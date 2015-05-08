package br.com.gmp.comps.lookup.dialog;

import br.com.gmp.comps.data.DAO;
import br.com.gmp.comps.data.GenericDAO;
import br.com.gmp.comps.dialog.GDialog;
import br.com.gmp.comps.model.GTableModel;
import br.com.gmp.comps.table.interfaces.TableSource;
import java.util.List;

/**
 * Caixa de dialogo para buscas automaticas
 *
 * @author kaciano
 * @param <T> Tipo de dados
 */
public class GLookUpDialog<T> extends GDialog implements TableSource<T> {

    private DAO dao;
    private GTableModel<T> model;

    /**
     * Cria nova instancia de GLookUpDialog
     */
    public GLookUpDialog() {
        initialize(null);
    }

    /**
     * Cria nova instancia de GLookUpDialog
     *
     * @param dao {@code DAO} DAO de controle das entidades
     */
    public GLookUpDialog(DAO dao) {
        initialize(dao);
    }

    /**
     * Método de inicialização
     *
     * @param dao {@code DAO} DAO de controle das entidades
     */
    private void initialize(DAO dao) {
        this.setDao(dao);
        this.initComponents();
        this.gTable.buildTable(this, 0, model);
    }

    @Override
    public List<T> getTableData() {
        return this.dao.getList();
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
        this.dao = dao != null ? dao : new GenericDAO<T>() {
        };
        this.model = new GTableModel(this.dao.getObjClass()) {
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSP = new javax.swing.JScrollPane();
        gTable = new br.com.gmp.comps.table.GTable();
        gTFilter = new br.com.gmp.comps.textfield.GTextField();
        jLFilter = new javax.swing.JLabel();
        jBSearch = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(542, 350));
        setMinimumSize(new java.awt.Dimension(542, 350));
        setResizable(false);

        gTable.setBorder(null);
        jSP.setViewportView(gTable);

        jLFilter.setText("Descrição:");

        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jBSearch.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSP, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gTFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSP, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSearch)
                    .addComponent(gTFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFilter))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.textfield.GTextField gTFilter;
    private br.com.gmp.comps.table.GTable gTable;
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLFilter;
    private javax.swing.JScrollPane jSP;
    // End of variables declaration//GEN-END:variables

}
