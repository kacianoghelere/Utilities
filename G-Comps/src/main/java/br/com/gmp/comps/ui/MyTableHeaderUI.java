package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTableHeaderUI;

/**
 *
 * @author kaciano
 */
public class MyTableHeaderUI extends BasicTableHeaderUI {

    private Color startColor;
    private Color endColor;
    private Color disabledColor;
    private Color normalColor;
    private Color highlightColor;
    private GradientPaint GP;

    public MyTableHeaderUI() {
        startColor = BaseColors.darkColor;
        endColor = BaseColors.darkColor;
        disabledColor = new Color(192, 192, 192);
        normalColor = Color.white;
        highlightColor = BaseColors.systemColor;
    }

    public MyTableHeaderUI(Color startColor, Color endColor) {
        this.startColor = startColor;
        this.endColor = endColor;
        disabledColor = new Color(192, 192, 192);
        normalColor = Color.white;
        highlightColor = BaseColors.systemColor;
    }

    public MyTableHeaderUI(Color startColor, Color endColor, Color disabledColor, Color normalColor, Color highlightColor) {
        this.startColor = startColor;
        this.endColor = endColor;
        this.disabledColor = disabledColor;
        this.normalColor = normalColor;
        this.highlightColor = highlightColor;
    }

    @Override
    public void paint(Graphics g, final JComponent c) {
        c.setFont(new Font("Verdana", Font.BOLD, 14));
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int h = c.getHeight();
        int w = c.getWidth();
        if (!c.isEnabled()) {
            c.setForeground(Color.GRAY);
            GP = new GradientPaint(0, 0, disabledColor, 0, h, disabledColor, true);
        } else {
            c.setForeground(normalColor);
        }
        g2d.setPaint(GP);
        GradientPaint p1;
        GradientPaint p2;
        p1 = new GradientPaint(0, 0, new Color(100, 100, 100), 0, h - 1,
                new Color(0, 0, 0));
        p2 = new GradientPaint(0, 1, new Color(255, 255, 255, 100), 0,
                h - 3, new Color(0, 0, 0, 50));
        GP = new GradientPaint(0, 0, startColor, 0, h, endColor, true);
        Rectangle2D.Float r2d = new Rectangle2D.Float(0, 0, w - 1, h - 1);
        Shape clip = g2d.getClip();
        g2d.clip(r2d);
        g2d.fillRect(0, 0, w, h);
        g2d.setClip(clip);
        g2d.setPaint(p1);
        g2d.drawRect(0, 0, w - 1, h - 1);
        g2d.setPaint(p2);
        g2d.drawRect(0, 0, w - 3, h - 3);
        g2d.dispose();
        super.paint(g, c);
    }

    public Color getStartColor() {
        return startColor;
    }

    public void setStartColor(Color startColor) {
        this.startColor = startColor;
    }

    public Color getEndColor() {
        return endColor;
    }

    public void setEndColor(Color endColor) {
        this.endColor = endColor;
    }

    public Color getHighlightColor() {
        return highlightColor;
    }

    public void setHighlightColor(Color highlightColor) {
        this.highlightColor = highlightColor;
    }

    public GradientPaint getGP() {
        return GP;
    }

    public void setGP(GradientPaint GP) {
        this.GP = GP;
    }

    public Color getNormalColor() {
        return normalColor;
    }

    public void setNormalColor(Color normalColor) {
        this.normalColor = normalColor;
    }

    public Color getDisabled() {
        return disabledColor;
    }

    public void setDisabled(Color gray) {
        this.disabledColor = gray;
    }

}
