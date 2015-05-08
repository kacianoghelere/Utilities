package br.com.gmp.comps.lookup.interfaces;

/**
 * Interface de controle para campos de lookup
 *
 * @author kaciano
 */
public interface LookUpControl {

    /**
     * Método de busca
     *
     * @param param {@code Object} Parametro
     * @return {@code Object} 
     */
    Object search(Object param);

    /**
     * Vai para o primeiro indice
     *
     * @param param {@code Object} Parametro
     */
    void goToFirst(Object param);

    /**
     * Vai para o indice anterior
     *
     * @param param {@code Object} Parametro
     */
    void goToPrevious(Object param);

    /**
     * Vai para o próximo indice
     *
     * @param param {@code Object} Parametro
     */
    void goToNext(Object param);

    /**
     * Vai para o último indice
     *
     * @param param {@code Object} Parametro
     */
    void goToLast(Object param);
}
