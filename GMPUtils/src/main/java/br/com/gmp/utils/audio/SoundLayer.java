package br.com.gmp.utils.audio;

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
 *
 * @author kaciano
 */
public class SoundLayer implements Runnable {

    private String filePath;
    private GAudioPlayer player;
    private Thread playerThread;
    private String namePlayerThread = "AudioPlayerThread";
    private PlaybackListener playbackListener = new PlaybackListener();
    private ID3v1Tag tag;

    public SoundLayer(String filePath) {
        this.filePath = filePath;
        loadTag();
    }

    public SoundLayer(String filePath, String namePlayerThread) {
        this.filePath = filePath;
        this.namePlayerThread = namePlayerThread;
        loadTag();
    }

    private void loadTag() {
        try {
            this.tag = new MP3File(new File(filePath)).getID3v1Tag();
        } catch (IOException | TagException | ReadOnlyFileException | InvalidAudioFrameException ex) {
            Logger.getLogger(SoundLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("---------------------------------------------------"
                + "\nTitle: " + tag.getFirst(FieldKey.TITLE)
                + "\nArtist: " + tag.getFirst(FieldKey.ARTIST)
                + "\nAlbum: " + tag.getFirst(FieldKey.ALBUM)
                + "\nTrack: " + tag.getFirst(FieldKey.TRACK)
                + "\n---------------------------------------------------");
    }

    public String getTitle() {
        return tag.getFirst(FieldKey.TITLE);
    }

    public String getArtist() {
        return tag.getFirst(FieldKey.ARTIST);
    }

    public String getTrack() {
        return tag.getFirst(FieldKey.TRACK);
    }

    public String getAlbum() {
        return tag.getFirst(FieldKey.ALBUM);
    }

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

    public void pause() {
        if (this.player != null) {
            this.player.pause();
            if (this.playerThread != null) {
                this.playerThread = null;
            }
        }
    }

    public void pauseToggle() {
        if (this.player != null) {
            if (this.player.isPaused() && !this.player.isStopped()) {
                this.play();
            } else {
                this.pause();
            }
        }
    }

    public void stop() {
        if (this.player != null) {
            this.player.stop();
            if (this.playerThread != null) {
                this.playerThread = null;
            }
        }
    }

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

    public ID3v1Tag getTag() {
        return tag;
    }

}
