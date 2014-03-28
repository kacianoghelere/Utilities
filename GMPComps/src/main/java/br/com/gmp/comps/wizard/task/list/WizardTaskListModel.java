package br.com.gmp.comps.wizard.task.list;

import br.com.gmp.comps.wizard.task.panel.WizardTaskPanel;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 * Modelo da WizardTaskList
 *
 * @author kaciano
 */
public class WizardTaskListModel extends AbstractListModel<WizardTaskPanel> {

    private List<WizardTaskPanel> taskList;

    /**
     * Cria novo Modelo da WizardTaskList
     *
     * @param taskList Lista de WizardTasks
     */
    public WizardTaskListModel(List<WizardTaskPanel> taskList) {
        this.taskList = taskList;
    }

    /**
     * Adiciona um novo WizardTask
     *
     * @param task WizardTask
     */
    public void add(WizardTaskPanel task) {
        taskList.add(task);
    }

    /**
     * Remove o WizardTask
     *
     * @param task WizardTask
     * @return A lista contem a WizardTask?
     */
    public boolean remove(WizardTaskPanel task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSize() {
        return taskList.size();
    }

    @Override
    public WizardTaskPanel getElementAt(int index) {
        return taskList.get(index);
    }

    /**
     * Retorna a WizardTask no endereço recebido
     *
     * @param index Endereço da WizardTask
     * @return WizardTask
     */
    public WizardTaskPanel getTaskAt(int index) {
        return taskList.get(index);
    }

    /**
     *
     * @return
     */
    public List<WizardTaskPanel> getTaskList() {
        return taskList;
    }

    /**
     *
     * @param taskList
     */
    public void setTaskList(List<WizardTaskPanel> taskList) {
        this.taskList = taskList;
    }

}
