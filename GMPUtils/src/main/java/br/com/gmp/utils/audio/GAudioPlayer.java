package br.com.gmp.utils.audio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;

/**
 * Controlador de reprodução de audio
 *
 * @author kaciano
 * @version 1.0
 */
public class GAudioPlayer {

    private URL urlStream;
    private String audioPath;
    private Bitstream bitstream;
    private Decoder decoder;
    private AudioDevice audioDevice;
    private boolean playing;
    private boolean closed;
    private boolean complete;
    private boolean paused;
    private boolean stopped;
    private PlaybackListener listener;
    private int frameIndexCurrent;
    private final int lostFrames = 20;

    /**
     * Cria nova instancia de GAudioPlayer
     *
     * @param urlStream {@code URL} URL do Stream
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws java.io.IOException Exceção de Java I/O
     */
    public GAudioPlayer(URL urlStream) throws JavaLayerException, IOException {
        this.urlStream = urlStream;
        this.listener = new PlaybackAdapter();
        this.playing = false;
        this.audioDevice = FactoryRegistry.systemRegistry().createAudioDevice();
        this.bitstream = new Bitstream(this.getAudioInputStream());
    }

    /**
     * Cria nova instancia de GAudioPlayer
     *
     * @param audioPath {@code String} Caminho do arquivo
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws java.io.IOException Exceção de Java I/O
     */
    public GAudioPlayer(String audioPath) throws JavaLayerException, IOException {
        this.audioPath = audioPath;
        this.listener = new PlaybackAdapter();
        this.playing = false;
        this.audioDevice = FactoryRegistry.systemRegistry().createAudioDevice();
        this.bitstream = new Bitstream(this.getAudioInputStream());
    }

    /**
     * Modifica o PlaybackListener
     *
     * @param newPlaybackListener {@code PlaybackListener} PlaybackListener
     */
    public void setPlaybackListener(PlaybackListener newPlaybackListener) {
        if (newPlaybackListener != null) {
            this.listener = newPlaybackListener;
        } else {
            throw new NullPointerException("PlaybackListener is null");
        }
    }

    /**
     * Retorna o stream de audio
     *
     * @return {@code InputStream} Stream de audio
     * @throws IOException Exceção de I/O
     */
    private InputStream getAudioInputStream() throws IOException {
        if (this.audioPath != null) {
            return new FileInputStream(audioPath);
        } else if (this.urlStream != null) {
            return this.urlStream.openStream();
        }
        return null;
    }

    /**
     * Decodifica frames
     *
     * @return {@code boolean} Frame decodificado?
     * @throws JavaLayerException Exceção de JavaLayer
     */
    protected boolean decodeFrame() throws JavaLayerException {
        boolean returnValue = false;
        if (this.stopped) {
            return false;
        }

        try {
            if (this.audioDevice != null) {
                Header header = this.bitstream.readFrame();
                if (header != null) {
                    SampleBuffer output = (SampleBuffer) this.decoder
                            .decodeFrame(header, this.bitstream);

                    synchronized (this) {
                        if (this.audioDevice != null) {
                            this.audioDevice.write(output.getBuffer(), 0,
                                    output.getBufferLength());
                        }
                    }

                    this.bitstream.closeFrame();
                    returnValue = true;
                } else {
                    System.out.println("End of file");
                    returnValue = false;
                }
            }
        } catch (RuntimeException ex) {
            throw new JavaLayerException("Exception decoding audio frame", ex);
        }
        return returnValue;
    }

    /**
     * Inicia a reprodução de audio
     *
     * @return {@code boolean} Reprodução iniciada?
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws java.io.IOException Exceção de Java i/O
     */
    public boolean play() throws JavaLayerException, IOException {
        return this.play(0);
    }

    /**
     * Inicia a reprodução de audio
     *
     * @param frameIndexStart {@code int} Frame inicial
     * @return {@code boolean} Reprodução iniciada?
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws java.io.IOException Exceção de Java i/O
     */
    public boolean play(int frameIndexStart) throws JavaLayerException, IOException {
        return this.play(frameIndexStart, -1, lostFrames);
    }

    /**
     * Inicia a reprodução de audio
     *
     * @param frameIndexStart {@code int} Frame inicial
     * @param frameIndexFinal {@code int} Frame final
     * @param correctionFactorInFrames {@code int} Fator de correção
     * @return {@code boolean} Reprodução iniciada?
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws java.io.IOException Exceção de Java I/O
     */
    public boolean play(int frameIndexStart, int frameIndexFinal,
            int correctionFactorInFrames) throws JavaLayerException, IOException {
        this.bitstream = new Bitstream(this.getAudioInputStream());

        this.audioDevice = FactoryRegistry.systemRegistry().createAudioDevice();
        this.decoder = new Decoder();
        this.audioDevice.open(this.decoder);

        boolean shouldContinueReadingFrames = true;

        this.paused = false;
        this.stopped = false;
        this.frameIndexCurrent = 0;

        while (shouldContinueReadingFrames == true
                && this.frameIndexCurrent < frameIndexStart
                - correctionFactorInFrames) {
            shouldContinueReadingFrames = this.skipFrame();
            this.frameIndexCurrent++;
        }

        if (this.listener != null) {
            this.listener.playbackStarted(new PlaybackEvent(this,
                    PlaybackEvent.EventType.Instances.Started, this.audioDevice
                    .getPosition()));
        }

        if (frameIndexFinal < 0) {
            frameIndexFinal = Integer.MAX_VALUE;
        }

        while (shouldContinueReadingFrames == true
                && this.frameIndexCurrent < frameIndexFinal) {
            if (this.paused || this.stopped) {
                shouldContinueReadingFrames = false;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GAudioPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                shouldContinueReadingFrames = this.decodeFrame();
                this.frameIndexCurrent++;
            }
        }

        if (this.audioDevice != null && !this.paused) {
            this.audioDevice.flush();

            synchronized (this) {
                this.complete = (this.closed == false);
                this.close();
            }

            if (this.listener != null) {
                int audioDevicePosition = -1;
                if (this.audioDevice != null) {
                    audioDevicePosition = this.audioDevice.getPosition();
                } else {

                }
                PlaybackEvent playbackEvent = new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Stopped,
                        audioDevicePosition);
                this.listener.playbackFinished(playbackEvent);
            }
        }
        this.playing = true;
        return shouldContinueReadingFrames;
    }

    /**
     * Reinicia a reprodução do audio
     *
     * @return {@code boolean} Reprodução em execução?
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws java.io.IOException Exceção de Java i/O
     */
    public boolean resume() throws JavaLayerException, IOException {
        return this.play(this.frameIndexCurrent);
    }

    /**
     * Fecha a reprodução de audio
     *
     * @throws javazoom.jl.decoder.BitstreamException BitstreamException
     */
    public synchronized void close() throws BitstreamException {
        if (this.audioDevice != null) {
            this.closed = true;
            this.playing = false;
            this.audioDevice.close();
            this.audioDevice = null;
            this.bitstream.close();
        }
    }

    /**
     * Pausa a execução
     *
     * @throws javazoom.jl.decoder.BitstreamException BitstreamException
     */
    public void pause() throws BitstreamException {
        if (!this.stopped) {
            this.paused = true;
            if (this.listener != null) {
                this.listener.playbackPaused(new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Paused,
                        this.audioDevice.getPosition()));
            }
            this.close();
        }
    }

    /**
     * Para a reprodução
     *
     * @throws javazoom.jl.decoder.BitstreamException BitstreamException
     */
    public void stop() throws BitstreamException {
        if (!this.stopped) {
            if (!this.closed) {
                this.listener.playbackFinished(new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Stopped,
                        this.audioDevice.getPosition()));
                this.close();
            } else if (this.paused) {
                int audioDevicePosition = -1;
                this.listener.playbackFinished(new PlaybackEvent(this,
                        PlaybackEvent.EventType.Instances.Stopped,
                        audioDevicePosition));
            }
            this.stopped = true;
        }
    }

    /**
     * Pula frames
     *
     * @return {@code boolean} Pulou o frame?
     * @throws JavaLayerException Exceção de JavaLayer
     */
    protected boolean skipFrame() throws JavaLayerException {
        boolean returnValue = false;
        Header header = this.bitstream.readFrame();

        if (header != null) {
            this.bitstream.closeFrame();
            returnValue = true;
        }

        return returnValue;
    }

    /**
     * Retorna se está executando
     *
     * @return {@code boolean} Está executando?
     */
    public boolean isPlaying() {
        return playing;
    }

    /**
     * Retorna se está terminado
     *
     * @return {@code boolean} Está terminado?
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Retorna se está completo
     *
     * @return {@code boolean} Está completo?
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Retorna se está em pausa
     *
     * @return {@code boolean} Está em pausa?
     */
    public boolean isPaused() {
        return paused;
    }

    /**
     * Retorna se está parado
     *
     * @return {@code boolean} Está parado?
     */
    public boolean isStopped() {
        return stopped;
    }

    /**
     * Evento para playback listeners
     */
    public static class PlaybackEvent {

        /**
         * Fonte de audio
         */
        public GAudioPlayer source;

        /**
         * Tipo do evento
         */
        public EventType eventType;

        /**
         * Endereço do frame
         */
        public int frameIndex;

        /**
         * Cria nova instancia de PlaybackEvent
         *
         * @param source {@code GAudioPlayer} Fonte de audio
         * @param eventType {@code EventType} Tipo do evento
         * @param frameIndex {@code int} Endereço do frame
         */
        public PlaybackEvent(GAudioPlayer source, EventType eventType, int frameIndex) {
            this.source = source;
            this.eventType = eventType;
            this.frameIndex = frameIndex;
        }

        /**
         * Classe estatica dos tipos de evento
         */
        public static class EventType {

            /**
             * Nome do tipo
             */
            public String name;

            /**
             * Cria nova instancia de EventType
             *
             * @param name {@code String} Nome do tipo
             */
            public EventType(String name) {
                this.name = name;
            }

            /**
             * Classe estatica das instancias dos tipos de evento
             */
            public static class Instances {

                /**
                 * Iniciado
                 */
                public static EventType Started = new EventType("Started");

                /**
                 * Em pausa
                 */
                public static EventType Paused = new EventType("Paused");

                /**
                 * Parado
                 */
                public static EventType Stopped = new EventType("Stopped");
            }
        }
    }

    /**
     * Adaptador de listener de playback
     */
    public static class PlaybackAdapter implements PlaybackListener {

        /**
         * Método de inicio da execução de faixa
         *
         * @param event {@code PlaybackEvent} Evento de playback
         */
        @Override
        public void playbackStarted(PlaybackEvent event) {
            System.err.println("Playback started");
        }

        /**
         * Método de pausa da execução de faixa
         *
         * @param event {@code PlaybackEvent} Evento de playback
         */
        @Override
        public void playbackPaused(PlaybackEvent event) {
            System.err.println("Playback paused");
        }

        /**
         * Método de fim da execução de faixa
         *
         * @param event {@code PlaybackEvent} Evento de playback
         */
        @Override
        public void playbackFinished(PlaybackEvent event) {
            System.err.println("Playback stopped");
        }
    }

    /**
     * Listener de playback
     */
    public static interface PlaybackListener {

        /**
         * Método de inicio da execução de faixa
         *
         * @param event {@code PlaybackEvent} Evento de playback
         */
        public void playbackStarted(PlaybackEvent event);

        /**
         * Método de pausa da execução de faixa
         *
         * @param event {@code PlaybackEvent} Evento de playback
         */
        public void playbackPaused(PlaybackEvent event);

        /**
         * Método de fim da execução de faixa
         *
         * @param event {@code PlaybackEvent} Evento de playback
         */
        public void playbackFinished(PlaybackEvent event);
    }
}
