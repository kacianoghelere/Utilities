package br.com.gmp.utils.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * Coleção de mapas para nomenclatura de numeros
 *
 * @author kaciano
 * @version 1.0
 */
public class NumberDescription {

    private final Map<Integer, String> unity;
    private final Map<Integer, String> tens;
    private final Map<Integer, String> hundreds;

    /**
     * Cria nova instancia de NumberDescription
     */
    public NumberDescription() {
        unity = new HashMap<>();
        unity.put(Integer.parseInt("0"), "zero");
        unity.put(Integer.parseInt("1"), "um");
        unity.put(Integer.parseInt("2"), "dois");
        unity.put(Integer.parseInt("3"), "três");
        unity.put(Integer.parseInt("4"), "quatro");
        unity.put(Integer.parseInt("5"), "cinco");
        unity.put(Integer.parseInt("6"), "seis");
        unity.put(Integer.parseInt("7"), "sete");
        unity.put(Integer.parseInt("8"), "oito");
        unity.put(Integer.parseInt("9"), "nove");
        tens = new HashMap<>();
        tens.put(Integer.parseInt("10"), "dez");
        tens.put(Integer.parseInt("20"), "vinte");
        tens.put(Integer.parseInt("30"), "trinta");
        tens.put(Integer.parseInt("40"), "quarenta");
        tens.put(Integer.parseInt("50"), "cinquenta");
        tens.put(Integer.parseInt("60"), "sessenta");
        tens.put(Integer.parseInt("70"), "setenta");
        tens.put(Integer.parseInt("80"), "oitenta");
        tens.put(Integer.parseInt("90"), "noventa");
        hundreds = new HashMap<>();
        tens.put(Integer.parseInt("100"), "cem");
        tens.put(Integer.parseInt("200"), "duzentos");
        tens.put(Integer.parseInt("300"), "trezentos");
        tens.put(Integer.parseInt("400"), "quatrocentos");
        tens.put(Integer.parseInt("500"), "quinhentos");
        tens.put(Integer.parseInt("600"), "seiscentos");
        tens.put(Integer.parseInt("700"), "setecentos");
        tens.put(Integer.parseInt("800"), "oitocentos");
        tens.put(Integer.parseInt("900"), "novecentos");
    }

    /**
     * Retorna a descrição da unidade
     *
     * @param value {@code Integer} Unidade
     * @return {@code Integer} Descrição
     */
    public String getUnityValue(Integer value) {
        return unity.get(value);
    }

    /**
     * Retorna a descrição da dezena
     *
     * @param value {@code Integer} Unidade
     * @return {@code Integer} Descrição
     */
    public String getTensValue(Integer value) {
        return tens.get(value);
    }

    /**
     * Retorna a descrição da centena
     *
     * @param value {@code Integer} Unidade
     * @return {@code Integer} Descrição
     */
    public String getHundredsValue(Integer value) {
        return hundreds.get(value);
    }

    /**
     * Retorna o mapa de unidades
     *
     * @return {@code Map(Integer, String)}
     */
    public Map<Integer, String> getUnity() {
        return unity;
    }

    /**
     * Retorna o mapa de dezenas
     *
     * @return {@code Map(Integer, String)}
     */
    public Map<Integer, String> getTens() {
        return tens;
    }

    /**
     * Retorna o mapa de centenas
     *
     * @return {@code Map(Integer, String)}
     */
    public Map<Integer, String> getHundreds() {
        return hundreds;
    }

}
