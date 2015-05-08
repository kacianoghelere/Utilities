package br.com.gmp.utils.export;

import br.com.gmp.utils.date.DateUtil;
import br.com.gmp.utils.system.SystemProperties;
import br.com.gmp.utils.test.Test;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.draw.LineSeparator;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Objeto de exportação de lista para o formato PDF
 *
 * @author kaciano
 * @version 1.0
 */
public class PDFExporter {

    private Font font = new Font(Font.HELVETICA, 8, Font.NORMAL);

    /**
     * Exporta os dados da lista para o formato PDF
     *
     * @param list {@code List(?)} Lista contendo os dados
     * @param filename {@code String} Nome do arquivo exportado
     * @throws FileNotFoundException Arquivo não encontrado
     * @throws DocumentException Exceção de documento
     * @throws IOException Exceção de I/O
     * @throws IllegalArgumentException Argumento ilegal
     * @throws IllegalAccessException Acesso restrito
     */
    public void export(final List<?> list, final String filename) throws FileNotFoundException, DocumentException, IOException, IllegalArgumentException, IllegalAccessException {
        export(list, list.get(0).getClass(), filename);
    }

    /**
     * Exporta os dados da lista para o formato PDF
     *
     * @param list {@code List(?)} Lista contendo os dados
     * @param objClass {@code Class(?)} Classe dos objetos exportados
     * @param filename {@code String} Nome do arquivo exportado
     * @throws FileNotFoundException Arquivo não encontrado
     * @throws DocumentException Exceção de documento
     * @throws IOException Exceção de I/O
     * @throws IllegalArgumentException Argumento ilegal
     * @throws IllegalAccessException Acesso restrito
     */
    public void export(List<?> list, Class<?> objClass, String filename) throws FileNotFoundException, DocumentException, IOException, IllegalArgumentException, IllegalAccessException {
        try (OutputStream os = new FileOutputStream(filename + ".pdf")) {
            Document doc = new Document(PageSize.A4, 36, 36, 36, 36);
            PdfWriter.getInstance(doc, os);
            doc.open();

            doc.addAuthor(SystemProperties.USER_NAME);
            doc.add(new Paragraph(new DateUtil().getCompleteDate(new Date())));
            doc.add(new Paragraph(" "));
            doc.add(new LineSeparator());
            doc.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(objClass.getDeclaredFields().length);
            //------------------------------------------------------------------
            // Preenche o cabeçalho
            for (String name : getFieldNames(objClass)) {
                PdfPCell header = new PdfPCell(new Paragraph(name.toUpperCase(), font));
                header.setBackgroundColor(Color.lightGray);
                header.setBorderWidth(1f);
                table.addCell(header);
            }
            //------------------------------------------------------------------
            // Preenche os dados
            for (Object obj : list) {
                for (Field field : obj.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    table.addCell(new Paragraph(String.valueOf(field.get(obj)), font));
                }
            }
            doc.add(table);
            doc.close();
            //------------------------------------------------------------------
            // Abre o documento
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File(filename + ".pdf"));
            }
        }
    }

    /**
     * Retorna os nomes das propriedades da classe indicada
     *
     * @param cl {@code Class(?)} Classe dos objetos exportados
     * @return {@code String} Nomes das propriedades
     */
    private String[] getFieldNames(Class<?> cl) {
        List<String> list = new ArrayList<>();
        for (Field field : cl.getDeclaredFields()) {
            field.setAccessible(true);
            list.add(field.getName());
        }
        return list.toArray(new String[]{});
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna a fonte do exportador
     *
     * @return {@code com.lowagie.text.Font} Fonte
     */
    public Font getFont() {
        return font;
    }

    /**
     * Modifica a fonte do exportador
     *
     * @param font {@code com.lowagie.text.Font} Fonte
     */
    public void setFont(Font font) {
        this.font = font;
    }

    //</editor-fold>
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Test("Name" + i, i, (i % 2 == 0)));
        }
        try {
            new PDFExporter().export(list, "exportt");
        } catch (DocumentException | IOException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(PDFExporter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
