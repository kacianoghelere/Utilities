package br.com.gmp.utils.interceptors;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Classe de teste para os interceptadores
 *
 * @author kaciano
 * @version 1.0
 */
public class InterceptTest {

    private Injector injector;

    /**
     * Cria nova instancia de InterceptTest
     */
    private InterceptTest() {
        injector = Guice.createInjector(new InterceptorModule());
    }

    /**
     * Recupera a instancia de uma classe que sera interceptada pelo Guice
     *
     * @param <T> Classe a ser convertido a instancia
     * @param classe <code>Class</code> Classe do objeto
     * @return <code>T</code> Instancia do objeto gerado pelo Guice
     * @see Injector
     */
    public <T> T getBeanInstance(Class classe) {
        return (T) injector.getInstance(classe);
    }

    /**
     * Efetua o teste do interceptador
     */
    @Intercept
    public void test() {
        System.out.println("Call!");
    }

    public static void main(String[] args) {
        new InterceptTest().test();
    }
}
