package br.com.gmp.utils.file;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * Filtro de arquivos para pastas
 *
 * @author kaciano
 */
public class DirectoryFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory();
    }

    @Override
    public String getDescription() {
        return "Pasta";
    }

}
