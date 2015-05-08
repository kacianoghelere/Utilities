package br.com.gmp.comps.textfield.numeric;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

/**
 * Campo com formatacao numerica
 *
 * @author kaciano
 */
public class NumericTextField extends JTextField implements NumericPlainDocument.InsertErrorListener {

    /**
     * Cria nova instancia de NumericTextField
     */
    public NumericTextField() {
        this(null, 0, null);
    }

    /**
     * Cria nova instancia de NumericTextField
     *
     * @param text {@code String} Texto
     * @param columns {@code int} Colunas
     * @param format {@code DecimalFormat} Formatacao decimal
     */
    public NumericTextField(String text, int columns, DecimalFormat format) {
        super(null, text, columns);

        NumericPlainDocument numericDoc = (NumericPlainDocument) getDocument();
        if (format != null) {
            numericDoc.setFormat(format);
        }

        numericDoc.addInsertErrorListener(this);
    }

    /**
     * Cria nova instancia de NumericTextField
     *
     * @param columns {@code int} Colunas
     * @param format {@code DecimalFormat} Formatacao decimal
     */
    public NumericTextField(int columns, DecimalFormat format) {
        this(null, columns, format);
    }

    /**
     * Cria nova instancia de NumericTextField
     *
     * @param text {@code String} Texto
     */
    public NumericTextField(String text) {
        this(text, 0, null);
    }

    /**
     * Cria nova instancia de NumericTextField
     *
     * @param text {@code String} Texto
     * @param columns {@code int} Colunas
     */
    public NumericTextField(String text, int columns) {
        this(text, columns, null);
    }

    /**
     * Modifica a Formatacao Decimal
     *
     * @param format {@code DecimalFormat} Formatacao Decimal
     */
    public void setFormat(DecimalFormat format) {
        ((NumericPlainDocument) getDocument()).setFormat(format);
    }

    /**
     * Retorna a Formatacao Decimal
     *
     * @return {@code DecimalFormat} Formatacao Decimal
     */
    public DecimalFormat getFormat() {
        return ((NumericPlainDocument) getDocument()).getFormat();
    }

    /**
     * Formato modificado
     */
    public void formatChanged() {
        // Notify change of format attributes.
        setFormat(getFormat());
    }

    /**
     * Retorna o valor no formato Long
     *
     * @return {@code Long} Valor no formato Long
     * @throws ParseException
     */
    public Long getLongValue() throws ParseException {
        return ((NumericPlainDocument) getDocument()).getLongValue();
    }

    /**
     * Retorna o valor no formato Double
     *
     * @return {@code Double} Valor no formato Double
     * @throws ParseException
     */
    public Double getDoubleValue() throws ParseException {
        return ((NumericPlainDocument) getDocument()).getDoubleValue();
    }

    /**
     * Retorna o valor no formato Number
     *
     * @return {@code Number no formato Number
     * @throws ParseException
     */
    public Number getNumberValue() throws ParseException {
        return ((NumericPlainDocument) getDocument()).getNumberValue();
    }

    /**
     * Modifica o valor numerico
     *
     * @param number {@code Number} Valor numerico
     */
    public void setValue(Number number) {
        setText(getFormat().format(number));
    }

    /**
     * Modifica o valor numerico
     *
     * @param value {@code long} Valor numerico
     */
    public void setValue(long value) {
        setText(getFormat().format(value));
    }

    /**
     * Modifica o valor numerico
     *
     * @param value {@code double} Valor numerico
     */
    public void setValue(double value) {
        setText(getFormat().format(value));
    }

    /**
     * Format the value according to the format string
     *
     * @throws ParseException
     */
    public void normalize() throws ParseException {
        // 
        setText(getFormat().format(getNumberValue()));
    }

    /**
     * Metodo de insercao de texto com falha
     *
     * @param doc {@code NumericPlainDocument} Documento
     * @param offset {@code int} Indice
     * @param string {@code String} Texto
     * @param attrSet {@code AttributeSet} conjunto de atributos
     */
    @Override
    public void insertFailed(NumericPlainDocument doc, int offset, String string, AttributeSet attrSet) {
        // By default, just beep
        Toolkit.getDefaultToolkit().beep();
    }

    // Method to create default model
    @Override
    protected Document createDefaultModel() {
        return new NumericPlainDocument();
    }

    /**
     * Test code
     *
     * @param args Argumentos
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException evt) {
        }

        DecimalFormat format = new DecimalFormat("#,###.###");
        format.setGroupingUsed(true);
        format.setGroupingSize(3);
        format.setParseIntegerOnly(false);

        JFrame f = new JFrame("Numeric Text Field Example");
        final NumericTextField tf = new NumericTextField(10, format);

        tf.setValue((double) 123456.789);

        JLabel lbl = new JLabel("Type a number: ");
        f.getContentPane().add(tf, "East");
        f.getContentPane().add(lbl, "West");

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    tf.normalize();
                    Long l = tf.getLongValue();
                    System.out.println("Value is (Long)" + l);
                } catch (ParseException e1) {
                    try {
                        Double d = tf.getDoubleValue();
                        System.out.println("Value is (Double)" + d);
                    } catch (ParseException e2) {
                        System.out.println(e2);
                    }
                }
            }
        });
        f.pack();
        f.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

/**
 * Documento de formatacao numerica
 *
 * @author kaciano
 */
class NumericPlainDocument extends PlainDocument {

    /**
     * Cria nova instancia de NumericPlainDocument
     */
    public NumericPlainDocument() {
        setFormat(null);
    }

    /**
     * Cria nova instancia de NumericPlainDocument
     *
     * @param format {@code DecimalFormat} Formatação decimal
     */
    public NumericPlainDocument(DecimalFormat format) {
        setFormat(format);
    }

    /**
     * Cria nova instancia de NumericPlainDocument
     *
     * @param content {@code AbstractDocument.Content} Conteúdo
     * @param format {@code DecimalFormat} Formatação decimal
     */
    public NumericPlainDocument(AbstractDocument.Content content, DecimalFormat format) {
        super(content);
        setFormat(format);

        try {
            format
                    .parseObject(content.getString(0, content.length()),
                            parsePos);
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Initial content not a valid number");
        }

        if (parsePos.getIndex() != content.length() - 1) {
            throw new IllegalArgumentException(
                    "Initial content not a valid number");
        }
    }

    /**
     * Modifica o formato decimal
     *
     * @param fmt {@code DecimalFormat} Formatação decimal
     */
    public void setFormat(DecimalFormat fmt) {
        this.format = fmt != null ? fmt : (DecimalFormat) defaultFormat.clone();

        decimalSeparator = format.getDecimalFormatSymbols()
                .getDecimalSeparator();
        groupingSeparator = format.getDecimalFormatSymbols()
                .getGroupingSeparator();
        positivePrefix = format.getPositivePrefix();
        positivePrefixLen = positivePrefix.length();
        negativePrefix = format.getNegativePrefix();
        negativePrefixLen = negativePrefix.length();
        positiveSuffix = format.getPositiveSuffix();
        positiveSuffixLen = positiveSuffix.length();
        negativeSuffix = format.getNegativeSuffix();
        negativeSuffixLen = negativeSuffix.length();
    }

    /**
     * Retorna o formato decimal
     *
     * @return {@code DecimalFormat} Formatação decimal
     */
    public DecimalFormat getFormat() {
        return format;
    }

    /**
     * Retorna o valor numerico
     *
     * @return @throws ParseException
     */
    public Number getNumberValue() throws ParseException {
        try {
            String content = getText(0, getLength());
            parsePos.setIndex(0);
            Number result = format.parse(content, parsePos);
            if (parsePos.getIndex() != getLength()) {
                throw new ParseException("Not a valid number: " + content, 0);
            }

            return result;
        } catch (BadLocationException e) {
            throw new ParseException("Not a valid number", 0);
        }
    }

    /**
     * Retorna o valor em formato Long
     *
     * @return {@code Long} Valor em formato Long
     * @throws ParseException
     */
    public Long getLongValue() throws ParseException {
        Number result = getNumberValue();
        if ((result instanceof Long) == false) {
            throw new ParseException("Not a valid long", 0);
        }

        return (Long) result;
    }

    /**
     * Retorna o valor em formato Double
     *
     * @return {@code Double} Valor em formato Double
     * @throws ParseException
     */
    public Double getDoubleValue() throws ParseException {
        Number result = getNumberValue();
        if ((result instanceof Long) == false
                && (result instanceof Double) == false) {
            throw new ParseException("Not a valid double", 0);
        }

        if (result instanceof Long) {
            result = result.doubleValue();
        }

        return (Double) result;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
        if (str == null || str.length() == 0) {
            return;
        }

        Content content = getContent();
        int length = content.length();
        int originalLength = length;

        parsePos.setIndex(0);

        // Create the result of inserting the new data,
        // but ignore the trailing newline
        String targetString = content.getString(0, offset) + str
                + content.getString(offset, length - offset - 1);

        // Parse the input string and check for errors
        do {
            boolean gotPositive = targetString.startsWith(positivePrefix);
            boolean gotNegative = targetString.startsWith(negativePrefix);

            length = targetString.length();

            // If we have a valid prefix, the parse fails if the
            // suffix is not present and the error is reported
            // at index 0. So, we need to add the appropriate
            // suffix if it is not present at this point.
            if (gotPositive == true || gotNegative == true) {
                String suffix;
                int suffixLength;
                int prefixLength;

                if (gotPositive == true && gotNegative == true) {
                    // This happens if one is the leading part of
                    // the other - e.g. if one is "(" and the other "(("
                    if (positivePrefixLen > negativePrefixLen) {
                        gotNegative = false;
                    } else {
                        gotPositive = false;
                    }
                }

                if (gotPositive == true) {
                    suffix = positiveSuffix;
                    suffixLength = positiveSuffixLen;
                    prefixLength = positivePrefixLen;
                } else {
                    // Must have the negative prefix
                    suffix = negativeSuffix;
                    suffixLength = negativeSuffixLen;
                    prefixLength = negativePrefixLen;
                }

                // If the string consists of the prefix alone,
                // do nothing, or the result won't parse.
                if (length == prefixLength) {
                    break;
                }

                // We can't just add the suffix, because part of it
                // may already be there. For example, suppose the
                // negative prefix is "(" and the negative suffix is
                // "$)". If the user has typed "(345$", then it is not
                // correct to add "$)". Instead, only the missing part
                // should be added, in this case ")".
                if (targetString.endsWith(suffix) == false) {
                    int i;
                    for (i = suffixLength - 1; i > 0; i--) {
                        if (targetString
                                .regionMatches(length - i, suffix, 0, i)) {
                            targetString += suffix.substring(i);
                            break;
                        }
                    }

                    if (i == 0) {
                        // None of the suffix was present
                        targetString += suffix;
                    }

                    length = targetString.length();
                }
            }

            format.parse(targetString, parsePos);

            int endIndex = parsePos.getIndex();
            if (endIndex == length) {
                break; // Number is acceptable
            }

            // Parse ended early
            // Since incomplete numbers don't always parse, try
            // to work out what went wrong.
            // First check for an incomplete positive prefix
            if (positivePrefixLen > 0 && endIndex < positivePrefixLen
                    && length <= positivePrefixLen
                    && targetString.regionMatches(0, positivePrefix, 0, length)) {
                break; // Accept for now
            }

            // Next check for an incomplete negative prefix
            if (negativePrefixLen > 0 && endIndex < negativePrefixLen
                    && length <= negativePrefixLen
                    && targetString.regionMatches(0, negativePrefix, 0, length)) {
                break; // Accept for now
            }

            // Allow a number that ends with the group
            // or decimal separator, if these are in use
            char lastChar = targetString.charAt(originalLength - 1);
            int decimalIndex = targetString.indexOf(decimalSeparator);
            if (format.isGroupingUsed() && lastChar == groupingSeparator
                    && decimalIndex == -1) {
                // Allow a "," but only in integer part
                break;
            }

            if (format.isParseIntegerOnly() == false
                    && lastChar == decimalSeparator
                    && decimalIndex == originalLength - 1) {
                // Allow a ".", but only one
                break;
            }

            // No more corrections to make: must be an error
            if (errorListener != null) {
                errorListener.insertFailed(this, offset, str, a);
            }
            return;
        } while (true == false);

        // Finally, add to the model
        super.insertString(offset, str, a);
    }

    /**
     * Adiciona novo listener de inserção de erros
     *
     * @param listener {@code InsertErrorListener} Listener de inserção de erros
     */
    public void addInsertErrorListener(InsertErrorListener listener) {
        if (errorListener == null) {
            errorListener = listener;
            return;
        }
        throw new IllegalArgumentException(
                "InsertErrorListener already registered");
    }

    /**
     * Remove listener de inserção de erros
     *
     * @param listener {@code InsertErrorListener} Listener de inserção de erros
     */
    public void removeInsertErrorListener(InsertErrorListener listener) {
        if (errorListener == listener) {
            errorListener = null;
        }
    }

    /**
     * Listener de inserção de erros
     */
    public interface InsertErrorListener {

        /**
         * Inserção falhou
         *
         * @param doc {@code NumericPlainDocument} Documento
         * @param offset {@code int} Indice
         * @param string {@code String} Texto
         * @param attrSet {@code AttributeSet} conjunto de atributos
         */
        public abstract void insertFailed(NumericPlainDocument doc, int offset, String string, AttributeSet attrSet);
    }

    protected InsertErrorListener errorListener;

    protected DecimalFormat format;

    protected char decimalSeparator;

    protected char groupingSeparator;

    protected String positivePrefix;

    protected String negativePrefix;

    protected int positivePrefixLen;

    protected int negativePrefixLen;

    protected String positiveSuffix;

    protected String negativeSuffix;

    protected int positiveSuffixLen;

    protected int negativeSuffixLen;

    protected ParsePosition parsePos = new ParsePosition(0);

    protected static DecimalFormat defaultFormat = new DecimalFormat();

}
