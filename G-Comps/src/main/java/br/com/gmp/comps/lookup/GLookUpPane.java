package br.com.gmp.comps.lookup;

import br.com.gmp.comps.lookup.interfaces.LookUpControl;
import javax.swing.JPanel;

/**
 * Painel de controle de LookUp
 *
 * @author kaciano
 */
public class GLookUpPane extends JPanel {

    private LookUpControl control;
    private Object value;

    /**
     * Cria nova instancia de GLookUpPane
     */
    public GLookUpPane() {
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Retorna o texto do filtro
     *
     * @return {@code String} Texto do filtro
     */
    public String getFilter() {
        return this.gTFilter.getText();
    }

    /**
     * Modifica o texto do filtro
     *
     * @param filter {@code String} Texto do filtro
     */
    public void setFilter(String filter) {
        this.gTFilter.setText(filter);
    }

    /**
     * Retorna a interface de controle
     *
     * @return {@code LookUpControl}
     */
    public LookUpControl getControl() {
        return control;
    }

    /**
     * Modifica a interface de controle
     *
     * @param control {@code LookUpControl}
     */
    public void setControl(LookUpControl control) {
        this.control = control;
    }

    /**
     * Retorna o resultado da busca
     *
     * @return {@code Object} Resultado da busca
     */
    public Object getValue() {
        return value;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopControls = new javax.swing.JPopupMenu();
        jMISearch = new javax.swing.JMenuItem();
        jMIFirst = new javax.swing.JMenuItem();
        jMIPrevious = new javax.swing.JMenuItem();
        jMINext = new javax.swing.JMenuItem();
        jMILast = new javax.swing.JMenuItem();
        jBSearch = new javax.swing.JButton();
        gTFilter = new br.com.gmp.comps.textfield.GTextField();

        jMISearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jMISearch.setText("Pesquisar");
        jMISearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchActionPerformed(evt);
            }
        });
        jPopControls.add(jMISearch);

        jMIFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/begining.png"))); // NOI18N
        jMIFirst.setText("Primeiro");
        jMIFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFirstActionPerformed(evt);
            }
        });
        jPopControls.add(jMIFirst);

        jMIPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/left.png"))); // NOI18N
        jMIPrevious.setText("Anterior");
        jMIPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPreviousActionPerformed(evt);
            }
        });
        jPopControls.add(jMIPrevious);

        jMINext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/right.png"))); // NOI18N
        jMINext.setText("Próximo");
        jMINext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINextActionPerformed(evt);
            }
        });
        jPopControls.add(jMINext);

        jMILast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/end.png"))); // NOI18N
        jMILast.setText("Último");
        jMILast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILastActionPerformed(evt);
            }
        });
        jPopControls.add(jMILast);

        setMaximumSize(new java.awt.Dimension(32767, 28));
        setMinimumSize(new java.awt.Dimension(200, 28));
        setPreferredSize(new java.awt.Dimension(200, 28));

        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        gTFilter.setComponentPopupMenu(jPopControls);
        gTFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gTFilterFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gTFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jBSearch))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBSearch)
            .addComponent(gTFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gTFilter, jBSearch});

    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        this.control.search(evt);
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jMISearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchActionPerformed
        this.control.search(evt);
    }//GEN-LAST:event_jMISearchActionPerformed

    private void jMIFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFirstActionPerformed
        this.control.goToFirst(evt);
    }//GEN-LAST:event_jMIFirstActionPerformed

    private void jMIPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPreviousActionPerformed
        this.control.goToPrevious(evt);
    }//GEN-LAST:event_jMIPreviousActionPerformed

    private void jMINextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINextActionPerformed
        this.control.goToNext(evt);
    }//GEN-LAST:event_jMINextActionPerformed

    private void jMILastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILastActionPerformed
        this.control.goToLast(evt);
    }//GEN-LAST:event_jMILastActionPerformed

    private void gTFilterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gTFilterFocusLost
        this.control.search(evt);
    }//GEN-LAST:event_gTFilterFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTFilter;
    private javax.swing.JButton jBSearch;
    private javax.swing.JMenuItem jMIFirst;
    private javax.swing.JMenuItem jMILast;
    private javax.swing.JMenuItem jMINext;
    private javax.swing.JMenuItem jMIPrevious;
    private javax.swing.JMenuItem jMISearch;
    private javax.swing.JPopupMenu jPopControls;
    // End of variables declaration//GEN-END:variables
}
