package br.com.gmp.comps.button;

/**
 *
 * @author Kaciano
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTabComponent extends JPanel {

    private final JTabbedPane pane;

    /**
     * Constroi nova instancia de ButtonTabComponent
     *
     * @param pane Painel de tabs
     */
    public ButtonTabComponent(final JTabbedPane pane) {
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;

        setOpaque(false);

        initialize(null);
    }

    /**
     * Constroi nova instancia de ButtonTabComponent
     *
     * @param pane Painel de tabs
     * @param icon Icone do componente
     */
    public ButtonTabComponent(final JTabbedPane pane, Icon icon) {

        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;

        setOpaque(false);

        initialize(icon);
    }

    /**
     * Inicializa o componente
     *
     * @param icon Icone do componente
     */
    private void initialize(Icon icon) {
        JLabel label = new JLabel() {
            @Override
            public String getText() {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);
                if (i != -1) {
                    return pane.getTitleAt(i);
                }
                return null;
            }
        };
        if (icon != null) {
            label.setIcon(icon);
            add(label);
        } else {
            add(label);
        }

        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));

        JButton button = new TabButton();
        add(button);
        //----------------------------------------------------------------------
        //adiciona mais espaço para o topo do componente  
        //setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }

    /**
     * Construção da UI do TabButton
     */
    private class TabButton extends GMPButton implements ActionListener {

        public TabButton() {
            int size = 16;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("Fechar esta aba");
//            setUI(new BasicButtonUI());
//            setContentAreaFilled(false);
//            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
//            setBorderPainted(false);
//            setBackground(Color.red);
            addMouseListener(buttonMouseListener);
            setRolloverEnabled(true);
            setText("x");
            setStartColor(new Color(204, 0, 51));
            setEndColor(Color.RED);
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = pane.indexOfTabComponent(ButtonTabComponent.this);
            if (i != -1) {
                pane.remove(i);
            }
        }

    }
    /**
     * Listeners do componente
     */
    private final static MouseListener buttonMouseListener = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                //button.setBorderPainted(true);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                //button.setBorderPainted(false);
            }
        }
    };
}
