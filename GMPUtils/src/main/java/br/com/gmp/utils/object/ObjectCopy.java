package br.com.gmp.utils.object;

import br.com.gmp.utils.annotations.Id;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * Classe responsavel pela cópia de campos de um objeto, para outro.
 *
 * @author kaciano
 * @since 1.0
 */
public class ObjectCopy {

    /**
     * Copia todos os valores das propriedades de A para B, desde que elas
     * existam em ambos os objetos e não possuam anotações para impedir a cópia
     *
     * @param a {@code <b>Object</b>} Objeto de base
     * @param b {@code <b>Object</b>} Objeto receptor
     * @throws java.lang.IllegalAccessException Acesso restrito
     */
    public static void copy(Object a, Object b) throws IllegalArgumentException, IllegalAccessException {
        //----------------------------------------------------------------------
        // Classes dos objetos
        Class<? extends Object> aClass = a.getClass();
        Class<? extends Object> bClass = b.getClass();
        //----------------------------------------------------------------------
        // Array das propriedades dos objetos
        Field[] aFields = aClass.getDeclaredFields();
        Field[] bFields = bClass.getDeclaredFields();
        //----------------------------------------------------------------------
        // Mapeamento
        for (Field aField : aFields) {
            aField.setAccessible(true);
            if (!aField.isAnnotationPresent(Id.class)) {
                for (Field bField : bFields) {
                    bField.setAccessible(true);
                    if (!bField.isAnnotationPresent(Id.class)) {
                        if (aField.getName().equals(bField.getName())) {
                            bField.set(b, aField.get(a));
                        }
                    }
                }
            }
        }
    }

    /**
     * Copia todos os valores das propriedades de A para B, desde que elas
     * existam em ambos os objetos
     *
     * @param a {@code Object} Objeto de base
     * @param b {@code Object} Objeto receptor
     * @throws java.lang.IllegalAccessException Acesso restrito
     */
    public static void copyAll(Object a, Object b) throws IllegalArgumentException, IllegalAccessException {
        //----------------------------------------------------------------------
        // Classes dos objetos
        Class<? extends Object> aClass = a.getClass();
        Class<? extends Object> bClass = b.getClass();
        //----------------------------------------------------------------------
        // Array das propriedades dos objetos
        Field[] aFields = aClass.getDeclaredFields();
        Field[] bFields = bClass.getDeclaredFields();
        //----------------------------------------------------------------------
        // Mapeamento
        for (Field aField : aFields) {
            aField.setAccessible(true);
            for (Field bField : bFields) {
                bField.setAccessible(true);
                if (aField.getName().equals(bField.getName())) {
                    bField.set(b, aField.get(a));
                }
            }
        }
    }

    /**
     * Copia todos o valores da propriedade enviada de A para B, desde que ela
     * exista em ambos os objetos
     *
     *
     * @param a {@code <b>Object</b>} Objeto de base
     * @param b {@code <b>Object</b>} Objeto receptor
     * @param name {@code <b>String</b>} Nome da propriedade a ser copiada
     * @throws java.lang.IllegalAccessException Acesso restrito
     */
    public static void copyOnly(Object a, Object b, String name) throws IllegalArgumentException, IllegalAccessException {
        //----------------------------------------------------------------------
        // Classes dos objetos
        Class<? extends Object> aClass = a.getClass();
        Class<? extends Object> bClass = b.getClass();
        //----------------------------------------------------------------------
        // Array das propriedades dos objetos
        Field[] aFields = aClass.getDeclaredFields();
        Field[] bFields = bClass.getDeclaredFields();
        //----------------------------------------------------------------------
        // Mapeamento
        for (Field aField : aFields) {
            aField.setAccessible(true);
            if (aField.getName().equalsIgnoreCase(name)) {
                for (Field bField : bFields) {
                    bField.setAccessible(true);
                    if (aField.getName().equals(bField.getName())) {
                        bField.set(b, aField.get(a));
                    }
                }
            }
        }
    }

    /**
     * Copia todos o valores das propriedades enviadas de A para B, desde que
     * ela exista em ambos os objetos
     *
     * @param a {@code <b>Object</b>} Objeto de base
     * @param b {@code <b>Object</b>} Objeto receptor
     * @param names {@code <b>String[]</b>} Nomes das propriedades a serem
     * copiadas
     * @throws java.lang.IllegalAccessException Acesso restrito
     */
    public static void copyOnly(Object a, Object b, String... names) throws IllegalArgumentException, IllegalAccessException {
        List<String> list = Arrays.asList(names);
        //----------------------------------------------------------------------
        // Classes dos objetos
        Class<? extends Object> aClass = a.getClass();
        Class<? extends Object> bClass = b.getClass();
        //----------------------------------------------------------------------
        // Array das propriedades dos objetos
        Field[] aFields = aClass.getDeclaredFields();
        Field[] bFields = bClass.getDeclaredFields();
        //----------------------------------------------------------------------
        // Mapeamento
        for (Field aField : aFields) {
            aField.setAccessible(true);
            if (list.contains(aField.getName())) {
                for (Field bField : bFields) {
                    bField.setAccessible(true);
                    if (aField.getName().equals(bField.getName())) {
                        bField.set(b, aField.get(a));
                    }
                }
            }
        }
    }

    /**
     * Copia todos o valores das propriedades enviadas de A para B (Super
     * classe), desde que ela exista em ambos os objetos
     *
     * @param a {@code <b>Object</b>} Objeto de base
     * @param b {@code <b>Object</b>} Objeto receptor (Super)
     * @throws java.lang.IllegalAccessException Acesso restrito
     */
    public void copyToSuper(Object a, Object b) throws IllegalAccessException {
        //----------------------------------------------------------------------
        // Classes dos objetos
        Class<? extends Object> aClass = a.getClass();
        Class<? extends Object> bClass = b.getClass().getSuperclass();
        //----------------------------------------------------------------------
        // Array das propriedades dos objetos
        Field[] aFields = aClass.getDeclaredFields();
        Field[] bFields = bClass.getDeclaredFields();
        //----------------------------------------------------------------------
        // Mapeamento
        for (Field aField : aFields) {
            aField.setAccessible(true);
            for (Field bField : bFields) {
                bField.setAccessible(true);
                if (aField.getName().equals(bField.getName())) {
                    bField.set(b, aField.get(a));
                }
            }
        }
    }

    /**
     * Copia todos o valores das propriedades enviadas de A (Super classe) para
     * B, desde que ela exista em ambos os objetos
     *
     * @param a {@code <b>Object</b>} Objeto de base (Super)
     * @param b {@code <b>Object</b>} Objeto receptor
     * @throws java.lang.IllegalAccessException Acesso restrito
     */
    public void copyFromSuper(Object a, Object b) throws IllegalAccessException {
        //----------------------------------------------------------------------
        // Classes dos objetos
        Class<? extends Object> aClass = a.getClass().getSuperclass();
        Class<? extends Object> bClass = b.getClass();
        //----------------------------------------------------------------------
        // Array das propriedades dos objetos
        Field[] aFields = aClass.getDeclaredFields();
        Field[] bFields = bClass.getDeclaredFields();
        //----------------------------------------------------------------------
        // Mapeamento
        for (Field aField : aFields) {
            aField.setAccessible(true);
            for (Field bField : bFields) {
                bField.setAccessible(true);
                if (aField.getName().equals(bField.getName())) {
                    bField.set(b, aField.get(a));
                }
            }
        }
    }

}
