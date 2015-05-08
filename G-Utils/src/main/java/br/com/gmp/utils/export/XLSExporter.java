package br.com.gmp.utils.export;

import br.com.gmp.utils.test.Test;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 * Classe resposavel pela exportação de dados para .XLS
 *
 * @author kaciano
 * @since 1.0
 */
public class XLSExporter {

    /**
     * Exporta os dados com base nos dados parametrizados
     *
     * @param list Lista a ser exportada
     * @param title Titulo do arquivo
     * @param sheettitle Titulo da planilha
     * @throws IllegalAccessException Exceção de acesso ilegal
     * @throws WriteException Exceção de escrita
     * @throws IOException Exceção de I/O
     */
    public void exportData(List list, String title, String sheettitle) throws IllegalAccessException, WriteException, IOException {
        WritableWorkbook xls = getXLS(list, title, sheettitle);
        xls.write();
        xls.close();
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(new File(title + ".xls"));
        }
    }

    /**
     * Exporta os dados com base nos dados parametrizados
     *
     * @param list Lista a ser exportada
     * @param path Caminho do arquivo
     * @param title Titulo do arquivo
     * @param sheettitle Titulo da planilha
     * @throws IllegalAccessException Exceção de acesso ilegal
     * @throws WriteException Exceção de escrita
     * @throws IOException Exceção de I/O
     */
    public void exportData(List list, String path, String title, String sheettitle) throws IllegalAccessException, WriteException, IOException {
        WritableWorkbook xls = getXLS(list, path + "/" + title, sheettitle);
        xls.write();
        xls.close();
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(new File(path + "/" + title + ".xls"));
        }
    }

    /**
     * Gera o WorkBook à ser exportado
     *
     * @param list Lista a ser exportada
     * @param title Titulo do arquivo
     * @param sheettitle Titulo da planilha
     * @return XLS
     * @throws IllegalAccessException Exceção de acesso ilegal
     * @throws WriteException Exceção de escrita
     */
    private WritableWorkbook getXLS(List list, String title, String sheettitle) throws IllegalAccessException, WriteException {
        WritableWorkbook workBook = null;
        try {
            workBook = Workbook.createWorkbook(new File(title + ".xls"));
            Class<? extends Object> cl = list.get(0).getClass();
            WritableSheet sheet = writableSheet(sheettitle, cl, workBook);
            for (int i = 0; i < list.size(); i++) {
                Field[] fields = cl.getDeclaredFields();
                Object object = list.get(i);
                for (int j = 0; j < fields.length; j++) {
                    Field f = fields[j];
                    f.setAccessible(true);
                    sheet.addCell(new Label(j, i + 1, f.get(object).toString()));
                }
            }
        } catch (IOException e) {
            Logger.getLogger(XLSExporter.class.getName()).log(Level.SEVERE, null, e);
        }
        return workBook;
    }

    /**
     * Gera a planilha
     *
     * @param sheettitle Titulo da planilha
     * @param cl Classe do objeto a ser mapeado na planilha
     * @param workBook WorkBook da exportação
     * @return WritableSheet da planilha
     */
    private WritableSheet writableSheet(String sheettitle, Class<?> cl, WritableWorkbook workBook) {
        WritableSheet sheet = workBook.createSheet(sheettitle, 0);
        try {
            Field[] fields = cl.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                sheet.addCell(new Label(i, 0, fields[i].getName().toUpperCase()));
            }
        } catch (RowsExceededException e) {
            Logger.getLogger(XLSExporter.class.getName()).log(Level.SEVERE, null, e);
        } catch (WriteException e) {
            Logger.getLogger(XLSExporter.class.getName()).log(Level.SEVERE, null, e);
        }
        return sheet;
    }

    /**
     *
     * @param args Argumentos
     */
    public static void main(String[] args) {
        List<Test> list = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            list.add(new Test(String.valueOf(i), i, true));
        }
        try {
            new XLSExporter().exportData(list, "teste", "teste");
        } catch (IllegalAccessException | WriteException | IOException ex) {
            Logger.getLogger(XLSExporter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
