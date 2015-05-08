package br.com.gmp.utils.object;

/**
 * Objeto utilitário para compor Strings complexas
 *
 * @author kaciano
 * @version 1.0
 */
public class TextBuilder {

    private String text;

    /**
     * Cria nova instancia de TextBuilder
     */
    public TextBuilder() {
        this.text = "";
    }

    /**
     * Cria nova instancia de TextBuilder
     *
     * @param text {@code String} Texto a ser manipulado
     */
    public TextBuilder(String text) {
        this.text = text;
    }

    /**
     * Concatena o texto original com o texto recebido
     *
     * @param text {@code String} Texto a ser concatenado
     * @return {@code TextBuilder} Construtor de texto
     */
    public TextBuilder append(String text) {
        this.text += text;
        return this;
    }

    /**
     * Concatena o texto original com o texto recebido
     *
     * @param text {@code String[]} Variaeis de texto a serem concatenadas
     * @return {@code TextBuilder} Construtor de texto
     */
    public TextBuilder append(String... text) {
        for (String value : text) {
            this.text += value;
        }
        return this;
    }

    /**
     * Concatena o texto original com o numero inteiro recebido
     *
     * @param number {@code int} Numero a ser concatenado
     * @return {@code TextBuilder} Construtor de texto
     */
    public TextBuilder append(int number) {
        this.text += String.valueOf(number);
        return this;
    }

    /**
     * Concatena o texto original com o numero racional recebido
     *
     * @param number {@code double} Numero a ser concatenado
     * @return {@code TextBuilder} Construtor de texto
     */
    public TextBuilder append(double number) {
        this.text += String.valueOf(number);
        return this;
    }

    /**
     * Remove todo o texto adicionado
     */
    public void clear() {
        this.text = "";
    }

    /**
     * Retorna o texto manipulado
     *
     * @return {@code String} Texto manipulado
     */
    public String getText() {
        return text;
    }

    public static void main(String[] args) {
        TextBuilder builder = new TextBuilder();
        builder.append("K","a","c","i","a","n","o"); 
        String text = builder.getText();
        System.out.println(text);
    }
}
