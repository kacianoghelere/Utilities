package br.com.gmp.comps.player.multi;

import br.com.gmp.comps.player.GPlayer;
import br.com.gmp.comps.player.multi.model.AudioModel;
import br.com.gmp.utils.audio.GAudioPlayer;
import br.com.gmp.utils.audio.SoundLayer;
import br.com.gmp.utils.audio.file.AudioFile;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.JavaLayerException;

/**
 * Player de audio para multiplos arquivos de audio
 *
 * @author kaciano
 * @version 1.0
 */
public class GPlayerList extends JPanel {

    private final Logger LOGGER = Logger.getLogger(GPlayerList.class.getName());
    private AudioFile track;
    private SoundLayer layer;
    private boolean navigate;
    private AudioModel model;
    private List<AudioFile> tracks;

    /**
     * Cria nova instancia de GPlayerList
     */
    public GPlayerList() {
        this.tracks = new ArrayList<>();
        this.model = new AudioModel();
        this.model.setData(tracks);
        initialize();
    }

    /**
     * Cria nova instancia de GPlayerList
     *
     * @param tracks {@code List(AudioFile)} Lista de arquivos
     */
    public GPlayerList(List<AudioFile> tracks) {
        this.tracks = tracks;
        this.model = new AudioModel();
        this.model.setData(tracks);
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
        this.gTableTracks.setModel(model);
        setNavigate(true);
    }

    /**
     * Constroi os dados no GPlayer
     *
     * @param tracks {@code List(AudioFile)} Lista de arquivos
     */
    public void build(List<AudioFile> tracks) {
        this.tracks = tracks;
        this.model = new AudioModel();
        this.model.setData(tracks);
        this.gTableTracks.setModel(model);
        this.gTableTracks.repaint();
        this.gTableTracks.revalidate();
        if (!model.isEmpty()) {
            this.gTableTracks.setRowSelectionInterval(0, 0);
        }
    }

    /**
     * Executa o commando no player de audio
     *
     * @param command {@code String} Comando a ser executado
     * @throws javazoom.jl.decoder.BitstreamException Exceção de Bitstream
     * @throws java.io.IOException Exceção de I/O
     */
    public void execute(String command) throws Exception {
        if (layer != null) {
            switch (command) {
                case "play":
                    layer.play();
                    break;
                case "resume":
                    layer.pauseToggle();
                    break;
                case "pause":
                    layer.pause();
                    break;
                case "stop":
                    layer.stop();
                    break;
                case "close":
                    layer.getPlayer().close();
                    break;
                default:
                    LOGGER.warning("Unknown command!");
            }
        }
    }

    /**
     * Retorna o arquivo executado
     *
     * @return {@code AudioFile} Arquivo executado
     */
    public AudioFile getTrack() {
        return track;
    }

    /**
     * Modifica o arquivo executado
     *
     * @param track {@code AudioFile} Arquivo executado
     */
    public void setTrack(AudioFile track) {
        this.track = track;
    }

    /**
     * Retorna o reprodutor de audio
     *
     * @return {@code SoundLayer} Reprodutor de audio
     */
    public SoundLayer getLayer() {
        return layer;
    }

    /**
     * Retorna o reprodutor de audio
     *
     */
    private void loadPlayer() throws IOException, BitstreamException {
        if (this.layer != null) {
            this.layer.stop();
            this.layer = null;
        }
        this.layer = new SoundLayer(model.getObject(gTableTracks.getSelectedRow()), jTBRepeat.isSelected());
    }

    /**
     * Modifica o reprodutor de audio
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
     * Retorna o modelo de tabelas dos arquivos de audio
     *
     * @return {@code AudioModel} Modelo de tabelas dos arquivos de audio
     */
    public AudioModel getModel() {
        return model;
    }

    @Override
    public synchronized void addMouseListener(MouseListener listener) {
        gTableTracks.addMouseListener(listener);
    }

    /**
     * Executa o arquivo
     */
    private void play() {
        try {
            loadPlayer();
            if (layer != null) {
                if (layer.getPlayer().isPlaying()) {
                    layer.stop();
                }
                layer.play();
                this.gTTrack.setText(layer.getTitle());
            }
        } catch (IOException | BitstreamException e) {
            Logger.getLogger(GPlayerList.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * Pausa a execução do arquivo
     */
    private void pause() {
        try {
            if (layer != null) {
                layer.pauseToggle();
            }
        } catch (IOException | BitstreamException e) {
            Logger.getLogger(GPlayerList.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * Para a execução do arquivo
     */
    private void stop() {
        try {
            if (layer != null) {
                layer.stop();
                this.gTTrack.setText("");
            }
        } catch (Exception e) {
            Logger.getLogger(GPlayer.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        gTableTracks = new br.com.gmp.comps.table.GTable();
        jTBControls = new javax.swing.JToolBar();
        jBPrevious = new javax.swing.JButton();
        jBPlay = new javax.swing.JButton();
        jBPause = new javax.swing.JButton();
        jBStop = new javax.swing.JButton();
        jBNext = new javax.swing.JButton();
        jTBRepeat = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        gTTrack = new br.com.gmp.comps.textfield.GTextField();

        jScrollPane1.setViewportView(gTableTracks);

        jTBControls.setFloatable(false);
        jTBControls.setRollover(true);
        jTBControls.setMaximumSize(new java.awt.Dimension(32767, 23));
        jTBControls.setMinimumSize(new java.awt.Dimension(300, 23));
        jTBControls.setPreferredSize(new java.awt.Dimension(300, 23));

        jBPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/begining.png"))); // NOI18N
        jBPrevious.setToolTipText("Anterior");
        jBPrevious.setFocusable(false);
        jBPrevious.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPrevious.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreviousActionPerformed(evt);
            }
        });
        jTBControls.add(jBPrevious);

        jBPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/multimedia/unpause.png"))); // NOI18N
        jBPlay.setToolTipText("Reproduzir");
        jBPlay.setFocusable(false);
        jBPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPlay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlayActionPerformed(evt);
            }
        });
        jTBControls.add(jBPlay);

        jBPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/multimedia/pause.png"))); // NOI18N
        jBPause.setToolTipText("Pausar");
        jBPause.setFocusable(false);
        jBPause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPause.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPauseActionPerformed(evt);
            }
        });
        jTBControls.add(jBPause);

        jBStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/progress/stop.png"))); // NOI18N
        jBStop.setToolTipText("Parar");
        jBStop.setFocusable(false);
        jBStop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBStop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBStopActionPerformed(evt);
            }
        });
        jTBControls.add(jBStop);

        jBNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/end.png"))); // NOI18N
        jBNext.setToolTipText("Próximo");
        jBNext.setFocusable(false);
        jBNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });
        jTBControls.add(jBNext);

        jTBRepeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/switch.png"))); // NOI18N
        jTBRepeat.setSelected(true);
        jTBRepeat.setToolTipText("Repetir");
        jTBRepeat.setFocusable(false);
        jTBRepeat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jTBRepeat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBControls.add(jTBRepeat);
        jTBControls.add(jSeparator1);

        gTTrack.setEditable(false);
        gTTrack.setBackground(new java.awt.Color(0, 0, 0));
        gTTrack.setForeground(new java.awt.Color(12, 139, 2));
        gTTrack.setEnabled(false);
        gTTrack.setMaximumSize(new java.awt.Dimension(23768, 23));
        gTTrack.setMinimumSize(new java.awt.Dimension(200, 23));
        gTTrack.setPreferredSize(new java.awt.Dimension(200, 23));
        jTBControls.add(gTTrack);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jTBControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreviousActionPerformed
        if (model != null && !model.isEmpty() && gTableTracks.getSelectedRow() != 0) {
            int prev = gTableTracks.getSelectedRow() - 1;
            gTableTracks.setRowSelectionInterval(prev, prev);
        }
    }//GEN-LAST:event_jBPreviousActionPerformed

    private void jBPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlayActionPerformed
        play();
    }//GEN-LAST:event_jBPlayActionPerformed

    private void jBPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPauseActionPerformed
        pause();
    }//GEN-LAST:event_jBPauseActionPerformed

    private void jBStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBStopActionPerformed
        stop();
    }//GEN-LAST:event_jBStopActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        if (model != null && !model.isEmpty() && (gTableTracks.getSelectedRow() + 1 != model.getSize())) {
            int next = gTableTracks.getSelectedRow() + 1;
            gTableTracks.setRowSelectionInterval(next, next);
        }
    }//GEN-LAST:event_jBNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTTrack;
    private br.com.gmp.comps.table.GTable gTableTracks;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBPause;
    private javax.swing.JButton jBPlay;
    private javax.swing.JButton jBPrevious;
    private javax.swing.JButton jBStop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jTBControls;
    private javax.swing.JToggleButton jTBRepeat;
    // End of variables declaration//GEN-END:variables
}
