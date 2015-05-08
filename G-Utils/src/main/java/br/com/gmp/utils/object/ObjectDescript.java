package br.com.gmp.utils.object;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Classe para descrever campos e conteudo de objetos
 *
 * @author kaciano
 * @since 1.0
 */
public class ObjectDescript {

    /**
     * Descreve os nomes dos campos no objeto parametro
     *
     * @param object Objeto à ser descrito
     * @return Descrição
     */
    public String describeFields(Object object) {
        String tmp = object.getClass().getName().toUpperCase() + "{\n";
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            tmp += field.getName() + ",\n";
        }
        tmp += "}";
        return tmp;
    }

    /**
     * Descreve os nomes dos campos e os respectivos valoresno objeto parametro
     *
     * @param object Objeto à ser descrito
     * @return Descrição
     * @throws IllegalArgumentException Exceção de argumento ilegal
     * @throws IllegalAccessException Exceção de acesso ilegal
     */
    public String describeValues(Object object) throws IllegalArgumentException, IllegalAccessException {
        String tmp = object.getClass().getName().toUpperCase() + "{\n";
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            tmp += field.getName() + " = " + field.get(object) + ",\n";
        }
        tmp += "}";
        return tmp;
    }

    /**
     * Descreve os nomes dos campos na lista de objetos
     *
     * @param list Objetos à serem descritos
     * @return Descrição
     */
    public String describeListFields(List list) {
        String tmp = "LIST [\n";
        for (Object object : list) {
            tmp += object.getClass().getName().toUpperCase() + "{\n";
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                tmp += field.getName() + ",\n";
            }
            tmp += "}\n";
        }
        tmp += "]";
        return tmp;
    }

    /**
     *
     * Descreve os nomes dos campos e os respectivos valores na lista parametro
     *
     * @param list Objetos à serem descritos
     * @return Descrição
     * @throws IllegalArgumentException Exceção de argumento ilegal
     * @throws IllegalAccessException Exceção de acesso ilegal
     */
    public String describeListValues(List list) throws IllegalArgumentException, IllegalAccessException {
        String tmp = "LIST [\n";
        for (Object object : list) {
            tmp += object.getClass().getName().toUpperCase() + "{\n";
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                tmp += field.getName() + " = " + field.get(object) + ",\n";
            }
            tmp += "}\n";
        }
        tmp += "]";
        return tmp;
    }
}
