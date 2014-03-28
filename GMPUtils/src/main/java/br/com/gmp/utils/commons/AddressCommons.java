package br.com.gmp.utils.commons;

/**
 *
 * @author kaciano
 */
public enum AddressCommons {

    STATES(new String[]{"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO",
        "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS",
        "RO", "RR", "SC", "SE", "SP", "TO"}),
    ADDRESS(new String[]{"Aerop.", "Alameda", "Área", "Avenida", "Campo",
        "Chácara", "Colônia", "Condom.", "Conjunto", "Distrito", "Esplanada",
        "Estação", "Estrada", "Favela", "Fazenda", "Feira", "Jardim", "Ladeira",
        "Lago", "Lagoa", "Largo", "Loteamento", "Morro", "Núcleo", "Parque",
        "Passarela", "Pátio", "Praça", "Quadra", "Recanto", "Residencial",
        "Rodovia", "Rua", "Setor", "Sítio", "Travessa", "Trecho", "Trevo",
        "Vale", "Vereda", "Via", "Viela", "Vila"});

    private String[] array;
    private String[] address;

    private AddressCommons(String[] array) {
        this.array = array;
    }

    public static AddressCommons getSTATES() {
        return STATES;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

}
