package br.com.gmp.comps.rating.dynamic;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

/**
 * Seletor de ratings
 *
 * @author kaciano
 * @version 1.0
 */
public class DynamicSelector extends JComponent {

    private boolean editable = true;
    private int ratingSize;
    private int rating;
    private String filledIcon;
    private String emptyIcon;
    private JToggleButton[] buttons;

    /**
     * Cria nova instancia do seletor de nivel
     */
    public DynamicSelector() {
        this(5, 1, false);
    }

    /**
     * Cria nova instancia do seletor de nivel
     *
     * @param rating Nivel inicial
     */
    public DynamicSelector(int rating) {
        this(5, rating, false);
    }

    /**
     * Cria nova instancia do seletor de nivel
     *
     * @param editable Editavel?
     */
    public DynamicSelector(boolean editable) {
        this(5, 1, editable);
    }

    /**
     * Cria nova instancia do seletor de nivel
     *
     * @param rating Nivel inicial
     * @param editable Editavel?
     */
    public DynamicSelector(int rating, boolean editable) {
        this(5, rating, editable);
    }

    /**
     * Cria nova instancia do seletor de nivel
     *
     * @param ratingSize Quantidade de itens
     * @param rating Nivel inicial
     * @param editable Editavel?
     */
    public DynamicSelector(int ratingSize, int rating, boolean editable) {
        this.ratingSize = ratingSize;
        this.rating = rating;
        this.editable = editable;
        this.filledIcon = "/res/Star_Full.png";
        this.emptyIcon = "/res/Star_Empty.png";
        initComponents();
        setRatingSize(ratingSize);
        addListeners();
        updateRating();
        setRating(rating);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
        if (buttons != null) {
            for (JToggleButton bt : buttons) {
                bt.addPropertyChangeListener(listener);
            }
        }
    }

    /**
     * Metodo privado de seleçao
     *
     * @param rating
     */
    private void setRating(int rating) {
        try {
            setSelectedRating(rating);
        } catch (Exception ex) {
            Logger.getLogger(DynamicSelector.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Retorna a quantidade de itens
     *
     * @return Quantidade de itens
     */
    public int getRatingSize() {
        return ratingSize;
    }

    /**
     * Modifica a quantidade de itens
     *
     * @param ratingSize Quantidade de itens
     */
    public void setRatingSize(int ratingSize) {
        this.ratingSize = ratingSize;
        this.removeAll();
        setSize((ratingSize * 36), 36);
        this.setLayout(new GridLayout(1, ratingSize));
        this.buttons = new JToggleButton[ratingSize];
        ImageIcon icon = new ImageIcon(getClass().getResource(emptyIcon));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JToggleButton(icon);
//            buttons[i].setOpaque(true);
            buttons[i].setBorderPainted(false);
            buttonGroup.add(buttons[i]);
            this.add(buttons[i]);
        }
        addListeners();
        SwingUtilities.updateComponentTreeUI(this);
    }

    /**
     * Adiciona os listeners especificos
     */
    private void addListeners() {
        for (JToggleButton c : buttons) {
            final JToggleButton button = (JToggleButton) c;
            addListeners(button);
        }
    }

    /**
     * Adiciona os listeners especificos no botão
     *
     * @param button Botão
     */
    private void addListeners(final JToggleButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (editable && !button.isSelected()) {
                    button.setIcon(getIcon(filledIcon));
                    for (Component other : getComponents()) {
                        final JToggleButton bt = (JToggleButton) other;
                        if (ratings().get(button) > ratings().get(bt)) {
                            bt.setIcon(getIcon(filledIcon));
                        } else if (ratings().get(bt) > ratings().get(button)) {
                            bt.setIcon(getIcon(emptyIcon));
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

    /**
     * Atualiza o nivel atual
     */
    private void updateRating() {
        boolean hasSelected = false;
        for (JToggleButton c : buttons) {
            final JToggleButton button = (JToggleButton) c;
            if (editable && button.isSelected()) {
                button.setIcon(getIcon(filledIcon));
                hasSelected = true;
                for (JToggleButton other : buttons) {
                    final JToggleButton bt = (JToggleButton) other;
                    if (ratings().get(button) > ratings().get(bt)) {
                        bt.setIcon(getIcon(filledIcon));
                    } else if (ratings().get(bt) > ratings().get(button)) {
                        bt.setIcon(getIcon(emptyIcon));
                    }
                }
            }
        }
        if (!hasSelected || getSelectedRating() == 0) {
            for (JToggleButton other : buttons) {
                final JToggleButton bt = (JToggleButton) other;
                bt.setIcon(getIcon(emptyIcon));
            }
        }
    }

    /**
     * Retorna a instancia do icone
     *
     * @param path
     * @return
     */
    private javax.swing.ImageIcon getIcon(String path) {
        return new javax.swing.ImageIcon(getClass().getResource(path));
    }

    /**
     * Retorna o nivel atual
     *
     * @return Nivel atual
     */
    public int getSelectedRating() {
        for (JToggleButton bt : buttons) {
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
     * @throws java.lang.Exception Exceção propagada
     */
    public void setSelectedRating(int rating) throws Exception {
        try {
            buttons[rating - 1].setSelected(true);
            updateRating();
        } catch (Exception e) {
            throw new Exception("Nivel invalido");
        }
    }

    /**
     * Mapa dos ToggleButton's
     *
     * @return Mapa dos ToggleButton's
     */
    public HashMap<JToggleButton, Integer> ratings() {
        HashMap<JToggleButton, Integer> rate = new HashMap<>();
        for (int i = 0; i < buttons.length; i++) {
            rate.put(buttons[i], (i + 1));
        }
        return rate;
    }

    @Override
    public void setOpaque(boolean isOpaque) {
        super.setOpaque(isOpaque);
        if (buttons != null) {
            for (JToggleButton j : buttons) {
                if (j != null) {
                    j.setOpaque(isOpaque);
                }
            }
        }
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        if (buttons != null) {
            for (JToggleButton j : buttons) {
                if (j != null) {
                    j.setBackground(bg);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();

        setOpaque(false);
        setRequestFocusEnabled(false);
        setLayout(new java.awt.GridLayout(1, 7));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    // End of variables declaration//GEN-END:variables

    /**
     * Retorna se é editavel
     *
     * @return Editavel?
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * Modifica se é editavel
     *
     * @param editable Editavel?
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    /**
     * Retorna o Icone de valor selecionado
     *
     * @return Icone de valor selecionado
     */
    public String getFilledIcon() {
        return filledIcon;
    }

    /**
     * Modifica o Icone de valor selecionado
     *
     * @param filledIcon Icone de valor selecionado
     */
    public void setFilledIcon(String filledIcon) {
        this.filledIcon = filledIcon;
    }

    /**
     * Retorna o Icone de valor não selecionado
     *
     * @return Icone de valor não selecionado
     */
    public String getEmptyIcon() {
        return emptyIcon;
    }

    /**
     * Modifica o Icone de valor não selecionado
     *
     * @param emptyIcon Icone de valor não selecionado
     */
    public void setEmptyIcon(String emptyIcon) {
        this.emptyIcon = emptyIcon;
    }

}
