package br.com.gmp.utils.interceptors;

import br.com.gmp.utils.annotations.Intercept;
import com.google.inject.Inject;

/**
 *
 * @author kaciano
 */
public class InterceptTest {

    /**
     * Cria nova instancia de InterceptTest
     */
    @Inject
    public InterceptTest() {        
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
