package br.com.gmp.utils.audio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class CustomPlayer {

    private AdvancedPlayer player;
    private FileInputStream FIS;
    private BufferedInputStream BIS;
    private boolean canResume;
    private String path;
    private int total;
    private int stopped;
    private boolean valid;

    public CustomPlayer() {
        player = null;
        FIS = null;
        valid = false;
        BIS = null;
        path = null;
        total = 0;
        stopped = 0;
        canResume = false;
    }

    public boolean canResume() {
        return canResume;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void pause() {
        try {
            stopped = FIS.available();
            player.close();
            FIS = null;
            BIS = null;
            player = null;
            if (valid) {
                canResume = true;
            }
        } catch (Exception e) {

        }
    }

    public void resume() {
        if (!canResume) {
            return;
        }
        if (play(total - stopped)) {
            canResume = false;
        }
    }

    public boolean play(int pos) {
        valid = true;
        canResume = false;
        try {
            FIS = new FileInputStream(path);
            total = FIS.available();
            if (pos > -1) {
                FIS.skip(pos);
            }
            BIS = new BufferedInputStream(FIS);
            player = new AdvancedPlayer(BIS);
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                player.play();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error playing mp3 file");
                                valid = false;
                            }
                        }
                    }
            ).start();
        } catch (IOException | JavaLayerException e) {
            JOptionPane.showMessageDialog(null, "Error playing mp3 file");
            valid = false;
        }
        return valid;
    }

    public void stop() {
        stopped = 1;
        canResume = false;
        player.stop();
    }

}
