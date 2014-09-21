package br.com.gmp.comps.data;

import com.db4o.query.Query;

/**
 * Objeto construtor de dados para querys
 *
 * @author kaciano
 * @version 1.0
 */
public class QueryBuilder {

    private Query query;

    /**
     * Cria nova instancia do construtor de querys
     *
     * @param query {@code Query} Query a ser manipulada
     */
    public QueryBuilder(Query query) {
        this.query = query;
    }

    /**
     * Restringe a busca à um campo especifico
     *
     * @param field {@code String} Campo a ser restringido
     * @return {@code QueryBuilder} Construtor de querys
     */
    public QueryBuilder descend(String field) {
        this.query.descend(field);
        return this;
    }

    /**
     * Restringe a busca à um valor especifico
     *
     * @param field {@code Object} Valor a ser restringido
     * @return {@code QueryBuilder} Construtor de querys
     */
    public QueryBuilder constrain(Object field) {
        this.query.constrain(field);
        return this;
    }

    /**
     * Restringe a busca à um campo especifico com um valor especifico
     *
     * @param field {@code String} Campo a ser restringido
     * @param value {@code Object} Valor a ser restringido
     * @return {@code QueryBuilder} Construtor de querys
     */
    public QueryBuilder searchFor(String field, Object value) {
        query.descend(field).constrain(value);
        return this;
    }

    /**
     * Ordena os resultados de forma crescente
     *
     * @return {@code QueryBuilder} Construtor de querys
     */
    public QueryBuilder orderAscending() {
        query.orderAscending();
        return this;
    }

    /**
     * Ordena os resultados de forma decrescente
     *
     * @return {@code QueryBuilder} Construtor de querys
     */
    public QueryBuilder orderDescending() {
        query.orderDescending();
        return this;
    }

    /**
     * Retorna a query construida
     *
     * @return {@code Query} Query construida
     */
    public Query ready() {
        return query;
    }

    /**
     * Retorna a criteria utilizada no builder
     *
     * @return {@code Query} Query construida
     */
    public Query getQuery() {
        return query;
    }

    /**
     * Modifica a criteria utilizada no builder
     *
     * @param query {@code Query} Query utilizada
     */
    public void setQuery(Query query) {
        this.query = query;
    }

}
