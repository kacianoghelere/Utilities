package br.com.gmp.utils.interpreter.object;

import java.util.HashMap;
import java.util.Map;

/**
 * Parametro para carregamento de formulas
 *
 * @author kaciano
 * @version 1.0
 */
public class FormulaParameter {

    private String formula;
    private final Map<String, Double> map;

    /**
     * Cria nova instancia de FormulaParameter
     */
    public FormulaParameter() {
        this.formula = "";
        this.map = new HashMap<>();
    }

    /**
     * Cria nova instancia de FormulaParameter
     *
     * @param formula {@code String} Formula à ser calculada
     */
    public FormulaParameter(String formula) {
        this.formula = formula;
        this.map = new HashMap<>();
    }

    /**
     * Adiciona novos valores no calculo da formula
     *
     * @param key {@code String} Valor que será substituido
     * @param value {@code Double} Valor real
     */
    public void put(String key, Double value) {
        map.put(key, value);
    }

    /**
     * Retorna a formula à ser calculada
     *
     * @return {@code String} Formula à ser calculada
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Modifica a formula à ser calculada
     *
     * @param formula {@code String} Formula à ser calculada
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * Retorna o mapa de valores carregados
     *
     * @return {@code Map(String, Double)} Mapa de valores
     */
    public Map<String, Double> getMap() {
        return map;
    }

}
