/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.comps.textfield;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import br.com.gmp.comps.baloontip.src.BaloonTip;

/**
 *
 * @author kaciano
 */
public class ValidTextField extends JTextField {

    private String aviso = "Obrigatorio";
    private boolean requerido = true;
    private boolean validado = true;
    private final BaloonTip baloon;
    
    public ValidTextField() {
        baloon = new BaloonTip(this);
        initComponents();        
        validate();
    }

    public ValidTextField(boolean requer) {
        this.requerido = requer;
        baloon = new BaloonTip(this);
        initComponents();        
        validate();
    }

    public ValidTextField(String aviso) {
        this.aviso = aviso;
        baloon = new BaloonTip(this);
        initComponents();        
        validate();
    }

    @Override
    public final void validate() {
        this.addFocusListener((FocusListener) new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (requerido) {
                    if (getText() == null || getText().equals("")) {
                        setBorder(new JTextField().getBorder());
                        setForeground(new JTextField().getForeground());
                        setText("");
                    } else if (getText().equals(aviso)) {
                        setBorder(new JTextField().getBorder());
                        setForeground(new JTextField().getForeground());
                        setText("");
                    }
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (requerido) {
                    if (getText() == null || getText().equals("")) {
                        setBorder(new LineBorder(Color.red));
                        setForeground(Color.red);
                        setText(aviso);
                        baloon.showBaloonTip(aviso, 5000, 2, getWidth(), getHeight());
                        validado = false;
                    } else if (getText().equals(aviso)) {
                        setBorder(new LineBorder(Color.red));
                        setForeground(Color.red);
                        setText(aviso);
                        baloon.showBaloonTip(aviso, 5000, 2, getWidth(), getHeight());
                        validado = false;
                    } else {
                        setBorder(new LineBorder(Color.green));
                        setForeground(new JTextField().getForeground());
                        validado = true;
                    }
                }
            }
        });
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    public boolean isRequerido() {
        return requerido;
    }

    public void setRequerido(boolean requerido) {
        this.requerido = requerido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
