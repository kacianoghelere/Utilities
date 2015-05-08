package br.com.gmp.comps.table.interfaces;

/**
 * Interface de controle para tabelas paginadas
 *
 * @author kaciano
 */
public interface TableControl {

    /**
     * Próxima página
     */
    void nextPage();

    /**
     * Página anterior
     */
    void previousPage();

    /**
     * Retorna o numero máximo de linhas por página
     *
     * @return {@code <b>int</b>} Máximo de linhas por página
     */
    int getMaxRows();

    /**
     * Modifica o limite de linhas por página
     *
     * @param maxrows {@code <b>int</b>} Máximo de linhas por página
     */
    void setMaxRows(int maxrows);

    /**
     * Retorna página atual
     *
     * @return {@code <b>int</b>} Página atual
     */
    int getActualPage();

    /**
     * Modifica a página atual
     *
     * @param page {@code <b>int</b>} Página atual
     */
    void setActualPage(int page);

    /**
     * Indica a página para a qual a tabela deve ir
     *
     * @param page {@code <b>int</b>} Página indicada
     */
    void gotoPage(int page);

    /**
     * Vai para a primeira página
     */
    void gotoFirst();

    /**
     * Vai para a última página
     */
    void gotoLast();

    /**
     * Atualiza a tabela.
     */
    void refresh();
}
