package br.com.gmp.utils.audio;

import br.com.gmp.utils.audio.file.AudioFile;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.ID3v1Tag;

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
    private PlaybackListener playbackListener = new PlaybackListener();
    private ID3v1Tag tag;

    /**
     * Cria nova instancia de SoundLayer
     *
     * @param filePath <code>String</code> Caminho do arquivo
     */
    public SoundLayer(String filePath) {
        this.filePath = filePath;
        loadTag();
    }

    /**
     * Cria nova instancia de SoundLayer
     *
     * @param audioFile <code>String</code> Caminho do arquivo
     */
    public SoundLayer(AudioFile audioFile) {
        this.audioFile = audioFile;
        this.filePath = audioFile.getFile().getPath();
        this.tag = audioFile.getTag();
        printData();
    }

    /**
     * * Cria nova instancia de SoundLayer
     *
     * @param filePath <code>String</code> Caminho do arquivo
     * @param namePlayerThread <code>String</code> Nome da Thread do Player
     */
    public SoundLayer(String filePath, String namePlayerThread) {
        this.filePath = filePath;
        this.namePlayerThread = namePlayerThread;
        loadTag();
    }

    /**
     * Carrega os dados da faixa
     */
    private void loadTag() {
        try {
            this.tag = new MP3File(new File(filePath)).getID3v1Tag();
        } catch (IOException | TagException | ReadOnlyFileException | InvalidAudioFrameException ex) {
            Logger.getLogger(SoundLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        printData();
    }

    /**
     * Imprime dados
     */
    private void printData() {
        System.out.println("---------------------------------------------------"
                + "\nTitle: " + tag.getFirst(FieldKey.TITLE)
                + "\nArtist: " + tag.getFirst(FieldKey.ARTIST)
                + "\nAlbum: " + tag.getFirst(FieldKey.ALBUM)
                + "\nTrack: " + tag.getFirst(FieldKey.TRACK)
                + "\nTempo: " + tag.getFirst(FieldKey.TEMPO)
                + "\n---------------------------------------------------");
    }

    /**
     * Retorna o titutlo da faixa
     *
     * @return <code>String</code> Titulo da faixa
     */
    public String getTitle() {
        return tag.getFirst(FieldKey.TITLE);
    }

    /**
     * Retorna o artista da faixa
     *
     * @return <code>String</code> Artista da faixa
     */
    public String getArtist() {
        return tag.getFirst(FieldKey.ARTIST);
    }

    /**
     * Retorna o numero da faixa
     *
     * @return <code>String</code> Numero da faixa
     */
    public String getTrack() {
        return tag.getFirst(FieldKey.TRACK);
    }

    /**
     * Retorna o da album faixa
     *
     * @return <code>String</code> Album da faixa
     */
    public String getAlbum() {
        return tag.getFirst(FieldKey.ALBUM);
    }

    /**
     * Inicia reprodução
     */
    public void play() {
        if (this.player == null) {
            this.playerInitialize();
        } else if (!this.player.isPaused() || this.player.isComplete()
                || this.player.isStopped()) {
            this.stop();
            this.playerInitialize();
        }
        this.playerThread = new Thread(this, namePlayerThread);
        this.playerThread.setDaemon(true);
        this.playerThread.start();
    }

    /**
     * Pausa reprodução
     */
    public void pause() {
        if (this.player != null) {
            this.player.pause();
            if (this.playerThread != null) {
                this.playerThread = null;
            }
        }
    }

    /**
     * Troca o status de pausa
     */
    public void pauseToggle() {
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
     */
    public void stop() {
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
    private void playerInitialize() {
        try {
            this.player = new GAudioPlayer(this.filePath);
            this.player.setPlaybackListener(this.playbackListener);
        } catch (JavaLayerException e) {
            Logger.getLogger(SoundLayer.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void run() {
        try {
            this.player.resume();
        } catch (javazoom.jl.decoder.JavaLayerException ex) {
            Logger.getLogger(SoundLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Listener privado para reprodução
     */
    private static class PlaybackListener extends GAudioPlayer.PlaybackAdapter {

        @Override
        public void playbackStarted(GAudioPlayer.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackStarted()");
        }

        @Override
        public void playbackPaused(GAudioPlayer.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackPaused()");
        }

        @Override
        public void playbackFinished(GAudioPlayer.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackStopped()");
        }
    }

    /**
     * Dados da faixa de audio
     *
     * @return <code>ID3v1Tag</code> Dados da faixa
     */
    public ID3v1Tag getTag() {
        return tag;
    }

}
