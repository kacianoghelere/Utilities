package br.com.gmp.utils.audio;

import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;

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

    public SoundLayer(String filePath) {
        this.filePath = filePath;
    }

    public SoundLayer(String filePath, String namePlayerThread) {
        this.filePath = filePath;
        this.namePlayerThread = namePlayerThread;
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

    private static class PlaybackListener extends
            GAudioPlayer.PlaybackAdapter {

        @Override
        public void playbackStarted(
                GAudioPlayer.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackStarted()");
        }

        @Override
        public void playbackPaused(
                GAudioPlayer.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackPaused()");
        }

        @Override
        public void playbackFinished(
                GAudioPlayer.PlaybackEvent playbackEvent) {
            System.err.println("PlaybackStopped()");
        }
    }
}
