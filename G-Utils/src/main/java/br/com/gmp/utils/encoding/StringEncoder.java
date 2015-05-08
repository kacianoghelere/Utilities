package br.com.gmp.utils.encoding;

import javax.xml.bind.DatatypeConverter;

/**
 * Classe para encriptação de String's
 *
 * @author kaciano
 * @since 1.0
 */
public class StringEncoder {

    /**
     * Encripta a String referenciada e retorna a array de bytes
     *
     * @param string String referenciada
     * @return Array de bytes
     */
    public byte[] encodeBase64(String string) {
        return DatatypeConverter.parseBase64Binary(string);
    }

    /**
     * Decripta a String a partir da array de bytes referenciada
     *
     * @param bytes Array de bytes referenciada
     * @return String decriptada
     */
    public String decodeBase64(byte[] bytes) {
        return DatatypeConverter.printBase64Binary(bytes);
    }

}
