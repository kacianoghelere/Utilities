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
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(invocation.getMethod().getName() + " -> Invoked!");
        return invocation.proceed();
    }
}
