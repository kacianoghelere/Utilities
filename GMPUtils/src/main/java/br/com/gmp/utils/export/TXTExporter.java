package br.com.gmp.utils.export;

import br.com.gmp.utils.test.Test;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de exportação de dados para arquivos de texto
 *
 * @author kaciano
 * @version 1.0
 */
public class TXTExporter {

    /**
     * Exporta a lista parametro em formatado de texto
     *
     * @param list {@code List} Lista para exportação
     * @param filename {@code String} Nome do arquivo
     * @throws IllegalAccessException Acesso restrito
     * @throws FileNotFoundException Arquivo não encontrado
     * @throws IOException Exceção de I/O
     * @see java.io.FileWriter
     * @see java.io.PrintWriter
     */
    public void exportTableList(List list, String filename) throws IllegalAccessException, FileNotFoundException, IOException {
        exportTableList(list, list.get(0).getClass(), filename);
    }

    /**
     * Exporta a lista parametro em formatado de texto (Método privado)
     *
     * @param list {@code List} Lista para exportação
     * @param cl {@code Class<?>} Classe para a conversão
     * @param filename {@code String} Nome do arquivo
     * @throws IllegalAccessException Acesso restrito
     * @throws FileNotFoundException Arquivo não encontrado
     * @throws IOException Exceção de I/O
     * @see java.io.FileWriter
     * @see java.io.PrintWriter
     */
    private void exportTableList(List list, Class<?> cl, String filename) throws IllegalAccessException, FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();        
        StringBuilder header = new StringBuilder();
        for (Field field : cl.getDeclaredFields()) {
            field.setAccessible(true);
            header.append(field.getName()).append("\t");
        }
        sb.append(header.toString().trim());
        sb.append("\n");
        for (Object obj : list) {
            StringBuilder body = new StringBuilder();
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                body.append(field.get(obj)).append("\t");
            }
            sb.append(body.toString().trim());
            sb.append("\n");
        }
        String export = sb.toString();
        File file = new File(filename + ".txt");
        try (FileWriter fWriter = new FileWriter(file)) {
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.printf(export);
        }
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(file);
        }
    }

    /**
     *
     * @param args Argumentos
     */
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Test("Name" + i, i, (i % 2 == 0)));
        }
        try {
            new TXTExporter().exportTableList(list, "export");
        } catch (IllegalAccessException | IOException ex) {
            Logger.getLogger(TXTExporter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
