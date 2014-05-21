package br.com.gmp.utils.formatter;

/**
 * Objeto utilitario para descrever numeros em forma de texto
 *
 * @author kaciano
 * @version 1.0
 */
public class NumberWriter {

    /**
     * Retorna a String contendo o numero escrito por extenso
     *
     * @param number <code>int</code> Numero a ser descrito
     * @return <code>String</code> Descrição do numero
     */
    public static String describe(int number) throws NumberFormatException {
        if (String.valueOf(number).length() > 9) {
            throw new NumberFormatException();
        }
        String value = String.valueOf(number);
        StringBuilder sb = new StringBuilder();
        int[] lenghts = getLenghts(value);
        // TODO
        return sb.toString();
    }

    /**
     * Varre a String do numero, identificando as quantidades
     * <br> Divisões do array
     * <br> [0] = Quantidade de bilhões
     * <br> [1] = Quantidade de milhões
     * <br> [2] = Quantidade de milhares
     * <br> [3] = Quantidade de centenas
     * <br> [4] = Quantidade de dezenas
     * <br> [5] = Quantidade de milhões
     *
     * @param value <code>String</code> Numero em String
     * @return <code>int[]</code> Array com as quantidades
     */
    private static int[] getLenghts(String value) {
        int[] lenghts = new int[6];
        int length = value.length();
        
        return lenghts;
    }
}
