package br.com.gmp.utils.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wrapper generico para transporte de objetos
 *
 * @author kaciano
 * @version 1.0
 */
public class ObjectWrapper {

    private Object object;
    private final List<Object> list = new ArrayList<>();
    private final Map<String, Object> map = new HashMap<>();

    /**
     * Cria nova instancia de ObjectWrapper
     *
     * @param object {@code View} Object do ObjectWrapper
     */
    public ObjectWrapper(Object object) {
        this.object = object;
    }

    /**
     * Adiciona novo valor na lista para ser transportado
     *
     * @param value {@code Object} Valor à ser transportado
     * @return {@code ObjectWrapper} Wrapper
     */
    public ObjectWrapper addValue(Object value) {
        list.add(value);
        return this;
    }

    /**
     * Adiciona novo valor no mapa para ser transportado
     *
     * @param key {@code String} Chave do valor
     * @param value {@code Object} Valor à ser transportado
     * @return {@code ObjectWrapper} Wrapper
     */
    public ObjectWrapper addValue(String key, Object value) {
        map.put(key, value);
        return this;
    }

    /**
     * Retorna o objeto carregado na posição indicada
     *
     * @param index {@code int} Posição do objeto
     * @return {@code Object} Valor transportado
     * @throws java.lang.Exception Exceção lançada
     */
    public Object getValue(int index) throws Exception {
        return list.get(index);
    }

    /**
     * Retorna o objeto carregado na posição indicada
     *
     * @param key {@code int} Chave do objeto
     * @return {@code Object} Valor transportado
     * @throws java.lang.Exception Exceção lançada
     */
    public Object getValue(String key) throws Exception {
        return map.get(key);
    }

    /**
     * Limpa todos os valores carregados
     */
    public void clear() {
        list.clear();
        map.clear();
    }

    /**
     * Limpa todos os valores carregados na lista
     */
    public void clearList() {
        list.clear();
    }

    /**
     * Limpa todos os valores carregados no mapa
     */
    public void clearMap() {
        map.clear();
    }

    /**
     * Retorna a View do ObjectWrapper
     *
     * @return {@code View} View do ObjectWrapper
     */
    public Object getObject() {
        return object;
    }

    /**
     * Modifica a View do ObjectWrapper
     *
     * @param object {@code Object} Object do ObjectWrapper
     */
    public void setView(Object object) {
        this.object = object;
    }

    /**
     * Retorna a lista de valores transportados
     *
     * @return {@code List(Object)} Lista de valores
     */
    public List<Object> getList() {
        return list;
    }

    /**
     * Retorna o mapa de valores transportados
     *
     * @return {@code Map(String, Object)} Mapa de valores
     */
    public Map<String, Object> getMap() {
        return map;
    }

}
