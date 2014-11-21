package br.com.gmp.comps.lookup;

import javax.swing.JPanel;

/**
 *
 * @author kaciano
 */
public class GLookUpPane extends JPanel {

    /**
     * Creates new form GLookUpPane
     */
    public GLookUpPane() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBLookUp = new javax.swing.JButton();
        gTFilter = new br.com.gmp.comps.textfield.GTextField();

        setMaximumSize(new java.awt.Dimension(32767, 28));
        setMinimumSize(new java.awt.Dimension(200, 30));
        setPreferredSize(new java.awt.Dimension(200, 30));

        jBLookUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jBLookUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLookUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gTFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jBLookUp))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBLookUp)
            .addComponent(gTFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gTFilter, jBLookUp});

    }// </editor-fold>//GEN-END:initComponents

    private void jBLookUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLookUpActionPerformed
        
    }//GEN-LAST:event_jBLookUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTFilter;
    private javax.swing.JButton jBLookUp;
    // End of variables declaration//GEN-END:variables
}
