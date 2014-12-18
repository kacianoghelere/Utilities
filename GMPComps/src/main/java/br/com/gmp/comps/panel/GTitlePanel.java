package br.com.gmp.comps.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Painel com titulo
 *
 * @author kaciano
 */
public class GTitlePanel extends JPanel {

    private static final long serialVersionUID = 9104873267039717087L;
    protected JPanel northPanel;
    protected JLabel label;

    /**
     * Constructs a titled panel.
     */
    public GTitlePanel() {
        initialize("Title", null, null, null);
    }

    /**
     * Constructs a titled panel.
     *
     * @param title Titulo
     * @param icon Icone
     * @param content JComponent do conteudo
     * @param outerBorder Borda externa
     */
    public GTitlePanel(String title, Icon icon, JComponent content, Border outerBorder) {
        initialize(title, icon, content, outerBorder);
    }

    /**
     * Método de inicialização
     *
     * @param title Titulo
     * @param icon Icone
     * @param content JComponent do conteudo
     * @param outerBorder Borda externa
     */
    private void initialize(String title, Icon icon, JComponent content, Border outerBorder) {
        initComponents();
        setLayout(new BorderLayout());

        label = new JLabel(title != null ? title : "", JLabel.LEADING);
        if (icon != null) {
            label.setIcon(icon);
        }
        label.setForeground(Color.WHITE);

        GradientPanel titlePanel = new GradientPanel(Color.BLACK);
        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(label, BorderLayout.WEST);
        int borderOffset = 2;
        if (icon == null) {
            borderOffset += 1;
        }
        titlePanel.setBorder(BorderFactory.createEmptyBorder(borderOffset, 4, borderOffset, 1));
        add(titlePanel, BorderLayout.NORTH);

        JPanel nPanel = new JPanel();
        nPanel.setLayout(new BorderLayout());
        if (content != null) {
            nPanel.add(content, BorderLayout.NORTH);
        }
        nPanel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        add(nPanel, BorderLayout.CENTER);

        if (outerBorder == null) {
            setBorder(BorderFactory.createLineBorder(Color.GRAY));
        } else {
            setBorder(BorderFactory.createCompoundBorder(outerBorder,
                    BorderFactory.createLineBorder(Color.GRAY)));
        }
    }

    public void setTitle(String label, Icon icon) {
        this.label.setText(label);
        this.label.setIcon(icon);
    }

    private static class GradientPanel extends JPanel {

        private static final long serialVersionUID = -6385751027379193053L;

        private GradientPanel(Color background) {
            setBackground(background);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (isOpaque()) {
                // Color controlColor = UIManager.getColor("control");
                // Color controlColor = new Color(252, 198, 82);
                Color controlColor = new Color(99, 153, 255);
                int width = getWidth();
                int height = getHeight();

                Graphics2D g2 = (Graphics2D) g;
                Paint oldPaint = g2.getPaint();
                g2.setPaint(new GradientPaint(0, 0, getBackground(), width, 0,
                        controlColor));
                g2.fillRect(0, 0, width, height);
                g2.setPaint(oldPaint);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
