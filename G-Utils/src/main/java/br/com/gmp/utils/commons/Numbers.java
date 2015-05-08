package br.com.gmp.utils.commons;

/**
 * Enum de controle para nomenclaturas de numeros
 *
 * @author kaciano
 * @version 1.0
 */
public enum Numbers {

    /**
     * Descrições das unidades
     */
    UNITY_BR(new String[]{"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "zero"}),
    /**
     * Descrições das dezenas
     */
    TENS_BR(new String[]{"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"}),
    /**
     * Descrições das centenas
     */
    HUNDREDS_BR(new String[]{"cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"}),
    /**
     * Descrições dos milhares
     */
    THOUSAND_BR(new String[]{"mil"}),
    /**
     * Descrições de milhões
     */
    MILLION_BR(new String[]{"milhão, milhões"}),
    /**
     * Descrições de bilhões
     */
    BILLION_BR(new String[]{"bilhão, bilhões"});

    private String[] array;

    /**
     * Cria nova instancia de Numbers
     *
     * @param array {@code String[]} Array de dados
     */
    private Numbers(String[] array) {
        this.array = array;
    }

    /**
     * Retorna o array de dados
     *
     * @return {@code String[]} Array de dados
     */
    public String[] getArray() {
        return array;
    }

    /**
     * Modifica o array de dados
     *
     * @param array {@code String[]} Array de dados
     */
    public void setArray(String[] array) {
        this.array = array;
    }

}
