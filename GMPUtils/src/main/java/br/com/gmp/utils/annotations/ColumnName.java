package br.com.gmp.utils.annotations;

import java.lang.annotation.*;

/**
 * Interface de anotação para nomes de colunas
 *
 * @author kaciano
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ColumnName {

    /**
     * Nome da coluna
     *
     * @return {@code String} Nome da coluna
     */
    String name();
}
