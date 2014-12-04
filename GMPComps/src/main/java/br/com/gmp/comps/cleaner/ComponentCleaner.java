package br.com.gmp.comps.cleaner;

import br.com.gmp.comps.textfield.GTextField;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.JTextComponent;

/**
 * Classe utilitária para limpar os valores de todos os componentes
 *
 * @author kaciano
 */
public class ComponentCleaner {

    private boolean cleanEverything;

    public ComponentCleaner(boolean cleanEverything) {
        this.cleanEverything = cleanEverything;
    }

    /**
     * Método de limpeza principal
     *
     * @param c {@code Container} Container raiz
     */
    public void clean(Container c) {
        for (Component comp : c.getComponents()) {
            if (c instanceof Container) {
                Container cont = (Container) comp;
                clean(cont);
                cleanComponents(cont);
            }
        }
        cleanComponents(c);
    }

    /**
     * Método de limpeza dos componentes internos
     *
     * @param c {@code Container} Container raiz
     */
    public void cleanComponents(Container c) {
        for (Component comp : c.getComponents()) {
            if (comp instanceof JTextComponent) {
                if (comp instanceof GTextField) {
                    GTextField txt = (GTextField) comp;
                    txt.clear();
                } else {
                    JTextComponent txt = (JTextComponent) comp;
                    txt.setText("");
                }
            } else if (comp instanceof JCheckBox) {
                JCheckBox check = (JCheckBox) comp;
                check.setSelected(false);
            } else if (comp instanceof JSpinner) {
                JSpinner spinner = (JSpinner) comp;
                if (spinner.getModel() instanceof SpinnerNumberModel) {
                    SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
                    model.setValue(model.getMinimum());
                } else if (spinner.getModel() instanceof SpinnerDateModel) {
                    SpinnerDateModel model = (SpinnerDateModel) spinner.getModel();
                    model.setValue(model.getStart());
                } else if (spinner.getModel() instanceof SpinnerListModel) {
                    SpinnerListModel model = (SpinnerListModel) spinner.getModel();
                    model.setValue(null);
                }
            } else if (comp instanceof JComboBox) {
                JComboBox combo = (JComboBox) comp;
                if (combo.getItemCount() > 0) {
                    combo.setSelectedIndex(0);
                }
            }
        }
    }

    /**
     * Deve limpar tudo?
     *
     * @return Boolean Limpar tudo
     */
    public Boolean isCleanEverything() {
        return cleanEverything;
    }

    /**
     * Modifica limpar tudo
     *
     * @param cleanEverything Boolean Limpar tudo
     */
    public void setCleanEverything(boolean cleanEverything) {
        this.cleanEverything = cleanEverything;
    }

}
