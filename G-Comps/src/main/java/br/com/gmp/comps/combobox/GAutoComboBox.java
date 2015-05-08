package br.com.gmp.comps.combobox;

import br.com.gmp.comps.combobox.model.GComboBoxModel;
import br.com.gmp.comps.interfaces.ValidableComponent;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;
import java.util.Vector;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 * ComboBox Auto completavel
 *
 * @author kaciano
 * @param <T> Tipo dos objetos carregados
 */
public class GAutoComboBox<T> extends GComboBox implements ValidableComponent {

    /**
     * Cria nova instancia de GAutoComboBox
     */
    public GAutoComboBox() {
        initialize(false);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param model {@code GComboBoxModel} Modelo de ComboBox
     */
    public GAutoComboBox(GComboBoxModel model) {
        super(model);
        initialize(false);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param data {@code Object[]} Array de dados
     */
    public GAutoComboBox(Object[] data) {
        super(data);
        initialize(false);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param data {@code List} Lista de dados
     */
    public GAutoComboBox(List data) {
        super(data);
        initialize(false);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param data {@code Vector} Vetor de dados
     */
    public GAutoComboBox(Vector data) {
        super(data);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param editable {@code boolean} Editavel?
     */
    public GAutoComboBox(boolean editable) {
        initialize(editable);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param model {@code GComboBoxModel} Modelo de ComboBox
     * @param editable {@code boolean} Editavel?
     */
    public GAutoComboBox(GComboBoxModel model, boolean editable) {
        super(model);
        initialize(editable);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param data {@code Object[]} Array de dados
     * @param editable {@code boolean} Editavel?
     */
    public GAutoComboBox(Object[] data, boolean editable) {
        super(data);
        initialize(editable);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param data {@code List} Lista de dados
     * @param editable {@code boolean} Editavel?
     */
    public GAutoComboBox(List data, boolean editable) {
        super(data);
        initialize(editable);
    }

    /**
     * Cria nova instancia de GAutoComboBox
     *
     * @param data {@code Vector} Vetor de dados
     * @param editable {@code boolean} Editavel?
     */
    public GAutoComboBox(Vector data, boolean editable) {
        super(data);
        initialize(editable);
    }

    /**
     * Método de inicialização
     *
     * @param editable {@code boolean} Editavel?
     */
    private void initialize(boolean editable) {
        setEditable(editable);

        AutoCompleteDecorator.decorate(this);
        final Color gray = getBackground();
        final Color green = UIManager.getColor("ComboBox.selectionBackground");

        final JTextComponent editorComponent = ((JTextComponent) getEditor().getEditorComponent());
        editorComponent.setBackground(gray);
        editorComponent.setSelectionColor(gray);
        editorComponent.setCaretColor(Color.black);
        editorComponent.setForeground(editorComponent.getSelectedTextColor());

        editorComponent.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                editorComponent.setBackground(green);
                editorComponent.setForeground(Color.black);
                editorComponent.setSelectionColor(green);
            }

            @Override
            public void focusLost(FocusEvent e) {
                editorComponent.setBackground(gray);
                editorComponent.setForeground(Color.black);
                editorComponent.setSelectionColor(gray);
            }
        });
    }

    @Override
    public void setEnabled(boolean b) {
        super.setEnabled(b);
        getEditor().getEditorComponent().setBackground(getBackground());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(100, 25));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
