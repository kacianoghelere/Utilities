package br.com.gmp.comps.table;

import br.com.gmp.comps.GColors;
import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.Exporter;
import br.com.gmp.comps.model.GTableModel;
import br.com.gmp.comps.objects.TableObject;
import br.com.gmp.comps.table.interfaces.TableControl;
import br.com.gmp.comps.table.interfaces.TableSource;
import br.com.gmp.utils.collections.CollectionUtil;
import br.com.gmp.utils.export.PDFExporter;
import br.com.gmp.utils.export.TXTExporter;
import br.com.gmp.utils.export.XLSExporter;
import br.com.gmp.utils.export.XMLExporter;
import com.lowagie.text.DocumentException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import jxl.write.WriteException;

/**
 * Tabela customizada
 *
 * @author kaciano
 * @version 1.0
 * @see javax.swing.JTable
 */
public class GTable extends JTable implements TableControl, Exporter {

    private TableSource source;
    private int pageCount;
    private int actualPage;
    private int maxRows;
    private List[] pages;
    private GTableModel model;
    private TableRowSorter<GTableModel> rowSorter;

    /**
     * Cria nova instancia de GMPTable
     */
    public GTable() {
        this.source = new TableSource() {
            @Override
            public List<TableObject> getTableData() {
                return new ArrayList<>();
            }
        };
        this.model = new SimpleModel();
        this.pageCount = 0;
        this.initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source <code>TableSource</code> Fonte de dados
     * @param model <code>GTableModel</code> Modelo da tabela
     */
    public GTable(TableSource source, GTableModel model) {
        this.source = source;
        this.maxRows = 0;
        this.model = model;
        this.initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source <code>TableSource</code> Fonte de dados
     * @param maxRows <code>Integer</code> Numero máximo de linhas
     * @param model <code>GTableModel</code> Modelo da tabela
     */
    public GTable(TableSource source, int maxRows, GTableModel model) {
        this.source = source;
        this.maxRows = maxRows;
        this.model = model;
        this.initialize();
    }

    /**
     * Metodo de inicialização
     */
    private void initialize() {
        this.initComponents();        
        this.getTableHeader().setLayout(new BorderLayout());
        this.getTableHeader().add(jTBSearch, BorderLayout.NORTH);
        this.jTBSearch.setBorderPainted(false);
        this.jTBSearch.setVisible(false);
        this.setShowGrid(true);
        this.setGridColor(Color.gray.darker());
        this.loadData();
    }

    /**
     * Carrega os dados da tabela
     */
    private void loadData() {
        this.splitData(source.getTableData(), maxRows);
        this.setModel(model);
    }

    @Override
    public void refresh() {
        this.loadData();
    }

    @Override
    public void nextPage() {
        if (actualPage < (pageCount - 1)) {
            setActualPage(actualPage + 1);
        } else {
            new BalloonUtil().showTimedBallon(this, "Esta é a ultima pagina");
        }
    }

    @Override
    public void previousPage() {
        if (actualPage > 0) {
            setActualPage(actualPage - 1);
        } else {
            new BalloonUtil().showTimedBallon(this, "Esta é a primeira pagina");
        }
    }

    @Override
    public int getMaxRows() {
        return this.maxRows;
    }

    @Override
    public void setMaxRows(int maxrows) {
        this.maxRows = maxrows;
        loadData();
    }

    @Override
    public int getActualPage() {
        return this.actualPage;
    }

    @Override
    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
        this.getDefaultModel().setData(pages[actualPage]);
        this.repaint();
        this.revalidate();
    }

    @Override
    public void gotoPage(int page) {
        this.setActualPage(page);
    }

    @Override
    public void gotoFirst() {
        this.setActualPage(0);
    }

    @Override
    public void gotoLast() {
        if (pages != null) {
            this.setActualPage(pages.length > 0 ? (pages.length - 1) : 0);
        }
    }

    /**
     * Retorna os objetos selecionados na tabela, se não houver nenhum, retorna
     * null
     *
     * @return <code>Object[]</code> Objetos selecionados
     */
    public Object[] getSelectedObjects() {
        try {
            List list = new ArrayList();
            if (getSelectedRows() != null) {
                for (int i : getSelectedRows()) {
                    list.add(model.getObject(i));
                }
            }
            if (!list.isEmpty()) {
                return list.toArray();
            } else {
                new BalloonUtil().showTimedBallon(this, "Nenhum item selecionado");
                return null;
            }
        } catch (Exception e) {
            Logger.getLogger(GTable.class.getName()).log(Level.SEVERE, null, e);
            new BalloonUtil().showTimedBallon(this, "Nenhum item selecionado");
            return null;
        }
    }

    /**
     * Constroi a tabela baseada nos dados informados
     *
     * @param source <code>TableSource</code> Fonte de dados
     * @param maxrows <code>Integer</code> Numero máximo de linhas
     * @param model <code>GTableModel</code> Modelo da tabela
     */
    public void buildTable(TableSource source, int maxrows, GTableModel model) {
        this.source = source;
        this.maxRows = maxrows;
        this.model = model;
        if (rowSorter == null) {
            this.rowSorter = (TableRowSorter<GTableModel>) new TableRowSorter<>(model);
            this.setRowSorter(rowSorter);
        }
        this.gTSearch.setColumns(10);
        this.gTSearch.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent arg0) {
                String text = gTSearch.getText().trim();
                if (!text.isEmpty()) {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, 0));
                }
            }
        });
        this.loadData();
        this.repaint();
        this.revalidate();
    }

    /**
     * Divide a lista principal em listas menores para gerar as páginas
     *
     * @param list <code><b>List</b>(Object)</code> Lista com os dados da tabela
     */
    private void splitData(List<Object> list, int maxRows) {
        if (maxRows != 0 && !list.isEmpty()) {
            this.pages = new CollectionUtil().splitList(list, maxRows);
        } else {
            this.pages = new ArrayList[1];
            this.pages[0] = list;
        }
        this.pageCount = pages.length;
        setActualPage(0);
    }

    @Override
    public void setModel(TableModel dataModel) {
        super.setModel(dataModel);
        if (dataModel instanceof GTableModel) {
            setDefaultModel((GTableModel) dataModel);
        }
    }

    /**
     * Monta a tabela
     *
     * @param objectclass <code><b>Class</b>(Object)</code> Classe a ser mapeada
     * @param list <code><b>List</b>(Object)</code> Lista com os dados da tabela
     */
    public void mount(Class<Object> objectclass, List<Object> list) {
        this.setModel(new GTableModel(list));
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        if (c instanceof JCheckBox) {
            JCheckBox check = (JCheckBox) c;
            check.setOpaque(showVerticalLines);
        }
        if (row % 2 == 0 && !isCellSelected(row, column)) {
            c.setBackground(GColors.FOCUS);
        } else if (isCellSelected(row, column)) {
            c.setBackground(getSelectionBackground());
        } else {
            c.setBackground(getBackground());
        }
        return c;
    }

    /**
     * Reagrupa todas as listas de páginas em uma
     *
     * @return <code>List</code> Lista reagrupada
     */
    private List assemblyData() {
        List data = new ArrayList();
        for (List<Object> list : pages) {
            for (Object object : list) {
                data.add(object);
            }
        }
        return data;
    }

    @Override
    public void exportXLS() {
        try {
            List data = assemblyData();
            new XLSExporter().exportData(data, "TableExport", "TableExport");
        } catch (IllegalAccessException | WriteException | IOException ex) {
            Logger.getLogger(GTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void exportTXT() {
        try {
            List data = assemblyData();
            new TXTExporter().exportTableList(data, "TableExport");
        } catch (IllegalAccessException | IOException ex) {
            Logger.getLogger(GTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void exportPDF() {
        try {
            List data = assemblyData();
            new PDFExporter().export(data, "TableExport");
        } catch (DocumentException | IOException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(GTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void exportXML() {
        try {
            List data = assemblyData();
            new XMLExporter().write(data, "TableExport");
        } catch (Exception ex) {
            Logger.getLogger(GTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Retorna o GTableModel da tabela
     *
     * @return <code>GTableModel(?)</code> Modelo da tabela
     */
    public GTableModel<?> getGModel() {
        return model;
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna o modelo da tabela
     *
     * @return <code>GTableModel</code> Modelo da tabela
     */
    public GTableModel getDefaultModel() {
        return model;
    }

    /**
     * Modifica o modelo da tabela
     *
     * @param model <code>GTableModel</code> Modelo da tabela
     */
    public void setDefaultModel(GTableModel model) {
        this.model = model;
    }

    /**
     * Retorna a fonte de dados
     *
     * @return <code>TableSource</code> Fonte de dados
     */
    public TableSource getSource() {
        return source;
    }

    /**
     * Modifica a fonte de dados
     *
     * @param source <code>TableSource</code> Fonte de dados
     */
    public void setSource(TableSource source) {
        this.source = source;
    }

    /**
     * Retorna a quantidade de páginas
     *
     * @return <code>int</code> Quantidade de páginas
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Retorna as páginas
     *
     * @return <code>List[]</code> Array de listas das páginas
     */
    public List[] getPages() {
        return pages;
    }

    /**
     * Modifica as páginas
     *
     * @param pages <code>List[]</code> Array de listas das páginas
     */
    public void setPages(List[] pages) {
        this.pages = pages;
    }

    //</editor-fold>
    /**
     * Código gerado automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPop = new javax.swing.JPopupMenu();
        jMISearch = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIExportXLS = new javax.swing.JMenuItem();
        jMIExportTXT = new javax.swing.JMenuItem();
        jMIExportPDF = new javax.swing.JMenuItem();
        jMIExportXML = new javax.swing.JMenuItem();
        jTBSearch = new javax.swing.JToolBar();
        jLSeach = new javax.swing.JLabel();
        gTSearch = new br.com.gmp.comps.textfield.GTextField();

        jMISearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jMISearch.setText("Filtrar");
        jMISearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchActionPerformed(evt);
            }
        });
        jPop.add(jMISearch);
        jPop.add(jSeparator1);

        jMIExportXLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/menubar/menubar/file_xls.png"))); // NOI18N
        jMIExportXLS.setText("<html>Exportar para <b>XLS</b></html>");
        jMIExportXLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExportXLSActionPerformed(evt);
            }
        });
        jPop.add(jMIExportXLS);

        jMIExportTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/collapsible/text.png"))); // NOI18N
        jMIExportTXT.setText("<html>Exportar para <b>TXT</b></html>");
        jMIExportTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExportTXTActionPerformed(evt);
            }
        });
        jPop.add(jMIExportTXT);

        jMIExportPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/menubar/menubar/icon-pdf.png"))); // NOI18N
        jMIExportPDF.setText("<html>Exportar para <b>PDF</b></html>");
        jMIExportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExportPDFActionPerformed(evt);
            }
        });
        jPop.add(jMIExportPDF);

        jMIExportXML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/menubar/menubar/file.png"))); // NOI18N
        jMIExportXML.setText("Exportar para XML");
        jMIExportXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExportXMLActionPerformed(evt);
            }
        });
        jPop.add(jMIExportXML);

        jTBSearch.setFloatable(false);
        jTBSearch.setRollover(true);
        jTBSearch.setPreferredSize(new java.awt.Dimension(100, 23));

        jLSeach.setText("Filtrar:");
        jLSeach.setToolTipText("");
        jTBSearch.add(jLSeach);

        gTSearch.setPreferredSize(new java.awt.Dimension(250, 28));
        gTSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gTSearchFocusLost(evt);
            }
        });
        jTBSearch.add(gTSearch);

        setComponentPopupMenu(jPop);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIExportXLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExportXLSActionPerformed
        exportXLS();
    }//GEN-LAST:event_jMIExportXLSActionPerformed

    private void jMIExportTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExportTXTActionPerformed
        exportTXT();
    }//GEN-LAST:event_jMIExportTXTActionPerformed

    private void jMIExportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExportPDFActionPerformed
        exportPDF();
    }//GEN-LAST:event_jMIExportPDFActionPerformed

    private void jMIExportXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExportXMLActionPerformed
        exportXML();
    }//GEN-LAST:event_jMIExportXMLActionPerformed

    private void gTSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gTSearchFocusLost
        jTBSearch.setVisible(false);
    }//GEN-LAST:event_gTSearchFocusLost

    private void jMISearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchActionPerformed
        jTBSearch.setVisible(true);
    }//GEN-LAST:event_jMISearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTSearch;
    private javax.swing.JLabel jLSeach;
    private javax.swing.JMenuItem jMIExportPDF;
    private javax.swing.JMenuItem jMIExportTXT;
    private javax.swing.JMenuItem jMIExportXLS;
    private javax.swing.JMenuItem jMIExportXML;
    private javax.swing.JMenuItem jMISearch;
    private javax.swing.JPopupMenu jPop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jTBSearch;
    // End of variables declaration//GEN-END:variables
}

/**
 * Modelo exclusivo para construção da tabela
 *
 * @author kaciano
 */
class SimpleModel extends GTableModel<TableObject> {

}
