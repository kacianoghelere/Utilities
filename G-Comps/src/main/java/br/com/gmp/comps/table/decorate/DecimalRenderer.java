package br.com.gmp.comps.table.decorate;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Renderer de numeros decimais para tabelas
 *
 * @author kaciano
 */
public class DecimalRenderer extends DefaultTableCellRenderer {

    DecimalFormat formatter;

    /**
     * Cria nova instancia de DecimalRenderer
     *
     * @param pattern {@code String} Padrão
     */
    public DecimalRenderer(String pattern) {
        this(new DecimalFormat(pattern));
    }

    /**
     * Cria nova instancia de DecimalRenderer
     *
     * @param formatter {@code DecimalFormat} Formatação
     */
    public DecimalRenderer(DecimalFormat formatter) {
        this.formatter = formatter;
        setHorizontalAlignment(JLabel.RIGHT);
    }

    @Override
    public void setValue(Object value) {
        setText((value == null) ? "" : formatter.format(((Double) value)
                .doubleValue()));
    }
}
