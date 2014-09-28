package br.com.gmp.comps.lookup.dialog;

import br.com.gmp.comps.combobox.model.GComboBoxModel;
import br.com.gmp.comps.data.DAO;
import br.com.gmp.comps.data.test.TestDAO;
import br.com.gmp.comps.dialog.GDialog;
import br.com.gmp.comps.model.GTableModel;
import br.com.gmp.comps.table.interfaces.TableSource;
import br.com.gmp.utils.annotations.LookUp;
import java.lang.reflect.Field;
import java.util.List;

/**
 * Caixa de dialogo para buscas automaticas
 *
 * @author kaciano
 */
public class GLookUpDialog extends GDialog implements TableSource {

    private DAO dao;
    private GTableModel model;
    private GComboBoxModel comboModel;

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
        this.comboModel = new GComboBoxModel();
        this.buildSearch();
        this.initComponents();
        this.gCBFilter.setGModel(comboModel);
        this.gTable.buildTable(this, 0, model);
    }

    /**
     * Constroi os filtros
     */
    private void buildSearch() {
        for (Field f : this.dao.getObjClass().getDeclaredFields()) {
            f.setAccessible(true);
            if (f.isAnnotationPresent(LookUp.class)) {
                comboModel.addElement(f.getAnnotation(LookUp.class).name());
            }
        }
    }

    @Override
    public List getTableData() {
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
        this.dao = dao != null ? dao : new TestDAO();
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
        gCBFilter = new br.com.gmp.comps.combobox.GComboBox();
        jBSearch1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(542, 350));
        setMinimumSize(new java.awt.Dimension(542, 350));
        setResizable(false);

        jSP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Resultados"));
        jSP.setViewportView(gTable);

        jLFilter.setText("Filtro:");

        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jBSearch.setText("Buscar");

        jBSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/button/switch/off.png"))); // NOI18N
        jBSearch1.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSP, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSearch1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gTFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gCBFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSP, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gTFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFilter)
                    .addComponent(gCBFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSearch)
                    .addComponent(jBSearch1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.combobox.GComboBox gCBFilter;
    private br.com.gmp.comps.textfield.GTextField gTFilter;
    private br.com.gmp.comps.table.GTable gTable;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBSearch1;
    private javax.swing.JLabel jLFilter;
    private javax.swing.JScrollPane jSP;
    // End of variables declaration//GEN-END:variables

}
