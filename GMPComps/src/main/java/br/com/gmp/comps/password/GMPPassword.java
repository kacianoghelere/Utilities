package br.com.gmp.comps.password;

import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.ValidableComponent;
import javax.swing.JPasswordField;

/**
 * Campo de senhas
 *
 * @author kaciano
 * @version 1.0
 * @see javax.swing.JPasswordField
 */
public class GMPPassword extends JPasswordField implements ValidableComponent {

    private int minLength;

    /**
     * Cria nova instancia de GMPPassword
     */
    public GMPPassword() {
        minLength = 0;
        initComponents();
    }

    /**
     * Cria nova instancia de GMPPassword
     *
     * @param minLength {@code int} Comprimento minimo
     */
    public GMPPassword(int minLength) {
        this.minLength = minLength;
        initComponents();
    }

    @Override
    public boolean validateComponent() {
        if (this.minLength != 0) {
            if (this.getText().length() < this.minLength) {
                new BalloonUtil().showTimedBallon(this, "O comprimento minimo é "
                        + minLength);
            }
            return this.getText().length() >= this.minLength;
        } else {
            return true;
        }
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna o comprimento minimo do texto
     *
     * @return {@code int} Comprimento minimo
     */
    public int getMinLength() {
        return minLength;
    }

    /**
     * Modifica o comprimento minimo do texto
     *
     * @param minLength {@code int} Comprimento minimo
     */
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
    //</editor-fold>
    /**
     * Dados gerados automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
