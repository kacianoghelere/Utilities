package br.com.gmp.comps.table.bar;

import br.com.gmp.comps.table.GTable;
import java.awt.FlowLayout;

/**
 * Barra de controles padronizados para GTables
 *
 * @author kaciano
 * @version 1.0
 */
public class GMPTableBar extends javax.swing.JPanel {

    private GTable gTable;

    /**
     * Cria nova instancia da barra de controle para tabelas
     */
    public GMPTableBar() {
        this.gTable = null;
        initComponents();
        jTBPage.setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    /**
     * Cria nova instancia da barra de controle para tabelas
     *
     * @param gTable {@code GTable} Tabela
     */
    public GMPTableBar(GTable gTable) {
        this.gTable = gTable;
        initComponents();
        jTBPage.setLayout(new FlowLayout(FlowLayout.CENTER));
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }

    /**
     * Modifica o rotulo das páginas
     *
     * @param actualpage {@code Integer} Página atual
     * @param pages {@code Integer} Total de páginas
     */
    private void setPages(int actualpage, int pages) {
        this.jLPages.setText(String.format("%s/%d", actualpage + 1, pages));
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna a tabela que está sendo utilizada
     *
     * @return {@code GTable} Tabela
     */
    public GTable getTable() {
        return gTable;
    }

    /**
     * Modifica a tabela que está sendo utilizada
     *
     * @param table {@code GTable} Tabela
     */
    public void setTable(GTable table) {
        this.gTable = table;
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }
    //</editor-fold>

    /**
     * Código gerado automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBPrevious = new javax.swing.JToolBar();
        jBFirst = new javax.swing.JButton();
        jBPrevious = new javax.swing.JButton();
        jTBPage = new javax.swing.JToolBar();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        gNumericField1 = new br.com.gmp.comps.textfield.numeric.GNumericField();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLPages = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jCBMaxRows = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBRefresh = new javax.swing.JButton();
        jTBNext = new javax.swing.JToolBar();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jBNext = new javax.swing.JButton();
        jBLast = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(363, 23));
        setPreferredSize(new java.awt.Dimension(363, 23));

        jTBPrevious.setFloatable(false);
        jTBPrevious.setRollover(true);
        jTBPrevious.setMaximumSize(new java.awt.Dimension(60, 23));
        jTBPrevious.setMinimumSize(new java.awt.Dimension(60, 23));
        jTBPrevious.setPreferredSize(new java.awt.Dimension(60, 23));

        jBFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/begining.png"))); // NOI18N
        jBFirst.setToolTipText("Voltar para a primeira página");
        jBFirst.setFocusable(false);
        jBFirst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBFirst.setMaximumSize(new java.awt.Dimension(23, 23));
        jBFirst.setMinimumSize(new java.awt.Dimension(23, 23));
        jBFirst.setPreferredSize(new java.awt.Dimension(23, 23));
        jBFirst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFirstActionPerformed(evt);
            }
        });
        jTBPrevious.add(jBFirst);

        jBPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/left.png"))); // NOI18N
        jBPrevious.setToolTipText("Voltar para a página anterior");
        jBPrevious.setFocusable(false);
        jBPrevious.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPrevious.setMaximumSize(new java.awt.Dimension(23, 23));
        jBPrevious.setMinimumSize(new java.awt.Dimension(23, 23));
        jBPrevious.setPreferredSize(new java.awt.Dimension(23, 23));
        jBPrevious.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreviousActionPerformed(evt);
            }
        });
        jTBPrevious.add(jBPrevious);

        jTBPage.setFloatable(false);
        jTBPage.setRollover(true);
        jTBPage.setMaximumSize(new java.awt.Dimension(32767, 25));

        jSeparator4.setMaximumSize(new java.awt.Dimension(32768, 12));
        jTBPage.add(jSeparator4);

        gNumericField1.setMaximumSize(new java.awt.Dimension(2147483647, 23));
        gNumericField1.setPreferredSize(new java.awt.Dimension(65, 23));
        jTBPage.add(gNumericField1);
        jTBPage.add(jSeparator1);

        jLPages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPages.setText("1/1");
        jLPages.setMaximumSize(new java.awt.Dimension(50, 15));
        jTBPage.add(jLPages);
        jTBPage.add(jSeparator2);

        jCBMaxRows.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "20", "40", "60", "80", "100" }));
        jCBMaxRows.setMaximumSize(new java.awt.Dimension(56, 25));
        jCBMaxRows.setMinimumSize(new java.awt.Dimension(56, 23));
        jCBMaxRows.setPreferredSize(new java.awt.Dimension(56, 23));
        jCBMaxRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMaxRowsActionPerformed(evt);
            }
        });
        jTBPage.add(jCBMaxRows);
        jTBPage.add(jSeparator3);

        jBRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/switch.png"))); // NOI18N
        jBRefresh.setToolTipText("Atualizar a tabela");
        jBRefresh.setFocusable(false);
        jBRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRefresh.setMaximumSize(new java.awt.Dimension(23, 23));
        jBRefresh.setMinimumSize(new java.awt.Dimension(23, 23));
        jBRefresh.setPreferredSize(new java.awt.Dimension(23, 23));
        jBRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefreshActionPerformed(evt);
            }
        });
        jTBPage.add(jBRefresh);

        jTBNext.setFloatable(false);
        jTBNext.setRollover(true);
        jTBNext.setMaximumSize(new java.awt.Dimension(60, 23));
        jTBNext.setMinimumSize(new java.awt.Dimension(60, 23));
        jTBNext.setPreferredSize(new java.awt.Dimension(60, 23));

        jSeparator5.setMaximumSize(new java.awt.Dimension(32768, 12));
        jTBNext.add(jSeparator5);

        jBNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/right.png"))); // NOI18N
        jBNext.setToolTipText("Ir para a próxima página");
        jBNext.setFocusable(false);
        jBNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNext.setMaximumSize(new java.awt.Dimension(23, 23));
        jBNext.setMinimumSize(new java.awt.Dimension(23, 23));
        jBNext.setPreferredSize(new java.awt.Dimension(23, 23));
        jBNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });
        jTBNext.add(jBNext);

        jBLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/end.png"))); // NOI18N
        jBLast.setToolTipText("Ir para a ultima página");
        jBLast.setFocusable(false);
        jBLast.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLast.setMaximumSize(new java.awt.Dimension(23, 23));
        jBLast.setMinimumSize(new java.awt.Dimension(23, 23));
        jBLast.setPreferredSize(new java.awt.Dimension(23, 23));
        jBLast.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLastActionPerformed(evt);
            }
        });
        jTBNext.add(jBLast);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTBPage, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTBNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBPage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreviousActionPerformed
        this.gTable.previousPage();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }//GEN-LAST:event_jBPreviousActionPerformed

    private void jBFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFirstActionPerformed
        this.gTable.gotoFirst();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }//GEN-LAST:event_jBFirstActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        this.gTable.nextPage();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }//GEN-LAST:event_jBNextActionPerformed

    private void jBLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLastActionPerformed
        this.gTable.gotoLast();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }//GEN-LAST:event_jBLastActionPerformed

    private void jBRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefreshActionPerformed
        this.gTable.refresh();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }//GEN-LAST:event_jBRefreshActionPerformed

    private void jCBMaxRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMaxRowsActionPerformed
        int max = Integer.parseInt((String) jCBMaxRows.getSelectedItem());
        gTable.setMaxRows(max);
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }//GEN-LAST:event_jCBMaxRowsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.numeric.GNumericField gNumericField1;
    private javax.swing.JButton jBFirst;
    private javax.swing.JButton jBLast;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBPrevious;
    private javax.swing.JButton jBRefresh;
    private javax.swing.JComboBox jCBMaxRows;
    private javax.swing.JLabel jLPages;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jTBNext;
    private javax.swing.JToolBar jTBPage;
    private javax.swing.JToolBar jTBPrevious;
    // End of variables declaration//GEN-END:variables
}
