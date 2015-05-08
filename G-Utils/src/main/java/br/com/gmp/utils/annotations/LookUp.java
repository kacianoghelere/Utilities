package br.com.gmp.utils.annotations;

import java.lang.annotation.*;

/**
 * Interface de anotação para campos de LookUp
 *
 * @author kaciano
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface LookUp {

    /**
     * Retorna o nome do campo de LookUp
     *
     * @return {@code String} Nome do campo
     */
    String name();

    /**
     * Retorna a classe do campo de LookUp
     *
     * @return {@code Class} Classe do campo
     */
    Class type();
}
