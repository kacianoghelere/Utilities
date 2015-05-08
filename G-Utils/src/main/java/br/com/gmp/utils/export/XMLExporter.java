package br.com.gmp.utils.export;

import br.com.gmp.utils.test.Test;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de exportação de dados para arquivos XML
 *
 * @author kaciano
 * @version 1.0
 */
public class XMLExporter {

    /**
     * Escreve novo arquivo XML
     *
     * @param name {@code Nome do arquivo}
     * @param value {@code Object} Valor à ser gravado no arquivo
     * @throws java.lang.Exception Exceção lançada
     */
    public void write(Object value, String name) throws Exception {
        XMLEncoder e;
        try {
            String n = name + (name.endsWith(".xml") ? "" : ".xml");
            e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(n)));
            e.writeObject(value);
            e.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLExporter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Lê o arquivo XML
     *
     * @param name {@code String} Nome do arquivo
     * @return {@code Object} Retorno do arquivo
     * @throws java.lang.Exception Exceção lançada
     */
    public Object read(String name) throws Exception {
        XMLDecoder d;
        try {
            String n = name + (name.endsWith(".xml") ? "" : ".xml");
            d = new XMLDecoder(new BufferedInputStream(new FileInputStream(n)));
            Object result = d.readObject();
            d.close();
            return result;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XMLExporter.class.getName()).log(Level.SEVERE, null, ex);
            return new Object();
        }
    }

    public static void main(String[] args) {
        try {
            XMLExporter xml = new XMLExporter();
            xml.write(new Test("kaciano", 22, true), "/home/kaciano/teste.xml");
            Test read = (Test) xml.read("/home/kaciano/teste");
            System.out.println(read.getName());
        } catch (Exception ex) {
            Logger.getLogger(XMLExporter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
