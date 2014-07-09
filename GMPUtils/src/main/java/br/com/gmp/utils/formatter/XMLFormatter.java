package br.com.gmp.utils.formatter;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Classe utulitária para formatação de arquivos xml
 *
 * @author kaciano
 * @version 1.0
 */
public class XMLFormatter {

    /**
     * Organiza o texto do XML, posicionando e identando as tags corretamente
     *
     * @param input {@code String} Texto do arquivo
     * @return {@code String} Texto do arquivo organizado
     */
    public static String organize(String input) {
        return organize(input, 4, "ISO-8859-1");
    }

    /**
     * Organiza o texto do XML, posicionando e identando as tags corretamente
     *
     * @param input {@code String} Texto do arquivo
     * @param indent {@code int} Identação desejada
     * @return {@code String} Texto do arquivo organizado
     */
    public static String organize(String input, int indent) {
        return organize(input, indent, "ISO-8859-1");
    }

    /**
     * Organiza o texto do XML, posicionando e identando as tags corretamente
     *
     * @param input {@code String} Texto do arquivo
     * @param indent {@code int} Identação desejada
     * @param encoding {@code String} Codificação aplicada
     * @return {@code String} Texto do arquivo organizado
     */
    public static String organize(String input, int indent, String encoding) {
        try {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory tFactory = TransformerFactory.newInstance();
            tFactory.setAttribute("indent-number", indent);
            Transformer tr = tFactory.newTransformer();
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty(OutputKeys.ENCODING, encoding);
            tr.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (TransformerFactoryConfigurationError | IllegalArgumentException | TransformerException e) {
            try {
                Source xmlInput = new StreamSource(new StringReader(input));
                StringWriter stringWriter = new StringWriter();
                StreamResult xmlOutput = new StreamResult(stringWriter);
                TransformerFactory tFactory = TransformerFactory.newInstance();
                Transformer tr = tFactory.newTransformer();
                tr.setOutputProperty(OutputKeys.INDENT, "yes");
                tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount",
                        String.valueOf(indent));
                tr.setOutputProperty(OutputKeys.ENCODING, encoding);
                tr.transform(xmlInput, xmlOutput);
                return xmlOutput.getWriter().toString();
            } catch (TransformerFactoryConfigurationError | IllegalArgumentException | TransformerException t) {
                return input;
            }
        }
    }

    public static void main(String[] args) {
        String texto = "\n<bosta><cabeca>Head</cabeca><corpo>Corpo</corpo></bosta>";
        System.out.println(XMLFormatter.organize(texto, 4));
    }
}
