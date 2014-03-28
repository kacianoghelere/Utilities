package br.com.gmp.comps.ui;

import br.com.gmp.comps.BaseColors;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.metal.MetalScrollBarUI;

/**
 *
 * @author kaciano
 */
public class GMPScrollbarUI extends MetalScrollBarUI {
    private Color thumb = BaseColors.darkColor;
    private Color track = BaseColors.lightColor.brighter();

    public GMPScrollbarUI() {
    }
    
    public GMPScrollbarUI(Color thumb, Color track) {
        this.thumb = thumb;
        this.track = track;        
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        g.translate(thumbBounds.x, thumbBounds.y);
        g.setColor(thumb);
        g.fillRect(0, 0, thumbBounds.width - 2, thumbBounds.height - 1);
        g.drawRect(0, 0, thumbBounds.width - 2, thumbBounds.height - 1);
        //g.drawRoundRect(0, 0, thumbBounds.width - 2, thumbBounds.height - 1,2,1);
        g.translate(-thumbBounds.x, -thumbBounds.y);
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        g.translate(trackBounds.x, trackBounds.y);      
        g.setColor(track);
        g.translate(-trackBounds.x, -trackBounds.y);
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        JButton button = new BasicArrowButton(orientation,
                Color.gray, Color.gray, Color.gray.brighter(), Color.gray);
        return button;
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        JButton button = new BasicArrowButton(orientation,
                Color.gray, Color.gray, Color.gray.brighter(), Color.gray);
        return button;
    }
}
