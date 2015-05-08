package br.com.gmp.utils.file;

import br.com.gmp.utils.object.TextBuilder;
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
     * @param dir {@code File} Diretorio
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
     * @param dir {@code File} Diretorio
     * @return {@code List(String)} Lista de nomes dos arquivos filhos
     */
    public static List<String> getChild(File dir) {
        List<String> list = new ArrayList<>();
        findChild(dir, list);
        return list;
    }

    /**
     * Busca os nomes dos arquivos filhos
     *
     * @param dir {@code File} Diretorio
     * @param list {@code List(String)} Lista de nomes dos arquivos filhos
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
     * @param file {@code String} Caminho do arquivo
     * @return {@code String} Dados carregados
     * @throws IOException Exceção de I/O
     */
    public static String readString(String file) throws IOException {
        File read = new File(file);
        return readString(read);
    }

    /**
     * Retorna os dados carregados no arquivo em forma de String
     *
     * @param file {@code String} Caminho do arquivo
     * @return {@code String} Dados carregados
     * @throws IOException Exceção de I/O
     */
    public static String readString(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        TextBuilder txt = new TextBuilder();
        for (String line : read(file)) {
            txt.append(line + "\n\r");
        }
        return txt.getText();
    }

    /**
     * Retorna os dados carregados no arquivo
     *
     * @param file {@code String} Caminho do arquivo
     * @return {@code List(String)} Dados carregados(Linhas)
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
     * @param file {@code File} Arquivo
     * @return {@code List(String)} Dados carregados(Linhas)
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
     * @param file file {@code File} Arquivo
     * @param data {@code String} Dados
     * @throws IOException Exceção de I/O
     */
    public static void write(File file, String data) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(data);
        }
    }

    /**
     * Escreve os dados no arquivo(Sem quebra de linhas)
     *
     * @param file file {@code File} Arquivo
     * @param data {@code List(String)} Dados(Linhas)
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
     * @param file file {@code File} Arquivo
     * @param data {@code List(String)} Dados(Linhas)
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
