package br.com.gmp.comps.wizard.listener;

import br.com.gmp.comps.wizard.task.panel.WizardTaskPanel;
import java.util.List;

/**
 *
 * @author kaciano
 */
public interface WizardListener {

    /**
     * Voltar para a task anterior
     */
    void previous();

    /**
     * Ir para próxima task
     */
    void next();

    /**
     * Cancelar o Wizard
     */
    void cancel();

    /**
     * Mostrar informações
     */
    void info();

    /**
     * Retorna a lista das tarefas
     *
     * @return Lista das tarefas
     */
    List<WizardTaskPanel> getTaskList();
}
