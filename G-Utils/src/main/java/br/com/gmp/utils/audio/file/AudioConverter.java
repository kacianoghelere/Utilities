package br.com.gmp.utils.audio.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.AudioFileFilter;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.ID3v1Tag;

/**
 * Conversor de conteudo de diretorios para arquivos de audio
 *
 * @author kaciano
 * @version 1.0
 */
public class AudioConverter {

    /**
     * Converte os arquivos do diretório indicado em uma lista de AudioFiles
     *
     * @param path {@code File} Arquivo do diretório
     * @return {@code List(AudioFile)} Lista de arquivos de audio
     * @throws java.lang.Exception Exceção de conversão
     * @throws java.io.IOException Exceção de I/O
     * @throws org.jaudiotagger.tag.TagException Exceção de leitura de Tag
     * @throws org.jaudiotagger.audio.exceptions.ReadOnlyFileException Exceção
     * leitura de Tag
     * @throws org.jaudiotagger.audio.exceptions.InvalidAudioFrameException
     * Exceção de frame de audio invalido
     */
    public static List<AudioFile> convert(File path) throws Exception, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
        return convert(path.getPath());
    }

    /**
     * Converte os arquivos do diretório indicado em uma lista de AudioFiles
     *
     * @param path {@code String} Caminho do diretório
     * @return {@code List(AudioFile)} Lista de arquivos de audio
     * @throws java.lang.Exception Exceção de conversão
     * @throws java.io.IOException Exceção de I/O
     * @throws org.jaudiotagger.tag.TagException Exceção de leitura de Tag
     * @throws org.jaudiotagger.audio.exceptions.ReadOnlyFileException Exceção
     * leitura de Tag
     * @throws org.jaudiotagger.audio.exceptions.InvalidAudioFrameException
     * Exceção de frame de audio invalido
     */
    public static List<AudioFile> convert(String path) throws Exception, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
        List<AudioFile> tracks = new ArrayList<>();
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new Exception("O caminho indicado não é um diretório");
        }
        for (File file : dir.listFiles(new AudioFileFilter(false))) {
            AudioFile audioFile = new AudioFile(file);
            tracks.add(audioFile);
        }
        return tracks;
    }
}
