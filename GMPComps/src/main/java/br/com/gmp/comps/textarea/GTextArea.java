package br.com.gmp.comps.textarea;

import br.com.gmp.comps.GColors;
import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.ValidableComponent;
import br.com.gmp.comps.textarea.finder.GTextFinder;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;

/**
 * Área de texto customizada
 *
 * @author kaciano
 * @version 1.0
 */
public class GTextArea extends JTextArea implements ValidableComponent {

    private int maximum;
    private String invalidMsg = "Campo obrigatório!";
    private GTextFinder finder;

    /**
     * Cria nova instancia de GTextArea
     */
    public GTextArea() {
        this.maximum = 0;
        initComponents();
        this.finder = new GTextFinder(null, this);
    }

    /**
     * Cria nova instancia de GTextArea
     *
     * @param maximum {@code int} Comprimento maximo do texto
     */
    public GTextArea(int maximum) {
        this.maximum = maximum;
        initComponents();
        this.finder = new GTextFinder(null, this);
    }

    /**
     * Ação de componente em foco
     *
     * @param e FocusEvent
     */
    public void focusGained(FocusEvent e) {
        this.setBackground(GColors.FOCUS);
    }

    /**
     * Ação de componente sem foco
     *
     * @param e FocusEvent
     */
    public void focusLost(FocusEvent e) {
        this.setBackground(new JTextArea().getBackground());
    }

    /**
     * Controla o comprimento do texto
     */
    private void controlLength() {
        if (this.maximum != 0 && this.maximum < this.getText().length()) {
            this.setText(this.getText().substring(0, maximum - 1));
        }
    }

    /**
     * Verifica se o campo de texto está vazio
     *
     * @return {@code boolean} Resultado da verificação
     */
    public boolean isEmpty() {
        return getText().isEmpty();
    }

    /**
     * Retorna o comprimento maximo do texto
     *
     * @return {@code int} Comprimento maximo do texto
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * Modifica o comprimento maximo do texto
     *
     * @param maximum {@code int} Comprimento maximo do texto
     */
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public boolean validateComponent() {
        if (this.getText().length() > maximum) {
            return false;
        } else if (this.getText().equals("") || this.getText() == null || getText().isEmpty()) {
            new BalloonUtil().showTimedBallon(this, invalidMsg);
            return false;
        }
        return true;
    }

    /**
     * Valida o texto do componente
     *
     * @return {@code boolean} Resultado da validação
     */
    public boolean validateText() {
        if (this.getText().equals("") || this.getText() == null || getText().isEmpty()) {
            new BalloonUtil().showTimedBallon(this, invalidMsg);
            return false;
        }
        return true;
    }

    /**
     * Retorna a mensagem do componente
     *
     * @return {@code String} Mensagem do componente
     */
    public String getInvalidMsg() {
        return invalidMsg;
    }

    /**
     * Modifica a mensagem do componente
     *
     * @param invalidMsg {@code String} Mensagem do componente
     */
    public void setInvalidMsg(String invalidMsg) {
        this.invalidMsg = invalidMsg;
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMFind = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMICopy = new javax.swing.JMenuItem();
        jMICut = new javax.swing.JMenuItem();
        jMIPaste = new javax.swing.JMenuItem();

        jMFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/field/search.png"))); // NOI18N
        jMFind.setText("Buscar");
        jMFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFindActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMFind);
        jPopupMenu.add(jSeparator1);

        jMICopy.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMICopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/toolbar/controls/copy.png"))); // NOI18N
        jMICopy.setMnemonic('c');
        jMICopy.setText("<html>Copiar <b>Ctrl+C</b></html>");
        jMICopy.setToolTipText("Copiar conteudo para a área de transferencia");
        jMICopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICopyActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMICopy);

        jMICut.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMICut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/toolbar/controls/cut.png"))); // NOI18N
        jMICut.setMnemonic('x');
        jMICut.setText("<html>Recortar <b>Ctrl+X</b></html>");
        jMICut.setToolTipText("Recortar conteudo para a área de transferencia");
        jMICut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICutActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMICut);

        jMIPaste.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMIPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/toolbar/controls/paste.png"))); // NOI18N
        jMIPaste.setMnemonic('v');
        jMIPaste.setText("<html>Colar <b>Ctrl+V</b></html>");
        jMIPaste.setToolTipText("Colar conteudo da área de transferencia");
        jMIPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPasteActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMIPaste);

        setComponentPopupMenu(jPopupMenu);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        focusGained(evt);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        focusLost(evt);
    }//GEN-LAST:event_formFocusLost

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        controlLength();
    }//GEN-LAST:event_formKeyReleased

    private void jMFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFindActionPerformed
        finder.setVisible(true);
    }//GEN-LAST:event_jMFindActionPerformed

    private void jMICopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICopyActionPerformed
        this.copy();
    }//GEN-LAST:event_jMICopyActionPerformed

    private void jMICutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICutActionPerformed
        this.cut();
    }//GEN-LAST:event_jMICutActionPerformed

    private void jMIPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPasteActionPerformed
        this.paste();
    }//GEN-LAST:event_jMIPasteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMFind;
    private javax.swing.JMenuItem jMICopy;
    private javax.swing.JMenuItem jMICut;
    private javax.swing.JMenuItem jMIPaste;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
