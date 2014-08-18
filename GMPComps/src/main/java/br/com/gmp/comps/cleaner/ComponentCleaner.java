package br.com.gmp.comps.cleaner;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JCheckBox;
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
                JTextComponent txt = (JTextComponent) comp;
                txt.setText("");
            } else if (comp instanceof JCheckBox) {
                JCheckBox check = (JCheckBox) comp;
                check.setSelected(false);
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
