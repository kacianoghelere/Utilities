package br.com.gmp.utils.interact;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Classe com utilidades de janelas
 *
 * @author kaciano
 */
public class WindowUtil {

    /**
     * Mostra mensagem de confirmação e retorna a escolha do usuário
     *
     * @param parent Componente pai (Não obrigatório)
     * @param title Titulo do frame
     * @param text Mensagem para o usuário
     * @return Escolha do usuário
     */
    public static boolean confirmation(Component parent, String title, String text) {
        return confirmation(parent, title, text, "Sim", "Não");
    }

    /**
     * Mostra mensagem de confirmação e retorna a escolha do usuário
     *
     * @param parent Componente pai (Não obrigatório)
     * @param title Titulo do frame
     * @param text Mensagem para o usuário
     * @param yes Texto do botão de confirmação
     * @param no Texto do botão de cancelamento
     * @return Escolha do usuário
     */
    public static boolean confirmation(Component parent, String title, String text, String yes, String no) {
        boolean opt = false;
        int opcao;
        Object[] buttons = {yes, no};
        opcao = JOptionPane.showOptionDialog(parent, text, title,
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, buttons, buttons[0]);
        if (opcao == JOptionPane.OK_OPTION) {
            opt = true;
        }
        return opt;
    }

}
