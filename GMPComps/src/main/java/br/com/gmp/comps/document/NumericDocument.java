package br.com.gmp.comps.document;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Documento para campos de texto numéricos
 *
 * @author kaciano
 * @versio 1.0
 */
public class NumericDocument extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null) {
            return;
        }
        String oldValue = getText(0, getLength());
        String newValue = oldValue.substring(0, offs) + str + oldValue.substring(offs);
        try {
            Integer.parseInt((newValue + "0"));
            super.insertString(offs, str, a);
        } catch (NumberFormatException e) {            
        }
    }
}
