package br.com.gmp.utils.audio;

import br.com.gmp.utils.annotations.Intercept;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.ID3v1Tag;

/**
 * Classe utilitária para reprodução de audio
 *
 * @author kaciano
 * @version 1.0
 */
public class AudioPlayer {

    /**
     * Não iniciado
     */
    public final static int NOTSTARTED = 0;
    /**
     * Reproduzindo
     */
    public final static int PLAYING = 1;
    /**
     * Em pausa
     */
    public final static int PAUSED = 2;
    /**
     * Terminado
     */
    public final static int FINISHED = 3;
    private String path;
    private File track;
    private InputStream inputStream;
    private AudioDevice audioDevice;
    private AdvancedPlayer player;
    private int pausedFrame = 0;
    private int state = NOTSTARTED;
    private ID3v1Tag tag;

    /**
     * Cria nova instancia de AudioPlayer
     */
    public AudioPlayer() {
    }

    /**
     * Cria nova instancia de AudioPlayer
     *
     * @param path {@code String} Caminho do arquivo
     * @throws java.io.FileNotFoundException Exceção de arquivo não encontrado
     * @throws javazoom.jl.decoder.JavaLayerException Exceção de JavaLayer
     * @throws IOException Exceção de IO
     * @throws TagException Exceção de Tags
     * @throws ReadOnlyFileException Exceção de 'Somente Leitura'
     * @throws InvalidAudioFrameException Exceção de tipo de audio invalido
     */
    public AudioPlayer(String path) throws FileNotFoundException, JavaLayerException, 
            IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
        this.path = path;
        this.track = new File(path);
        initialize(track);
    }

    /**
     * Cria nova instancia de AudioPlayer
     *
     * @param track {@code File} Arquivo
     * @throws java.io.FileNotFoundException Exceção de arquivo não encontrado
     * @throws javazoom.jl.decoder.JavaLayerException Exceção de JavaLayer
     * @throws IOException Exceção de IO
     * @throws TagException Exceção de Tags
     * @throws ReadOnlyFileException Exceção de 'Somente Leitura'
     * @throws InvalidAudioFrameException Exceção de tipo de audio invalido
     */
    public AudioPlayer(File track) throws FileNotFoundException, JavaLayerException, 
            IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
        this.path = track.getAbsolutePath();
        this.track = track;
        initialize(track);
    }

    /**
     * Constroi o reprodutor de audio
     *
     * @param track {@code File} Arquivo
     * @throws java.io.FileNotFoundException Exceção de arquivo não encontrado
     * @throws javazoom.jl.decoder.JavaLayerException Exceção de JavaLayer
     * @throws IOException Exceção de I/O
     * @throws TagException Exceção de Tags
     * @throws ReadOnlyFileException Exceção de 'Somente Leitura'
     * @throws InvalidAudioFrameException Exceção de tipo de audio invalido
     */
    @Intercept
    public void build(File track) throws FileNotFoundException, JavaLayerException, 
            IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
        this.path = track.getAbsolutePath();
        this.track = track;
        initialize(track);
    }

    /**
     * Método de inicialização
     *
     * @param track {@code File} Arquivo
     * @throws java.io.FileNotFoundException Exceção de arquivo não encontrado
     * @throws javazoom.jl.decoder.JavaLayerException Exceção de JavaLayer
     * @throws IOException Exceção de IO
     * @throws TagException Exceção de Tags
     * @throws ReadOnlyFileException Exceção de 'Somente Leitura'
     * @throws InvalidAudioFrameException Exceção de tipo de audio invalido
     */
    private void initialize(File track) throws FileNotFoundException,
            JavaLayerException, IOException, TagException,
            ReadOnlyFileException, InvalidAudioFrameException {
        this.tag = new MP3File(track).getID3v1Tag();
        System.out.println("---------------------------------------------------"
                + "\nTitle: " + tag.getFirst(FieldKey.TITLE)
                + "\nArtist: " + tag.getFirst(FieldKey.ARTIST)
                + "\nAlbum: " + tag.getFirst(FieldKey.ALBUM)
                + "\nTrack: " + tag.getFirst(FieldKey.TRACK)
                + "\n---------------------------------------------------");
        startPlayer();
    }

    /**
     * Inicia o player
     *
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws FileNotFoundException Arquivo não encontrado
     */
    private void startPlayer() throws JavaLayerException, FileNotFoundException {
        refresh();
        this.player.setPlayBackListener(new PlaybackListener() {

            @Override
            public void playbackStarted(PlaybackEvent evt) {
//                state = PLAYING;
                System.out.println("Playback Started on " + pausedFrame + "!");
            }

            @Override
            public void playbackFinished(PlaybackEvent evt) {
                pausedFrame = (state == PAUSED ? (evt.getFrame()) : 0);
                System.out.println("Playback Stopped on " + pausedFrame + "!");
            }

        });
    }

    /**
     * Atualiza o Player
     *
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws FileNotFoundException Arquivo não encontrado
     */
    @Intercept
    private void refresh() throws JavaLayerException, FileNotFoundException {
        this.inputStream = new FileInputStream(track);
        this.player = new AdvancedPlayer(inputStream, audioDevice);
    }

    /**
     * Inicia a reprodução de audio
     *
     * @throws JavaLayerException Exceção de JavaLayer
     * @throws FileNotFoundException Arquivo não encontrado
     */
    @Intercept
    public void play() throws JavaLayerException, FileNotFoundException {
        if (state != PLAYING) {
            this.state = PLAYING;
            System.out.println("Playing!");
            startPlayer();
            if (pausedFrame > 0) {
                this.player.play((pausedFrame / 1000), Integer.MAX_VALUE);
            } else {
                this.player.play();
            }
        }
    }

    /**
     * Pausa a reprodução de audio
     */
    @Intercept
    public void pause() {
        if (state != FINISHED && state != NOTSTARTED && state != PAUSED) {
            this.state = PAUSED;
            this.player.stop();
        }
    }

    /**
     * Para a reprodução de audio
     */
    @Intercept
    public void stop() {
        if (state != FINISHED && state != NOTSTARTED) {
            this.state = FINISHED;
            this.player.stop();
        }
    }

    /**
     * Retorna a Tag com as informações do arquivo
     *
     * @return {@code ID3v1Tag} Tag com as informações do arquivo
     */
    public ID3v1Tag getTag() {
        return tag;
    }

    /**
     * Retorna o dispositivo de audio
     *
     * @return {@code AudioDevice} Dispositivo de audio
     */
    public AudioDevice getAudioDevice() {
        return this.audioDevice;
    }

    /**
     * Modifica o dispositivo de audio
     *
     * @param audioDevice {@code AudioDevice} Dispositivo de audio
     */
    public void setAudioDevice(AudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    /**
     * Retorna o caminho do arquivo reproduzido
     *
     * @return {@code String} Caminho do arquivo reproduzido
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Modifica o caminho do arquivo reproduzido
     *
     * @param path {@code String} Caminho do arquivo reproduzido
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Retorna o arquivo reproduzido
     *
     * @return  {@code String} Arquivo reproduzido
     */
    public File getTrack() {
        return this.track;
    }

    /**
     * Modifica o arquivo reproduzido
     *
     * @param track  {@code String} Arquivo reproduzido
     */
    public void setTrack(File track) {
        this.track = track;
    }

    /**
     * Retorna o frame onde ocorreu a pausa
     *
     * @return {@code int} Frame onde ocorreu a pausa
     */
    public int getPausedFrame() {
        return this.pausedFrame;
    }

    /**
     * Modifica o frame onde ocorreu a pausa
     *
     * @param pausedFrame {@code int} Frame onde ocorreu a pausa
     */
    public void setPausedFrame(int pausedFrame) {
        this.pausedFrame = pausedFrame;
    }

}
