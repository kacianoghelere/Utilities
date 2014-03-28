package br.com.gmp.comps.baloontip.src;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JTable;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.TableCellBalloonTip;
import net.java.balloontip.styles.ModernBalloonStyle;
import net.java.balloontip.styles.RoundedBalloonStyle;

/**
 * Utilitário para demonstração de balões de mensagens
 *
 * @author kaciano
 */
public class BalloonUtil {

    ModernBalloonStyle mbs = new ModernBalloonStyle(8, 8, new Color(255, 230, 166), new Color(255, 230, 166), Color.black);
    RoundedBalloonStyle rbs = new RoundedBalloonStyle(8, 8, new Color(255, 230, 166), Color.black);

    /**
     * Mostra um balão contendo a mensagem por um determinado periodo de tempo
     * (5 segundos)
     *
     * @param component <b>Component</b> Objeto de base
     * @param msg <b>String</b> Mensagem
     */
    public void showTimedBallon(final JComponent component, final String msg) {
        Thread tr = new Thread() {
            @Override
            public void run() {
                try {
                    BalloonTip balloon = new BalloonTip(component, msg, rbs, true);
                    sleep(5000);
                    balloon.closeBalloon();
                } catch (InterruptedException ex) {
                    Logger.getLogger(BalloonUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        tr.start();
    }

    /**
     * Mostra um balão contendo a mensagem por um determinado periodo de tempo
     *
     * @param component <b>Component</b> Objeto de base
     * @param msg <b>String</b> Mensagem
     * @param millis <b>Long</b> Tempo em milisegundos
     */
    public void showTimedBallon(final JComponent component, final String msg, final long millis) {
        Thread tr = new Thread() {
            @Override
            public void run() {
                try {
                    BalloonTip balloon = new BalloonTip(component, msg, rbs, true);
                    sleep(millis);
                    balloon.closeBalloon();
                } catch (InterruptedException ex) {
                    Logger.getLogger(BalloonUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        tr.start();
    }

    /**
     * Mostra um balão contendo a mensagem
     *
     * @param component <b>Component</b> Objeto de base
     * @param msg <b>String</b> Mensagem
     */
    public void showBallon(final JComponent component, final String msg) {
        BalloonTip balloon = new BalloonTip(component, msg, rbs, true);
    }

    /**
     * Mostra um balão arredondado contendo a mensagem
     *
     * @param component <b>Component</b> Objeto de base
     * @param msg <b>String</b> Mensagem
     */
    public void showRoundedBallon(final JComponent component, final String msg) {
        BalloonTip balloon = new BalloonTip(component, msg, rbs, true);
    }

    /**
     * Mostra um balão com design moderno contendo a mensagem
     *
     * @param component <b>Component</b> Objeto de base
     * @param msg <b>String</b> Mensagem
     */
    public void showModernBallon(final JComponent component, final String msg) {
        BalloonTip balloon = new BalloonTip(component, msg, mbs, true);
    }

    /**
     * Mostra balão de mensagem na tabela conforme a posição da celula indicada
     *
     * @param table
     * @param component
     * @param row
     * @param column
     */
    private void showTableBallon(JTable table, JComponent component, int row, int column) {
        BalloonTip ballon = new TableCellBalloonTip(table, component, row, column, rbs, null, null);
    }

}
