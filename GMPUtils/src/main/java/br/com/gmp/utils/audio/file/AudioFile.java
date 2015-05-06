package br.com.gmp.utils.audio.file;

import br.com.gmp.utils.annotations.ColumnName;
import br.com.gmp.utils.annotations.Ignore;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.ID3v1Tag;

/**
 * Objeto de construção para arquivos de audio
 *
 * @author kaciano
 * @version 1.0
 */
public class AudioFile implements Comparable<AudioFile> {

    @ColumnName(name = "Titulo")
    private String title;
    @Ignore
    @ColumnName(name = "Artista")
    private String artist;
    @ColumnName(name = "Album")
    private String album;
    @Ignore
    @ColumnName(name = "Faixa")
    private String track;
    @Ignore
    private String path;

    /**
     * Cria nova instancia de AudioFile
     */
    public AudioFile() {
    }

    /**
     * Cria nova instancia de AudioFile
     *
     * @param file {@code File} Arquivo de audio
     */
    public AudioFile(File file) {
        this.path = file.getAbsolutePath();
        readTag(file);
    }

    /**
     * Copia os atributos da ID3v1Tag
     *
     * @param file {@code File} Arquivo de audio
     */
    private void readTag(File file) {
        try {
            ID3v1Tag tag = new MP3File(file).getID3v1Tag();
            this.title = tag != null ? tag.getFirst(FieldKey.TITLE) + "" : "";
            this.artist = tag != null ? tag.getFirst(FieldKey.ARTIST) + "" : "";
            this.album = tag != null ? tag.getFirst(FieldKey.ALBUM) + "" : "";
            this.track = tag != null ? tag.getFirst(FieldKey.TRACK) + "" : "";
        } catch (IOException | TagException | ReadOnlyFileException | InvalidAudioFrameException ex) {
            Logger.getLogger(AudioFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cria nova instancia de AudioFile
     *
     * @param title {@code String} Titulo da faixa de audio
     * @param artist {@code String} Artista da faixa de audio
     * @param album {@code String} Album da faixa de audio
     * @param track {@code String} Numero da faixa de audio
     * @param file {@code File} Arquivo de audio
     */
    public AudioFile(String title, String artist, String album, String track, File file) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.track = track;
        this.path = file.getAbsolutePath();
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.title);
        hash = 23 * hash + Objects.hashCode(this.artist);
        hash = 23 * hash + Objects.hashCode(this.album);
        hash = 23 * hash + Objects.hashCode(this.track);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AudioFile other = (AudioFile) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.album, other.album)) {
            return false;
        }
        return Objects.equals(this.track, other.track);
    }

    /**
     * Retorna o titulo da faixa de audio
     *
     * @return {@code String} Titulo da faixa de audio
     */
    public String getTitle() {
        return title;
    }

    /**
     * Modifica o titulo da faixa de audio
     *
     * @param title {@code String} Titulo da faixa de audio
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retorna o artista da faixa de audio
     *
     * @return {@code String} Artista da faixa de audio
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Modifica o artista da faixa de audio
     *
     * @param artist {@code String} Artista da faixa de audio
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Retorna o album da faixa de audio
     *
     * @return {@code String} Album da faixa de audio
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Modifica o album da faixa de audio
     *
     * @param album {@code String} Album da faixa de audio
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * Retorna o numero da faixa de audio
     *
     * @return {@code String} Numero da faixa de audio
     */
    public String getTrack() {
        return track;
    }

    /**
     * Modifica o numero da faixa de audio
     *
     * @param track {@code String} Numero da faixa de audio
     */
    public void setTrack(String track) {
        this.track = track;
    }

    /**
     * Retorna o caminho do arquivo da faixa de audio
     *
     * @return {@code String} Caminho do arquivo da faixa de audio
     */
    public String getPath() {
        return path;
    }

    /**
     * Modifica o caminho do arquivo da faixa de audio
     *
     * @param path {@code String} Caminho do arquivo da faixa de audio
     */
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int compareTo(AudioFile o) {
        return this.getTitle().compareTo(o.getTitle());
    }

}
