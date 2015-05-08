package br.com.gmp.comps.baloontip.src;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
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

    /**
     * Tipo de mensagem para erros
     */
    public static int ERROR_MSG = 4;

    /**
     * Tipo de mensagem para informação
     */
    public static int INFORMATIVE_MSG = 1;

    /**
     * Tipo de mensagem para questionamento
     */
    public static int QUESTION_MSG = 2;

    /**
     * Tipo de mensagem para secesso
     */
    public static int SUCCESS_MSG = 5;

    /**
     * Tipo de mensagem para avisos
     */
    public static int WARNING_MSG = 3;

    /**
     * Icone de mensagem para erros
     */
    public static String ERROR_ICON = "/ComponentIcons/transition/toolbar/4.png";

    /**
     * Icone de mensagem para informação
     */
    public static String INFORMATIVE_ICON = "/ComponentIcons/transition/toolbar/1.png";

    /**
     * Icone de mensagem para questionamento
     */
    public static String QUESTION_ICON = "/ComponentIcons/transition/toolbar/2.png";

    /**
     * Icone de mensagem para secesso
     */
    public static String SUCCESS_ICON = "/ComponentIcons/transition/toolbar/5.png";

    /**
     * Icone de mensagem para avisos
     */
    public static String WARNING_ICON = "/ComponentIcons/transition/toolbar/3.png";
    private final ModernBalloonStyle mbs = new ModernBalloonStyle(8, 8, new Color(255, 230, 166), new Color(255, 230, 166), Color.black);
    private final RoundedBalloonStyle rbs = new RoundedBalloonStyle(8, 8, new Color(255, 230, 166), Color.black);

    /**
     * Mostra um balão contendo a mensagem por um determinado periodo de tempo
     * (5 segundos)
     *
     * @param component {@code Component} Objeto de base
     * @param msg {@code String} Mensagem
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
     * (5 segundos)
     *
     * @param component {@code Component} Objeto de base
     * @param msg {@code String} Mensagem
     * @param type {@code int} Tipo de Mensagem
     */
    public void showStatusBallon(final JComponent component, final String msg, final int type) {
        Thread tr = new Thread() {
            @Override
            public void run() {
                try {
                    JLabel label = new JLabel(msg, getIcon(type), JLabel.RIGHT);
                    BalloonTip balloon = new BalloonTip(component, label, rbs, true);
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
     * Retorna o icone do tipo baseado no identificador recebido
     *
     * @param type {@code int} Identificador de tipo
     * @return {@code ImageIcon} Icone
     */
    private ImageIcon getIcon(int type) {
        URL path = null;
        switch (type) {
            case 1:
                path = getClass().getResource(INFORMATIVE_ICON);
                break;
            case 2:
                path = getClass().getResource(QUESTION_ICON);
                break;
            case 3:
                path = getClass().getResource(WARNING_ICON);
                break;
            case 4:
                path = getClass().getResource(ERROR_ICON);
                break;
            case 5:
                path = getClass().getResource(SUCCESS_ICON);
                break;
            default:
                throw new AssertionError();
        }
        return new ImageIcon(path);
    }

    /**
     * Mostra um balão contendo a mensagem por um determinado periodo de tempo
     *
     * @param component {@code Component} Objeto de base
     * @param msg {@code String} Mensagem
     * @param millis {@code Long} Tempo em milisegundos
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
     * @param component {@code Component} Objeto de base
     * @param msg {@code String} Mensagem
     */
    public void showBallon(final JComponent component, final String msg) {
        BalloonTip balloon = new BalloonTip(component, msg, rbs, true);
    }

    /**
     * Mostra um balão arredondado contendo a mensagem
     *
     * @param component {@code Component} Objeto de base
     * @param msg {@code String} Mensagem
     */
    public void showRoundedBallon(final JComponent component, final String msg) {
        BalloonTip balloon = new BalloonTip(component, msg, rbs, true);
    }

    /**
     * Mostra um balão com design moderno contendo a mensagem
     *
     * @param component {@code Component} Objeto de base
     * @param msg {@code String} Mensagem
     */
    public void showModernBallon(final JComponent component, final String msg) {
        BalloonTip balloon = new BalloonTip(component, msg, mbs, true);
    }

    /**
     * Mostra balão de mensagem na tabela conforme a posição da celula indicada
     *
     * @param table {@code JTable} Tabela
     * @param component {@code Component} Componente de base
     * @param row {@code int} Linha da tabela
     * @param column {@code int} Coluna da tabela
     */
    public void showTableBallon(JTable table, JComponent component, int row, int column) {
        BalloonTip ballon = new TableCellBalloonTip(table, component, row, column, rbs, null, null);
    }

}
