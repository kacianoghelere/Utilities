package br.com.gmp.utils.image;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * Coleção de métodos utilitários para trabalhar com imagens
 *
 * @author kaciano
 */
public class ImageUtil {

    /**
     * Retorna a imagem com redimensionamento
     *
     * @param srcImg {@code Image} Imagem fonte
     * @param w {@code int} Largura
     * @param h {@code int} Altura
     * @return {@code Image} Imagem redimensionada
     */
    public Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
}
