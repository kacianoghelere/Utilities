package br.com.gmp.comps.textfield.numeric;

import br.com.gmp.comps.document.NumericDocument;
import br.com.gmp.comps.textfield.GTextField;
import javax.swing.text.Document;

/**
 * Campo de texto numérico
 *
 * @author kaciano
 * @version 1.0
 */
public class GNumericField extends GTextField {

    /**
     * Cria novo campo de texto numerico
     */
    public GNumericField() {
        super(String.valueOf(0), 5);
        initialize();
    }

    /**
     * Cria novo campo de texto numerico
     *
     * @param text <code>String</code> Texto do componente
     * @param size <code>int</code> Quantidade de colunas
     */
    public GNumericField(String text, int size) {
        super(text, size);
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Valida se o valor do campo é diferente de zero
     *
     * @return {@code Boolean} O valor do campo é diferente de zero?
     */
    public Boolean validateZero() {
        try {
            return getDouble() != 0;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Valida se o valor do campo é menor que zero
     *
     * @return {@code Boolean} O valor do campo é menor que zero?
     */
    public Boolean validateNegative() {
        try {
            return getDouble() < 0;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    protected Document createDefaultModel() {
        return new NumericDocument();
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        if (getText().isEmpty()) {
            setText("0");
        }
    }//GEN-LAST:event_formFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
