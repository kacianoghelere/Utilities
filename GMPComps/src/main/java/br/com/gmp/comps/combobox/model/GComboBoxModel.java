package br.com.gmp.comps.combobox.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

/**
 * Modelo de combobox customizado
 *
 * @author kaciano
 * @param <T> Tipo dos dados
 */
public class GComboBoxModel<T> extends DefaultComboBoxModel<T> {

    private List<T> data;
    private T selectedObject;

    /**
     * Cria nova instancia de GComboBoxModel
     */
    public GComboBoxModel() {
        this.data = new ArrayList<>();
        initialize();
    }

    /**
     * Cria nova instancia de GComboBoxModel
     *
     * @param data {@code List(T)} Dados do combobox
     */
    public GComboBoxModel(List<T> data) {
        this.data = data;
        initialize();
    }

    /**
     * Cria nova instancia de GComboBoxModel
     *
     * @param data {@code T[]} Dados do combobox
     */
    public GComboBoxModel(T[] data) {
        this.data = Arrays.asList(data);
        initialize();
    }

    /**
     * Cria nova instancia de GComboBoxModel
     *
     * @param data {@code Vector(T)} Dados do combobox
     */
    public GComboBoxModel(Vector<T> data) {
        this.data = data;
        initialize();
    }

    private void initialize() {

    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public void addElement(T object) {
        this.data.add(object);
        if (data.size() == 1 && getSelectedItem() == null && object != null) {
            setSelectedItem(object);
        }
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public T getElementAt(int index) {
        return this.data.get(index);
    }

    @Override
    public void removeElement(Object object) {
        if (contains((T) object)) {
            this.data.remove((T) object);
        }
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public void removeElementAt(int index) {
        this.data.remove(index);
        fireIntervalRemoved(this, index, index);
    }

    @Override
    public void removeAllElements() {        
        this.data.clear();
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public void insertElementAt(T object, int index) {
        this.data.set(index, object);
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public T getSelectedItem() {
        return selectedObject;
    }

    @Override
    public void setSelectedItem(Object object) {
        if ((selectedObject != null && !selectedObject.equals(object))
                || selectedObject == null && object != null) {
            selectedObject = (T) object;
            fireContentsChanged(this, -1, -1);
        }
    }

    /**
     * Retorna a posição do objeto parametro dentro do modelo
     *
     * @param object {@code T} Objeto a ser buscado
     * @return {@code int} Posição do objeto
     */
    @Override
    public int getIndexOf(Object object) {
        return this.data.indexOf(object);
    }

    /**
     * Verifica se o modelo contem o objeto indicado
     *
     * @param object {@code T} Objeto a ser buscado
     * @return {@code T} Contem o objeto?
     */
    public Boolean contains(T object) {
        return this.data.contains(object);
    }

    /**
     * Retorna os dados originais do combobox
     *
     * @return {@code List(T)} Dados do combobox
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Modifica os dados originais do combobox
     *
     * @param data {@code List(T)} Dados do combobox
     */
    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * Modifica os dados originais do combobox
     *
     * @param data {@code Vector(T)} Dados do combobox
     */
    public void setData(Vector<T> data) {
        this.data = data;
    }

    /**
     * Modifica os dados originais do combobox
     *
     * @param data {@code T[]} Dados do combobox
     */
    public void setData(T[] data) {
        this.data = Arrays.asList(data);
    }

}
