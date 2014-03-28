package br.com.gmp.utils.desktop;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Classe que controla os acessos ao desktop
 *
 * @author kaciano
 */
public class DesktopLaunch {

    /**
     * Abre o arquivo utilizando o programa padrão
     *
     * @param path Caminho do arquivo
     * @throws IOException Exceção de I/O
     */
    public static void open(String path) throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(new File(path));
        }
    }

    /**
     * Abre o arquivo utilizando o programa padrão
     *
     * @param file Arquivo
     * @throws IOException Exceção de I/O
     */
    public static void open(File file) throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(file);
        }
    }

    /**
     * Abre o arquivo para edição utilizando o programa padrão
     *
     * @param path Caminho do arquivo
     * @throws IOException Exceção de I/O
     */
    public static void edit(String path) throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().edit(new File(path));
        }
    }

    /**
     * Abre o arquivo para edição utilizando o programa padrão
     *
     * @param file Arquivo
     * @throws IOException Exceção de I/O
     */
    public static void edit(File file) throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().edit(file);
        }
    }

}
