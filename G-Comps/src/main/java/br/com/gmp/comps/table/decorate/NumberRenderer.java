package br.com.gmp.comps.table.decorate;

import java.text.NumberFormat;
import javax.swing.SwingConstants;

public class NumberRenderer extends FormatRenderer {

    /**
     * Use the specified number formatter and right align the text
     *
     * @param formatter Formatador
     */
    public NumberRenderer(NumberFormat formatter) {
        super(formatter);
        setHorizontalAlignment(SwingConstants.RIGHT);
    }

    /**
     * Use the default currency formatter for the default locale
     *
     * @return Renderer for Currency
     */
    public static NumberRenderer getCurrencyRenderer() {
        return new NumberRenderer(NumberFormat.getCurrencyInstance());
    }

    /**
     * Use the default integer formatter for the default locale
     *
     * @return Renderer for Integer
     */
    public static NumberRenderer getIntegerRenderer() {
        return new NumberRenderer(NumberFormat.getIntegerInstance());
    }

    /**
     * Use the default number formatter for the default locale
     *
     * @return Renderer for Number
     */
    public static NumberRenderer getNumberRenderer() {
        return new NumberRenderer(NumberFormat.getNumberInstance());
    }

    /**
     * Use the default percent formatter for the default locale
     *
     * @return Renderer for Percent
     */
    public static NumberRenderer getPercentRenderer() {
        return new NumberRenderer(NumberFormat.getPercentInstance());
    }

    /**
     * Use the default decimal formatter for the default locale
     *
     * @return DecimalRenderer for Percent
     */
    public static DecimalRenderer getDecimalRenderer() {
        return new DecimalRenderer("###,##0.00");
    }

}
