package br.com.gmp.utils.formatter;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 * Objeto de formatação para JFormattedTextFields e outros campos de texto que
 * utilizam getMasks
 *
 * @author kaciano
 */
public class MaskFormats {

    public static final String CPF = "###.###.###-##";
    public static final String CNPJ = "##.###.###/####-##";
    public static final String CEP = "#####-###";
    public static final String PHONE = "(##)####-####";
    public static final String DATE = "##/##/####";
    public static final String DATE_SQL = "####-##-##";

    /**
     * Mascaras para JFormattedTextField
     *
     * @param pattern String Tipo de getMask
     * @return MaskFormatter Mascara do padrão
     */
    public MaskFormatter getMask(String pattern) {
        MaskFormatter mask = new MaskFormatter();
        try {
            mask = new MaskFormatter(pattern);
            mask.setPlaceholderCharacter(' ');
            mask.setCommitsOnValidEdit(true);
            mask.setValueContainsLiteralCharacters(false);
        } catch (java.text.ParseException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return mask;
    }
}
