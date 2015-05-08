package br.com.gmp.comps.list.dual.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.AbstractListModel;

/**
 * Modelo ordenado para JLists
 *
 * @author kaciano
 * @version 1.0
 * @param <T> Tipo dos objetos
 * @see javax.swing.JList
 */
public class GDualListModel<T> extends AbstractListModel<T> {

    SortedSet<T> model;

    /**
     * Cria nova instancia de SortedListModel
     */
    public GDualListModel() {
        model = new TreeSet<>();
    }

    /**
     * Cria nova instancia de SortedListModel
     *
     * @param collection {@code List(T)} Collection
     */
    public GDualListModel(List<T> collection) {
        model = new TreeSet<>(collection);
    }

    @Override
    public int getSize() {
        return model.size();
    }

    @Override
    public T getElementAt(int index) {
        return ((T[]) model.toArray())[index];
    }

    /**
     * Retorna os elementos
     *
     * @return {@code T[]} Objeto
     */
    public T[] getElements() {
        return (T[]) model.toArray();
    }

    /**
     * Retorna os elementos
     *
     * @return {@code List(T)} Objeto
     */
    public List<T> getList() {
        return new ArrayList<>(model);
    }

    /**
     * Adiciona novo elemento
     *
     * @param element {@code T} Objeto
     */
    public void add(T element) {
        if (model.add(element)) {
            fireContentsChanged(this, 0, getSize());
        }
    }

    /**
     * Adiciona os objetos recebidos
     *
     * @param elements {@code T[]} Objetos
     */
    public void addAll(T elements[]) {
        Collection<T> c = Arrays.asList(elements);
        model.addAll(c);
        fireContentsChanged(this, 0, getSize());
    }

    /**
     * Adiciona os objetos recebidos
     *
     * @param elements {@code Collection(T)} Objetos
     */
    public void addAll(Collection<T> elements) {
        model.addAll(elements);
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
     * @param element {@code T} Objeto
     * @return {@code Boolean} Contem o objeto?
     */
    public Boolean contains(T element) {
        return model.contains(element);
    }

    /**
     * Retorna o primeiro elemento do modelo
     *
     * @return {@code T} Primeiro elemento
     */
    public T firstElement() {
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
     * @return {@code T} Ultimo elemento
     */
    public T lastElement() {
        return model.last();
    }

    /**
     * Remove o elemento indicado
     *
     * @param element {@code T} Elemento
     * @return {@code boolean} Item foi removido?
     */
    public boolean removeElement(T element) {
        boolean removed = model.remove(element);
        if (removed) {
            fireContentsChanged(this, 0, getSize());
        }
        return removed;
    }

}
