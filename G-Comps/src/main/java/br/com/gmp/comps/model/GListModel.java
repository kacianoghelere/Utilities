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
    private Object selectedValue;

    /**
     * Cria nova instancia de GListModel
     */
    public GListModel() {
        data = new ArrayList<>();
    }

    /**
     * Cria nova instancia de GListModel
     *
     * @param data {@code List} Dados do modelo
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
     * @param t {@code T} Novo elemento
     */
    public void add(T t) {
        data.add(t);
        refresh();
    }

    /**
     * Remove elemento do modelo
     *
     * @param t {@code T} Elemento
     */
    public void remove(T t) {
        if (data.contains(t)) {
            data.remove(t);
        }
        refresh();
    }

    /**
     * Remove vários elementos do modelo
     *
     * @param elements {@code T[]} Elementos
     */
    public void remove(T[] elements) {
        for (T t : elements) {
            if (data.contains(t)) {
                data.remove(t);
            }
        }
        refresh();
    }

    /**
     * Remove elemento do modelo
     *
     * @param index {@code int} ID do Elemento
     */
    public void remove(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        }
        refresh();
    }

    /**
     * Remove vários elementos do modelo
     *
     * @param elements {@code int[]} IDs dos Elementos
     */
    public void remove(int[] elements) {
        for (int i : elements) {
            remove(i);
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
     * @return {@code List} Dados do modelo
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Modifica os dados do modelo
     *
     * @param data {@code List} Dados do modelo
     */
    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * Retorna o valor selecionado
     *
     * @return {@code Object} Valor selecionado
     */
    public Object getSelectedValue() {
        return selectedValue;
    }

    /**
     * Modifica o valor selecionado
     *
     * @param selectedValue {@code Object} Valor selecionado
     */
    public void setSelectedValue(Object selectedValue) {
        this.selectedValue = selectedValue;
    }

}
