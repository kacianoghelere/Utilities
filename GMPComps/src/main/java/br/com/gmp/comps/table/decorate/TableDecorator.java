package br.com.gmp.comps.table.decorate;

import br.com.gmp.comps.table.GTable;
import br.com.gmp.utils.image.ImageUtil;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

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
     * @param table <code>GTable</code> Tabela à ser decorada
     */
    public TableDecorator(GTable table) {
        this.table = table;
    }

    /**
     * Decora a coluna indicada com um ícone
     *
     * @param iconcolumn <code>int</code> Indice da coluna
     * @return
     */
    public TableDecorator withIcon(int iconcolumn) {
        this.table.getColumnModel().getColumn(iconcolumn).setCellRenderer((JTable table, Object value, boolean isSelected1, boolean hasFocus, int row, int column) -> {
            ImageIcon ic = new ImageIcon(getClass().getResource((String) value));
            Image sc = new ImageUtil().getScaledImage(ic.getImage(), 20, 20);
            ic.setImage(sc);
            JLabel label = new JLabel(ic);
            if (isSelected1) {
                label.setOpaque(true);
                label.setBackground(table.getSelectionBackground());
            } else {
                label.setOpaque(true);
                label.setBackground(new JLabel().getBackground());
            }
            return label;
        });
        return this;
    }

    /**
     * Retorna a tabela
     *
     * @return <code>GTable</code> Tabela
     */
    public GTable getTable() {
        return table;
    }

    /**
     * Modifica a tabela
     *
     * @param table <code>GTable</code> Tabela
     */
    public void setTable(GTable table) {
        this.table = table;
    }

}
