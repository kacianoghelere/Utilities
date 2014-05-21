package br.com.gmp.utils.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Coleção de métodos utilitários para tratar arquivos
 *
 * @author kaciano
 * @version 1.0
 */
public class FileUtil {

    /**
     * Imprime todos os arquivo dentro do diretorio indicado
     *
     * @param dir <code>File</code> Diretorio
     */
    public static void printChild(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                printChild(file);
            }
            System.out.println(file.getPath());
        }
    }

    /**
     * Retorna todos os arquivo dentro do diretorio indicado
     *
     * @param dir <code>File</code> Diretorio
     * @return <code>List(String)</code> Lista de nomes dos arquivos filhos
     */
    public static List<String> getChild(File dir) {
        List<String> list = new ArrayList<>();
        findChild(dir, list);
        return list;
    }

    /**
     * Busca os nomes dos arquivos filhos
     *
     * @param dir <code>File</code> Diretorio
     * @param list <code>List(String)</code> Lista de nomes dos arquivos filhos
     */
    public static void findChild(File dir, List<String> list) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                findChild(file, list);
            }
            list.add(file.getPath());
        }
    }

    /**
     * Retorna os dados carregados no arquivo em forma de String
     *
     * @param file <code>String</code> Caminho do arquivo
     * @return <code>String</code> Dados carregados
     * @throws IOException Exceção de I/O
     */
    public static String readString(String file) throws IOException {
        File read = new File(file);
        if (!read.isFile()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String line : read(read)) {
            sb.append(line);
        }        
        return sb.toString();
    }

    /**
     * Retorna os dados carregados no arquivo
     *
     * @param file <code>String</code> Caminho do arquivo
     * @return <code>List(String)</code> Dados carregados(Linhas)
     * @throws IOException Exceção de I/O
     */
    public static List<String> read(String file) throws IOException {
        File read = new File(file);
        if (!read.isFile()) {
            return null;
        }
        return read(read);
    }

    /**
     * Retorna os dados carregados no arquivo
     *
     * @param file <code>File</code> Arquivo
     * @return <code>List(String)</code> Dados carregados(Linhas)
     * @throws IOException Exceção de I/O
     */
    public static List<String> read(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        List<String> list = new ArrayList<>();
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            while (br.ready()) {
                list.add(br.readLine());
            }
        }
        return list;
    }

    /**
     * Escreve os dados no arquivo(Sem quebra de linhas)
     *
     * @param file file <code>File</code> Arquivo
     * @param data <code>List(String)</code> Dados(Linhas)
     * @throws IOException Exceção de I/O
     */
    public static void write(File file, List<String> data) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            for (String s : data) {
                fw.write(s);
            }
        }
    }

    /**
     * Escreve os dados no arquivo(Com quebra de linhas)
     *
     * @param file file <code>File</code> Arquivo
     * @param data <code>List(String)</code> Dados(Linhas)
     * @throws IOException Exceção de I/O
     */
    public static void writeLine(File file, List<String> data) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            for (String s : data) {
                fw.write(s + "\n");
            }
        }
    }

}