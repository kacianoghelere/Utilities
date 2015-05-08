package br.com.gmp.utils.commons;

/**
 * Enum de cadastro para casas decimais
 *
 * @author kaciano
 * @version 1.0
 */
public enum DecimalFormat {

    /**
     *
     */
    ONE("#,###,###.0"),

    /**
     *
     */
    TWO("#,###,###.00"),

    /**
     *
     */
    THREE("#,###,###.000"),

    /**
     *
     */
    FOUR("#,###,###.0000"),

    /**
     *
     */
    FIVE("#,###,###.00000");

    private String format;

    /**
     * Cria nova instancia de DecimalFormat
     *
     * @param format {@code String} Formato do texto
     */
    private DecimalFormat(String format) {
        this.format = format;
    }

    /**
     * Retorna o formato das casas decimais
     *
     * @return {@code String} Formato do texto
     */
    public String getFormat() {
        return format;
    }

    /**
     * Modifica o formato das casas decimais
     *
     * @param format {@code String} Formato do texto
     */
    public void setFormat(String format) {
        this.format = format;
    }

}
