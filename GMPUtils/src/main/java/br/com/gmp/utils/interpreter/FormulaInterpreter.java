package br.com.gmp.utils.interpreter;

import br.com.gmp.utils.interpreter.object.FormulaParameter;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import java.util.Map;

/**
 * Objeto interpretador de formulas
 *
 * @author kaciano
 * @version 1.0
 */
public class FormulaInterpreter {

    private FormulaParameter parameter;

    /**
     * Cria nova instancia FormulaInterpreter
     */
    public FormulaInterpreter() {
    }

    /**
     * Cria nova instancia FormulaInterpreter
     *
     * @param parameter <code>FormulaParameter</code> Parametro
     */
    public FormulaInterpreter(FormulaParameter parameter) {
        this.parameter = parameter;
    }

    /**
     * Substitui os valores na expressão pelos valores carregados e calcula a
     * formula
     *
     * @return <code>Double</code> Resultado
     */
    public Double parse() {
        String formula = parameter.getFormula();
        for (Map.Entry<String, Double> entry : parameter.getMap().entrySet()) {
            formula = formula.replaceAll(entry.getKey(), String.valueOf(entry.getValue()));
        }
        Double parseFormula = (Double) parseFormula(formula, formula, "formula");
        return parseFormula;
    }

    /**
     * Retorna o resultado do calculo da formula
     *
     * @param expression <code>String</code> Expressão a ser calculada
     * @param dto <code>Object</code> Detalhamento
     * @param variable <code>String</code> Nome da variavel
     * @return <code>Object</code> Resultado
     */
    private Object parseFormula(String expression, Object dto, String variable) {
        Binding binding = new Binding();
        binding.setVariable(variable, dto);
        GroovyShell shell = new GroovyShell(binding);
        return shell.evaluate(expression);
    }

    /**
     * Retorna os parametros da formula
     *
     * @return <code>FormulaParameter</code> Parametro
     */
    public FormulaParameter getParameter() {
        return parameter;
    }

    /**
     * Modifica os parametros da formula
     *
     * @param parameter <code>FormulaParameter</code> Parametro
     * @return <code>FormulaInterpreter</code> Interpretador de formulas
     */
    public FormulaInterpreter setParameter(FormulaParameter parameter) {
        this.parameter = parameter;
        return this;
    }

}
