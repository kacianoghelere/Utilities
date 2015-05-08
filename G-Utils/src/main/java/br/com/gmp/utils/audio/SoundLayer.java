package br.com.gmp.utils.audio;

import br.com.gmp.utils.audio.file.AudioFile;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.JavaLayerException;

/**
 * Reprodutor de audio
 *
 * @author kaciano
 * @version 1.0
 */
public class SoundLayer implements Runnable {

    private AudioFile audioFile;
    private String filePath;
    private GAudioPlayer player;
    private Thread playerThread;
    private String namePlayerThread = "AudioPlayerThread";
    private static final Logger LOGGER = Logger.getLogger(SoundLayer.class.getName());
    private boolean repeat;

    /**
     * Cria nova instancia de SoundLayer
     *
     * @param filePath {@code String} Caminho do arquivo
     * @throws java.io.IOException Exceção de Java I/O
     */
    public SoundLayer(String filePath) throws IOException {
        this.filePath = filePath;
        playerInitialize();
    }

    /**
     * Cria nova instancia de SoundLayer
     *
     * @param audioFile {@code String} Caminho do arquivo
     * @param repeat
     * @throws java.io.IOException Exceção de Java I/O
     */
    public SoundLayer(AudioFile audioFile, boolean repeat) throws IOException {
        this.audioFile = audioFile;
        this.repeat = repeat;
        this.filePath = audioFile.getPath();
        playerInitialize();
    }

    /**
     * * Cria nova instancia de SoundLayer
     *
     * @param filePath {@code String} Caminho do arquivo
     * @param namePlayerThread {@code String} Nome da Thread do Player
     * @throws java.io.IOException Exceção de Java I/O
     */
    public SoundLayer(String filePath, String namePlayerThread) throws IOException {
        this.filePath = filePath;
        this.namePlayerThread = namePlayerThread;
        playerInitialize();
    }

    /**
     * Inicia reprodução
     *
     * @throws javazoom.jl.decoder.BitstreamException BitstreamException
     * @throws java.io.IOException Exceção de Java I/O
     */
    public void play() throws BitstreamException, IOException {
        if (this.player == null) {
            this.playerInitialize();
        } else if (!this.player.isPaused() || this.player.isComplete() || this.player.isStopped()) {
            this.stop();
            this.playerInitialize();
        }
        this.playerThread = new Thread(this, namePlayerThread);
        this.playerThread.setDaemon(true);
        this.playerThread.start();
    }

    /**
     * Pausa reprodução
     *
     * @throws javazoom.jl.decoder.BitstreamException BitstreamException
     */
    public void pause() throws BitstreamException {
        if (this.player != null) {
            this.player.pause();
            if (this.playerThread != null) {
                this.playerThread = null;
            }
        }
    }

    /**
     * Troca o status de pausa
     *
     * @throws javazoom.jl.decoder.BitstreamException BitstreamException
     * @throws java.io.IOException Exceção de Java I/O
     */
    public void pauseToggle() throws BitstreamException, IOException {
        if (this.player != null) {
            if (this.player.isPaused() && !this.player.isStopped()) {
                this.play();
            } else {
                this.pause();
            }
        }
    }

    /**
     * Para reprodução
     *
     * @throws javazoom.jl.decoder.BitstreamException BitstreamException
     */
    public void stop() throws BitstreamException {
        if (this.player != null) {
            this.player.stop();
            if (this.playerThread != null) {
                this.playerThread = null;
            }
        }
    }

    /**
     * Inicializa o player
     */
    private void playerInitialize() throws IOException {
        try {
            LOGGER.log(Level.INFO, "INITIALISING PLAYER[repeat={0}]", repeat);
            this.player = new GAudioPlayer(this.filePath, new PlaybackListener());
        } catch (JavaLayerException e) {
            Logger.getLogger(SoundLayer.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void run() {
        try {
            this.player.resume();
        } catch (javazoom.jl.decoder.JavaLayerException | IOException ex) {
            Logger.getLogger(SoundLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Retorna o titutlo da faixa
     *
     * @return {@code String} Titulo da faixa
     */
    public String getTitle() {
        return audioFile.getTitle();
    }

    /**
     * Retorna o artista da faixa
     *
     * @return {@code String} Artista da faixa
     */
    public String getArtist() {
        return audioFile.getArtist();
    }

    /**
     * Retorna o numero da faixa
     *
     * @return {@code String} Numero da faixa
     */
    public String getTrack() {
        return audioFile.getTrack();
    }

    /**
     * Retorna o da album faixa
     *
     * @return {@code String} Album da faixa
     */
    public String getAlbum() {
        return audioFile.getAlbum();
    }

    /**
     * Retorna o player de audio
     *
     * @return {@code GAudioPlayer} Player de audio
     */
    public GAudioPlayer getPlayer() {
        return player;
    }

    /**
     * Retorna se o player de audio deve repetir a faixa
     *
     * @return {@code boolean} Repetir
     */
    public boolean isRepeat() {
        return repeat;
    }

    /**
     * Modifica se o player de audio deve repetir
     *
     * @param repeat {@code boolean} Repetir
     */
    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    /**
     * Listener privado para reprodução
     */
    public class PlaybackListener extends GAudioPlayer.PlaybackAdapter {

        @Override
        public void playbackFinished(GAudioPlayer.PlaybackEvent event) {
            LOGGER.log(Level.INFO, "PLAYBACK STOPPED(complete={0},repeat={1})",
                    new Object[]{event.getSource().isComplete(), SoundLayer.this.isRepeat()});
            if (event.getSource().isComplete() && SoundLayer.this.isRepeat()) {
                try {
                    SoundLayer.this.play();
                } catch (JavaLayerException | IOException ex) {
                    LOGGER.log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
