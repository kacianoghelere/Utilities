package br.com.gmp.utils.generics;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Utilitário para objetos genéricos
 *
 * @author kaciano
 */
public class GenericUtil {

    /**
     *
     * @param type Tipo
     * @param targetClass Classe
     * @return Classe
     */
    public static Class<?> getActualClass(Type type, Class<?> targetClass) {
        Map<TypeVariable<?>, Type> map = getTypeVariableMap(targetClass);
        return getActualClass(type, map);
    }

    /**
     *
     * @param type Tipo
     * @param targetClass Classe
     * @return Tipo
     */
    public static Type getActualType(Type type, Class<?> targetClass) {
        Map<TypeVariable<?>, Type> map = getTypeVariableMap(targetClass);
        return getActualType(type, map);
    }

    /**
     *
     * @param type Tipo
     * @param map Mapa
     * @return Tipo
     */
    private static Class<?> getActualClass(Type type,
            Map<TypeVariable<?>, Type> map) {
        if (Class.class.isInstance(type)) {
            return Class.class.cast(type);
        }
        if (ParameterizedType.class.isInstance(type)) {
            final Type actualType = getActualType(type, map);
            return getActualClass(actualType, map);
        } else if (TypeVariable.class.isInstance(type)) {
            final Type actualType = getActualType(type, map);
            return getActualClass(actualType, map);
        } else if (GenericArrayType.class.isInstance(type)) {
            GenericArrayType genericArrayType = GenericArrayType.class
                    .cast(type);
            final Type genericComponentType = genericArrayType
                    .getGenericComponentType();
            Class<?> componentClass = getActualClass(genericComponentType, map);
            return Array.newInstance(componentClass, 0).getClass();
        } else {
            return null;
        }
    }

    /**
     *
     * @param type Tipo
     * @param map Mapa
     * @return Tipo
     */
    private static Type getActualType(Type type, Map<TypeVariable<?>, Type> map) {
        if (Class.class.isInstance(type)) {
            return type;
        } else if (ParameterizedType.class.isInstance(type)) {
            return ParameterizedType.class.cast(type).getRawType();
        } else if (TypeVariable.class.isInstance(type)) {
            return map.get(TypeVariable.class.cast(type));
        } else {
            return null;
        }
    }

    /**
     *
     * @param cl Classe
     * @return Mapa
     */
    private static Map<TypeVariable<?>, Type> getTypeVariableMap(
            final Class<?> cl) {
        if (cl == null) {
            return Collections.emptyMap();
        }
        final Map<TypeVariable<?>, Type> map = new LinkedHashMap<>();
        final Class<?> superClass = cl.getSuperclass();
        final Type superClassType = cl.getGenericSuperclass();
        if (superClass != null) {
            gatherTypeVariables(superClass, superClassType, map);
        }
        final Class<?>[] interfaces = cl.getInterfaces();
        final Type[] interfaceTypes = cl.getGenericInterfaces();
        for (int i = 0; i < interfaces.length; ++i) {
            gatherTypeVariables(interfaces[i], interfaceTypes[i], map);
        }
        return map;
    }

    /**
     *
     * @param cl Classe
     * @param type Tipo
     * @param map Mapa
     */
    private static void gatherTypeVariables(final Class<?> cl,
            final Type type, final Map<TypeVariable<?>, Type> map) {
        if (cl == null) {
            return;
        }
        gatherTypeVariables(type, map);

        final Class<?> superClass = cl.getSuperclass();
        final Type superClassType = cl.getGenericSuperclass();
        if (superClass != null) {
            gatherTypeVariables(superClass, superClassType, map);
        }
        final Class<?>[] interfaces = cl.getInterfaces();
        final Type[] interfaceTypes = cl.getGenericInterfaces();
        for (int i = 0; i < interfaces.length; ++i) {
            gatherTypeVariables(interfaces[i], interfaceTypes[i], map);
        }
    }

    /**
     *
     * @param type Tipo
     * @param map Mapa
     */
    private static void gatherTypeVariables(final Type type,
            final Map<TypeVariable<?>, Type> map) {
        if (ParameterizedType.class.isInstance(type)) {
            final ParameterizedType parameterizedType = ParameterizedType.class
                    .cast(type);
            final TypeVariable<?>[] typeVariables = GenericDeclaration.class
                    .cast(parameterizedType.getRawType()).getTypeParameters();
            final Type[] actualTypes = parameterizedType
                    .getActualTypeArguments();
            for (int i = 0; i < actualTypes.length; ++i) {
                map.put(typeVariables[i], actualTypes[i]);
            }
        }
    }

}
