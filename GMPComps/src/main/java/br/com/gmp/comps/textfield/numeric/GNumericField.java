package br.com.gmp.comps.textfield.numeric;

import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.textfield.GTextField;

/**
 * Campo de texto numérico
 *
 * @author kaciano
 * @version 1.0
 */
public class GNumericField extends GTextField {

    private int limit;

    /**
     * Cria novo campo de texto numerico
     */
    public GNumericField() {
        this.limit = 0;
        initialize();
    }

    /**
     * Cria novo GNumericField
     *
     * @param limit <code>int</code> Limite de caracteres
     */
    public GNumericField(int limit) {
        this.limit = limit;
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Retorna o limite de caracteresF
     *
     * @return <code>int</code> Limite de caracteres
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Modifica o limite de caracteres
     *
     * @param limit <code>int</code> Limite de caracteres
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void setText(String t) {
        super.setText(t);
        textControl();
    }

    /**
     * Controla o texto para não inserir letras e manter dentro do tamanho max.
     */
    private void textControl() {
        String s = getText();
        new BalloonUtil().showTimedBallon(this, "Somente números!");
        if (s.length() > 0) {
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    String sub = getText().substring(0, getText().length() - 1);
                    setText(sub);
                    grabFocus();
                    break;
                }
            }
        }
        if (limit != 0 && getText().length() > limit) {
            String sub = getText().substring(0, getText().length() - 1);
            setText(sub);
        }
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        textControl();
    }//GEN-LAST:event_formKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
