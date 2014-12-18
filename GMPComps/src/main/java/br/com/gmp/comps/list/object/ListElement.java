package br.com.gmp.comps.list.object;

/**
 * Classe padronizada para itens de listas, tanto simples quanto duplas
 *
 * @author kaciano
 */
public abstract class ListElement {

    /**
     * Retorna o ID do objeto
     *
     * @return {@code int} ID do objeto
     */
    abstract int getId();

    /**
     * Retorna o Nome do objeto
     *
     * @return {@code String} Nome do objeto
     */
    abstract String getName();

    @Override
    public String toString() {
        return getId() + " - " + getName();
    }

}
