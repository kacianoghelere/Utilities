/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.comps.upload;

import javax.swing.JPanel;

/**
 *
 * @author kaciano
 */
public class GImageUploadPane extends JPanel {

    private String initialPath;
    private String destinationPath;

    /**
     * Creates new form GUploadPane
     */
    public GImageUploadPane() {
        initialize();
    }

    /**
     *
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Envia a imagem selecionada para o destino
     */
    public void upload() {

    }

    /**
     * Retorna o caminho inicial do seletor de arquivos
     *
     * @return {@code String} Caminho inicial do seletor de arquivos
     */
    public String getInitialPath() {
        return initialPath;
    }

    /**
     * Modifica o caminho inicial do seletor de arquivos
     *
     * @param initialPath {@code String} Caminho inicial do seletor de arquivos
     */
    public void setInitialPath(String initialPath) {
        this.initialPath = initialPath;
    }

    /**
     * Retorna o caminho do destino
     *
     * @return {@code String} Destino da imagem
     */
    public String getDestinationPath() {
        return destinationPath;
    }

    /**
     * Modifica o caminho do destino
     *
     * @param destinationPath {@code String} Destino da imagem
     */
    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        gTPath = new br.com.gmp.comps.textfield.GTextField();
        jBSearch = new javax.swing.JButton();
        jLImg = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(280, 220));
        setPreferredSize(new java.awt.Dimension(280, 220));

        jBSearch.setText("...");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        jLImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLImg.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem"));
        jLImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gTPath, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImg, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gTPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gTPath, jBSearch});

    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed

    }//GEN-LAST:event_jBSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTPath;
    private javax.swing.JButton jBSearch;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLImg;
    // End of variables declaration//GEN-END:variables
}
