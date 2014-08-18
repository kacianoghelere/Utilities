package br.com.gmp.comps.table.interfaces;

import java.util.List;

/**
 * Interface para Forms que utilizam GMPTables
 *
 * @author kaciano
 * @version 1.0
 * @param <T>
 */
public interface TableSource<T> {

    /**
     * Retorna os dados para preencher e atualizar a tabela
     *
     * @return {@code List<T>} Lista de dados
     */
    List<T> getTableData();
}
