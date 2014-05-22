package br.com.gmp.utils.formatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public String describe(int number) throws NumberFormatException {
        if (String.valueOf(number).length() > 12) {
            throw new NumberFormatException();
        }
        String value = String.valueOf(number);
        StringBuilder sb = new StringBuilder();
        int[] values = getLenghts(value);

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
     * <br> [5] = Quantidade de unidades
     *
     * @param value <code>String</code> Numero em String
     * @return <code>int[]</code> Array com as quantidades
     */
    public int[] getLenghts(String value) {
        String toString = new StringBuffer(value).reverse().toString();
        char[] fields = toString.toCharArray();
        String[] lenghts = new String[6];
        for (int i = 0; i < fields.length; i++) {
            if (i < 3) {
                if (i == 0) {
                    lenghts[0] = String.valueOf(fields[i]);
                } else if (i == 1) {
                    lenghts[1] = String.valueOf(fields[i]);
                } else if (i == 2) {
                    lenghts[2] = String.valueOf(fields[i]);
                }
            } else if (i >= 3 && i < 6) {
                lenghts[3] += String.valueOf(fields[i]);
            } else if (i >= 6 && i < 9) {
                lenghts[4] += String.valueOf(fields[i]);
            } else if (i >= 9) {
                lenghts[5] += String.valueOf(fields[i]);
            }
        }
        int[] ints = new int[lenghts.length];
        List<String> list = Arrays.asList(lenghts);
        list.removeAll(Collections.singleton(null));
        lenghts = list.toArray(new String[]{});
        for (int i = 0; i < ints.length; i++) {
            String trim = lenghts[i].replaceAll("null", "").trim();
            System.out.println("Convertendo " + trim);
            ints[i] = Integer.parseInt(trim);
        }
        return ints;
    }

    /**
     * Converte o caractere em um valor inteiro
     *
     * @param value <code>char</code> Valor a ser convertido
     * @return <code>Integer</code> Resultado
     */
    private Integer charToInteger(char value) {
        return Integer.parseInt(Character.toString(value));
    }

    public static void main(String[] args) {
        NumberWriter numberWriter = new NumberWriter();
        String number = "1234567";
        int[] lenghts = numberWriter.getLenghts(number);
        System.out.println(lenghts[0] + " unidades");
        System.out.println(lenghts[1] + " dezenas");
        System.out.println(lenghts[2] + " centenas");
        System.out.println(lenghts[3] + " milhares");
        System.out.println(lenghts[4] + " milhões");
        System.out.println(lenghts[5] + " bilhões");        
    }
}
