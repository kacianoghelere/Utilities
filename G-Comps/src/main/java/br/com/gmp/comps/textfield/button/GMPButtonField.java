package br.com.gmp.comps.textfield.button;

import br.com.gmp.comps.textfield.GTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;

/**
 *
 * @author kaciano
 */
public class GMPButtonField extends GTextField {

    private String buttonPosition;
    private ActionListener actionListener;

    /**
     * Cria nova instancia de GMPButtonField
     */
    public GMPButtonField() {
        this.buttonPosition = BorderLayout.EAST;
        this.actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nenhuma função implementada.");
            }
        };
        initialize();
    }

    /**
     * Cria nova instancia de GMPButtonField
     *
     * @param actionListener {@code ActionListener{@code  Ação do botão
     */
    public GMPButtonField(ActionListener actionListener) {
        this.buttonPosition = BorderLayout.EAST;
        this.actionListener = actionListener;
        initialize();
    }

    /**
     * Cria nova instancia de GMPButtonField
     *
     * @param buttonPosition {@code String{@code  Posição dos botões
     * @param actionListener {@code ActionListener{@code  Ação do botão
     */
    public GMPButtonField(String buttonPosition, ActionListener actionListener) {
        this.buttonPosition = buttonPosition;
        this.actionListener = actionListener;
        initialize();
    }

    /**
     * Cria nova instancia de GMPButtonField
     *
     * @param icon {@code Icon{@code  Icone do botão
     * @param buttonPosition {@code String{@code  Posição dos botões
     * @param actionListener
     */
    public GMPButtonField(Icon icon, String buttonPosition, ActionListener actionListener) {
        super(icon);
        this.buttonPosition = buttonPosition;
        this.actionListener = actionListener;
        initialize();
    }

    /**
     * Metodo de inicialização
     */
    private void initialize() {
        initComponents();
        jButton.addActionListener(actionListener);
        if (getIcon() != null) {
            jButton.setText(null);
            jButton.setIcon(getIcon());
        }
        this.setLayout(new BorderLayout());
        this.add(jButton, buttonPosition);
    }

    @Override
    public void setIcon(Icon icon) {
        super.setIcon(icon);
        jButton.setIcon(icon);
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna a posição do botão
     *
     * @return {@code String{@code  Posição dos botões
     */
    public String getButtonPosition() {
        return buttonPosition;
    }

    /**
     * Modifica a posição do botão
     *
     * @param buttonPosition {@code String{@code  Posição dos botões
     */
    public void setButtonPosition(String buttonPosition) {
        this.buttonPosition = buttonPosition;
    }

    /**
     * Retorna o ActionListener do botão
     *
     * @return {@code ActionListener{@code  Ação do botão
     */
    public ActionListener getActionListener() {
        return actionListener;
    }

    /**
     * Modifica o ActionListener do botão
     *
     * @param actionListener {@code ActionListener{@code  Ação do botão
     */
    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    //</editor-fold>
    
    /**
     * Dados gerados automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton = new javax.swing.JButton();

        jButton.setText("...");
        jButton.setMaximumSize(new java.awt.Dimension(26, 26));
        jButton.setMinimumSize(new java.awt.Dimension(26, 26));
        jButton.setPreferredSize(new java.awt.Dimension(26, 26));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    // End of variables declaration//GEN-END:variables
}
