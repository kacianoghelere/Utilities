package br.com.gmp.utils.interceptors;

import com.google.inject.matcher.AbstractMatcher;
import java.lang.reflect.Method;

/**
 * Matcher para buscar somente os metodos com a anotação presente
 *
 * @author kaciano
 * @version 1.0
 * @see Intercept
 */
public class InterceptMatcher extends AbstractMatcher<Method> {

    /**
     * Somente os metodos que contiverem a anotação Intercept
     *
     * @param method <code>Method</code> Metodo a ser verificado
     * @return <code>boolean</code> true caso o metodo possua a anotação
     * @see Intercept
     */
    @Override
    public boolean matches(Method method) {
        return method.isAnnotationPresent(Intercept.class);
    }
}
