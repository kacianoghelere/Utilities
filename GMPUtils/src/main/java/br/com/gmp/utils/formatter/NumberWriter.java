package br.com.gmp.utils.formatter;

import br.com.gmp.utils.commons.NumberDescription;
import br.com.gmp.utils.commons.Numbers;
import java.util.ArrayList;
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
        NumberDescription descriptions = new NumberDescription();
        if (String.valueOf(number).length() > 12) {
            throw new NumberFormatException();
        }
        String value = String.valueOf(number);
        StringBuilder sb = new StringBuilder();
        Integer[] values = getLenghts(value);
        String desc = "";

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
    private Integer[] getLenghts(String value) {
        String toString = new StringBuffer(value).reverse().toString();
        char[] fields = toString.toCharArray();
        String[] lenghts = new String[6];
        for (int i = 0; i < fields.length; i++) {
            if (i < 3) {
                if (i == 0) {
                    lenghts[5] = String.valueOf(fields[i]);
                } else if (i == 1) {
                    lenghts[4] = String.valueOf(fields[i]);
                } else if (i == 2) {
                    lenghts[3] = String.valueOf(fields[i]);
                }
            } else if (i >= 3 && i < 6) {
                lenghts[2] += String.valueOf(fields[i]);
            } else if (i >= 6 && i < 9) {
                lenghts[1] += String.valueOf(fields[i]);
            } else if (i >= 9) {
                lenghts[0] += String.valueOf(fields[i]);
            }
        }
        if (lenghts[2] != null) {
            lenghts[2] = new StringBuffer(lenghts[2]).reverse().toString();
        }
        if (lenghts[1] != null) {
            lenghts[1] = new StringBuffer(lenghts[1]).reverse().toString();
        }
        if (lenghts[0] != null) {
            lenghts[0] = new StringBuffer(lenghts[0]).reverse().toString();
        }
        Integer[] ints = new Integer[lenghts.length];
        List<String> list = Arrays.asList(lenghts);
        List<String> data = new ArrayList<>();
        data.addAll(list);
        data.removeAll(Collections.singleton(null));
        lenghts = data.toArray(new String[]{});
        for (int i = 0; i < lenghts.length; i++) {
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
        System.out.println(numberWriter.describe(1234567));
        // um milhão duzentos trinta e quatro mil quinhentos e e sessenta e sete
    }
}
