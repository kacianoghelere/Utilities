package br.com.gmp.comps.textfield.file;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 * Campo para busca arquivos
 *
 * @author kaciano
 */
public class GFileField extends JPanel {

    private File selectedFile;

    /**
     * Cria nova instancia de GFileField
     */
    public GFileField() {
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Retorna o arquivo selecionado
     *
     * @return {@code File} Arquivo selecionado
     */
    public File getSelectedFile() {
        return selectedFile;
    }

    /**
     * Modifica o arquivo selecionado
     *
     * @param selectedFile {@code File} Arquivo selecionado
     */
    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
        if (selectedFile != null) {
            this.gTPath.setText(selectedFile.getPath());
        }
    }

    /**
     * Retorna o seletor de arquivos
     *
     * @return {@code JFileChooser} Seletor de arquivos
     */
    public JFileChooser getFileChooser() {
        return jFileChooser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jBSearch = new javax.swing.JButton();
        gTPath = new br.com.gmp.comps.textfield.GTextField();

        jBSearch.setText("...");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gTPath, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jBSearch))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gTPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        this.jFileChooser.showDialog(this, "Selecionar");
        setSelectedFile(jFileChooser.getSelectedFile());
    }//GEN-LAST:event_jBSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTPath;
    private javax.swing.JButton jBSearch;
    private javax.swing.JFileChooser jFileChooser;
    // End of variables declaration//GEN-END:variables
}
