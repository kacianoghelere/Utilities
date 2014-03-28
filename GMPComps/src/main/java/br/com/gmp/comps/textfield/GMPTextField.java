package br.com.gmp.comps.textfield;

import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.ValidableComponent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 * Extensão de JTextField que implementa validação customizada entre outras
 * melhorias
 *
 * @author kaciano
 * @version 1.0
 * @since 1.0
 */
public class GMPTextField extends JTextField implements ValidableComponent, KeyListener {

    private String placeholder = "";
    private String invalidMsg = "Invalido";
    private Icon icon = new ImageIcon();
    private int minimallength = 0;
    private int maximumlength = 999999;
    private boolean force = false;

    /**
     * Cria nova instancia de GMPTextField
     */
    public GMPTextField() {
        initialize();
    }

    /**
     * Cria nova instancia de GMPTextField
     *
     * @param doc <code>Document</code> Documento do componente
     * @param text <code>String</code> Texto do componente
     * @param columns <code>int</code> Quantidade de colunas
     */
    public GMPTextField(Document doc, String text, int columns) {
        super(doc, text, columns);
        initialize();
    }

    /**
     * Cria nova instancia de GMPTextField
     *
     * @param placeholder <code>String</code> Texto que ficará no componente
     * enquanto ele estiver vazio
     * @param icon <code>Icon</code> Icone do componente
     */
    public GMPTextField(String placeholder, Icon icon) {
        this.placeholder = placeholder;
        this.icon = icon;
        initialize();
    }

    /**
     * Cria nova instancia de GMPTextField
     *
     * @param icon <code>Icon</code> Icone do componente
     */
    public GMPTextField(Icon icon) {
        this.icon = icon;
        initialize();
    }

    /**
     * Cria nova instancia de GMPTextField
     *
     * @param minimallength <code>int</code> Comprimento mínimo do texto
     * @param maximumlength <code>int</code> Comprimento máximo do texto
     * @param force <code>boolean</code> Forçar o campo a obedecer as regras?
     */
    public GMPTextField(int minimallength, int maximumlength, boolean force) {
        this.minimallength = minimallength;
        this.maximumlength = maximumlength;
        this.force = force;
        initialize();
    }

    /**
     * Cria nova instancia de GMPTextField
     *
     * @param placeholder <code>String</code> Texto que ficará no componente
     * enquanto ele estiver vazio
     * @param icon <code>Icon</code> Icone do componente
     * @param minimallength <code>int</code> Comprimento mínimo do texto
     * @param maximumlength <code>int</code> Comprimento máximo do texto
     * @param force <code>boolean</code> Forçar o campo a obedecer as regras?
     */
    public GMPTextField(String placeholder, Icon icon, int minimallength,
            int maximumlength, boolean force) {
        this.placeholder = placeholder;
        this.icon = icon;
        this.minimallength = minimallength;
        this.maximumlength = maximumlength;
        this.force = force;
        initialize();
    }

    /**
     * Inicializa o componente
     */
    private void initialize() {
        initComponents();
        if (icon != null) {
            this.setLayout(new BorderLayout());
            this.add(new JLabel(icon), BorderLayout.EAST);
        }
    }

    /**
     * Controla o comprimento do texto
     */
    private void controlLength() {
        if (this.maximumlength < this.getText().length()) {
            this.setText(this.getText().substring(0, maximumlength - 1));
        }
    }

    @Override
    public boolean validateComponent() {
        if (this.minimallength != 0 && this.minimallength < this.getText().length()) {
            new BalloonUtil().showModernBallon(this, invalidMsg);
            return false;
        } else if (this.getText().equals("") || this.getText() == null) {
            new BalloonUtil().showModernBallon(this, invalidMsg);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            this.nextFocus();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (force) {
            controlLength();
        }
    }

    /**
     * Ação de componente em foco
     *
     * @param e FocusEvent
     */
    public void focusGained(FocusEvent e) {
        this.setBackground(new Color(255, 230, 166));
        if (this.getText().equals(this.placeholder)) {
            this.setForeground(new JTextField().getForeground());
            this.setText("");
        }
    }

    /**
     * Ação de componente sem foco
     *
     * @param e FocusEvent
     */
    public void focusLost(FocusEvent e) {
        this.setBackground(new JTextField().getBackground());
        if (this.getText().equals("") && !this.placeholder.equals("")) {
            this.setForeground(Color.GRAY.brighter());
            this.setText(this.placeholder);
        }
    }

    /**
     * Retorna o valor Boolean do texto
     *
     * @return <code>Boolean</code> Valor Boolean do texto
     */
    public Boolean getBoolean() {
        try {
            return Boolean.getBoolean(getText());
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /**
     * Modifica o valor conforme o boolean recebido
     *
     * @param value <code>boolean</code> Valor Boolean do texto
     */
    public void setBoolean(boolean value) {
        setText(String.valueOf(value));
    }

    /**
     * Retorna o valor Integer do texto
     *
     * @return <code>Integer</code> Valor Integer do texto
     */
    public Integer getInteger() {
        try {
            return Integer.parseInt(getText());
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /**
     * Modifica o valor conforme o int recebido
     *
     * @param value <code>int</code> Valor Boolean do texto
     */
    public void setInt(int value) {
        setText(String.valueOf(value));
    }

    /**
     * Retorna o valor Long do texto
     *
     * @return <code>Long</code> Valor Long do texto
     */
    public Long getLong() {
        try {
            return Long.parseLong(getText());
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /**
     * Modifica o valor conforme o long recebido
     *
     * @param value <code>long</code> Valor Boolean do texto
     */
    public void setLong(long value) {
        setText(String.valueOf(value));
    }

    /**
     * Conteúdo gerado automáticamente pela IDEs
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopActions = new javax.swing.JPopupMenu();
        jMICopy = new javax.swing.JMenuItem();
        jMICut = new javax.swing.JMenuItem();
        jMIPaste = new javax.swing.JMenuItem();

        jMICopy.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMICopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textfield/16/documents.png"))); // NOI18N
        jMICopy.setMnemonic('c');
        jMICopy.setText("<html>Copiar <b>Ctrl+C</b></html>");
        jMICopy.setToolTipText("Copiar conteudo para a área de transferencia");
        jMICopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICopyActionPerformed(evt);
            }
        });
        jPopActions.add(jMICopy);

        jMICut.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMICut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textfield/16/document_remove.png"))); // NOI18N
        jMICut.setMnemonic('x');
        jMICut.setText("<html>Recortar <b>Ctrl+X</b></html>");
        jMICut.setToolTipText("Recortar conteudo para a área de transferencia");
        jMICut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICutActionPerformed(evt);
            }
        });
        jPopActions.add(jMICut);

        jMIPaste.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jMIPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/textfield/16/document_add.png"))); // NOI18N
        jMIPaste.setMnemonic('v');
        jMIPaste.setText("<html>Colar <b>Ctrl+V</b></html>");
        jMIPaste.setToolTipText("Colar conteudo da área de transferencia");
        jMIPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPasteActionPerformed(evt);
            }
        });
        jPopActions.add(jMIPaste);

        setComponentPopupMenu(jPopActions);
        setMinimumSize(new java.awt.Dimension(5, 28));
        setPreferredSize(new java.awt.Dimension(100, 28));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void jMICopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICopyActionPerformed
        this.copy();
    }//GEN-LAST:event_jMICopyActionPerformed

    private void jMICutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICutActionPerformed
        this.cut();
    }//GEN-LAST:event_jMICutActionPerformed

    private void jMIPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPasteActionPerformed
        this.paste();
    }//GEN-LAST:event_jMIPasteActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        focusGained(evt);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        focusLost(evt);
    }//GEN-LAST:event_formFocusLost

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    public String getInvalidMsg() {
        return invalidMsg;
    }

    public void setInvalidMsg(String invalidMsg) {
        this.invalidMsg = invalidMsg;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getMinimallength() {
        return minimallength;
    }

    public void setMinimallength(int minimallength) {
        this.minimallength = minimallength;
    }

    public int getMaximumlength() {
        return maximumlength;
    }

    public void setMaximumlength(int maximumlength) {
        this.maximumlength = maximumlength;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    //</editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMICopy;
    private javax.swing.JMenuItem jMICut;
    private javax.swing.JMenuItem jMIPaste;
    private javax.swing.JPopupMenu jPopActions;
    // End of variables declaration//GEN-END:variables
}
