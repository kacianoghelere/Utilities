/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author kaciano
 */
public class GMPButtonUI extends BasicButtonUI {

    private Color startColor = BaseColors.darkColor;
    private Color endColor = BaseColors.lightColor;
    private Color rollOverColor = BaseColors.systemColor;
    private Color pressedColor = BaseColors.alternativeColor;
    private GradientPaint GP;

    @Override
    public void paint(Graphics g, JComponent c) {
        JButton button = (JButton) c;
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int h = button.getHeight();
        int w = button.getWidth();

        ButtonModel otherModel = button.getModel();
        if (!otherModel.isEnabled()) {
            button.setForeground(BaseColors.darkColor.brighter());
            GP = new GradientPaint(0, 0, BaseColors.darkColor, 0, h, BaseColors.darkColor,
                    true);
        } else {
            button.setForeground(Color.WHITE);
            if (otherModel.isRollover()) {
                GP = new GradientPaint(0, 0, rollOverColor, 0, h, rollOverColor,
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
            p1 = new GradientPaint(0, 0, new Color(0, 0, 0), 0, h - 1,
                    new Color(100, 100, 100));
            p2 = new GradientPaint(0, 1, new Color(0, 0, 0, 50), 0, h - 3,
                    new Color(255, 255, 255, 100));
        } else {
            p1 = new GradientPaint(0, 0, new Color(100, 100, 100), 0, h - 1,
                    new Color(0, 0, 0));
            p2 = new GradientPaint(0, 1, new Color(255, 255, 255, 100), 0,
                    h - 3, new Color(0, 0, 0, 50));
            GP = new GradientPaint(0, 0, startColor, 0, h, endColor, true);
        }
        Rectangle2D.Float r2d = new Rectangle2D.Float(0, 0, w - 1, h - 1);
        Shape clip = g2d.getClip();
        g2d.clip(r2d);
        g2d.fillRect(0, 0, w, h);
        g2d.setClip(clip);
        g2d.setPaint(p1);
        g2d.setPaint(p2);
        Color color = new Color(255, 255, 255, 100);
        g2d.setColor(color);
        g2d.drawRect(0, 0, w - 2, (h / 2));
        g2d.dispose();
        button.paintComponents(g);
    }

    public GradientPaint getGP() {
        return GP;
    }

    public void setGP(GradientPaint GP) {
        this.GP = GP;
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

}
