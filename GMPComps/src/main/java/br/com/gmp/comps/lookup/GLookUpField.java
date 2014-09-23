package br.com.gmp.comps.lookup;

import br.com.gmp.comps.data.DAO;
import br.com.gmp.comps.data.test.TestDAO;
import br.com.gmp.comps.lookup.dialog.GLookUpDialog;
import br.com.gmp.comps.textfield.GTextField;
import java.awt.BorderLayout;

/**
 * Campo de texto para buscas automaticas
 *
 * @author kaciano
 */
public class GLookUpField extends GTextField {

    private DAO dao;
    private GLookUpDialog dialog;

    /**
     * Cria nova instancia de GLookUpField
     */
    public GLookUpField() {
        initialize(null);
    }

    /**
     * Cria nova instancia de GLookUpField
     *
     * @param dao {@code DAO} DAO de controle das entidades
     */
    public GLookUpField(DAO dao) {
        initialize(dao);
    }

    /**
     * Método de inicialização
     *
     * @param dao {@code DAO} DAO de controle das entidades
     */
    private void initialize(DAO dao) {
        this.setDao(dao);
        this.setLayout(new BorderLayout());
        this.initComponents();
        this.add(jBLookUp, BorderLayout.EAST);
        this.dialog = new GLookUpDialog(dao);
    }

    /**
     * Retorna o DAO de controle das entidades
     *
     * @return {@code DAO} DAO de controle das entidades
     */
    public DAO getDao() {
        return dao;
    }

    /**
     * Modifica o DAO de controle das entidades
     *
     * @param dao {@code DAO} DAO de controle das entidades
     */
    public void setDao(DAO dao) {
        this.dao = dao != null ? dao : new TestDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBLookUp = new javax.swing.JButton();

        jBLookUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jBLookUp.setToolTipText("Buscar");
        jBLookUp.setMaximumSize(new java.awt.Dimension(25, 25));
        jBLookUp.setMinimumSize(new java.awt.Dimension(25, 25));
        jBLookUp.setPreferredSize(new java.awt.Dimension(25, 25));
        jBLookUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLookUpActionPerformed(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void jBLookUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLookUpActionPerformed
        this.dialog.show();
    }//GEN-LAST:event_jBLookUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLookUp;
    // End of variables declaration//GEN-END:variables
}
