package br.com.gmp.comps.list.dual.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.AbstractListModel;

/**
 * Modelo ordenado para JLists
 *
 * @author kaciano
 * @version 1.0
 * @see javax.swing.JList
 */
public class SortedListModel extends AbstractListModel {

    SortedSet<Object> model;

    /**
     * Cria nova instancia de SortedListModel
     */
    public SortedListModel() {
        model = new TreeSet<>();
    }

    @Override
    public int getSize() {
        return model.size();
    }

    @Override
    public Object getElementAt(int index) {
        return model.toArray()[index];
    }

    /**
     * Retorna os elementos
     *
     * @return {@code Object[]} Objeto
     */
    public Object[] getElements() {
        return model.toArray();
    }

    /**
     * Adiciona novo elemento
     *
     * @param element {@code Object} Objeto
     */
    public void add(Object element) {
        if (model.add(element)) {
            fireContentsChanged(this, 0, getSize());
        }
    }

    /**
     * Adiciona os objetos recebidos
     *
     * @param elements {@code Object[]} Objetos
     */
    public void addAll(Object elements[]) {
        Collection<Object> c = Arrays.asList(elements);
        model.addAll(c);
        fireContentsChanged(this, 0, getSize());
    }

    /**
     * Limpa a lista do modelo
     */
    public void clear() {
        model.clear();
        fireContentsChanged(this, 0, getSize());
    }

    /**
     *
     * @param element {@code Object} Objeto
     * @return {@code Boolean} Contem o objeto?
     */
    public Boolean contains(Object element) {
        return model.contains(element);
    }

    /**
     * Retorna o primeiro elemento do modelo
     *
     * @return {@code Object} Primeiro elemento
     */
    public Object firstElement() {
        return model.first();
    }

    /**
     * Iterator do modelo
     *
     * @return {@code Iterator}
     */
    public Iterator iterator() {
        return model.iterator();
    }

    /**
     * Retorna o ultimo elemento do modelo
     *
     * @return {@code Object} Ultimo elemento
     */
    public Object lastElement() {
        return model.last();
    }

    /**
     * Remove o elemento indicado
     *
     * @param element {@code Object} Elemento
     * @return
     */
    public boolean removeElement(Object element) {
        boolean removed = model.remove(element);
        if (removed) {
            fireContentsChanged(this, 0, getSize());
        }
        return removed;
    }
}
