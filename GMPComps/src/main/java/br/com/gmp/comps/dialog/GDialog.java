package br.com.gmp.comps.dialog;

import br.com.gmp.comps.panel.BlurGlassPane;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JWindow;

/**
 * Caixa de dialogo customizada
 *
 * @author kaciano
 */
public class GDialog extends javax.swing.JDialog {

    private JComponent parent;

    /**
     *
     */
    public GDialog() {
        initialize();
    }

    /**
     *
     * @param parent
     */
    public GDialog(JInternalFrame parent) {
        this.parent = parent;
        initialize();
    }

    /**
     *
     * @param parent
     * @param title
     */
    public GDialog(JInternalFrame parent, String title) {
        this.parent = parent;
        initialize();
        setTitle(title);
    }

    /**
     *
     * @param parent
     * @param modal
     */
    public GDialog(JInternalFrame parent, boolean modal) {
        this.parent = parent;
        initialize();
        setModal(modal);
    }

    /**
     *
     * @param parent
     * @param title
     * @param modal
     */
    public GDialog(JInternalFrame parent, String title, boolean modal) {
        this.parent = parent;
        initialize();
        setTitle(title);
        setModal(modal);
    }

    /**
     *
     * @param owner
     */
    public GDialog(Frame owner) {
        super(owner);
        initialize();
    }

    /**
     *
     * @param owner
     * @param modal
     */
    public GDialog(Frame owner, boolean modal) {
        super(owner, modal);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     */
    public GDialog(Frame owner, String title) {
        super(owner, title);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modal
     */
    public GDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modal
     * @param gc
     */
    public GDialog(Frame owner, String title, boolean modal, GraphicsConfiguration gc) {
        super(owner, title, modal, gc);
        initialize();
    }

    /**
     *
     * @param owner
     */
    public GDialog(Dialog owner) {
        super(owner);
        initialize();
    }

    /**
     *
     * @param owner
     * @param modal
     */
    public GDialog(Dialog owner, boolean modal) {
        super(owner, modal);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     */
    public GDialog(Dialog owner, String title) {
        super(owner, title);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modal
     */
    public GDialog(Dialog owner, String title, boolean modal) {
        super(owner, title, modal);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modal
     * @param gc
     */
    public GDialog(Dialog owner, String title, boolean modal, GraphicsConfiguration gc) {
        super(owner, title, modal, gc);
        initialize();
    }

    /**
     *
     * @param owner
     */
    public GDialog(Window owner) {
        super(owner);
        initialize();
    }

    /**
     *
     * @param owner
     * @param modalityType
     */
    public GDialog(Window owner, ModalityType modalityType) {
        super(owner, modalityType);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     */
    public GDialog(Window owner, String title) {
        super(owner, title);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modalityType
     */
    public GDialog(Window owner, String title, ModalityType modalityType) {
        super(owner, title, modalityType);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modalityType
     * @param gc
     */
    public GDialog(Window owner, String title, ModalityType modalityType, GraphicsConfiguration gc) {
        super(owner, title, modalityType, gc);
        initialize();
    }

    /**
     * Inicializa o Frame
     */
    private void initialize() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                applyBlur();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                removeBlur();
            }

        });
    }

    /**
     * Adiciona o blur ao GlassPane do Parent
     */
    private void applyBlur() {
        if ((parent != null || getParent() != null) && isModal()) {
            toggleBlur(true);
        }
    }

    /**
     * Remove o blur do GlassPane do Parent
     */
    private void removeBlur() {
        if ((parent != null || getParent() != null) && isModal()) {
            toggleBlur(false);
        }
    }

    /**
     * Modifica a visibilidade do glasspane
     *
     * @param state {@code Boolean} Visibilidade do GlassPane
     */
    private void toggleBlur(boolean state) {
        if (getParent() instanceof JFrame) {
            JFrame p = (JFrame) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(state ? new BlurGlassPane() : new JFrame().getGlassPane());
            p.getGlassPane().setVisible(state);
        } else if (getParent() instanceof JInternalFrame) {
            JInternalFrame p = (JInternalFrame) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(state ? new BlurGlassPane() : new JInternalFrame().getGlassPane());
            p.getGlassPane().setVisible(state);
        } else if (getParent() instanceof JDialog) {
            JDialog p = (JDialog) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(state ? new BlurGlassPane() : new JDialog().getGlassPane());
            p.getGlassPane().setVisible(state);
        } else if (getParent() instanceof JWindow) {
            JWindow p = (JWindow) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(state ? new BlurGlassPane() : new JWindow().getGlassPane());
            p.getGlassPane().setVisible(state);
        }
        if (!state) {

        }
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getContentPane().setLayout(new java.awt.FlowLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
