package br.com.gmp.utils.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Interceptador de execuções de métodos
 *
 * @author kaciano
 * @version 1.0
 */
public class Interceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation method) throws Throwable {
        String msg = "Method: " + method.getMethod().getName().toUpperCase()
                + " -> Invoked!";
        System.out.println(msg);
        return method.proceed();
    }
}
