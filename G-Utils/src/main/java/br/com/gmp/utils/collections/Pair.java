package br.com.gmp.utils.collections;

import java.util.LinkedList;
import java.util.Objects;

/**
 * Classe dos pares
 *
 * @author kaciano
 * @param <V> Primeiro TYPE de Objeto
 * @param <K> Segundo TYPE de Objeto
 */
public class Pair<V, K> {

    private V first;
    private K second;

    public Pair(V first, K second) {
        this.first = first;
        this.second = second;
    }

    public Pair(LinkedList list1, LinkedList list2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.first);
        hash = 71 * hash + Objects.hashCode(this.second);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair<?, ?> other = (Pair<?, ?>) obj;
        if (!Objects.equals(this.first, other.first)) {
            return false;
        }
        return Objects.equals(this.second, other.second);
    }

    public V getFirst() {
        return first;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public K getSecond() {
        return second;
    }

    public void setSecond(K second) {
        this.second = second;
    }
    
    
}
