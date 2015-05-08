package br.com.gmp.comps.rating.fivestar;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 * Seletor de niveis de 7 estrelas
 *
 * @author kaciano
 */
public class FiveStarSelector extends JComponent implements MouseListener {

    private boolean editable = true;

    /**
     * Cria nova instancia do seletor de nivel
     */
    public FiveStarSelector() {
        initComponents();
        addListeners();
        updateRating();
    }

    /**
     * Cria nova instancia do seletor de nivel
     *
     * @param rate Nivel inicial
     */
    public FiveStarSelector(int rate) {
        initComponents();
        addListeners();
        updateRating();
        setSelectedRating(rate);
    }

    /**
     * Cria nova instancia do seletor de nivel
     *
     * @param editable Editavel?
     */
    public FiveStarSelector(boolean editable) {
        initComponents();
        addListeners();
        updateRating();
        this.editable = editable;
    }

    /**
     * Cria nova instancia do seletor de nivel
     *
     * @param rate Nivel inicial
     * @param editable Editavel?
     */
    public FiveStarSelector(int rate, boolean editable) {
        initComponents();
        addListeners();
        updateRating();
        setSelectedRating(rate);
        this.editable = editable;
    }

    /**
     * Adiciona os listeners especificos
     */
    private void addListeners() {
        for (JToggleButton c : componentArray()) {
            final JToggleButton button = (JToggleButton) c;
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    if (editable && !button.isSelected()) {
                        button.setIcon(new javax.swing.ImageIcon(getClass()
                                .getResource("/res/Star_Full.png")));
                        for (Component other : getComponents()) {
                            final JToggleButton bt = (JToggleButton) other;
                            if (ratings().get(button) > ratings().get(bt)) {
                                bt.setIcon(new javax.swing.ImageIcon(getClass()
                                        .getResource("/res/Star_Full.png")));
                            } else if (ratings().get(bt) > ratings().get(button)) {
                                bt.setIcon(new javax.swing.ImageIcon(getClass()
                                        .getResource("/res/Star_Empty.png")));
                            }
                        }
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    updateRating();
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                    updateRating();
                }
            });
        }
    }

    /**
     * Atualiza o nivel atual
     */
    private void updateRating() {
        for (JToggleButton c : componentArray()) {
            final JToggleButton button = (JToggleButton) c;
            if (editable && button.isSelected()) {
                button.setIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/res/Star_Full.png")));
                for (JToggleButton other : componentArray()) {
                    final JToggleButton bt = (JToggleButton) other;
                    if (ratings().get(button) > ratings().get(bt)) {
                        bt.setIcon(new javax.swing.ImageIcon(getClass()
                                .getResource("/res/Star_Full.png")));
                    } else if (ratings().get(bt) > ratings().get(button)) {
                        bt.setIcon(new javax.swing.ImageIcon(getClass()
                                .getResource("/res/Star_Empty.png")));
                    }
                }
            }
        }
    }

    /**
     * Retorna o nivel atual
     *
     * @return Nivel atual
     */
    public int getSelectedRating() {
        for (JToggleButton bt : componentArray()) {
            if (bt.isSelected()) {
                return ratings().get(bt);
            }
        }
        return 0;
    }

    /**
     * Modifica o nivel atual
     *
     * @param rating Novo nivel
     */
    public void setSelectedRating(int rating) {
        try {
            componentArray()[rating - 1].setSelected(true);
            updateRating();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nivel desconhecido");
        }
    }

    /**
     * Array dos ToggleButton's
     *
     * @return Array dos ToggleButton's
     */
    public JToggleButton[] componentArray() {
        return new JToggleButton[]{jBStar1, jBStar2, jBStar3, jBStar4, jBStar5};

    }

    /**
     * Mapa dos ToggleButton's
     *
     * @return Mapa dos ToggleButton's
     */
    public HashMap<JToggleButton, Integer> ratings() {
        HashMap<JToggleButton, Integer> rating = new HashMap<>();
        rating.put(jBStar1, 1);
        rating.put(jBStar2, 2);
        rating.put(jBStar3, 3);
        rating.put(jBStar4, 4);
        rating.put(jBStar5, 5);
        return rating;
    }

    @Override
    public void setOpaque(boolean isOpaque) {
        super.setOpaque(isOpaque);
        for (JToggleButton j : componentArray()) {
            j.setOpaque(isOpaque);
        }
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        for (JToggleButton j : componentArray()) {
            j.setBackground(bg);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jBStar1 = new javax.swing.JToggleButton();
        jBStar2 = new javax.swing.JToggleButton();
        jBStar3 = new javax.swing.JToggleButton();
        jBStar4 = new javax.swing.JToggleButton();
        jBStar5 = new javax.swing.JToggleButton();

        setMaximumSize(new java.awt.Dimension(125, 25));
        setMinimumSize(new java.awt.Dimension(125, 25));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(125, 25));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.GridLayout(1, 7));

        buttonGroup.add(jBStar1);
        jBStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Star_Empty.png"))); // NOI18N
        jBStar1.setSelected(true);
        jBStar1.setBorderPainted(false);
        jBStar1.setContentAreaFilled(false);
        jBStar1.setFocusPainted(false);
        add(jBStar1);

        buttonGroup.add(jBStar2);
        jBStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Star_Empty.png"))); // NOI18N
        jBStar2.setBorderPainted(false);
        jBStar2.setContentAreaFilled(false);
        jBStar2.setFocusPainted(false);
        add(jBStar2);

        buttonGroup.add(jBStar3);
        jBStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Star_Empty.png"))); // NOI18N
        jBStar3.setBorderPainted(false);
        jBStar3.setContentAreaFilled(false);
        jBStar3.setFocusPainted(false);
        add(jBStar3);

        buttonGroup.add(jBStar4);
        jBStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Star_Empty.png"))); // NOI18N
        jBStar4.setBorderPainted(false);
        jBStar4.setContentAreaFilled(false);
        jBStar4.setFocusPainted(false);
        add(jBStar4);

        buttonGroup.add(jBStar5);
        jBStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Star_Empty.png"))); // NOI18N
        jBStar5.setBorderPainted(false);
        jBStar5.setContentAreaFilled(false);
        jBStar5.setFocusPainted(false);
        add(jBStar5);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JToggleButton jBStar1;
    private javax.swing.JToggleButton jBStar2;
    private javax.swing.JToggleButton jBStar3;
    private javax.swing.JToggleButton jBStar4;
    private javax.swing.JToggleButton jBStar5;
    // End of variables declaration//GEN-END:variables

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public javax.swing.ButtonGroup getButtonGroup() {
        return buttonGroup;
    }

    public void setButtonGroup(javax.swing.ButtonGroup buttonGroup) {
        this.buttonGroup = buttonGroup;
    }

    public javax.swing.JToggleButton getjBStar1() {
        return jBStar1;
    }

    public void setjBStar1(javax.swing.JToggleButton jBStar1) {
        this.jBStar1 = jBStar1;
    }

    public javax.swing.JToggleButton getjBStar2() {
        return jBStar2;
    }

    public void setjBStar2(javax.swing.JToggleButton jBStar2) {
        this.jBStar2 = jBStar2;
    }

    public javax.swing.JToggleButton getjBStar3() {
        return jBStar3;
    }

    public void setjBStar3(javax.swing.JToggleButton jBStar3) {
        this.jBStar3 = jBStar3;
    }

    public javax.swing.JToggleButton getjBStar4() {
        return jBStar4;
    }

    public void setjBStar4(javax.swing.JToggleButton jBStar4) {
        this.jBStar4 = jBStar4;
    }

    public javax.swing.JToggleButton getjBStar5() {
        return jBStar5;
    }

    public void setjBStar5(javax.swing.JToggleButton jBStar5) {
        this.jBStar5 = jBStar5;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
