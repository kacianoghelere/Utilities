package br.com.gmp.comps.table.bar;

import br.com.gmp.comps.table.GTable;
import javax.swing.JToolBar;

/**
 * Barra de controles padronizados para GTables
 *
 * @author kaciano
 * @version 1.0
 */
public class GTableBar extends JToolBar {

    private GTable gTable;

    /**
     * Cria nova instancia da barra de controle para tabelas
     */
    public GTableBar() {
        this.gTable = null;
        this.initialize();
    }

    /**
     * Cria nova instancia da barra de controle para tabelas
     *
     * @param gTable {@code GTable} Tabela
     */
    public GTableBar(GTable gTable) {
        this.gTable = gTable;
        this.initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
        setTable(gTable);
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

    /**
     * Ir para primeira página
     */
    private void gotoFirst() {
        this.gTable.gotoFirst();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }

    /**
     * Ir para ultima página
     */
    private void gotoLast() {
        this.gTable.gotoLast();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }

    /**
     * Ir para próxima página
     */
    private void goNext() {
        this.gTable.nextPage();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }

    /**
     * Voltar para página anterior
     */
    private void goPrevious() {
        this.gTable.previousPage();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }

    /**
     * Atualizar a tabela
     */
    private void refresh() {
        this.gTable.refresh();
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }

    /**
     * Mudar a quantidade máxima de linhas
     */
    private void changeMax() {
        int max = Integer.parseInt((String) jCBMaxRows.getSelectedItem());
        gTable.setMaxRows(max);
        setPages(gTable.getActualPage(), gTable.getPageCount());
    }

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
        if (table != null) {
            this.gTable = table;
            setPages(gTable.getActualPage(), gTable.getPageCount());
        }
    }

    /**
     * Método gerado automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBFirst = new javax.swing.JButton();
        jBPrevious = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        gNumericField1 = new br.com.gmp.comps.textfield.numeric.GNumericField();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLPages = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jCBMaxRows = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBRefresh = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jBNext = new javax.swing.JButton();
        jBLast = new javax.swing.JButton();
        jBClose = new javax.swing.JButton();

        setFloatable(false);
        setRollover(true);
        setMaximumSize(new java.awt.Dimension(32767, 23));
        setMinimumSize(new java.awt.Dimension(12, 23));
        setPreferredSize(new java.awt.Dimension(350, 23));

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
        add(jBFirst);

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
        add(jBPrevious);

        jSeparator4.setMaximumSize(new java.awt.Dimension(32768, 12));
        add(jSeparator4);

        gNumericField1.setMaximumSize(new java.awt.Dimension(2147483647, 23));
        gNumericField1.setPreferredSize(new java.awt.Dimension(65, 23));
        add(gNumericField1);
        add(jSeparator1);

        jLPages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPages.setText("1/1");
        jLPages.setMaximumSize(new java.awt.Dimension(50, 15));
        add(jLPages);
        add(jSeparator2);

        jCBMaxRows.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "20", "40", "60", "80", "100" }));
        jCBMaxRows.setMaximumSize(new java.awt.Dimension(56, 25));
        jCBMaxRows.setMinimumSize(new java.awt.Dimension(56, 23));
        jCBMaxRows.setPreferredSize(new java.awt.Dimension(56, 23));
        jCBMaxRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMaxRowsActionPerformed(evt);
            }
        });
        add(jCBMaxRows);
        add(jSeparator3);

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
        add(jBRefresh);

        jSeparator5.setMaximumSize(new java.awt.Dimension(32768, 12));
        add(jSeparator5);

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
        add(jBNext);

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
        add(jBLast);

        jBClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/toolbar/4.png"))); // NOI18N
        jBClose.setToolTipText("Fechar barra de paginação");
        jBClose.setFocusable(false);
        jBClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBClose.setMaximumSize(new java.awt.Dimension(23, 23));
        jBClose.setMinimumSize(new java.awt.Dimension(23, 23));
        jBClose.setPreferredSize(new java.awt.Dimension(23, 23));
        jBClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCloseActionPerformed(evt);
            }
        });
        add(jBClose);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreviousActionPerformed
        goPrevious();
    }//GEN-LAST:event_jBPreviousActionPerformed

    private void jBFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFirstActionPerformed
        gotoFirst();
    }//GEN-LAST:event_jBFirstActionPerformed

    private void jCBMaxRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMaxRowsActionPerformed
        changeMax();
    }//GEN-LAST:event_jCBMaxRowsActionPerformed

    private void jBRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefreshActionPerformed
        refresh();
    }//GEN-LAST:event_jBRefreshActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        goNext();
    }//GEN-LAST:event_jBNextActionPerformed

    private void jBLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLastActionPerformed
        gotoLast();
    }//GEN-LAST:event_jBLastActionPerformed

    private void jBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.numeric.GNumericField gNumericField1;
    private javax.swing.JButton jBClose;
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
    // End of variables declaration//GEN-END:variables
}
