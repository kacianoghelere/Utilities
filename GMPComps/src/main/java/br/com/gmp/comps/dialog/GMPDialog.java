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
 *
 * @author kaciano
 */
public class GMPDialog extends javax.swing.JDialog {

    private JComponent parent;

    /**
     *
     */
    public GMPDialog() {
        initialize();
    }

    /**
     *
     * @param parent
     */
    public GMPDialog(JInternalFrame parent) {
        this.parent = parent;
        initialize();
    }

    /**
     *
     * @param parent
     * @param title
     */
    public GMPDialog(JInternalFrame parent, String title) {
        this.parent = parent;
        initialize();
        setTitle(title);
    }

    /**
     *
     * @param parent
     * @param modal
     */
    public GMPDialog(JInternalFrame parent, boolean modal) {
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
    public GMPDialog(JInternalFrame parent, String title, boolean modal) {
        this.parent = parent;
        initialize();
        setTitle(title);
        setModal(modal);
    }

    /**
     *
     * @param owner
     */
    public GMPDialog(Frame owner) {
        super(owner);
        initialize();
    }

    /**
     *
     * @param owner
     * @param modal
     */
    public GMPDialog(Frame owner, boolean modal) {
        super(owner, modal);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     */
    public GMPDialog(Frame owner, String title) {
        super(owner, title);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modal
     */
    public GMPDialog(Frame owner, String title, boolean modal) {
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
    public GMPDialog(Frame owner, String title, boolean modal, GraphicsConfiguration gc) {
        super(owner, title, modal, gc);
        initialize();
    }

    /**
     *
     * @param owner
     */
    public GMPDialog(Dialog owner) {
        super(owner);
        initialize();
    }

    /**
     *
     * @param owner
     * @param modal
     */
    public GMPDialog(Dialog owner, boolean modal) {
        super(owner, modal);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     */
    public GMPDialog(Dialog owner, String title) {
        super(owner, title);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modal
     */
    public GMPDialog(Dialog owner, String title, boolean modal) {
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
    public GMPDialog(Dialog owner, String title, boolean modal, GraphicsConfiguration gc) {
        super(owner, title, modal, gc);
        initialize();
    }

    /**
     *
     * @param owner
     */
    public GMPDialog(Window owner) {
        super(owner);
        initialize();
    }

    /**
     *
     * @param owner
     * @param modalityType
     */
    public GMPDialog(Window owner, ModalityType modalityType) {
        super(owner, modalityType);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     */
    public GMPDialog(Window owner, String title) {
        super(owner, title);
        initialize();
    }

    /**
     *
     * @param owner
     * @param title
     * @param modalityType
     */
    public GMPDialog(Window owner, String title, ModalityType modalityType) {
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
    public GMPDialog(Window owner, String title, ModalityType modalityType, GraphicsConfiguration gc) {
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
     * @param state <code><b>Boolean</b></code> Visibilidade do GlassPane
     */
    private void toggleBlur(boolean state) {
        if (getParent() instanceof JFrame) {
            JFrame p = (JFrame) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(new BlurGlassPane());
            p.getGlassPane().setVisible(state);
        } else if (getParent() instanceof JInternalFrame) {
            JInternalFrame p = (JInternalFrame) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(new BlurGlassPane());
            p.getGlassPane().setVisible(state);
        } else if (getParent() instanceof JDialog) {
            JDialog p = (JDialog) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(new BlurGlassPane());
            p.getGlassPane().setVisible(state);
        } else if (getParent() instanceof JWindow) {
            JWindow p = (JWindow) getParent();
            setLocationRelativeTo(p);
            p.setGlassPane(new BlurGlassPane());
            p.getGlassPane().setVisible(state);
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
