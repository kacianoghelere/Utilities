package br.com.gmp.comps.button;

import java.awt.Font;

/**
 *
 * @author kaciano
 */
public class GMPSimpleButton extends javax.swing.JButton {

    public GMPSimpleButton() {
        super();
        initialize();
    }

    /**
     *
     * @param text
     */
    public GMPSimpleButton(String text) {
        super(text);
        initialize();
        setText(text);
    }

    private void initialize() {
        initComponents();
        setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
