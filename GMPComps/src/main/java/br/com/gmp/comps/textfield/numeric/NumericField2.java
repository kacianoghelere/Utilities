package br.com.gmp.comps.textfield.numeric;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;

/**
 * Classe externa para construção de campos numericos
 *
 * @author kaciano
 * @version 1.0
 */
public class NumericField2 extends JFormattedTextField implements Serializable {

    private final java.text.DecimalFormat decimal = new java.text.DecimalFormat("#,###,###.00");
    private final javax.swing.text.NumberFormatter numFormatter = new javax.swing.text.NumberFormatter(decimal);
    private DefaultFormatterFactory def = new javax.swing.text.DefaultFormatterFactory(numFormatter);

    /**
     * Cria nova instancia de NumericField
     */
    public NumericField2() {
        super();
        FormataNumeric();
    }

    /**
     * Método que faz a formatacao do campo numérico
     *
     * @param Campo {@code JFormattedTextField} recebe campo a ser
     * formatado
     * @since 1.0
     */
    private synchronized void FormataNumeric() {
        try {
            numFormatter.setAllowsInvalid(false);
            setFormatterFactory(def);
            numFormatter.setFormat(decimal);
        } catch (Exception e) {
            Logger.getLogger(NumericField2.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
