package br.com.gmp.comps.panel.gradient;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * Painel de coloração gradiente
 *
 * @author kaciano
 * @version 1.0
 */
public class GGradientPanel extends JPanel {

    private Color startColor;
    private Color endColor;

    /**
     * Cria nova instancia de GGradientPanel
     */
    public GGradientPanel() {
        this.startColor = new JPanel().getBackground();
        this.endColor = new JPanel().getBackground();
        initialize();
    }

    /**
     * Cria nova instancia de GGradientPanel
     *
     * @param startColor {@code Color} Cor inicial do gradiente
     * @param endColor {@code Color} Cor final do gradiente
     */
    public GGradientPanel(Color startColor, Color endColor) {
        this.startColor = startColor;
        this.endColor = endColor;
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, startColor, 0, h, endColor);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

    /**
     * Retorna a cor inicial do gradiente
     *
     * @return {@code Color} Cor inicial do gradiente
     */
    public Color getStartColor() {
        return startColor;
    }

    /**
     * Modifica a cor inicial do gradiente
     *
     * @param startColor {@code Color} Cor inicial do gradiente
     */
    public void setStartColor(Color startColor) {
        this.startColor = startColor;
    }

    /**
     * Retorna a cor final do gradiente
     *
     * @return {@code Color} Cor final do gradiente
     */
    public Color getEndColor() {
        return endColor;
    }

    /**
     * Modifica a cor final do gradiente
     *
     * @param endColor {@code Color} Cor final do gradiente
     */
    public void setEndColor(Color endColor) {
        this.endColor = endColor;
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
