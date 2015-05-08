package br.com.gmp.utils.file;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Classe de utilidades para seletores de arquivos
 *
 * @author kaciano
 * @version 1.0
 */
public class FileChooserUtil {

    /**
     * Mostra o seletor de arquivos
     *
     * @param parent {@code Component} Componente pai
     * @param filtername {@code String} Descrição do filtro
     * @param extensions {@code String} Extensões
     * @return {@code File} Arquivo selecionado
     */
    public File show(Component parent, String filtername, String... extensions) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter(
                filtername, extensions));
        int returnVal = chooser.showOpenDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Arquivo selecionado: " + chooser.getSelectedFile());
            return chooser.getSelectedFile();
        }
        System.out.println("Nenhum arquivo selecionado");
        return null;
    }

}
