package br.com.gmp.utils.interceptors;

import br.com.gmp.utils.annotations.Intercept;
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
     * Configuração dos metodos anotados
     *
     * @see br.com.gmp.utils.annotations.Intercept
     * @see Interceptor
     * @see Matchers#any()
     * @since 1.0
     */
    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(Intercept.class), new Interceptor());
    }
}
