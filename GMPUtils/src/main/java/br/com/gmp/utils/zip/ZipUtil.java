package br.com.gmp.utils.zip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * Utilitario para compressao de arquivos
 *
 * @author kaciano
 */
public class ZipUtil {

    /**
     * Tamanho do buffer de descompressão
     */
    private static final int BUFFER = 2048;
    private static final Logger LOGGER = Logger.getLogger(ZipUtil.class.getName());

    /**
     * Comprime os arquivos da pasta
     *
     * @param zippath {@code String} Caminho do arquivo ZIP
     * @param filepath {@code File} Diretorio dos itens à serem zipados
     */
    public static void zip(String zippath, File filepath) {
        zip(zippath, filepath.getPath());
    }

    /**
     * Comprime os arquivos da pasta
     *
     * @param zippath {@code String} Caminho do arquivo ZIP
     * @param filepath {@code String} Caminho do diretorio dos itens à serem
     * zipados
     */
    public static void zip(String zippath, String filepath) {
        try {
            BufferedInputStream origin = null;
            FileOutputStream dest = new FileOutputStream(zippath);
            try (ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest))) {
                byte data[] = new byte[BUFFER];
                File dir = new File(filepath);
                LOGGER.log(Level.INFO, "Zipping files in {0}", dir.getPath());
                for (String file : dir.list()) {
                    System.out.println("Adding: " + file);
                    FileInputStream fi = new FileInputStream(filepath
                            + File.separator + file);
                    origin = new BufferedInputStream(fi, BUFFER);
                    ZipEntry entry = new ZipEntry(file);
                    out.putNextEntry(entry);
                    int count;
                    while ((count = origin.read(data, 0,
                            BUFFER)) != -1) {
                        out.write(data, 0, count);
                    }
                    origin.close();
                }
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error while zipping files", e);
        }
    }

    /**
     * Descomprime os arquivos do arquivo ZIP
     *
     * @param zippath {@code File} Arquivo ZIP
     * @param filepath {@code File} Destino dos arquivos
     */
    public static void unzip(File zippath, File filepath) {
        unzip(zippath.getPath(), filepath.getPath());
    }

    /**
     * Descomprime os arquivos do arquivo ZIP
     *
     * @param zippath {@code String} Caminho do arquivo ZIP
     * @param filepath {@code String} Caminho do destino dos arquivos
     */
    public static void unzip(String zippath, String filepath) {
        try {
            BufferedOutputStream dest = null;
            BufferedInputStream is = null;
            ZipEntry entry;
            ZipFile zipfile = new ZipFile(zippath);
            Enumeration e = zipfile.entries();
            LOGGER.log(Level.INFO, "Unzipping files from {0}", filepath);
            while (e.hasMoreElements()) {
                entry = (ZipEntry) e.nextElement();
                System.out.println("Extracting: " + entry);
                is = new BufferedInputStream(zipfile.getInputStream(entry));
                int count;
                byte data[] = new byte[BUFFER];
                FileOutputStream fos = new FileOutputStream(filepath
                        + File.separator + entry.getName());
                dest = new BufferedOutputStream(fos, BUFFER);
                while ((count = is.read(data, 0, BUFFER)) != -1) {
                    dest.write(data, 0, count);
                }
                dest.flush();
                dest.close();
                is.close();
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error while unzipping files", e);
        }
    }
}
