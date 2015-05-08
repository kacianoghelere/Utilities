package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;

import org.jdesktop.swingx.JXTaskPane;
import org.jdesktop.swingx.plaf.basic.BasicTaskPaneUI;

/**
 * UI customizada para GMPTaskPane
 *
 * @author Kaciano
 */
public class GMPTaskPaneUI extends BasicTaskPaneUI {

    private Color initialColor;
    private Color finalColor;
    private Color textColor;
    private Color highlight;

    /**
     * Cria nova instancia de GMPTaskPaneUI
     */
    public GMPTaskPaneUI() {
    }

    /**
     * Cria nova instancia de GMPTaskPaneUI
     *
     * @param initialColor Color Cor inicial do gradiente
     * @param finalColor Color Cor final do gradiente
     * @param textColor Color Cor do texto
     * @param highlight Color Cor do realce
     */
    public GMPTaskPaneUI(Color initialColor, Color finalColor, Color textColor, Color highlight) {
        this.initialColor = initialColor;
        this.finalColor = finalColor;
        this.textColor = textColor;
        this.highlight = highlight;
    }

    /**
     *
     * @param c
     * @return
     */
    public static ComponentUI createUI(JComponent c) {
        return new GMPTaskPaneUI();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        //group.setOpaque(false);
    }

    @Override
    protected Border createPaneBorder() {
        return new CustomPaneBorder(initialColor, finalColor, textColor, highlight);
    }

    /**
     * Borda de painel customizada
     */
    class CustomPaneBorder extends PaneBorder {

        public CustomPaneBorder(Color start, Color end, Color foreground, Color highlight) {
            titleBackgroundGradientStart = start;
            titleBackgroundGradientEnd = end;
            titleForeground = foreground;
            titleOver = highlight;
            specialTitleBackground = end;
            specialTitleForeground = foreground;
            specialTitleOver = highlight;
        }

        @Override
        protected void paintExpandedControls(JXTaskPane group, Graphics g, int x,
                int y, int width, int height) {
//            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//                    RenderingHints.VALUE_ANTIALIAS_ON);
//            g.setColor(getPaintColor(group));
//            paintRectAroundControls(group, g, x, y, width, height, g.getColor(),
//                    g.getColor());
//            paintChevronControls(group, g, x, y, width, height);
//            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//                    RenderingHints.VALUE_ANTIALIAS_ON);
            if (group.isCollapsed()) {
                group.setIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/IKONS/16/invert/arrow_right.png")));
            } else {
                group.setIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/IKONS/16/invert/arrow_up.png")));
            }
            super.paintExpandedControls(group, g, x, y, width, height);
        }

        @Override
        protected boolean isMouseOverBorder() {
            return true;
        }

        public Color getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(Color borderColor) {
            this.borderColor = borderColor;
        }

        public Color getTitleForeground() {
            return titleForeground;
        }

        public void setTitleForeground(Color titleForeground) {
            this.titleForeground = titleForeground;
        }

        public Color getSpecialTitleBackground() {
            return specialTitleBackground;
        }

        public void setSpecialTitleBackground(Color specialTitleBackground) {
            this.specialTitleBackground = specialTitleBackground;
        }

        public Color getSpecialTitleForeground() {
            return specialTitleForeground;
        }

        public void setSpecialTitleForeground(Color specialTitleForeground) {
            this.specialTitleForeground = specialTitleForeground;
        }

        public Color getTitleBackgroundGradientStart() {
            return titleBackgroundGradientStart;
        }

        public void setTitleBackgroundGradientStart(Color titleBackgroundGradientStart) {
            this.titleBackgroundGradientStart = titleBackgroundGradientStart;
        }

        public Color getTitleBackgroundGradientEnd() {
            return titleBackgroundGradientEnd;
        }

        public void setTitleBackgroundGradientEnd(Color titleBackgroundGradientEnd) {
            this.titleBackgroundGradientEnd = titleBackgroundGradientEnd;
        }

        public Color getTitleOver() {
            return titleOver;
        }

        public void setTitleOver(Color titleOver) {
            this.titleOver = titleOver;
        }

        public Color getSpecialTitleOver() {
            return specialTitleOver;
        }

        public void setSpecialTitleOver(Color specialTitleOver) {
            this.specialTitleOver = specialTitleOver;
        }

        public JLabel getLabel() {
            return label;
        }

        public void setLabel(JLabel label) {
            this.label = label;
        }
    }

    /**
     *
     * @return
     */
    public Color getInitialColor() {
        return initialColor;
    }

    /**
     *
     * @param initialColor
     */
    public void setInitialColor(Color initialColor) {
        this.initialColor = initialColor;
    }

    /**
     *
     * @return
     */
    public Color getFinalColor() {
        return finalColor;
    }

    /**
     *
     * @param finalColor
     */
    public void setFinalColor(Color finalColor) {
        this.finalColor = finalColor;
    }

    /**
     *
     * @return
     */
    public Color getTextColor() {
        return textColor;
    }

    /**
     *
     * @param textColor
     */
    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    /**
     *
     * @return
     */
    public Color getHighlight() {
        return highlight;
    }

    /**
     *
     * @param highlight
     */
    public void setHighlight(Color highlight) {
        this.highlight = highlight;
    }

}
