package br.com.gmp.utils.logs;

import br.com.gmp.utils.date.DateUtil;
import br.com.gmp.utils.system.SystemProperties;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Classe com métodos utiliários para registrar Exceptions em arquivos
 *
 * @author kaciano
 * @version 1.0
 */
public class CaptureException {

    /**
     * Grava o texto da exceção em um arquivo de texto
     *
     * @param ex {@code Exception} Exceção à ser gravada no arquivo
     * @throws java.io.IOException Exceção de I/O
     */
    public static void saveLog(Exception ex) throws IOException {
        saveLog(getRoot(), ex);
    }

    /**
     * Grava o texto da exceção em um arquivo de texto
     *
     * @param root {@code String} Raiz dos logs
     * @param ex {@code Exception} Exceção à ser gravada no arquivo
     * @throws java.io.IOException Exceção de I/O
     */
    public static void saveLog(String root, Exception ex) throws IOException {
        File file = new File(
                new DateUtil().getFormattedDate(new Date(), DateUtil.TXTDATE)
                + ".txt");
        try (FileWriter fWriter = new FileWriter(file)) {
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.printf(ex.getMessage());
        }
    }

    /**
     * Retorna o caminho raiz dos logs (padrão)
     *
     * @return {@code String} Raiz dos logs
     */
    public static String getRoot() {
        String root = SystemProperties.USER_HOME + "/log";
        File dir = new File(root);
        if (!dir.exists()) {
            dir.mkdir();
        }
        return root + "/";
    }

}
