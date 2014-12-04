package br.com.gmp.comps.data;

import com.db4o.ObjectContainer;
import java.util.List;

/**
 * Interface padrão para os DAO's
 *
 * @author kaciano
 * @param <T> Classe da Entidade
 */
public interface DAO<T> {

    /**
     * Deleta a entidade
     *
     * @param entity {@code T} Entidade
     */
    void delete(T entity);

    /**
     * Deleta todos os objetos da lista
     *
     * @param entities {@code List(T)} Lista a ser deletada
     */
    void deleteAll(List<T> entities);

    /**
     * Deleta todos os objetos do banco
     */
    void deleteAll();

    /**
     * Retorna a conexão com o banco de dados para buscas externas
     *
     * @return {@code ObjectContainer} Conexão com o banco
     */
    ObjectContainer getClient();

    /**
     * Retorna o nome da base de dados
     *
     * @return {@code String} Nome da base de dados
     */
    String getDatabase();

    /**
     * Busca todos os dados da entidade
     *
     * @return {@code List(T)} Entidade
     */
    List<T> getList();

    /**
     * Busca todos os dados da entidade
     *
     * @return {@code T[]} Entidade
     */
    Object[] getArray();

    /**
     * Retorna a classe do objeto que aplica o DAO
     *
     * @return {@code Class(?)} Classe do DAO
     */
    Class<T> getObjClass();

    /**
     * Retorna o prefixo da base de dados (Caminho do arquivo)
     *
     * @return {@code String} Prefixo da base de dados
     */
    String getDir();

    /**
     * Retorna o sufixo da base de dados (Extensão do arquivo)
     *
     * @return {@code String} sufixo da base de dados (Extensão do arquivo)
     */
    String getSufix();

    /**
     * Insere a entidade no banco de dados
     *
     * @param entity {@code T} Entidade
     */
    void insert(T entity);

    /**
     * Insere as entidades no banco de dados
     *
     * @param entities {@code List(T)} Entidades
     */
    void insertAll(List<T> entities);

    /**
     * Efetua a busca com base no campo informado
     *
     * @param field {@code String} Campo a ser verificado
     * @param value {@code Object} Valor da busca
     * @return {@code List(T)} Lista contendo o resultado
     */
    List<T> queryByField(String field, Object value);

    /**
     * Retorna a entidade a partir do ID
     *
     * @param id {@code Integer} ID
     * @return {@code T} Entidade
     */
    T queryByID(int id);

    /**
     * Deleta todos os registros anteriores e insere os registros da lista
     *
     * @param entities {@code List(T)} Lista dos novos registros
     */
    void replaceAll(List<T> entities);

    /**
     * Modifica o nome da base de dados
     *
     * @param database {@code String} Nome da base de dados
     */
    void setDatabase(String database);

    /**
     * Modifica a classe do objeto que aplica o DAO
     *
     * @param oClass {@code Class(?)} Classe do DAO
     */
    void setObjClass(Class<T> oClass);

    /**
     * Atualiza a entidade
     *
     * @param entity {@code T} Entidade
     * @throws java.lang.IllegalAccessException Acesso ilegal
     */
    void update(T entity) throws IllegalArgumentException, IllegalAccessException;

    /**
     * Retorna o próximo ID de entidade disponivel
     *
     * @return {@code Long} ID de entidade disponivel
     */
    Long getNextId();
}
