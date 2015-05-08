/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.comps.sidedlist;

import br.com.gmp.comps.util.Pair;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author kaciano
 */
public class SidedList extends JPanel {

    private LinkedList list1;
    private LinkedList list2;
    private Object[] list1Array;
    private Object[] list2Array;

    public SidedList(LinkedList list1, LinkedList list2) {
        this.list1 = list1;
        this.list2 = list2;
        initComponents();
    }

    public void listToArray() {
        this.list1Array = list1.toArray();
        this.list2Array = list2.toArray();
    }

    public Pair<Object[], Object[]> getArrays() {
        Pair<Object[], Object[]> pair = new Pair<>(list1Array, list2Array);
        return pair;
    }

    public LinkedList getList1() {
        return list1;
    }

    public void setList1(LinkedList list1) {
        this.list1 = list1;
    }

    public LinkedList getList2() {
        return list2;
    }

    public void setList2(LinkedList list2) {
        this.list2 = list2;
    }

    public Object[] getList1Array() {
        return list1Array;
    }

    public void setList1Array(Object[] list1Array) {
        this.list1Array = list1Array;
    }

    public Object[] getList2Array() {
        return list2Array;
    }

    public void setList2Array(Object[] list2Array) {
        this.list2Array = list2Array;
    }

    public JList getjList1() {
        return jList1;
    }

    public void setjList1(JList jList1) {
        this.jList1 = jList1;
    }

    public JLabel getjList1Label() {
        return jList1Label;
    }

    public void setjList1Label(JLabel jList1Label) {
        this.jList1Label = jList1Label;
    }

    public JList getjList2() {
        return jList2;
    }

    public void setjList2(JList jList2) {
        this.jList2 = jList2;
    }

    public JLabel getjList2Label() {
        return jList2Label;
    }

    public void setjList2Label(JLabel jList2Label) {
        this.jList2Label = jList2Label;
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPList1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jList1Label = new javax.swing.JLabel();
        jPList2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jList2Label = new javax.swing.JLabel();
        jPControls = new javax.swing.JPanel();
        jBAddOneTo2 = new javax.swing.JButton();
        jBAddAllTo2 = new javax.swing.JButton();
        jBAddOneTo1 = new javax.swing.JButton();
        jBAddAllTo1 = new javax.swing.JButton();

        jPList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList1Label.setText("Lista 1");

        javax.swing.GroupLayout jPList1Layout = new javax.swing.GroupLayout(jPList1);
        jPList1.setLayout(jPList1Layout);
        jPList1Layout.setHorizontalGroup(
            jPList1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPList1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPList1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addGroup(jPList1Layout.createSequentialGroup()
                        .addComponent(jList1Label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPList1Layout.setVerticalGroup(
            jPList1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPList1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jList1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPList2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jList2Label.setText("Lista 2");

        javax.swing.GroupLayout jPList2Layout = new javax.swing.GroupLayout(jPList2);
        jPList2.setLayout(jPList2Layout);
        jPList2Layout.setHorizontalGroup(
            jPList2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPList2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPList2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addGroup(jPList2Layout.createSequentialGroup()
                        .addComponent(jList2Label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPList2Layout.setVerticalGroup(
            jPList2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPList2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jList2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPControls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jBAddOneTo2.setIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/GMPComps/src/main/resources/res/sidedlist/16/circle_right.png")); // NOI18N
        jBAddOneTo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddOneTo2ActionPerformed(evt);
            }
        });
        jPControls.add(jBAddOneTo2);

        jBAddAllTo2.setIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/GMPComps/src/main/resources/res/sidedlist/16/circle_fast_forward.png")); // NOI18N
        jBAddAllTo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddAllTo2ActionPerformed(evt);
            }
        });
        jPControls.add(jBAddAllTo2);

        jBAddOneTo1.setIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/GMPComps/src/main/resources/res/sidedlist/16/circle_left.png")); // NOI18N
        jBAddOneTo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddOneTo1ActionPerformed(evt);
            }
        });
        jPControls.add(jBAddOneTo1);

        jBAddAllTo1.setIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/GMPComps/src/main/resources/res/sidedlist/16/circle_rewind.png")); // NOI18N
        jBAddAllTo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddAllTo1ActionPerformed(evt);
            }
        });
        jPControls.add(jBAddAllTo1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPControls, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPList2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPList1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPList2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPControls, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddOneTo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddOneTo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAddOneTo2ActionPerformed

    private void jBAddAllTo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddAllTo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAddAllTo2ActionPerformed

    private void jBAddOneTo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddOneTo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAddOneTo1ActionPerformed

    private void jBAddAllTo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddAllTo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAddAllTo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddAllTo1;
    private javax.swing.JButton jBAddAllTo2;
    private javax.swing.JButton jBAddOneTo1;
    private javax.swing.JButton jBAddOneTo2;
    private javax.swing.JList jList1;
    private javax.swing.JLabel jList1Label;
    private javax.swing.JList jList2;
    private javax.swing.JLabel jList2Label;
    private javax.swing.JPanel jPControls;
    private javax.swing.JPanel jPList1;
    private javax.swing.JPanel jPList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
