package br.com.gmp.utils.interceptors;

import br.com.gmp.utils.annotations.Intercept;

/**
 *
 * @author kaciano
 */
public class InterceptTest {

    /**
     * Cria nova instancia de InterceptTest
     */
    public InterceptTest() {
        InterceptorModule interceptorModule = new InterceptorModule();
        jaguara();
    }

    @Intercept
    private void jaguara() {
        System.out.println("Métodozinho jaguara!");
    }

    public static void main(String[] args) {
        new InterceptTest();
    }
}
