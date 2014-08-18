package br.com.gmp.comps.textarea.finder;

import java.awt.HeadlessException;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 * Localizador de textos para áreas de texto
 *
 * @author kaciano
 * @version 1.0
 */
public class GTextFinder extends javax.swing.JDialog {

    private JTextComponent textArea;
    private int proximo = 0;

    /**
     * Cria nova instancia de GTextFinder
     *
     * @param parent {@code Frame} Componente pai
     * @param textArea {@code JTextComponent} Área de texto
     */
    public GTextFinder(java.awt.Frame parent, JTextComponent textArea) {
        super(parent);
        this.textArea = textArea;        
        initialize();
        setLocationRelativeTo(parent != null ? parent : textArea);
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Método de busca
     */
    public void find() {
        try {
            if (!jTLocalizar.getText().isEmpty()) {
                System.out.println("Texto preenchido");
                textArea.select(0, 0);
                String text = textArea.getText();
                String localizar = jTLocalizar.getText();
                if (text.contains(localizar)) {
                    Point pegaTexto = getLocation(text, localizar, jCBDiferenciar.isSelected());
                    if (pegaTexto != null) {
                        textArea.select(pegaTexto.x, pegaTexto.y);
                    } else {
                        int opt = JOptionPane.showConfirmDialog(this, "Nenhum texto encontrado a frente."
                                + "\nDeseja voltar ao inicio?", "Erro", JOptionPane.WARNING_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
                        if (opt == JOptionPane.OK_OPTION) {
                            proximo = 0;
                            find();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Nenhum texto encontrado.", "Erro", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (HeadlessException e) {
            Logger.getLogger(GTextFinder.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * Retorna a localização do texto conforme a busca realizada
     *
     * @param text {@code String} Texto principal
     * @param value {@code String} Valor buscado
     * @param sensitive {@code boolean} Case sensitive?
     * @return {@code Point} Localização do texto
     */
    public Point getLocation(String text, String value, boolean sensitive) {
        int inicio = -1;
        int fim = -1;
        String txt = !sensitive ? text.toUpperCase() : text;
        String vl = !sensitive ? value.toUpperCase() : value;
        if (txt.contains(vl)) {
            inicio = txt.indexOf(vl, proximo);
            fim = (inicio + vl.length());
        }
        Point ponto = new Point(inicio, fim);
        if (inicio != -1 && fim != -1) {
            proximo = fim;
            return ponto;
        } else {
            return null;
        }
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTLocalizar = new javax.swing.JTextField();
        jLLocalizar = new javax.swing.JLabel();
        jCBDiferenciar = new javax.swing.JCheckBox();
        jBProcurar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar");
        setResizable(false);

        jLLocalizar.setText("Localizar:");

        jCBDiferenciar.setText("Diferenciar maiusculas e minusculas");

        jBProcurar.setText("Localizar");
        jBProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProcurarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLLocalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTLocalizar))
                    .addComponent(jCBDiferenciar, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLocalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBDiferenciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBProcurar)
                    .addComponent(jBCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProcurarActionPerformed
        this.find();
    }//GEN-LAST:event_jBProcurarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBProcurar;
    private javax.swing.JCheckBox jCBDiferenciar;
    private javax.swing.JLabel jLLocalizar;
    private javax.swing.JTextField jTLocalizar;
    // End of variables declaration//GEN-END:variables
}
