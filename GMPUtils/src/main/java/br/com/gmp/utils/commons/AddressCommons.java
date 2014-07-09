package br.com.gmp.utils.commons;

/**
 * Enum de controle para nomenclaturas basicas de endereços
 *
 * @author kaciano
 * @version 1.0
 */
public enum AddressCommons {

    /**
     * Siglas dos estados
     */
    STATES_BR(new String[]{
        "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
        "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC",
        "SE", "SP", "TO"}),
    /**
     * Prefixos de endereços básicos
     */
    ADDRESS_BR(new String[]{
        "Aeroporto", "Alameda", "Área", "Avenida", "Campo", "Chácara", "Colônia",
        "Condom.", "Conjunto", "Distrito", "Esplanada", "Estação", "Estrada",
        "Favela", "Fazenda", "Feira", "Jardim", "Ladeira", "Lago", "Lagoa",
        "Largo", "Loteamento", "Morro", "Núcleo", "Parque", "Passarela", "Pátio",
        "Praça", "Quadra", "Recanto", "Residencial", "Rodovia", "Rua", "Setor",
        "Sítio", "Travessa", "Trecho", "Trevo", "Vale", "Vereda", "Via", "Viela",
        "Vila"});

    private String[] array;

    /**
     * Cria nova instancia de AddressCommons
     *
     * @param array {@code String[]} Array de dados
     */
    private AddressCommons(String[] array) {
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
