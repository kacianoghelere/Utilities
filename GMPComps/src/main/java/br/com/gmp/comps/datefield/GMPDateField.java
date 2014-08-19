package br.com.gmp.comps.datefield;

import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.ValidableComponent;
import br.com.gmp.utils.formatter.MaskFormats;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;

/**
 * Componente seletor de datas
 *
 * @author kaciano
 * @version 1.0
 */
public class GMPDateField extends JFormattedTextField implements ValidableComponent {

    private Date date;
    private ImageIcon icon;

    /**
     * Creates new form GMPDateField
     */
    public GMPDateField() {
        initialize();
    }

    /**
     * Inicializa o componente
     */
    private void initialize() {
        initComponents();
        setMask();
        //setDate(new Date());
        this.setLayout(new BorderLayout());
        this.add(jBDate, BorderLayout.EAST);
        jPopDate.add(jPCalendar);
    }

    /**
     * Adiciona a mascara ao campo
     */
    private void setMask() {
        setFormatterFactory(new DefaultFormatterFactory(new MaskFormats()
                .getMask(MaskFormats.DATE)));
    }

    /**
     * Retorna a data selecionada
     *
     * @return Date Data selecionada
     * @throws ParseException
     */
    public Date getDate() throws ParseException {
        return date;
    }

    /**
     * Modifica a data
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
        this.gCalendar.setDate(date);
        setText(new SimpleDateFormat("dd/MM/yyyy").format(date));
    }

    /**
     * Vai para o próximo mês
     */
    public void nextMonth() {
        if (date.getMonth() == 12) {
            date.setMonth(1);
            date.setYear(date.getYear() + 1);
        } else {
            date.setMonth(date.getMonth() + 1);
        }
        setDate(date);
    }

    /**
     * Volta para o mês anterior
     */
    public void previousMonth() {
        if (date.getMonth() == 1) {
            date.setMonth(12);
            date.setYear(date.getYear() - 1);
        } else {
            date.setMonth(date.getMonth() - 1);
        }
        setDate(date);
    }

    /**
     * Vai para o próximo ano
     */
    public void nextYear() {
        date.setYear(date.getYear() + 1);
        setDate(date);
    }

    /**
     * Volta ao ano anterior
     */
    public void previousYear() {
        date.setYear(date.getYear() - 1);
        setDate(date);
    }

    /**
     * Ação de componente em foco
     *
     * @param e FocusEvent
     */
    public void focusGained(FocusEvent e) {
        this.setBackground(new Color(255, 230, 166));
    }

    /**
     * Ação de componente sem foco
     *
     * @param e FocusEvent
     */
    public void focusLost(FocusEvent e) {
        this.setBackground(new JTextField().getBackground());
        if (getText().equals("") || getText() == null) {
            setDate(date);
        }
    }

    @Override
    public boolean validateComponent() {
        try {
            new SimpleDateFormat("dd/MM/yyyy").parse(this.getText());
            return true;
        } catch (ParseException e) {
            new BalloonUtil().showTimedBallon(this, "Data invalida!");
            return false;
        }
    }

    /**
     * Mostra a PopUp de seleção de datas
     */
    private void openPopUp() {
        jBDate.setComponentPopupMenu(jPopDate);
        jBDate.getComponentPopupMenu().show(jBDate.getParent(), 0, getHeight());
    }

    /**
     * Verifica o status do PopUp
     */
    private void checkPop() {
        if (jPopDate.isShowing()) {
            jPopDate.setVisible(false);
        } else {
            jPopDate.show(jBDate.getParent(), 0, getHeight());
        }
    }

    /**
     * Ações das teclas pressionadas
     *
     * @param evt {@code KeyEvent} Dados do evento
     */
    private void keyControls(java.awt.event.KeyEvent evt) {
        if (isFocusOwner()) {
            switch (evt.getKeyCode()) {
                // Seta para cima pressionada
                case KeyEvent.VK_UP:
                    nextYear();
                    break;
                // Seta para baixo pressionada
                case KeyEvent.VK_DOWN:
                    previousYear();
                    break;
                // Seta para direita pressionada
                case KeyEvent.VK_RIGHT:
                    nextMonth();
                    break;
                // Seta para esquerda pressionada
                case KeyEvent.VK_LEFT:
                    previousMonth();
                    break;
            }
        }
    }

    /**
     * Retorna o mês atual do seletor de datas em Integer
     *
     * @return {@code Integer} Mês atual do seletor de datas
     */
    public Integer getMonth() {
        return gCalendar.getDate().getMonth();
    }

    /**
     * Retorna o ano atual do seletor de datas em Integer
     *
     * @return {@code Integer} Ano atual do seletor de datas
     */
    public Integer getYear() {
        return gCalendar.getDate().getYear();
    }

    /**
     * Retorna o icone do seletor de datas
     *
     * @return {@code ImageIcon} Icone do seletor de datas
     */
    public ImageIcon getIcon() {
        return icon;
    }

    /**
     * Modifica o icone do seletor de datas
     *
     * @param icon {@code ImageIcon} Icone do seletor de datas
     */
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    /**
     * Método chamado quando há um clique no calendario
     *
     * @param evt {@code java.awt.event.MouseEvent} Evento do mouse
     */
    private void calendarClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {            
            setDate(gCalendar.getDate());
            checkPop();
        } else {
            setDate(gCalendar.getDate());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopDate = new javax.swing.JPopupMenu();
        jBDate = new javax.swing.JButton();
        jPCalendar = new javax.swing.JPanel();
        gCalendar = new br.com.gmp.comps.calendar.GCalendar();

        jPopDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPopDate.setMaximumSize(new java.awt.Dimension(32253, 32270));
        jPopDate.setMinimumSize(new java.awt.Dimension(253, 230));

        jBDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/date/date.png"))); // NOI18N
        jBDate.setToolTipText("Escolher data");
        jBDate.setMaximumSize(new java.awt.Dimension(26, 26));
        jBDate.setMinimumSize(new java.awt.Dimension(26, 26));
        jBDate.setPreferredSize(new java.awt.Dimension(26, 26));
        jBDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDateActionPerformed(evt);
            }
        });

        jPCalendar.setMaximumSize(new java.awt.Dimension(253, 230));
        jPCalendar.setMinimumSize(new java.awt.Dimension(253, 230));
        jPCalendar.setPreferredSize(new java.awt.Dimension(253, 230));

        gCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gCalendarMouseClicked(evt);
            }
        });
        gCalendar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gCalendarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPCalendarLayout = new javax.swing.GroupLayout(jPCalendar);
        jPCalendar.setLayout(jPCalendarLayout);
        jPCalendarLayout.setHorizontalGroup(
            jPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );
        jPCalendarLayout.setVerticalGroup(
            jPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        setToolTipText("<html>\nComandos padrão do seletor de datas:\n<ul>\n<li style='text-size:10px;'>Teclar <b>Cima</b> avança um ano</li>\n<li style='text-size:10px;'>Teclar <b>Baixo</b> volta um ano</li>\n<li style='text-size:10px;'>Teclar <b>Direita</b> avança um mês</li>\n<li style='text-size:10px;'>Teclar <b>Esquerda</b> volta um mês</li>\n</ul>\n</html>");
        setComponentPopupMenu(jPopDate);
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

    private void jBDatePickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDatePickActionPerformed

    }//GEN-LAST:event_jBDatePickActionPerformed

    private void jFTDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTDateFocusGained

    }//GEN-LAST:event_jFTDateFocusGained

    private void jFTDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTDateFocusLost

    }//GEN-LAST:event_jFTDateFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        focusGained(evt);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        focusLost(evt);
    }//GEN-LAST:event_formFocusLost

    private void jBDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDateActionPerformed
        checkPop();
    }//GEN-LAST:event_jBDateActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        keyControls(evt);
    }//GEN-LAST:event_formKeyReleased

    private void gCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gCalendarMouseClicked
        calendarClicked(evt);
    }//GEN-LAST:event_gCalendarMouseClicked

    private void gCalendarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gCalendarFocusLost
        setDate(gCalendar.getDate());
    }//GEN-LAST:event_gCalendarFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.calendar.GCalendar gCalendar;
    private javax.swing.JButton jBDate;
    private javax.swing.JPanel jPCalendar;
    private javax.swing.JPopupMenu jPopDate;
    // End of variables declaration//GEN-END:variables

}
