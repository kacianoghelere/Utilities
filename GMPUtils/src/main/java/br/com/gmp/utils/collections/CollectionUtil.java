package br.com.gmp.utils.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Coleção de métodos utilitários para Collections
 *
 * @author kaciano
 * @version 1.0
 * @param <T> Tipo a ser convertido
 */
public class CollectionUtil<T> {

    /**
     * Divide uma lista em um array de listas menores, conforme a quantidade
     * especificada
     *
     * @param list {@code <b>List</b>(T)} Lista a ser dividida
     * @param max {@code <b>Integer</b>} Quantidade máximo de itens por
     * lista
     * @return {@code <b>List</b>(T)[]} Array de listas
     */
    public List<T>[] splitList(List<T> list, int max) {
        int size = 0;
        //----------------------------------------------------------------------
        // Verifica o tamanho da lista
        if (list.size() > 0) {
            size = list.size() / max;
        }
        //----------------------------------------------------------------------
        // Verifica se a quantidade de paginas é igual à divisão do lista pelo
        // limite designado, se não for, adiciona uma pagina
        if (size * max < list.size()) {
            size++;
        }
        //----------------------------------------------------------------------
        // Cria uma array de arraylist com a quantidade de páginas a serem
        // criadas
        List<T>[] collectionList = new ArrayList[size];
        //----------------------------------------------------------------------
        // Inicializa todas as listas do array de paginas
        for (int i = 0; i < collectionList.length; i++) {
            collectionList[i] = new ArrayList<>();
        }
        //----------------------------------------------------------------------
        // Distribui o conteudo da lista principal para as paginas
        int x = 0;
        //----------------------------------------------------------------------
        // Laço da array principal, varre as paginas
        for (List<T> part : collectionList) {
            //------------------------------------------------------------------
            // Laço da pagina
            for (int j = x; j < list.size(); j++) {
                part.add(list.get(j));
                // Delimitador de conteudo
                x = j + 1;
                if (part.size() == max) {
                    break;
                }
            }
        }
        return collectionList;
    }

}
