package br.com.gmp.comps.table.decorate;

import java.text.Format;
import java.text.DateFormat;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Formatter to format the Object
 *
 * @author kaciano
 */
public class FormatRenderer extends DefaultTableCellRenderer {

    private Format formatter;

    /**
     * Use the specified formatter to format the Object
     *
     * @param formatter Format
     */
    public FormatRenderer(Format formatter) {
        this.formatter = formatter;
    }

    @Override
    public void setValue(Object value) {
        //  Format the Object before setting its value in the renderer

        try {
            if (value != null) {
                value = formatter.format(value);
            }
        } catch (IllegalArgumentException e) {
        }

        super.setValue(value);
    }

    /**
     * Use the default date/time formatter for the default locale
     *
     * @return FormatRenderer
     */
    public static FormatRenderer getDateTimeRenderer() {
        return new FormatRenderer(DateFormat.getDateTimeInstance());
    }

    /**
     * Use the default time formatter for the default locale
     *
     * @return FormatRenderer
     */
    public static FormatRenderer getTimeRenderer() {
        return new FormatRenderer(DateFormat.getTimeInstance());
    }
}
