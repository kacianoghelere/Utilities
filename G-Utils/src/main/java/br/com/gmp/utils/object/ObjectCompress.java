package br.com.gmp.utils.object;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Classe com metodos para compressão e descompressão de objetos java
 *
 * @author kaciano
 * @since 1.0
 */
public class ObjectCompress {

    /**
     * Comprime o objeto enviado e retorna o array de bytes
     *
     * @param object Objeto
     * @return Objeto comprimido
     * @throws java.io.IOException Exceção I/O
     */
    public byte[] compress(Object object) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        GZIPOutputStream gzipOut = new GZIPOutputStream(baos);
        try (ObjectOutputStream objectOut = new ObjectOutputStream(gzipOut)) {
            objectOut.writeObject(object);
        }
        return baos.toByteArray();
    }

    /**
     * Descomprime o objeto enviado com base no array de bytes
     *
     * @param bytes Objeto comprimido
     * @return Objeto descomprimido
     * @throws java.io.IOException Exceção I/O
     * @throws java.lang.ClassNotFoundException Exceção de classe não encontrada
     */
    public Object decompress(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        GZIPInputStream gzipIn = new GZIPInputStream(bais);
        Object object;
        try (ObjectInputStream objectIn = new ObjectInputStream(gzipIn)) {
            object = objectIn.readObject();
        }
        return object;
    }

}
