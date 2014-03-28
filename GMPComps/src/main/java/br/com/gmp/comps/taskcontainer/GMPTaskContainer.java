package br.com.gmp.comps.taskcontainer;

import br.com.gmp.comps.taskpane.GMPTaskPane;
import br.com.gmp.comps.ui.GMPTaskPaneUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import org.jdesktop.swingx.JXTaskPane;

/**
 * Componente responsavel pelo agrupamento das JXTaskPanes
 *
 * @author kaciano
 * @since 1.0
 * @version 1.0
 */
public class GMPTaskContainer extends org.jdesktop.swingx.JXTaskPaneContainer {

    private boolean accordion = true;
    private Color initialColor;
    private Color finalColor;
    private Color textColor;
    private Color highlight;

    /**
     * Cria novo GMPTaskContainer
     */
    public GMPTaskContainer() {
        initComponents();
    }

    /**
     * Cria novo GMPTaskContainer
     *
     * @param highlight Cor de realce
     */
    public GMPTaskContainer(Color highlight) {
        this.highlight = highlight;
        initComponents();
    }

    /**
     * Cria novo GMPTaskContainer
     *
     * @param tasks Lista de JXTaskPane's
     */
    public GMPTaskContainer(List<JXTaskPane> tasks) {
        initComponents();
        addMultiple(tasks);
    }

    @Override
    public Component add(Component comp) {
        if (comp instanceof GMPTaskPane) {
            GMPTaskPane task = (GMPTaskPane) comp;
            addListeners(task);
            return super.add(task);
        } else {
            return super.add(comp);
        }
    }

    /**
     * Adiciona multiplas JXTaskPane's
     *
     * @param tasks Lista de JXTaskPane's
     */
    private void addMultiple(List<JXTaskPane> tasks) {
        for (JXTaskPane task : tasks) {
            this.add(task);
            this.revalidate();
            this.repaint();
        }
    }

    /**
     * Adiciona multiplas JXTaskPane's
     *
     * @param tasks List<JXTaskPane> Lista de Tasks
     */
    public void addMultipleTasks(List<JXTaskPane> tasks) {
        addMultiple(tasks);
    }

    /**
     * Modifica a JXTaskPane para entrar no layout
     *
     * @param task JXTaskPane a ser formatada
     */
    public void formatTask(JXTaskPane task) {
        task.setUI(new GMPTaskPaneUI());
        addListeners(task);
        task.setCollapsed(true);
    }

    /**
     * Adiciona os listeners especificos
     *
     * @param task JXTaskPane Receptor do listener
     */
    public void addListeners(JXTaskPane task) {
        if (accordion) {
            task.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent me) {
                    JXTaskPane task;
                    for (Component c : getComponents()) {
                        if (c instanceof JXTaskPane) {
                            task = (JXTaskPane) c;
                            if (task != me.getComponent()) {
                                task.setCollapsed(true);
                            }
                        }
                    }
                }
            });
        }
    }

    /**
     * Modifica a JXTaskPane para entrar no layout
     *
     * @param tasks List<JXTaskPane> Lista a ser formatada
     */
    public void formatTasks(List<JXTaskPane> tasks) {
        for (JXTaskPane task : tasks) {
            task.setUI(new GMPTaskPaneUI());
            if (accordion) {
                task.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent me) {
                        JXTaskPane task;
                        for (Component c : getComponents()) {
                            if (c instanceof JXTaskPane) {
                                task = (JXTaskPane) c;
                                if (task != me.getComponent()) {
                                    task.setCollapsed(true);
                                }
                            }
                        }
                    }
                });
            }
            task.setCollapsed(true);
        }
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     *
     * @return
     */
    public boolean isAccordion() {
        return accordion;
    }

    /**
     *
     * @param accordion
     */
    public void setAccordion(boolean accordion) {
        this.accordion = accordion;
    }

    public Color getInitialColor() {
        return initialColor;
    }

    /**
     *
     * @param initialColor
     */
    public void setInitialColor(Color initialColor) {
        this.initialColor = initialColor;
    }

    /**
     *
     * @return
     */
    public Color getFinalColor() {
        return finalColor;
    }

    /**
     *
     * @param finalColor
     */
    public void setFinalColor(Color finalColor) {
        this.finalColor = finalColor;
    }

    /**
     *
     * @return
     */
    public Color getTextColor() {
        return textColor;
    }

    /**
     *
     * @param textColor
     */
    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    /**
     * Retorna a cor de realce
     *
     * @return Color Cor de realce
     */
    public Color getHighlight() {
        return this.highlight;
    }

    /**
     * Modifica a cor de realce
     *
     * @param highlight Nova cor de realce
     */
    public void setHighlight(Color highlight) {
        this.highlight = highlight;
    }

    //</editor-fold>
    /**
     * Dados gerados automaticamente pelo IDE
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(51, 102, 255));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        setLayout(verticalLayout1);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
