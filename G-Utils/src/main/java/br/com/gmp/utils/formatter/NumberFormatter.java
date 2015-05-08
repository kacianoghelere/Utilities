package br.com.gmp.utils.formatter;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Classe que contem coleção de métodos para formatação de números
 *
 * @author kaciano
 * @version 1.0
 */
public class NumberFormatter {

    public static final String DECIMAL_ONE = "#0.0";
    public static final String DECIMAL_TWO = "#0.00";
    public static final String DECIMAL_THREE = "#0.000";
    public static final String DECIMAL_FOUR = "#0.0000";
    public static final String DECIMAL_FIVE = "#0.00000";

    /**
     * Retorna o formatador
     *
     * @param pattern {@code String} Padrão de formatação
     * @return {@code DecimalFormat} Formatador
     * @see java.text.DecimalFormat
     */
    private DecimalFormat getFormatter(String pattern) {
        return new DecimalFormat(pattern);
    }

    /**
     * Formata os numeros conforme o padrão especificado
     *
     * @param pattern {@code String} Padrão de formatação
     * @param number {@code BigDecimal} Valor a ser formatado
     * @return {@code String} Valor formatado
     */
    public String format(String pattern, BigDecimal number) {
        return getFormatter(pattern).format(number);
    }

    /**
     * Formata os numeros conforme o padrão especificado
     *
     * @param pattern {@code String} Padrão de formatação
     * @param number {@code long} Valor a ser formatado
     * @return {@code String} Valor formatado
     */
    public String format(String pattern, long number) {
        return getFormatter(pattern).format(new BigDecimal(number));
    }

    /**
     * Formata os numeros conforme o padrão especificado
     *
     * @param pattern {@code String} Padrão de formatação
     * @param number {@code double} Valor a ser formatado
     * @return {@code String} Valor formatado
     */
    public String format(String pattern, double number) {
        return getFormatter(pattern).format(new BigDecimal(number));
    }

    /**
     * Formata os numeros conforme o padrão especificado
     *
     * @param pattern {@code String} Padrão de formatação
     * @param number {@code int} Valor a ser formatado
     * @return {@code String} Valor formatado
     */
    public String format(String pattern, int number) {
        return getFormatter(pattern).format(new BigDecimal(number));
    }

    /**
     * Formata os numeros conforme o padrão especificado
     *
     * @param pattern {@code String} Padrão de formatação
     * @param number {@code String} Valor a ser formatado
     * @return {@code String} Valor formatado
     */
    public String format(String pattern, String number) {
        return getFormatter(pattern).format(new BigDecimal(number));
    }
    
    public static void main(String[] args) {
        System.out.println(new NumberFormatter().format(DECIMAL_ONE, 1.78901));
        System.out.println(new NumberFormatter().format(DECIMAL_TWO, 1.78901));
        System.out.println(new NumberFormatter().format(DECIMAL_THREE, 1.78901));
        System.out.println(new NumberFormatter().format(DECIMAL_FOUR, 1.78901));
        System.out.println(new NumberFormatter().format(DECIMAL_FIVE, 1.78901));
    }
}
