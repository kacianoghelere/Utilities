package br.com.gmp.comps.combobox;

import br.com.gmp.comps.BaseColors;
import br.com.gmp.comps.ui.GMPComboBoxUI;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/**
 *
 * @author kaciano
 */
public class GMPComboBox extends JComboBox {

    public GMPComboBox() {
        initComponents();
        setBackground(BaseColors.lightColor);
//        UIManager.put("ComboBox.selectionBackground", BaseColors.systemColor);
//        UIManager.put("ComboBox.selectionForeground", Color.white);
//        UIManager.put("ComboBox.border", new LineBorder(BaseColors.darkColor, 1));
//        setUI(new GMPComboBoxUI());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(100, 25));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
