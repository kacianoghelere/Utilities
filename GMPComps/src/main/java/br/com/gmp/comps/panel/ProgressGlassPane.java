package br.com.gmp.comps.panel;

/**
 *
 * @author Kaciano
 */
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JComponent;

public class ProgressGlassPane extends JComponent {

    private static final int BAR_WIDTH = 200;
    private static final int BAR_HEIGHT = 10;

    private static final Color TEXT_COLOR = new Color(0x333333);
    private static final Color BORDER_COLOR = new Color(0x333333);

    private static final float[] GRADIENT_FRACTIONS = new float[]{
        0.0f, 0.499f, 0.5f, 1.0f
    };
    private static final Color[] GRADIENT_COLORS = new Color[]{
        Color.GRAY, Color.DARK_GRAY, Color.BLACK, Color.GRAY
    };
    private static final Color GRADIENT_COLOR2 = Color.WHITE;
    private static final Color GRADIENT_COLOR1 = Color.GRAY;

    private String message = "Downloading file...";
    private int progress = 0;

    public ProgressGlassPane() {
        setBackground(Color.WHITE);
        setFont(new Font("Default", Font.BOLD, 16));
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        int oldProgress = this.progress;
        this.progress = progress;

        // computes the damaged area
        FontMetrics metrics = getGraphics().getFontMetrics(getFont());
        int w = (int) (BAR_WIDTH * ((float) oldProgress / 100.0f));
        int x = w + (getWidth() - BAR_WIDTH) / 2;
        int y = (getHeight() - BAR_HEIGHT) / 2;
        y += metrics.getDescent() / 2;

        w = (int) (BAR_WIDTH * ((float) progress / 100.0f)) - w;
        int h = BAR_HEIGHT;

        repaint(x, y, w, h);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // enables anti-aliasing
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // gets the current clipping area
        Rectangle clip = g.getClipBounds();

        // sets a 65% translucent composite
        AlphaComposite alpha = AlphaComposite.SrcOver.derive(0.65f);
        Composite composite = g2.getComposite();
        g2.setComposite(alpha);

        // fills the background
        g2.setColor(getBackground());
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);

        // centers the progress bar on screen
        FontMetrics metrics = g.getFontMetrics();
        int x = (getWidth() - BAR_WIDTH) / 2;
        int y = (getHeight() - BAR_HEIGHT - metrics.getDescent()) / 2;

        // draws the text
        g2.setColor(TEXT_COLOR);
        g2.drawString(message, x, y);

        // goes to the position of the progress bar
        y += metrics.getDescent();

        // computes the size of the progress indicator
        int w = (int) (BAR_WIDTH * ((float) progress / 100.0f));
        int h = BAR_HEIGHT;

        // draws the content of the progress bar
        Paint paint = g2.getPaint();

        // bar's background
        Paint gradient = new GradientPaint(x, y, GRADIENT_COLOR1,
                x, y + h, GRADIENT_COLOR2);
        g2.setPaint(gradient);
        g2.fillRect(x, y, BAR_WIDTH, BAR_HEIGHT);

        // actual progress
        gradient = new LinearGradientPaint(x, y, x, y + h,
                GRADIENT_FRACTIONS, GRADIENT_COLORS);
        g2.setPaint(gradient);
        g2.fillRect(x, y, w, h);

        g2.setPaint(paint);

        // draws the progress bar border
        g2.drawRect(x, y, BAR_WIDTH, BAR_HEIGHT);

        g2.setComposite(composite);
    }
}
