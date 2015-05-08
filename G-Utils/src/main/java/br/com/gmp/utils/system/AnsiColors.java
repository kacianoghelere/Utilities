package br.com.gmp.utils.system;

/**
 * Enum para classificação e controle das cores de console
 *
 * @author kaciano
 * @version 1.0
 */
public enum AnsiColors {

    ANSI_RESET("\u001B[0m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m");

    private String color;

    /**
     * Cria nova instancia de AnsiColors
     *
     * @param color {@code String} Nome
     */
    private AnsiColors(String color) {
        this.color = color;
    }

    /**
     * Retorna a cor
     *
     * @return {@code String} Cor
     */
    public String getColor() {
        return color;
    }

    /**
     * Modifica a cor
     *
     * @param color {@code String} Cor
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

}
