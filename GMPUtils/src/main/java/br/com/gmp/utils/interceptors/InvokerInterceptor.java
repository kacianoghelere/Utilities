package br.com.gmp.utils.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.perf4j.StopWatch;
import org.perf4j.javalog.JavaLogStopWatch;

/**
 * Interceptador de metodo, executa alguma tarefa antes de executar o metodo
 *
 * @author kaciano
 * @version 1.0
 */
public class InvokerInterceptor implements MethodInterceptor {

    /**
     * Metodo de invocação quando um metodo invocado tiver a anotação Intercept,
     * ele é filtrado por esse metodo.
     *
     * @param invoker <code>MethodInvocation</code> Invocação do metodo
     * @return <code>Object</code> Retorno do metodo
     * @throws java.lang.Throwable Exceção lançada pelo método
     * @since 1.0
     */
    @Override
    public Object invoke(MethodInvocation invoker) throws Throwable {
        StopWatch stop = null;
        Long before = System.currentTimeMillis();
        invoker.getMethod().setAccessible(true);
        Object result = null;
        synchronized (this) {
            stop = new JavaLogStopWatch(invoker.getMethod().getDeclaringClass().getSimpleName() + "." + invoker.getMethod().getName(), "");
            result = invoker.proceed();
            stop.stop();
        }
        result = invoker.proceed();
        Long after = System.currentTimeMillis();
        String metodoLog = "Method: "
                + invoker.getMethod().getDeclaringClass().getSimpleName()
                + "."
                + invoker.getMethod().getName()
                + " -> Called in "
                + (after - before)
                + "ms";
        before = null;
        after = null;
        System.out.println(metodoLog);
        return result;
    }
}
