package br.com.gmp.comps.textfield;

import br.com.gmp.comps.baloontip.src.BalloonUtil;

/**
 * Campo de texto numerico
 *
 * @author kaciano
 * @version 1.0
 */
public class NumericTextField extends GTextField {

    private int limit;

    /**
     * Cria novo campo de texto numerico
     */
    public NumericTextField() {
        this.limit = 0;
        initComponents();
    }

    /**
     * Cria novo campo de texto numerico
     *
     * @param limit {@code int} Limite de caracteres
     */
    public NumericTextField(int limit) {
        this.limit = limit;
        initComponents();
    }

    /**
     * Retorna o limite de caracteresF
     *
     * @return {@code int} Limite de caracteres
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Modifica o limite de caracteres
     *
     * @param limit {@code int} Limite de caracteres
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void setText(String t) {
        super.setText(t);
    }

    /**
     * Controla o texto para não inserir letras e manter dentro do tamanho max.
     */
    private void textControl() {
        String s = getText();
        if (s.length() > 0) {
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c) && !" ".equals(Character.toString(c))) {
                    new BalloonUtil().showTimedBallon(this, "Somente números!");
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

        setPreferredSize(new java.awt.Dimension(100, 25));
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
