package br.com.gmp.comps;

import br.com.gmp.comps.combobox.model.GComboBoxModel;
import br.com.gmp.comps.model.GListModel;
import br.com.gmp.comps.model.GMPTableModel;
import br.com.gmp.comps.model.GTableModel;
import br.com.gmp.comps.panel.BlurGlassPane;
import br.com.gmp.comps.table.interfaces.TableSource;
import br.com.gmp.utils.test.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author kaciano
 */
public class Tets extends javax.swing.JFrame implements TableSource<Test> {

    /**
     * Creates new form Tets
     */
    public Tets() {
        initialize();
    }

    private void initialize() {
        OtherModel mdl = new OtherModel();
        GListModel<TestObject> gListModel = new GListModel<>();
        for (int i = 0; i < 20; i++) {
            mdl.add(new Test("bosta", 22, false));
            gListModel.add(new TestObject("Test" + i));
        }
        initComponents();
        gPlayer.build("/home/kaciano/lp.mp3");
        try {
            setGlassPane(new BlurGlassPane());
        } catch (Exception e) {
            Logger.getLogger(Tets.class.getName()).log(Level.SEVERE, null, e);
            System.exit(0);
        }
        
        gTable2.buildTable(this, 0, mdl);
        //gTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dual.setSourceElements(getTable().toArray());
        TestObject[] tos = new TestObject[5];
        tos[0] = new TestObject("Kaciano");
        tos[1] = new TestObject("Frávio");
        tos[2] = new TestObject("Jesus");
        tos[3] = new TestObject("Hipopotamo");
        tos[4] = new TestObject("Jaraguá do sul");

        TestAutoModel model = new TestAutoModel();
        model.setData(tos);
        gAutoCB.setModel(model);
        gTree.mount(Test.class, getTableData());
        setLocationRelativeTo(null);        
    }

    @Override
    public List<Test> getTableData() {
        List<Test> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add(new Test("Kaciano" + (i + 1), i, true));
        }
        return list;
    }

    private List<String> getTable() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        gTableBar = new br.com.gmp.comps.table.bar.GMPTableBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        gTable = new br.com.gmp.comps.table.GMPTable(this, new DefaultModel(), Test.class);
        jPanel3 = new javax.swing.JPanel();
        dual = new br.com.gmp.comps.list.dual.GMPDualList();
        gMPDualTable1 = new br.com.gmp.comps.table.dual.GMPDualTable();
        jPanel4 = new javax.swing.JPanel();
        gMPDateField2 = new br.com.gmp.comps.datefield.GMPDateField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        gTree = new br.com.gmp.comps.tree.GMPTree();
        gMPButtonField1 = new br.com.gmp.comps.textfield.button.GMPButtonField();
        numericTextField1 = new br.com.gmp.comps.textfield.NumericTextField();
        gAutoCB = new br.com.gmp.comps.combobox.GAutoComboBox();
        gGradientPanel1 = new br.com.gmp.comps.panel.gradient.GGradientPanel();
        gNumericField1 = new br.com.gmp.comps.textfield.numeric.GNumericField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gTextArea1 = new br.com.gmp.comps.textarea.GTextArea();
        gPlayer = new br.com.gmp.comps.player.GPlayer();
        jScrollPane5 = new javax.swing.JScrollPane();
        gTable2 = new br.com.gmp.comps.table.GTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel2.setName("jPanel2"); // NOI18N

        gTableBar.setName("gTableBar"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        gTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gTable.setEnabled(false);
        gTable.setName("gTable"); // NOI18N
        gTable.setShowGrid(true);
        jScrollPane2.setViewportView(gTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gTableBar, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(gTableBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabela", jPanel2);

        jPanel3.setName("jPanel3"); // NOI18N

        dual.setDestinationLabelText("Destino");
        dual.setSourceLabelText("Fonte");
        dual.setName("dual"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(dual, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(dual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Lista", jPanel3);

        gMPDualTable1.setName("gMPDualTable1"); // NOI18N
        jTabbedPane1.addTab("DualTable", gMPDualTable1);

        jPanel4.setName("jPanel4"); // NOI18N

        gMPDateField2.setName("gMPDateField2"); // NOI18N

        jButton4.setText("Validar");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        gTree.setName("gTree"); // NOI18N
        jScrollPane4.setViewportView(gTree);

        gMPButtonField1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/label/icon.png"))); // NOI18N
        gMPButtonField1.setName("gMPButtonField1"); // NOI18N

        numericTextField1.setName("numericTextField1"); // NOI18N
        numericTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numericTextField1ActionPerformed(evt);
            }
        });

        gAutoCB.setName("gAutoCB"); // NOI18N

        gGradientPanel1.setEndColor(new java.awt.Color(99, 50, 0));
        gGradientPanel1.setStartColor(new java.awt.Color(255, 128, 0));
        gGradientPanel1.setName("gGradientPanel1"); // NOI18N

        gNumericField1.setName("gNumericField1"); // NOI18N
        gNumericField1.setOpaque(false);

        javax.swing.GroupLayout gGradientPanel1Layout = new javax.swing.GroupLayout(gGradientPanel1);
        gGradientPanel1.setLayout(gGradientPanel1Layout);
        gGradientPanel1Layout.setHorizontalGroup(
            gGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gGradientPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(gNumericField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gGradientPanel1Layout.setVerticalGroup(
            gGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(gNumericField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        gTextArea1.setColumns(20);
        gTextArea1.setRows(5);
        gTextArea1.setName("gTextArea1"); // NOI18N
        jScrollPane1.setViewportView(gTextArea1);

        gPlayer.setName("gPlayer"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(gMPDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(gMPButtonField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numericTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gAutoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gMPDateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(gMPButtonField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numericTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gAutoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(gGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Outros", jPanel4);

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        gTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gTable2.setName("gTable2"); // NOI18N
        jScrollPane5.setViewportView(gTable2);

        jTabbedPane1.addTab("tab5", jScrollPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (gMPDateField2.validateComponent()) {
            System.out.println("Válido!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void numericTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numericTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numericTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Tets.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.list.dual.GMPDualList dual;
    private br.com.gmp.comps.combobox.GAutoComboBox gAutoCB;
    private br.com.gmp.comps.panel.gradient.GGradientPanel gGradientPanel1;
    private br.com.gmp.comps.textfield.button.GMPButtonField gMPButtonField1;
    private br.com.gmp.comps.datefield.GMPDateField gMPDateField2;
    private br.com.gmp.comps.table.dual.GMPDualTable gMPDualTable1;
    private br.com.gmp.comps.textfield.numeric.GNumericField gNumericField1;
    private br.com.gmp.comps.player.GPlayer gPlayer;
    private br.com.gmp.comps.table.GMPTable gTable;
    private br.com.gmp.comps.table.GTable gTable2;
    private br.com.gmp.comps.table.bar.GMPTableBar gTableBar;
    private br.com.gmp.comps.textarea.GTextArea gTextArea1;
    private br.com.gmp.comps.tree.GMPTree gTree;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private br.com.gmp.comps.textfield.NumericTextField numericTextField1;
    // End of variables declaration//GEN-END:variables
}

class OtherModel extends GTableModel<Test> {

}

class DefaultModel extends GMPTableModel {

    public DefaultModel() {
        super(Test.class);
    }

}

class TestAutoModel extends GComboBoxModel<TestObject> {

}

class TestObject {

    private String name;

    public TestObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
