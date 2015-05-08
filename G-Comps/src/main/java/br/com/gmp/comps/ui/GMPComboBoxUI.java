package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author kaciano
 */
public class GMPComboBoxUI extends BasicComboBoxUI {

    private Color startColor = BaseColors.darkColor;
    private Color endColor = BaseColors.lightColor;
    private Color disabledColor = new Color(192, 192, 192);
    private Color normalColor = Color.white;
    private Color highlightColor = BaseColors.systemColor;
    private GradientPaint GP;

    public static ComponentUI createUI(JComponent c) {
        return new GMPComboBoxUI();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
    }

    @Override
    protected JButton createArrowButton() {
        JButton button = new BasicArrowButton(BasicArrowButton.SOUTH,
                startColor, startColor, endColor, startColor);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            }
        });
        return button;
    }
}
