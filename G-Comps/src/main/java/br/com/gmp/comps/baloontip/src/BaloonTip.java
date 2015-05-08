package br.com.gmp.comps.baloontip.src;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.LineBorder;

/**
 *
 * @author Kaciano
 */
public class BaloonTip extends JWindow {

    private Component comp;

    public BaloonTip(Component comp) {
        this.comp = comp;
    }

    public void showBaloonTip(String msg, final int time, int type, final int w, final int h) {
        if (comp == null) {
            JOptionPane.showMessageDialog(null, "Componente de base não foi"
                    + " inicializado.");
            return;
        }
        int x = comp.getLocationOnScreen().x;
        int y = comp.getLocationOnScreen().y;
        String path = "/res/Info.png";
        Color color = Color.blue.darker();
        switch (type) {
            case 1:
                path = "/res/Cancel.png";
                color = Color.red.darker();
                break;
            case 2:
                path = "/res/Alert.png";
                color = Color.yellow.darker();
                break;
            case 3:
                path = "/res/Success.png";
                color = Color.green.darker();
                break;
        }
        JPanel root = new JPanel();
        JLabel tipIcon = new JLabel(new ImageIcon(getClass().getResource(path)));                
        root.add(tipIcon);
        JLabel tipText = new JLabel(msg);
        root.add(tipText);        
        root.setBorder(new LineBorder(color));
        add(root);
        setBounds(x, y + comp.getHeight(), w, h);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                dispose();
            }
        });
        new Thread() {
            @Override
            public void run() {
                try {
                    setVisible(true);
                    sleep(time);
                    dispose();
                } catch (InterruptedException ex) {
                    Logger.getLogger(this.getClass().getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (isShowing() && isVisible()) {
                    int x = comp.getLocationOnScreen().x;
                    int y = comp.getLocationOnScreen().y;
                    setBounds(x, y + comp.getHeight(), w, h);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BaloonTip.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
}
