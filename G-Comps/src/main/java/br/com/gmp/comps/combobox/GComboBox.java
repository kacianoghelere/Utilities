package br.com.gmp.comps.combobox;

import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.combobox.model.GComboBoxModel;
import br.com.gmp.comps.interfaces.ValidableComponent;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Combobox customizado
 *
 * @author kaciano
 * @param <T> Tipo dos objetos carregados
 */
public class GComboBox<T> extends JComboBox implements ValidableComponent {

    private List<T> data;
    private GComboBoxModel<T> model;
    private String invalidMsg = "Campo obrigatório!";

    /**
     * Cria nova instancia de GMPComboBox
     */
    public GComboBox() {
        SimpleComboModel scm = new SimpleComboModel();
        scm.addElement("Item 1");
        scm.addElement("Item 2");
        scm.addElement("Item 3");
        scm.addElement("Item 4");
        initialize(scm);
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param model {@code GComboBoxModel(T)} Modelo da combobox
     */
    public GComboBox(GComboBoxModel<T> model) {
        initialize(model);
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param data {@code T[]} Dados da combobox
     */
    public GComboBox(T[] data) {
        initialize(new GComboBoxModel<>(data));
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param data {@code List(T)} Dados da combobox
     */
    public GComboBox(List<T> data) {
        initialize(new GComboBoxModel<>(data));
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param data {@code Vector(T)} Dados da combobox
     */
    public GComboBox(Vector<T> data) {
        initialize(new GComboBoxModel<>(data));
    }

    /**
     * Metodo de inicialização
     */
    private void initialize(GComboBoxModel model) {
        this.model = model;
        this.data = model.getData();
        this.setModel(model);
        initComponents();
    }

    /**
     * Retorna os valores do combo
     *
     * @return {@code List(T)} Dados da combobox
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Modifica os dados no combo
     *
     * @param data {@code List(T)} Lista de dados
     */
    public void setData(List<T> data) {
        this.data = data;
        this.setModel(new DefaultComboBoxModel(data.toArray()));
        this.repaint();
        this.revalidate();
    }

    /**
     * Modifica o modelo da combobox
     *
     * @return {@code GComboBoxModel(T)} Modelo da combobox
     */
    public GComboBoxModel<T> getGModel() {
        return model;
    }

    /**
     * Modifica o modelo da combobox
     *
     * @param model {@code GComboBoxModel(T)} Modelo da combobox
     */
    public void setGModel(GComboBoxModel<T> model) {
        this.model = model;
        this.setData(model.getData());
        this.setModel(model);
        if (this.model.getSize() > 0) {
            setSelectedIndex(0);
        }
    }

    @Override
    public boolean validateComponent() {
        if (getItemCount() == 0) {
            new BalloonUtil().showTimedBallon(this, invalidMsg);
            return false;
        } else if (getSelectedItem() == null) {
            new BalloonUtil().showTimedBallon(this, invalidMsg);
            return false;
        } else if (getSelectedIndex() == -1) {
            new BalloonUtil().showTimedBallon(this, invalidMsg);
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(100, 25));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

class SimpleComboModel extends GComboBoxModel<String> {

}
