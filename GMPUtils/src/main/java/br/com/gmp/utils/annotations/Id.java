package br.com.gmp.utils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação para itens que não podem ser copiados utilizando ObjectCopy
 *
 * @author kaciano
 * @since 1.0
 * @see br.com.gmp.utils.object.ObjectCopy
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Id {
}
