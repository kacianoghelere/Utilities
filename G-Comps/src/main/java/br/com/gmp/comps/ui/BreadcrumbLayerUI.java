package br.com.gmp.comps.ui;

import br.com.gmp.comps.breadcumb.ToggleButtonBarCellIcon;
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.plaf.LayerUI;

/**
 *
 * @author kaciano
 */
public class BreadcrumbLayerUI extends LayerUI<JPanel> {

    private Shape shape;

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        if (shape != null) {
            Graphics2D g2 = (Graphics2D) g.create();
            //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setPaint(Color.GRAY);
            g2.draw(shape);
            g2.dispose();
        }
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        ((JLayer) c).setLayerEventMask(AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK);
    }

    @Override
    public void uninstallUI(JComponent c) {
        ((JLayer) c).setLayerEventMask(0);
        super.uninstallUI(c);
    }

    private void update(MouseEvent e, JLayer<? extends JPanel> l) {
        int id = e.getID();
        Shape s = null;
        if (id == MouseEvent.MOUSE_ENTERED || id == MouseEvent.MOUSE_MOVED) {
            Component c = e.getComponent();
            if (c instanceof AbstractButton) {
                AbstractButton b = (AbstractButton) c;
                if (b.getIcon() instanceof ToggleButtonBarCellIcon) {
                    ToggleButtonBarCellIcon icon = (ToggleButtonBarCellIcon) b.getIcon();
                    Rectangle r = c.getBounds();
                    AffineTransform at = AffineTransform.getTranslateInstance(r.x, r.y);
                    s = at.createTransformedShape(icon.area);
                }
            }
        }
        if (s != shape) {
            shape = s;
            l.getView().repaint();
        }
    }

    @Override
    protected void processMouseEvent(MouseEvent e, JLayer<? extends JPanel> l) {
        update(e, l);
    }

    @Override
    protected void processMouseMotionEvent(MouseEvent e, JLayer<? extends JPanel> l) {
        update(e, l);
    }
}
