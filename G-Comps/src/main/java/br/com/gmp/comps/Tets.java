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
        //gPlayer.build("/home/kaciano/lp.mp3");
        try {
            setGlassPane(new BlurGlassPane());
        } catch (Exception e) {
            Logger.getLogger(Tets.class.getName()).log(Level.SEVERE, null, e);
            System.exit(0);
        }
        

        //gTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dual.setSourceElements(getTable().toArray());
        TestObject[] tos = new TestObject[5];
        tos[0] = new TestObject("Kaciano");
        tos[1] = new TestObject("Frávio");
        tos[2] = new TestObject("Jesuss");
        tos[3] = new TestObject("Hipopotamo");
        tos[4] = new TestObject("Jaraguá do sul");

        TestAutoModel model = new TestAutoModel();
        model.setData(tos);
//        gAutoCB.setModel(model);
        
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
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        gTree = new br.com.gmp.comps.tree.GMPTree();
        gMPButtonField1 = new br.com.gmp.comps.textfield.button.GMPButtonField();
        numericTextField1 = new br.com.gmp.comps.textfield.NumericTextField();
        gGradientPanel1 = new br.com.gmp.comps.panel.gradient.GGradientPanel();
        gNumericField1 = new br.com.gmp.comps.textfield.numeric.GNumericField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gTextArea1 = new br.com.gmp.comps.textarea.GTextArea();
        gCalendar1 = new br.com.gmp.comps.calendar.GCalendar();
        dynamicSelector2 = new br.com.gmp.comps.rating.dynamic.DynamicSelector();
        gLookUpField1 = new br.com.gmp.comps.lookup.GLookUpField();
        dual = new br.com.gmp.comps.list.dual.GDualList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel4.setName("jPanel4"); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gNumericField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        gTextArea1.setColumns(20);
        gTextArea1.setRows(5);
        gTextArea1.setName("gTextArea1"); // NOI18N
        jScrollPane1.setViewportView(gTextArea1);

        gCalendar1.setName("gCalendar1"); // NOI18N

        dynamicSelector2.setEditable(true);
        dynamicSelector2.setRatingSize(10);
        dynamicSelector2.setName("dynamicSelector2"); // NOI18N

        gLookUpField1.setName("gLookUpField1"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4)
                                    .addComponent(gCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(gLookUpField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(dynamicSelector2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gMPButtonField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numericTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(gMPButtonField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numericTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dynamicSelector2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(gLookUpField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(gCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Outros", jPanel4);

        dual.setDestinationLabelText("Destino");
        dual.setSourceLabelText("Fonte");
        dual.setName("dual"); // NOI18N
        jTabbedPane1.addTab("Dual List", dual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println(dynamicSelector2.getSelectedRating());
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
    private br.com.gmp.comps.list.dual.GDualList dual;
    private br.com.gmp.comps.rating.dynamic.DynamicSelector dynamicSelector2;
    private br.com.gmp.comps.calendar.GCalendar gCalendar1;
    private br.com.gmp.comps.panel.gradient.GGradientPanel gGradientPanel1;
    private br.com.gmp.comps.lookup.GLookUpField gLookUpField1;
    private br.com.gmp.comps.textfield.button.GMPButtonField gMPButtonField1;
    private br.com.gmp.comps.textfield.numeric.GNumericField gNumericField1;
    private br.com.gmp.comps.textarea.GTextArea gTextArea1;
    private br.com.gmp.comps.tree.GMPTree gTree;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
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