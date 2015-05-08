package br.com.gmp.comps.interfaces;

/**
 * Interface para objetos encadeados que armazenam informações anteriores
 *
 * @author kaciano
 * @param <T> Classe do objeto
 */
public interface PreviousInformation<T> {

    T getPrevious();
}
