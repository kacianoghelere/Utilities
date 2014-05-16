package br.com.gmp.utils.interceptors;

import br.com.gmp.utils.annotations.Intercept;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *
 * @author kaciano
 */
public class InterceptTest {

    private Injector injector;

    /**
     * Cria nova instancia de InterceptTest
     */
    public InterceptTest() {
        injector = Guice.createInjector(new InterceptorModule());
    }

    public Injector getInjector() {
        return injector;
    }

    public static void main(String[] args) {
        InterceptMember instance = new InterceptTest().getInjector()
                .getInstance(InterceptMember.class);
        instance.jaguara();
    }
}

class InterceptMember {

    @Intercept
    public void jaguara() {
        System.out.println("Métodozinho jaguara!");
    }
}
