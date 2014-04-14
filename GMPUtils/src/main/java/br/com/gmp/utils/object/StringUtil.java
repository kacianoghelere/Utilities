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

}
