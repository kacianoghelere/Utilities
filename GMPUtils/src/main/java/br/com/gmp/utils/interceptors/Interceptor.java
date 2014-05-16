package br.com.gmp.utils.interceptors;

import br.com.gmp.utils.system.TimeCounter;
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
        TimeCounter counter = new TimeCounter();
        Object proceed = method.proceed();
        String msg = "Method: " + method.getMethod().getName().toUpperCase()
                + " -> Invoked in " + counter.getTimeSpent() + "ms";
        System.out.println(msg);
        return proceed;
    }
}
