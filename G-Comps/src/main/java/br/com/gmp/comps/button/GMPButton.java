package br.com.gmp.comps.button;

import br.com.gmp.comps.BaseColors;
import br.com.gmp.comps.ui.GMPButtonUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.ButtonModel;

/**
 *
 * @author kaciano
 */
public class GMPButton extends javax.swing.JButton {

    private Color startColor = BaseColors.darkColor;
    private Color endColor = BaseColors.lightColor;
    private Color rollOverColor = BaseColors.darkColor.brighter();
    private Color pressedColor = BaseColors.systemColor.brighter();
    private GradientPaint GP;

    public GMPButton() {
        super();
        initialize();
    }

    /**
     *
     * @param text
     */
    public GMPButton(String text) {
        super(text);
        initialize();
        setText(text);
    }

    /**
     *
     * @param startColor
     * @param endColor
     * @param rollOverColor
     * @param pressedColor
     */
    public GMPButton(Color startColor, Color endColor, Color rollOverColor, Color pressedColor) {
        this.startColor = startColor;
        this.endColor = endColor;
        this.rollOverColor = rollOverColor;
        this.pressedColor = pressedColor;
        initialize();
    }

    private void initialize() {
        initComponents();
        setForeground(Color.WHITE);
        setFocusable(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFont(new Font("Tahoma", Font.BOLD, 12));
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int h = getHeight();
        int w = getWidth();
        ButtonModel otherModel = getModel();
        if (!otherModel.isEnabled()) {
            setForeground(Color.GRAY);
            GP = new GradientPaint(0, 0, new Color(192, 192, 192), 0, h, new Color(152, 152, 152),
                    true);
        } else {
            setForeground(Color.WHITE);
            if (otherModel.isRollover()) {
                GP = new GradientPaint(0, 0, rollOverColor, 0, h, rollOverColor.darker(),
                        true);
            } else {
                GP = new GradientPaint(0, 0, startColor, 0, h, endColor, true);
            }
        }
        g2d.setPaint(GP);
        GradientPaint p1;
        GradientPaint p2;
        if (otherModel.isPressed()) {
            GP = new GradientPaint(0, 0, pressedColor, 0, h, pressedColor, true);
            g2d.setPaint(GP);
            p1 = new GradientPaint(0, 0, pressedColor, 0, h - 1,
                    pressedColor.darker());
            p2 = new GradientPaint(0, 1, pressedColor.darker(), 0, h - 3,
                    pressedColor);
        } else {
            p1 = new GradientPaint(0, 0, startColor, 0, h - 1,
                    endColor);
            p2 = new GradientPaint(0, 1, endColor, 0,
                    h - 3, startColor);
            GP = new GradientPaint(0, 0, startColor, 0, h, endColor, true);
        }
        Rectangle2D.Float r2d = new Rectangle2D.Float(0, 0, w - 1, h - 1);
        Shape clip = g2d.getClip();
        g2d.clip(r2d);
        g2d.fillRect(0, 0, w, h);
        g2d.setClip(clip);
        g2d.setPaint(p1);
        g2d.drawRect(0, 0, w - 1, h - 1);
        g2d.setPaint(p2);
        g2d.drawRect(1, 1, w - 3, h - 3);
        Color color = new Color(255, 255, 255, 75);
        g2d.setColor(color);
        g2d.fillRect(1, 1, w - 2, (h / 2));
        g2d.dispose();

        super.paintComponent(g);
    }

    /**
     * This method sets the Actual Background Color of the Button
     *
     * @param color
     */
    public void setStartColor(Color color) {
        startColor = color;
    }

    /**
     * This method sets the Pressed Color of the Button
     *
     * @param pressedColor
     */
    public void setEndColor(Color pressedColor) {
        endColor = pressedColor;
    }

    /**
     * @return Starting Color of the Button
     */
    public Color getStartColor() {
        return startColor;
    }

    /**
     * @return Ending Color of the Button
     */
    public Color getEndColor() {
        return endColor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public Color getRollOverColor() {
        return rollOverColor;
    }

    public void setRollOverColor(Color rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    public Color getPressedColor() {
        return pressedColor;
    }

    public void setPressedColor(Color pressedColor) {
        this.pressedColor = pressedColor;
    }

    public GradientPaint getGP() {
        return GP;
    }

    public void setGP(GradientPaint GP) {
        this.GP = GP;
    }
}
