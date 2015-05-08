package br.com.gmp.comps.player;

import br.com.gmp.utils.audio.SoundLayer;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JToolBar;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.JavaLayerException;

/**
 * Player de Audio
 *
 * @author kaciano
 * @version 1.0
 */
public class GPlayer extends JToolBar {

    private String path;
    private File file;
    private SoundLayer layer;
    private boolean navigate;

    /**
     * Cria nova instancia de GPlayer
     */
    public GPlayer() {
        initialize();
    }

    /**
     * Cria nova instancia de GPlayer
     *
     * @param path {@code String} Caminho do arquivo
     */
    public GPlayer(String path) {
        this.path = path;
        this.file = new File(path);
        try {
            this.layer = new SoundLayer(path);
        } catch (IOException ex) {
            Logger.getLogger(GPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
        setNavigate(false);
    }

    /**
     * Constroi os dados no GPlayer
     *
     * @param path {@code String} Caminho do arquivo
     */
    public void build(String path) {
        this.path = path;
        this.file = new File(path);
        try {
            this.layer = new SoundLayer(path);
        } catch (IOException ex) {
            Logger.getLogger(GPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Retorna o caminho do arquivo executado
     *
     * @return {@code String} Caminho do arquivo executado
     */
    public String getPath() {
        return path;
    }

    /**
     * Modifica o caminho do arquivo executado
     *
     * @param path {@code String} Caminho do arquivo executado
     */
    public void setPath(String path) {
        this.path = path;
        build(path);
    }

    /**
     * Retorna o arquivo executado
     *
     * @return {@code File} Arquivo executado
     */
    public File getFile() {
        return file;
    }

    /**
     * Modifica o arquivo executado
     *
     * @param file {@code File} Arquivo executado
     */
    public void setFile(File file) {
        this.file = file;
        build(file.getPath());
    }

    /**
     * Modifica o reprodutor de audio
     *
     * @return {@code SoundLayer} Reprodutor de audio
     */
    public SoundLayer getLayer() {
        return layer;
    }

    /**
     * Retorna o reprodutor de audio
     *
     * @param layer {@code SoundLayer} Reprodutor de audio
     */
    public void setLayer(SoundLayer layer) {
        this.layer = layer;
    }

    /**
     * Retorna se os controles de navegação devem ser gerados
     *
     * @return {@code boolean} Gerar controles de navegação?
     */
    public boolean isNavigate() {
        return navigate;
    }

    /**
     * Identifica se os controles de navegação devem ser gerados
     *
     * @param navigate {@code boolean} Gerar controles de navegação?
     */
    public void setNavigate(boolean navigate) {
        this.navigate = navigate;
        jBPrevious.setEnabled(navigate);
        jBNext.setEnabled(navigate);
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBPrevious = new javax.swing.JButton();
        jBPlay = new javax.swing.JButton();
        jBPause = new javax.swing.JButton();
        jBStop = new javax.swing.JButton();
        jBNext = new javax.swing.JButton();
        gTTrack = new br.com.gmp.comps.textfield.GTextField();

        setFloatable(false);
        setRollover(true);
        setMaximumSize(new java.awt.Dimension(32767, 23));
        setMinimumSize(new java.awt.Dimension(300, 23));
        setPreferredSize(new java.awt.Dimension(300, 23));

        jBPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/begining.png"))); // NOI18N
        jBPrevious.setFocusable(false);
        jBPrevious.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPrevious.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreviousActionPerformed(evt);
            }
        });
        add(jBPrevious);

        jBPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/multimedia/unpause.png"))); // NOI18N
        jBPlay.setFocusable(false);
        jBPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPlay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlayActionPerformed(evt);
            }
        });
        add(jBPlay);

        jBPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/multimedia/pause.png"))); // NOI18N
        jBPause.setFocusable(false);
        jBPause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPause.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPauseActionPerformed(evt);
            }
        });
        add(jBPause);

        jBStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/progress/stop.png"))); // NOI18N
        jBStop.setFocusable(false);
        jBStop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBStop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBStopActionPerformed(evt);
            }
        });
        add(jBStop);

        jBNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/end.png"))); // NOI18N
        jBNext.setFocusable(false);
        jBNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });
        add(jBNext);

        gTTrack.setEditable(false);
        gTTrack.setBackground(new java.awt.Color(0, 0, 0));
        gTTrack.setForeground(new java.awt.Color(13, 160, 1));
        gTTrack.setEnabled(false);
        gTTrack.setMaximumSize(new java.awt.Dimension(23768, 23));
        gTTrack.setMinimumSize(new java.awt.Dimension(200, 23));
        gTTrack.setPreferredSize(new java.awt.Dimension(150, 23));
        add(gTTrack);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreviousActionPerformed
        System.out.println("Not implemented yet.");
    }//GEN-LAST:event_jBPreviousActionPerformed

    private void jBPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlayActionPerformed
        try {
            if (layer != null) {
                this.layer.play();
                this.gTTrack.setText(layer.getTitle());
            }
        } catch (IOException | BitstreamException e) {
            Logger.getLogger(GPlayer.class.getName()).log(Level.SEVERE, null, e);
        } catch (JavaLayerException ex) {
            Logger.getLogger(GPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBPlayActionPerformed

    private void jBPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPauseActionPerformed
        try {
            if (layer != null) {
                layer.pauseToggle();
            }
        } catch (IOException | BitstreamException e) {
            Logger.getLogger(GPlayer.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBPauseActionPerformed

    private void jBStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBStopActionPerformed
        try {
            if (layer != null) {
                layer.stop();
                this.gTTrack.setText("");
            }
        } catch (BitstreamException e) {
            Logger.getLogger(GPlayer.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jBStopActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        System.out.println("Not implemented yet.");
    }//GEN-LAST:event_jBNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTTrack;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBPause;
    private javax.swing.JButton jBPlay;
    private javax.swing.JButton jBPrevious;
    private javax.swing.JButton jBStop;
    // End of variables declaration//GEN-END:variables
}
