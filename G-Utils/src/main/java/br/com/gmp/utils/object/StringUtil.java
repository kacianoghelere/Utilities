package br.com.gmp.utils.object;

/**
 * Coleção de métodos utilitários para Strings
 *
 * @author kaciano
 * @version 1.0
 */
public class StringUtil {

    /**
     * Divide a String em um Array contendo os valores divididos, não
     * acrescentar [...] no fator de divisão
     *
     * @param value {@code String} Valor a ser dividido
     * @param split {@code String} Fator de divisão
     * @return {@code String[]} Resultado
     */
    public static String[] split(String value, String split) {
        return value.split('[' + split + ']');
    }

    /**
     * Divide a String em um Array contendo os valores divididos, não
     * acrescentar [...] no fator de divisão
     *
     * @param value {@code String} Valor a ser dividido
     * @param split {@code String} Fator de divisão
     * @param limit {@code int} Quantidade máxima de divisões
     * @return {@code String[]} Resultado
     */
    public static String[] split(String value, String split, int limit) {
        return value.split('[' + split + ']', limit);
    }

    /**
     * Retorna uma String com a quantidade de zeros à frente do numero recebido
     *
     * @param size {@code int} Quantidade de numeros da String
     * @param number {@code Long} Numero à ser formatado
     * @return {@code String} String formatada
     */
    public String completeWithZeros(int size, Long number) {
        StringBuilder sb = new StringBuilder();
        String value = String.valueOf(number);
        for (int i = 0; i < (size - value.length()); i++) {
            sb.append("0");
        }
        sb.append(value);
        return sb.toString();
    }

    /**
     * Torna a primeira letra da String maiuscula
     *
     * @param text {@code String} String à ser formatada
     * @return {@code String} String formatada
     */
    public String capitalize(String text) {
        return Character.toString(text.charAt(0)).toUpperCase() + text.substring(1);
    }

    /**
     * Remove todos as letras da string, deixando apenas os numeros
     *
     * @param text {@code String} String à ser formatada
     * @return {@code String} String formatada
     */
    public static String onlyNumbers(String text) {
        if (text != null) {
            return text.replaceAll("[^012346789]", "");
        } else {
            return "";
        }
    }

    /**
     * Remove todos os numeros da string, deixando apenas letras
     *
     * @param text {@code String} String à ser formatada
     * @return {@code String} String formatada
     */
    public static String onlyLetters(String text) {
        if (text != null) {
            return text.replaceAll("[012346789]", "");
        } else {
            return "";
        }
    }

    /**
     * Remove todos os caracteres especiais da String
     *
     * @param str {@code String} String à ser formatada
     * @return {@code String} String formatada
     */
    public static String removeSpecial(String str) {
        // Troca os caracteres especiais da string por "" *         
        String[] specials = {"\\.", ",", "-", ":", "\\(", "\\)", "ª", "\\|", "\\\\", "°"};
        for (String special : specials) {
            str = str.replaceAll(special, "");
        }
        // Troca os espaços no início por "" *
        str = str.replaceAll("^\\s+", "");
        // Troca os espaços no início por "" *         
        str = str.replaceAll("\\s+$", "");
        // Troca os espaços duplicados, tabulações e etc por " " *         
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public static void main(String[] args) {
        Long num1 = (long) 1;
        Long num2 = (long) 111;
        Long num3 = (long) 110;
        System.out.println(new StringUtil().completeWithZeros(6, num1));
        System.out.println(new StringUtil().completeWithZeros(6, num2));
        System.out.println(new StringUtil().completeWithZeros(6, num3));
    }
}
