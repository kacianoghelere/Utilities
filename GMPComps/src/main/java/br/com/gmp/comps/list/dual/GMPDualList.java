package br.com.gmp.comps.list.dual;

import br.com.gmp.comps.list.dual.model.SortedListModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.ListModel;

/**
 *
 * @author kaciano
 */
public class GMPDualList extends JPanel {

    private String sourceLabelText;
    private String destLabelText;
    private SortedListModel sourceListModel;
    private SortedListModel destListModel;

    /**
     * Cria nova instancia de GMPDualList
     */
    public GMPDualList() {
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        sourceListModel = new SortedListModel();
        destListModel = new SortedListModel();
        initComponents();
        jBToRight.addActionListener(new AddListener());
        jBToLeft.addActionListener(new RemoveListener());
    }

    /**
     * Limpa o modelo da lista de fonte
     */
    public void clearSourceListModel() {
        sourceListModel.clear();
    }

    /**
     * Limpa o modelo da lista de destino
     */
    public void clearDestinationListModel() {
        destListModel.clear();
    }

    /**
     * Adiciona itens na lista de fonte
     *
     * @param newValue <code>ListModel</code> Novos valores
     */
    public void addSourceElements(ListModel newValue) {
        fillListModel(sourceListModel, newValue);
    }

    /**
     * Define itens na lista de fonte
     *
     * @param newValue <code>ListModel</code> Novos valores
     */
    public void setSourceElements(ListModel newValue) {
        clearSourceListModel();
        addSourceElements(newValue);
    }

    /**
     * Adiciona itens na lista de fonte
     *
     * @param newValue <code>ListModel</code> Novos valores
     */
    public void addDestinationElements(ListModel newValue) {
        fillListModel(destListModel, newValue);
    }

    /**
     * Preenche o modelo da lista
     *
     * @param model <code>SortedListModel</code> Modelo
     * @param newValues <code>ListModel</code> Novos valores
     */
    private void fillListModel(SortedListModel model, ListModel newValues) {
        int size = newValues.getSize();
        for (int i = 0; i < size; i++) {
            model.add(newValues.getElementAt(i));
        }
    }

    /**
     * Adiciona itens na lista de fonte
     *
     * @param newValues <code>Object[]</code> Novos valores
     */
    public void addSourceElements(Object[] newValues) {
        fillListModel(sourceListModel, newValues);
    }

    /**
     * Adiciona itens na lista de fonte
     *
     * @param newValues <code>List</code><?> Novos valores
     */
    public void addSourceElements(List<?> newValues) {
        fillListModel(sourceListModel, newValues.toArray());
    }

    /**
     * Define os itens na lista de fonte
     *
     * @param newValues <code>Object[]</code> Novos valores
     */
    public void setSourceElements(Object[] newValues) {
        clearSourceListModel();
        addSourceElements(newValues);
    }

    /**
     * Adiciona itens na lista de destino
     *
     * @param newValues <code>Object[]</code> Novos valores
     */
    public void addDestinationElements(Object[] newValues) {
        fillListModel(destListModel, newValues);
    }

    /**
     * Adiciona itens na lista de destino
     *
     * @param newValues <code>List</code><?> Novos valores
     */
    public void addDestinationElements(List<?> newValues) {
        fillListModel(destListModel, newValues.toArray());
    }

    /**
     * Preenche o ListModel
     *
     * @param model
     * @param newValues <code>Object[]</code> Novos valores
     */
    private void fillListModel(SortedListModel model, Object[] newValues) {
        model.addAll(newValues);
    }

    /**
     * Limpa a lista de fonte
     */
    private void clearSourceSelected() {
        Object selected[] = sourceList.getSelectedValues();
        for (int i = selected.length - 1; i >= 0; --i) {
            sourceListModel.removeElement(selected[i]);
        }
        sourceList.getSelectionModel().clearSelection();
    }

    /**
     * Limpa a lista de destino
     */
    private void clearDestinationSelected() {
        Object selected[] = destList.getSelectedValues();
        for (int i = selected.length - 1; i >= 0; --i) {
            destListModel.removeElement(selected[i]);
        }
        destList.getSelectionModel().clearSelection();
    }

    /**
     * Listener de adição dos itens
     */
    private class AddListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object selected[] = sourceList.getSelectedValues();
            addDestinationElements(selected);
            clearSourceSelected();
        }
    }

    /**
     * Listener de remoção dos itens
     */
    private class RemoveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object selected[] = destList.getSelectedValues();
            addSourceElements(selected);
            clearDestinationSelected();
        }
    }

    /**
     * Revalida os dados
     */
    private void refresh() {
        sourceList.repaint();
        sourceList.revalidate();
        destList.repaint();
        destList.revalidate();
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna o texto do rótulo da fonte
     *
     * @return <code>String<code> Texto do rótulo da fonte
     */
    public String getSourceLabelText() {
        return sourceLabelText;
    }

    /**
     * Modifica o texto do rótulo na lista de fonte
     *
     * @param sourceLabelText <code>String<code>
     */
    public void setSourceLabelText(String sourceLabelText) {
        this.sourceLabelText = sourceLabelText;
        this.sourceLabel.setText(sourceLabelText);
    }

    /**
     * Retorna o texto do rótulo do destino
     *
     * @return <code>String<code> Texto do rótulo do destino
     */
    public String getDestinationLabelText() {
        return destLabelText;
    }

    /**
     * Modifica o texto do rótulo na lista de destino
     *
     * @param destLabelText <code>String<code>
     */
    public void setDestinationLabelText(String destLabelText) {
        this.destLabelText = destLabelText;
        this.destLabel.setText(destLabelText);
    }

    //</editor-fold>
    /**
     * Código gerado automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLabels = new javax.swing.JPanel();
        sourceLabel = new javax.swing.JLabel();
        destLabel = new javax.swing.JLabel();
        jPLists = new javax.swing.JPanel();
        jSP1 = new javax.swing.JScrollPane();
        sourceList = new javax.swing.JList();
        jSP2 = new javax.swing.JScrollPane();
        destList = new javax.swing.JList();
        jPButtons = new javax.swing.JPanel();
        jBToRight = new javax.swing.JButton();
        jBAllToRight = new javax.swing.JButton();
        jBAllToLeft = new javax.swing.JButton();
        jBToLeft = new javax.swing.JButton();

        jPLabels.setName("jPLabels"); // NOI18N
        jPLabels.setLayout(new java.awt.GridLayout(1, 2));

        sourceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sourceLabel.setText("Label1");
        sourceLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sourceLabel.setName("sourceLabel"); // NOI18N
        jPLabels.add(sourceLabel);

        destLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destLabel.setText("Label2");
        destLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        destLabel.setName("destLabel"); // NOI18N
        jPLabels.add(destLabel);

        jPLists.setName("jPLists"); // NOI18N
        jPLists.setLayout(new java.awt.GridLayout(1, 2));

        jSP1.setName("jSP1"); // NOI18N

        sourceList.setModel(sourceListModel);
        sourceList.setName("sourceList"); // NOI18N
        jSP1.setViewportView(sourceList);

        jPLists.add(jSP1);

        jSP2.setName("jSP2"); // NOI18N

        destList.setModel(destListModel);
        destList.setName("destList"); // NOI18N
        jSP2.setViewportView(destList);

        jPLists.add(jSP2);

        jPButtons.setName("jPButtons"); // NOI18N
        jPButtons.setLayout(new java.awt.GridLayout(1, 4));

        jBToRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/24/Navigate_right.png"))); // NOI18N
        jBToRight.setName("jBToRight"); // NOI18N
        jPButtons.add(jBToRight);

        jBAllToRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/24/Hide_right.png"))); // NOI18N
        jBAllToRight.setName("jBAllToRight"); // NOI18N
        jBAllToRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAllToRightActionPerformed(evt);
            }
        });
        jPButtons.add(jBAllToRight);

        jBAllToLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/24/Hide_left.png"))); // NOI18N
        jBAllToLeft.setName("jBAllToLeft"); // NOI18N
        jBAllToLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAllToLeftActionPerformed(evt);
            }
        });
        jPButtons.add(jBAllToLeft);

        jBToLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/24/Navigate_left.png"))); // NOI18N
        jBToLeft.setName("jBToLeft"); // NOI18N
        jBToLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBToLeftActionPerformed(evt);
            }
        });
        jPButtons.add(jBToLeft);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPLists, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
            .addComponent(jPButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPLists, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAllToRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAllToRightActionPerformed
        Object selected[] = sourceListModel.getElements();
        addDestinationElements(selected);
        sourceListModel.clear();
        refresh();
    }//GEN-LAST:event_jBAllToRightActionPerformed

    private void jBAllToLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAllToLeftActionPerformed
        Object selected[] = destListModel.getElements();
        addSourceElements(selected);
        destListModel.clear();
        refresh();
    }//GEN-LAST:event_jBAllToLeftActionPerformed

    private void jBToLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBToLeftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBToLeftActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel destLabel;
    private javax.swing.JList destList;
    private javax.swing.JButton jBAllToLeft;
    private javax.swing.JButton jBAllToRight;
    private javax.swing.JButton jBToLeft;
    private javax.swing.JButton jBToRight;
    private javax.swing.JPanel jPButtons;
    private javax.swing.JPanel jPLabels;
    private javax.swing.JPanel jPLists;
    private javax.swing.JScrollPane jSP1;
    private javax.swing.JScrollPane jSP2;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JList sourceList;
    // End of variables declaration//GEN-END:variables
}
