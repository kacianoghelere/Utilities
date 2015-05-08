package br.com.gmp.comps.audioplayer;

import br.com.gmp.basicplayer.BasicController;
import br.com.gmp.basicplayer.BasicPlayer;
import br.com.gmp.basicplayer.BasicPlayerEvent;
import br.com.gmp.basicplayer.BasicPlayerException;
import br.com.gmp.basicplayer.BasicPlayerListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author kaciano
 */
public class GPlayerUI extends JPanel implements BasicPlayerListener {

    private static final Logger LOGGER = Logger.getLogger(GPlayerUI.class.getName());
    public static final int TEXT_LENGTH_MAX = 30;
    public static final long SCROLL_PERIOD = 250;
    /*-- Sound player --*/
    private BasicController soundPlayer = null;
    private Map audioInfo = null;
    private int playerState = BasicPlayerEvent.OPENING;

    /**
     * Creates new form GPlayerUI
     */
    public GPlayerUI() {
        initComponents();
        gFileField1.getFileChooser().setFileSelectionMode(JFileChooser.FILES_ONLY);
        gFileField1.getFileChooser().setMultiSelectionEnabled(false);
    }

    @Override
    public void opened(Object stream, Map properties) {
        this.audioInfo = properties;
        jTextField1.setText(audioInfo.get("mp3.shoutcast.metadata.StreamTitle").toString());
    }

    @Override
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
        System.out.println("\nbytesread: " + bytesread
                + "\nmicroseconds: " + microseconds
                + "\npcmdata: " + Arrays.toString(pcmdata)
                + "\npcmdata: " + properties);
    }

    @Override
    public void stateUpdated(BasicPlayerEvent event) {
        System.out.println("Position: " + event.getPosition());
        System.out.println("State: " + event.getCode());
        playerState = event.getCode();
    }

    @Override
    public void setController(BasicController soundPlayer) {
        this.soundPlayer = soundPlayer;
    }

    /**
     * Returns a File from a filename.
     *
     * @param file
     * @return
     */
    protected File openFile(String file) {
        return new File(file);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jBPlay = new javax.swing.JButton();
        jBPause = new javax.swing.JButton();
        jBStop = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        gFileField1 = new br.com.gmp.comps.textfield.file.GFileField();

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/player/media_skip_backward.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jBPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/player/media_playback_start.png"))); // NOI18N
        jBPlay.setFocusable(false);
        jBPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPlay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlayActionPerformed(evt);
            }
        });
        jToolBar1.add(jBPlay);

        jBPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/player/media_playback_pause.png"))); // NOI18N
        jBPause.setFocusable(false);
        jBPause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPause.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPauseActionPerformed(evt);
            }
        });
        jToolBar1.add(jBPause);

        jBStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/player/media_playback_stop.png"))); // NOI18N
        jBStop.setFocusable(false);
        jBStop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBStop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBStopActionPerformed(evt);
            }
        });
        jToolBar1.add(jBStop);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/player/media_skip_forward.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jTextField1.setBackground(new java.awt.Color(68, 68, 68));
        jTextField1.setForeground(new java.awt.Color(236, 236, 236));
        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(gFileField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gFileField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlayActionPerformed
        if (gFileField1.getSelectedFile() != null) {
            if (soundPlayer == null) {
                this.soundPlayer = new BasicPlayer();
            }
            try {
                this.soundPlayer = new BasicPlayer();
                this.soundPlayer.open(gFileField1.getSelectedFile());
                this.soundPlayer.play();
                this.playerState = BasicPlayerEvent.PLAYING;
            } catch (BasicPlayerException ex) {
                Logger.getLogger(GPlayerUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBPlayActionPerformed

    private void jBPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPauseActionPerformed
        if (soundPlayer != null && playerState == BasicPlayerEvent.PLAYING) {
            try {
                this.soundPlayer.pause();
            } catch (BasicPlayerException ex) {
                Logger.getLogger(GPlayerUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (soundPlayer != null && playerState == BasicPlayerEvent.PAUSED) {
            try {
                this.soundPlayer.resume();
            } catch (BasicPlayerException ex) {
                Logger.getLogger(GPlayerUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBPauseActionPerformed

    private void jBStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBStopActionPerformed
        if (soundPlayer != null && (playerState == BasicPlayerEvent.PLAYING || playerState == BasicPlayerEvent.PAUSED)) {
            try {
                this.soundPlayer.stop();
            } catch (BasicPlayerException ex) {
                Logger.getLogger(GPlayerUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBStopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.file.GFileField gFileField1;
    private javax.swing.JButton jBPause;
    private javax.swing.JButton jBPlay;
    private javax.swing.JButton jBStop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
