package br.com.gmp.comps.combobox;

import br.com.gmp.comps.combobox.model.GComboBoxModel;
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
public class GMPComboBox<T> extends JComboBox {

    private List<T> data;
    private GComboBoxModel<T> model;

    /**
     * Cria nova instancia de GMPComboBox
     */
    public GMPComboBox() {
        initialize(new GComboBoxModel<T>());
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param model <code>GComboBoxModel(T)</code> Modelo da combobox
     */
    public GMPComboBox(GComboBoxModel<T> model) {
        initialize(model);
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param data <code>T[]</code> Dados da combobox
     */
    public GMPComboBox(T[] data) {
        initialize(new GComboBoxModel<>(data));
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param data <code>List(T)</code> Dados da combobox
     */
    public GMPComboBox(List<T> data) {
        initialize(new GComboBoxModel<>(data));
    }

    /**
     * Cria nova instancia de GMPComboBox
     *
     * @param data <code>Vector(T)</code> Dados da combobox
     */
    public GMPComboBox(Vector<T> data) {
        initialize(new GComboBoxModel<>(data));
    }

    /**
     * Metodo de inicialização
     */
    private void initialize(GComboBoxModel<T> model) {
        this.model = model;
        this.data = model.getData();
        this.setModel(model);
        initComponents();
    }

    /**
     * Retorna os valores do combo
     *
     * @return <code>List(T)</code> Dados da combobox
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Modifica os dados no combo
     *
     * @param data <code>List(T)</code> Lista de dados
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
     * @return <code>GComboBoxModel(T)</code> Modelo da combobox
     */
    public GComboBoxModel<T> getGModel() {
        return model;
    }

    /**
     * Modifica o modelo da combobox
     *
     * @param model <code>GComboBoxModel(T)</code> Modelo da combobox
     */
    public void setGModel(GComboBoxModel<T> model) {
        this.model = model;
        this.setData(model.getData());
        this.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(100, 25));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
