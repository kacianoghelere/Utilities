package br.com.gmp.utils.collections;

import java.util.Objects;

/**
 * Classe das tríades
 *
 * @author kaciano
 * @param <V> Primeiro TYPE de Objeto
 * @param <K> Segundo TYPE de Objeto
 * @param <T> Terceiro TYPE de Objeto
 */
public class Triad<V, K, T> {

    private V first;
    private K second;
    private T third;

    public Triad(V first, K second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triad{" + "first=" + first + ", second=" + second + ", third=" + third + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.first);
        hash = 17 * hash + Objects.hashCode(this.second);
        hash = 17 * hash + Objects.hashCode(this.third);
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
        final Triad<?, ?, ?> other = (Triad<?, ?, ?>) obj;
        if (!Objects.equals(this.first, other.first)) {
            return false;
        }
        if (!Objects.equals(this.second, other.second)) {
            return false;
        }
        return Objects.equals(this.third, other.third);
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

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

}
