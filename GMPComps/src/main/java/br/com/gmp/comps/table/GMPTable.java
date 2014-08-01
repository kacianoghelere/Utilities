package br.com.gmp.comps.table;

import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.Exporter;
import br.com.gmp.comps.model.GMPTableModel;
import br.com.gmp.comps.objects.TableObject;
import br.com.gmp.comps.table.bar.GMPTableBar;
import br.com.gmp.comps.table.interfaces.TableControl;
import br.com.gmp.comps.table.interfaces.TableSource;
import br.com.gmp.utils.collections.CollectionUtil;
import br.com.gmp.utils.export.PDFExporter;
import br.com.gmp.utils.export.TXTExporter;
import br.com.gmp.utils.export.XLSExporter;
import com.lowagie.text.DocumentException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import jxl.write.WriteException;

/**
 * Tabela customizada
 *
 * @author kaciano
 * @version 1.0
 * @see javax.swing.JTable
 */
public class GMPTable extends JTable implements TableControl, Exporter {

    private Class objClass;
    private TableSource source;
    private int pageCount;
    private int actualPage;
    private int maxRows;
    private List<Object> mainList;
    private List<Object>[] pages;
    private GMPTableModel gmpModel;
    private boolean keyDelete;

    /**
     * Cria nova instancia de GMPTable
     */
    public GMPTable() {
        this.objClass = TableObject.class;
        this.source = new TableSource() {
            @Override
            public List<TableObject> getTableData() {
                return new ArrayList<>();
            }
        };
        mainList = source.getTableData();
        this.gmpModel = new GMPTableModel(objClass);
        this.pageCount = 0;
        this.initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source {@code TableSource} Fonte de dados
     * @param objClass {@code Class(Object)} Classe a ser mapeada
     */
    public GMPTable(TableSource source, Class objClass) {
        this.source = source;
        this.objClass = objClass;
        this.mainList = source.getTableData();
        this.gmpModel = new GMPTableModel(objClass);
        this.maxRows = 0;
        this.initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source Fonte de dados
     * @param model {@code GMPTableModel} Modelo da tabela
     * @param objClass {@code Class(Object)} Classe a ser mapeada
     */
    public GMPTable(TableSource source, GMPTableModel model, Class objClass) {
        this.source = source;
        this.mainList = source.getTableData();
        this.maxRows = 0;
        this.gmpModel = model;
        this.initialize();
    }

    /**
     * Cria nova instancia de GMPTable
     *
     * @param source {@code TableSource} Fonte de dados
     * @param maxRows {@code Integer} Numero máximo de linhas
     * @param gmpModel {@code GMPTableModel} Modelo da tabela
     * @param objClass {@code Class(Object)} Classe a ser mapeada
     */
    public GMPTable(TableSource source, int maxRows, GMPTableModel gmpModel, Class objClass) {
        this.source = source;
        this.mainList = source.getTableData();
        this.maxRows = maxRows;
        this.gmpModel = gmpModel;
        this.objClass = objClass;
        this.initialize();
    }

    /**
     * Metodo de inicialização
     */
    private void initialize() {
        this.initComponents();
        this.setLayout(new BorderLayout());        
        this.setShowGrid(true);
        this.setGridColor(Color.gray.darker());
        this.loadData();
    }

    private void loadData() {
        this.mainList = source.getTableData();
        this.splitData(source.getTableData(), maxRows);
        this.setModel(gmpModel);
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
        this.getGmpModel().setList(pages[actualPage]);
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

    public void setTable(TableSource source, int maxRows, GMPTableModel gmpModel, Class objClass) {
        this.source = source;
        this.mainList = source.getTableData();
        this.maxRows = maxRows;
        this.gmpModel = gmpModel;
        this.objClass = objClass;
        this.loadData();
        this.repaint();
        this.revalidate();
    }

    /**
     * Divide a lista principal em listas menores para gerar as páginas
     *
     * @param list {@code List(Object)} Lista com os dados da tabela
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
        if (dataModel instanceof GMPTableModel) {
            setGmpModel((GMPTableModel) dataModel);
        }
    }

    /**
     * Monta a tabela
     *
     * @param objectclass {@code Class(Object)} Classe a ser mapeada
     * @param list {@code List(Object)} Lista com os dados da tabela
     */
    public void mount(Class<Object> objectclass, List<Object> list) {
        this.setModel(new GMPTableModel(objectclass, list));
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component c = super.prepareRenderer(renderer, row, column);
        if (c instanceof JCheckBox) {
            JCheckBox check = (JCheckBox) c;
            check.setOpaque(showVerticalLines);
        }
        if (row % 2 == 0 && !isCellSelected(row, column)) {
            c.setBackground(new Color(255, 230, 166));
        } else if (isCellSelected(row, column)) {
            c.setBackground(getSelectionBackground());
        } else {
            c.setBackground(getBackground());
        }
        return c;
    }

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
            Logger.getLogger(GMPTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void exportTXT() {
        try {
            List data = assemblyData();
            new TXTExporter().exportTableList(data, "TableExport");
        } catch (IllegalAccessException | IOException ex) {
            Logger.getLogger(GMPTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void exportPDF() {
        try {
            List data = assemblyData();
            new PDFExporter().export(data, "TableExport");
        } catch (DocumentException | IOException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(GMPTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void exportXML() {
        System.out.println("Not supported yet.");
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna a classe dos objetos mapeados
     *
     * @return {@code Class(Object)} Classe mapeada
     */
    public Class getObjClass() {
        return objClass;
    }

    /**
     * Retorna o modelo da tabela
     *
     * @return {@code GMPTableModel} Modelo da tabela
     */
    public GMPTableModel getGmpModel() {
        return gmpModel;
    }

    /**
     * Modifica o modelo da tabela
     *
     * @param gmpModel {@code GMPTableModel} Modelo da tabela
     */
    public void setGmpModel(GMPTableModel gmpModel) {
        this.gmpModel = gmpModel;
    }

    /**
     * Retorna a fonte de dados
     *
     * @return {@code TableSource} Fonte de dados
     */
    public TableSource getSource() {
        return source;
    }

    /**
     * Modifica a fonte de dados
     *
     * @param source {@code TableSource} Fonte de dados
     */
    public void setSource(TableSource source) {
        this.source = source;
    }

    /**
     * Retorna a quantidade de páginas
     *
     * @return {@code int} Quantidade de páginas
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Retorna as páginas
     *
     * @return {@code List[]} Array de listas das páginas
     */
    public List[] getPages() {
        return pages;
    }

    /**
     * Modifica as páginas
     *
     * @param pages {@code List[]} Array de listas das páginas
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
        jMIExportXLS = new javax.swing.JMenuItem();
        jMIExportTXT = new javax.swing.JMenuItem();
        jMIExportPDF = new javax.swing.JMenuItem();

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

        setAutoCreateRowSorter(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMIExportPDF;
    private javax.swing.JMenuItem jMIExportTXT;
    private javax.swing.JMenuItem jMIExportXLS;
    private javax.swing.JPopupMenu jPop;
    // End of variables declaration//GEN-END:variables
}
