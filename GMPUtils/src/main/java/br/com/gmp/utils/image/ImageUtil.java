package br.com.gmp.utils.image;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 * Coleção de métodos utilitários para trabalhar com imagens
 *
 * @author kaciano
 * @version 1.0
 * @author kaciano
 * @version 1.1
 */
public class ImageUtil {

    /**
     * Retorna a imagem com redimensionamento
     *
     * @param image {@code Image} Imagem fonte
     * @param width {@code int} Largura
     * @param height {@code int} Altura
     * @return {@code Image} Imagem redimensionada
     * @since 1.0
     */
    public Image getScaledImage(Image image, int width, int height) {
        BufferedImage resizedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(image, 0, 0, width, height, null);
        g2.dispose();
        return resizedImg;
    }

    /**
     * Retorna o ImageIcon carregado
     *
     * @param path {@code String} Caminho do icone
     * @return {@code ImageIcon} Icone recuperado
     * @since 1.1
     */
    public ImageIcon getResource(String path) {
        return new ImageIcon(getClass().getResource(path));
    }

}
