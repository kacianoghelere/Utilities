package br.com.gmp.utils.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Coleção de métodos utilitários para trabalhar <b>Reflection</b>
 *
 * @author kaciano
 * @version 1.0
 */
public class ReflectionUtil {

    /**
     * Retorna o objeto instanciado a partir dos dados recebidos
     *
     * @param cl {@code <b>Class</b>} Classe da instancia
     * @param argTypes {@code <b>Class</b>[]} Array de argumentos da
     * instancia(Classes dos objetos a serem passados como parametro)
     * @param arguments {@code <b>Object</b>[]} Valores dos parametros
     * @return {@code <b>Object</b>} Objeto instanciado
     * @throws java.lang.InstantiationException Exceção de instanciamento
     */
    public Object newInstance(Class cl, Class[] argTypes, Object[] arguments) throws InstantiationException {
        try {
            Constructor declaredConstructor = cl.getDeclaredConstructor(argTypes);
            return declaredConstructor.newInstance(arguments);
        } catch (NoSuchMethodException | SecurityException |
                InstantiationException | IllegalAccessException |
                IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(ReflectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new InstantiationException();
    }

    /**
     * Retorna o objeto instanciado a partir do objeto de instancia recebido
     *
     * @param instance {@code <b>ObjectInstance</b>} Objeto com os dados da
     * instancia
     * @return {@code <b>Object</b>} Objeto instanciado
     * @throws java.lang.InstantiationException Exceção de instanciamento
     */
    public Object newInstance(ObjectInstance instance) throws InstantiationException {
        return newInstance(instance.getCl(), instance.getArgTypes(),
                instance.getArguments());
    }

    /**
     * Invoca o método
     *
     * @param method {@code <b>String</b>} Nome do método
     * @param cl {@code <b>Class</b>} Classe que contem o método
     * @param argtypes {@code <b>Class(?)[]</b>} Tipos dos parametros
     * @param args {@code <b>Object</b>[]} Valores dos parametros
     * @throws IllegalAccessException Acesso ilegal
     * @throws IllegalArgumentException Argumento ilegal
     * @throws InvocationTargetException Exceção de Invocação
     * @throws java.lang.NoSuchMethodException Método não existe
     */
    public void callMethod(String method, Class<?> cl, Class<?>[] argtypes, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        cl.getDeclaredMethod(method, argtypes).invoke(this, args);
    }

    public void test(String nome) {
        System.out.println("Meu nome é " + nome);
    }

    public static void main(String[] args) {
        try {
            new ReflectionUtil().callMethod("test", ReflectionUtil.class, new Class<?>[]{String.class}, "Jorge");
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException ex) {
            Logger.getLogger(ReflectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
