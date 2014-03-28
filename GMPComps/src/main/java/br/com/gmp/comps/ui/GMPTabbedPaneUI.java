package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author kaciano
 */
public class GMPTabbedPaneUI extends BasicTabbedPaneUI {

    private Color selectColor;
    private Color deSelectColor;
    private int i1;
    private int i2;
    private int i3;
    private int i4;

    /**
     * Cria nova instancia de GMPTabbedPaneUI
     */
    public GMPTabbedPaneUI() {
        this.i1 = 1;
        this.i2 = 1;
        this.i3 = 1;
        this.i4 = 1;
        selectColor = new Color(1, 113, 215);
        deSelectColor = new Color(51, 153, 255);
    }

    /**
     * Cria nova instancia de GMPTabbedPaneUI
     *
     * @param i1 Espessura da borda no topo
     * @param i2 Espessura da borda na esquerda
     * @param i3 Espessura da borda na base
     * @param i4 Espessura da borda na direita
     */
    public GMPTabbedPaneUI(int i1, int i2, int i3, int i4) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
        selectColor = new Color(1, 113, 215);
        deSelectColor = new Color(51, 153, 255);
    }

    /**
     * Cria nova instancia de GMPTabbedPaneUI
     *
     * @param selectColor Cor quando selecionado
     * @param deSelectColor Cor quando não selecionado
     * @param i1 Espessura da borda no topo
     * @param i2 Espessura da borda na esquerda
     * @param i3 Espessura da borda na base
     * @param i4 Espessura da borda na direita
     */
    public GMPTabbedPaneUI(Color selectColor, Color deSelectColor, int i1, int i2, int i3, int i4) {
        this.selectColor = selectColor;
        this.deSelectColor = deSelectColor;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        contentBorderInsets = new InsetsUIResource(i1, i2, i3, i4);
        tabInsets = new InsetsUIResource(1, 2, 1, 2);

    }

    @Override
    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        return super.calculateTabHeight(tabPlacement, tabIndex, fontHeight) + 5;
    }

    @Override
    protected void paintText(Graphics g, int tabPlacement, Font font,
            FontMetrics metrics, int tabIndex, String title,
            Rectangle textRect, boolean isSelected) {
        font = new Font("Verdana", Font.BOLD, 14);

        super.paintText(g, tabPlacement, font, metrics, tabIndex, title, textRect, isSelected);
    }

    @Override
    protected void paintTab(Graphics g, int tabPlacement, Rectangle[] rects,
            int tabIndex, Rectangle iconRect, Rectangle textRect) {
        Graphics2D g2D = (Graphics2D) g;
        int x = rects[tabIndex].x;
        int y = rects[tabIndex].y;
        int w = rects[tabIndex].width;
        int h = rects[tabIndex].height;
        int selected = tabPane.getSelectedIndex();
        if (selected == tabIndex) {
            g2D.setColor(selectColor);
            g2D.fillRect(x, y, w, h);
        } else {
            g2D.setColor(deSelectColor);
            g2D.fillRect(x, y, w, h);
        }
        g2D.setPaint(new GradientPaint(x, y, selectColor, w, h, deSelectColor.darker(), false));
        g2D.drawRect(x, y, w, h);
        g2D.setPaint(new GradientPaint(x, y, deSelectColor, w, h, selectColor.darker(), false));
        g2D.drawRect(x + 1, y + 1, w - 1, h - 1);        
    }

    private class ScrollableTabButton extends BasicArrowButton {

        public ScrollableTabButton() {
            super(0);
        }

        @Override
        public void paint(Graphics g) {
            GradientPaint GP;
            JButton button = (JButton) this;
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
                    GP = new GradientPaint(0, 0, BaseColors.systemColor, 0, h, BaseColors.systemColor,
                            true);
                } else {
                    GP = new GradientPaint(0, 0, BaseColors.darkColor, 0, h, BaseColors.lightColor, true);
                }
            }
            g2d.setPaint(GP);
            GradientPaint p1;
            GradientPaint p2;
            if (otherModel.isPressed()) {
                GP = new GradientPaint(0, 0, BaseColors.alternativeColor, 0, h, BaseColors.alternativeColor, true);
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
                GP = new GradientPaint(0, 0, BaseColors.darkColor, 0, h, BaseColors.lightColor, true);
            }
            Rectangle2D.Float r2d = new Rectangle2D.Float(0, 0, w - 1, h - 1);
            Shape clip = g2d.getClip();
            g2d.clip(r2d);
            g2d.fillRect(0, 0, w, h);
            g2d.setClip(clip);
            g2d.setPaint(p1);
            g2d.setPaint(p2);
            g2d.dispose();
            button.paintComponents(g);
        }

    }

    public Color getSelectColor() {
        return selectColor;
    }

    public void setSelectColor(Color selectColor) {
        this.selectColor = selectColor;
    }

    public Color getDeSelectColor() {
        return deSelectColor;
    }

    public void setDeSelectColor(Color deSelectColor) {
        this.deSelectColor = deSelectColor;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public int getI3() {
        return i3;
    }

    public void setI3(int i3) {
        this.i3 = i3;
    }

    public int getI4() {
        return i4;
    }

    public void setI4(int i4) {
        this.i4 = i4;
    }

}

/**
 *
 * @author kaciano
 */
class TabbedColors {

    public static final Color deSelectColor = new Color(1, 113, 215);
    public static final Color selectColor = new Color(51, 153, 255);

}
