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
     * @param value <code>String</code> Valor a ser dividido
     * @param split <code>String</code> Fator de divisão
     * @return <code>String[]</code> Resultado
     */
    public static String[] split(String value, String split) {
        return value.split('[' + split + ']');
    }

    /**
     * Divide a String em um Array contendo os valores divididos, não
     * acrescentar [...] no fator de divisão
     *
     * @param value <code>String</code> Valor a ser dividido
     * @param split <code>String</code> Fator de divisão
     * @param limit <code>int</code> Quantidade máxima de divisões
     * @return <code>String[]</code> Resultado
     */
    public static String[] split(String value, String split, int limit) {
        return value.split('[' + split + ']', limit);
    }

    /**
     * Retorna uma String com a quantidade de zeros à frente do numero recebido
     *
     * @param size <code>int</code> Quantidade de numeros da String
     * @param number <code>Long</code> Numero à ser formatado
     * @return <code>String</code> String formatada
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
     * @param text <code>String</code> String à ser formatada
     * @return  <code>String</code> String formatada
     */
    public String capitalize(String text) {
        return Character.toString(text.charAt(0)).toUpperCase() + text.substring(1);
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
