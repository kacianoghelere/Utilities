package br.com.gmp.comps.textfield;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author kaciano
 */
public final class Monetary {

    private static final DecimalFormatSymbols DOLAR = new DecimalFormatSymbols(Locale.US);
    public static final DecimalFormat DINHEIRO_DOLAR = new DecimalFormat("¤ ###,###,##0.00", DOLAR);
    private static final DecimalFormatSymbols EURO = new DecimalFormatSymbols(Locale.GERMANY);
    public static final DecimalFormat DINHEIRO_EURO = new DecimalFormat("¤ ###,###,##0.00", EURO);
    private static final Locale BRAZIL = new Locale("pt", "BR");
    private static final DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
    public static final DecimalFormat DINHEIRO_REAL = new DecimalFormat("¤ ###,###,##0.00", REAL);

    public static String maskMoney(double value, DecimalFormat money) {
        return money.format(value);
    }
}
