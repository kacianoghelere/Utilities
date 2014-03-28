package br.com.gmp.utils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação para itens a serem mapeados em JTables
 *
 * @author kaciano
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TableObject {

    /**
     * Titulo da coluna
     *
     * @return Titulo da coluna
     */
    String title();

    /**
     * Deve ser demonstrado?
     *
     * @return Desmonstrar?
     */
    boolean show();

}
