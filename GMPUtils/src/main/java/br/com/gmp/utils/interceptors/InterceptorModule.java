package br.com.gmp.utils.interceptors;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * Modulo interceptador das classes
 *
 * @author kaciano
 * @version 1.0
 */
public class InterceptorModule extends AbstractModule {

    /**
     * Configuração do metodo.
     *
     * @see InterceptMatcher
     * @see InvokerInterceptor
     * @see Matchers#any()
     * @see #bindInterceptor(com.google.inject.matcher.Matcher,
     * com.google.inject.matcher.Matcher,
     * org.aopalliance.intercept.MethodInterceptor[]) i
     * @since 1.0
     */
    @Override
    protected void configure() {
        //Todas as classes, usando o terceptMatcher e o InvokerInterceptor
        bindInterceptor(Matchers.any(), new InterceptMatcher(), new InvokerInterceptor());
    }
}
