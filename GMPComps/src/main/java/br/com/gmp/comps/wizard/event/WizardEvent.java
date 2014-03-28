package br.com.gmp.comps.wizard.event;

import br.com.gmp.comps.wizard.task.panel.WizardTaskPanel;

/**
 *
 * @author kaciano
 */
public class WizardEvent {

    WizardTaskPanel task;

    public WizardEvent(WizardTaskPanel task) {
        this.task = task;
    }

    public WizardTaskPanel getTask() {
        return task;
    }

    public void setTask(WizardTaskPanel task) {
        this.task = task;
    }

}
