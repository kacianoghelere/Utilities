package br.com.gmp.comps.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 * Modelo para JList
 *
 * @author kaciano
 * @param <T> Tipo dos dados do modelo
 */
public class GListModel<T> extends AbstractListModel<T> {

    private List<T> data;

    /**
     * Cria nova instancia de GListModel
     */
    public GListModel() {
        data = new ArrayList<>();
    }

    /**
     * Cria nova instancia de GListModel
     *
     * @param data <code>List</code> Dados do modelo
     */
    public GListModel(List<T> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public T getElementAt(int index) {
        return data.get(index);
    }

    /**
     * Adiciona novo elemento ao modelo
     *
     * @param t <code>T</code> Novo elemento
     */
    public void add(T t) {
        data.add(t);
        refresh();
    }

    /**
     * Remove elemento do modelo
     *
     * @param t <code>T</code> Elemento
     */
    public void remove(T t) {
        if (data.contains(t)) {
            data.remove(t);
        }
        refresh();
    }

    /**
     * Atualiza o modelo
     */
    public void refresh() {
        fireContentsChanged(this, 0, getSize());
    }

    /**
     * Retorna os dados do modelo
     *
     * @return <code>List</code> Dados do modelo
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Modifica os dados do modelo
     *
     * @param data <code>List</code> Dados do modelo
     */
    public void setData(List<T> data) {
        this.data = data;
    }

}
