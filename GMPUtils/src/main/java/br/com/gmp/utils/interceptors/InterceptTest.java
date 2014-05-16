package br.com.gmp.utils.interceptors;

import br.com.gmp.utils.annotations.Intercept;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Classe de teste para interceptadores
 *
 * @author kaciano
 * @version 1.0
 */
public class InterceptTest {

    private Injector injector;

    /**
     * Cria nova instancia de InterceptTest
     */
    public InterceptTest() {
        injector = Guice.createInjector(new InterceptorModule());
    }

    /**
     * Retorna o injetor de dependencia
     *
     * @return <code>Injector</code> Injetor
     */
    public Injector getInjector() {
        return injector;
    }

    public static void main(String[] args) {
        InterceptMember instance = new InterceptTest().getInjector()
                .getInstance(InterceptMember.class);
        instance.testMethod();
    }

}

/**
 * Membro da classe de teste
 *
 * @author kaciano
 */
class InterceptMember {

    /**
     * Método que será interceptado no teste
     */
    @Intercept
    public void testMethod() {
        System.out.println("Métodozinho jaguara!");
    }
}
