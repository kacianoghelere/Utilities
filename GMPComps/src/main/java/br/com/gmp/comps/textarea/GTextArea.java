package br.com.gmp.comps.textarea;

import br.com.gmp.comps.GColors;
import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.ValidableComponent;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;

/**
 * Área de texto customizada
 *
 * @author kaciano
 * @version 1.0
 */
public class GTextArea extends JTextArea implements ValidableComponent {

    private int maximum;
    private String invalidMsg = "Campo obrigatório!";

    /**
     * Cria nova instancia de GMPTextArea
     */
    public GTextArea() {
        this.maximum = 0;
    }

    /**
     * Cria nova instancia de GMPTextArea
     *
     * @param maximum <code>int</code> Comprimento maximo do texto
     */
    public GTextArea(int maximum) {
        this.maximum = maximum;
        initComponents();
    }

    /**
     * Ação de componente em foco
     *
     * @param e FocusEvent
     */
    public void focusGained(FocusEvent e) {
        this.setBackground(GColors.FOCUS);
    }

    /**
     * Ação de componente sem foco
     *
     * @param e FocusEvent
     */
    public void focusLost(FocusEvent e) {
        this.setBackground(new JTextArea().getBackground());
    }

    /**
     * Controla o comprimento do texto
     */
    private void controlLength() {
        if (this.maximum != 0 && this.maximum < this.getText().length()) {
            this.setText(this.getText().substring(0, maximum - 1));
        }
    }

    /**
     * Retorna o comprimento maximo do texto
     *
     * @return <code>int</code> Comprimento maximo do texto
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Modifica o comprimento maximo do texto
     *
     * @param maximum <code>int</code> Comprimento maximo do texto
     */
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public boolean validateComponent() {
        if (this.getText().length() > maximum) {
            return false;
        } else if (this.getText().equals("") || this.getText() == null || getText().isEmpty()) {
            new BalloonUtil().showTimedBallon(this, invalidMsg);
            return false;
        }
        return true;
    }

    /**
     * Retorna a mensagem do componente
     *
     * @return <code>String</code> Mensagem do componente
     */
    public String getInvalidMsg() {
        return invalidMsg;
    }

    /**
     * Modifica a mensagem do componente
     *
     * @param invalidMsg <code>String</code> Mensagem do componente
     */
    public void setInvalidMsg(String invalidMsg) {
        this.invalidMsg = invalidMsg;
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        focusGained(evt);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        focusLost(evt);
    }//GEN-LAST:event_formFocusLost

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        controlLength();
    }//GEN-LAST:event_formKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
