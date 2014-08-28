package br.com.gmp.comps.table.decorate;

import br.com.gmp.comps.combobox.GComboBox;
import br.com.gmp.comps.combobox.model.GComboBoxModel;
import br.com.gmp.comps.table.GTable;
import br.com.gmp.comps.textfield.numeric.GNumericField;
import br.com.gmp.utils.image.ImageUtil;
import java.awt.Component;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * Decorador de dados para tabelas
 *
 * @author kaciano
 */
public class TableDecorator {

    private GTable table;

    /**
     * Cria nova instancia de TableDecorator
     *
     * @param table {@code GTable} Tabela à ser decorada
     */
    public TableDecorator(GTable table) {
        this.table = table;
    }

    /**
     * Decora a coluna indicada com um ícone
     *
     * @param iconcolumn {@code int} Indice da coluna
     * @return {@code TableDecorator} Decorador de tabela
     */
    public TableDecorator withIcon(int iconcolumn) {
        this.table.getColumnModel().getColumn(iconcolumn).setCellRenderer(new TableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                ImageIcon ic = new ImageIcon(getClass().getResource((String) value));
                Image sc = new ImageUtil().getScaledImage(ic.getImage(), 20, 20);
                ic.setImage(sc);
                JLabel label = new JLabel(ic);
                if (isSelected) {
                    label.setOpaque(true);
                    label.setBackground(table.getSelectionBackground());
                } else {
                    label.setOpaque(true);
                    label.setBackground(new JLabel().getBackground());
                }
                return label;
            }
        });
        return this;
    }

    /**
     * Decora a coluna indicada com um combobox
     *
     * @param column {@code int} Indice da coluna
     * @param model {@code GComboBoxModel} Modelo do combo
     * @return {@code TableDecorator} Decorador de tabela
     */
    public TableDecorator comboAt(int column, GComboBoxModel model) {
        this.table.getColumnModel().getColumn(column).setCellEditor(
                new DefaultCellEditor(new GComboBox(model))
        );
        return this;
    }

    /**
     * Decora a coluna indicada com um combobox
     *
     * @param column {@code int} Indice da coluna
     * @param data {@code List} Dados do combo
     * @return {@code TableDecorator} Decorador de tabela
     */
    public TableDecorator comboAt(int column, List data) {
        return comboAt(column, new GComboBoxModel(data));
    }

    /**
     * Decora a coluna indicada com um editor de numeros
     *
     * @param column {@code int} Indice da coluna
     * @return {@code TableDecorator} Decorador de tabela
     */
    public TableDecorator withNumber(int column) {
        this.table.getColumnModel().getColumn(column).setCellRenderer(NumberRenderer.getNumberRenderer());
        this.table.getColumnModel().getColumn(column)
                .setCellEditor(new DefaultCellEditor(new GNumericField()));        
        return this;
    }

    /**
     * Decora a coluna indicada com um editor de numeros decimais
     *
     * @param column {@code int} Indice da coluna
     * @return {@code TableDecorator} Decorador de tabela
     */
    public TableDecorator withDecimal(int column) {
        this.table.getColumnModel().getColumn(column)
                .setCellRenderer(NumberRenderer.getDecimalRenderer());
        return this;
    }

    /**
     * Retorna a tabela
     *
     * @return {@code GTable} Tabela
     */
    public GTable getTable() {
        return table;
    }

    /**
     * Modifica a tabela
     *
     * @param table {@code GTable} Tabela
     */
    public void setTable(GTable table) {
        this.table = table;
    }

}
