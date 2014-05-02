package br.com.gmp.utils.interceptors;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação dos metodos que devem ser interceptados. Quando um metodo é
 * interceptado o icone na tela muda para a ambulheta e é feita a contagem do
 * tempo de execução desse metodo.
 *
 * @author Kaciano
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Intercept {
}
