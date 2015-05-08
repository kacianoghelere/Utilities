package br.com.gmp.utils.reflection;

/**
 * Objeto de transição para agilizar o processo de instanciamento via
 * <b>Reflection</b>
 *
 * @author Kaciano
 * @version 1.0
 */
public class ObjectInstance {

    private final Class cl;
    private final Class[] argTypes;
    private final Object[] arguments;

    /**
     * Cria novo objeto de instanciamento
     */
    public ObjectInstance() {
        throw new RuntimeException("Instancia nula");
    }

    /**
     * Cria novo objeto de instanciamento
     *
     * @param cl {@code <b>Class</b>} Classe da instancia
     * @param argTypes {@code <b>Class</b>[]} Array de argumentos da
     * instancia(Classes dos objetos a serem passados como parametro)
     * @param arguments {@code <b>Object</b>[]} Valores dos parametros
     */
    public ObjectInstance(Class cl, Class[] argTypes, Object[] arguments) {
        this.cl = cl;
        this.argTypes = argTypes;
        this.arguments = arguments;
    }

    /**
     * Retorna a classe da instancia
     *
     * @return {@code <b>Class</b>} Classe da instancia
     */
    public Class getCl() {
        return cl;
    }

    /**
     * Retorna as classes dos argumentos da instancia
     *
     * @return {@code <b>Class</b>[]} Array de argumentos da
     * instancia(Classes dos objetos a serem passados como parametro)
     */
    public Class[] getArgTypes() {
        return argTypes;
    }

    /**
     * Retorna os o array de valores dos parametros da instancia
     *
     * @return {@code <b>Object</b>[]} Valores dos parametros
     */
    public Object[] getArguments() {
        return arguments;
    }
}
