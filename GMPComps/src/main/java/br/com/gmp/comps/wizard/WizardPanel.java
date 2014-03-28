package br.com.gmp.comps.wizard;

import br.com.gmp.comps.wizard.listener.WizardListener;
import br.com.gmp.comps.wizard.task.panel.WizardTaskPanel;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Painel de gerenciamento para fluxo de processos
 *
 * @author kaciano
 * @version 1.0
 * @since 1.0
 */
public class WizardPanel extends JPanel implements WizardListener {

    private WizardListener event;
    private WizardTaskPanel activeTask;
    private List<WizardTaskPanel> taskList;

    /**
     * Cria nova instancia de WizardPanel
     */
    public WizardPanel() {
        this.event = null;
        this.taskList = new LinkedList<>();
        initialize();
    }

    /**
     * Cria nova instancia de WizardPanel
     *
     * @param event WizardListener
     */
    public WizardPanel(WizardListener event) {
        this.event = event;
        this.taskList = event.getTaskList();
        initialize();
    }

    /**
     * Cria nova instancia de WizardPanel
     *
     * @param event WizardListener
     * @param taskList Lista de tarefas
     */
    public WizardPanel(WizardListener event, List<WizardTaskPanel> taskList) {
        this.event = event;
        this.taskList = taskList;
        initialize();
    }

    /**
     * Inicializa os dados
     */
    private void initialize() {
        initComponents();
        if (taskList.isEmpty()) {
            this.taskList.add(testTask);
            setActiveTaskPanel(taskList.get(0));
        } else {
            setActiveTaskPanel(taskList.get(0));
        }
    }

    /**
     *
     */
    private void recharge() {
        if (taskList.isEmpty()) {
            this.taskList.add(testTask);
            setActiveTaskPanel(taskList.get(0));
        } else {
            setActiveTaskPanel(taskList.get(0));
        }
    }

    @Override
    public void previous() {
        int index = taskList.indexOf(activeTask);
        if (index != 0) {
            setActiveTaskPanel(taskList.get(index - 1));
        } else {
            System.out.println("First task!");
        }
    }

    @Override
    public void next() {
        int index = taskList.indexOf(activeTask);
        if (index != taskList.size() - 1) {
            setActiveTaskPanel(taskList.get(index + 1));
        } else {
            System.out.println("Last task!");
        }
    }

    @Override
    public void cancel() {

    }

    @Override
    public void info() {

    }

    /**
     * Adiciona nova WizardTaskPanel à lista
     *
     * @param task WizardTaskPanel
     */
    public void addTask(WizardTaskPanel task) {
        this.taskList.add(task);
        setHeader(taskList.get(0));
    }

    /**
     * Remove a WizardTaskPanel da lista
     *
     * @param task WizardTaskPanel
     */
    public void removeTask(WizardTaskPanel task) {
        if (this.taskList.contains(task)) {
            this.taskList.remove(task);
        }
    }

    /**
     * Modifica o painel da tarefa atual
     *
     * @param task Painel da task
     */
    public void setActiveTaskPanel(WizardTaskPanel task) {
        this.activeTask = task;
        this.jPContent.removeAll();
        this.jPContent.add(activeTask);
        this.jPContent.repaint();
        this.jPContent.revalidate();
        this.setHeader(activeTask);
        this.setActualTask(activeTask);
        this.loadTaskList(taskList);
        this.checkActiveIndex();
        System.out.println("Now displaying " + activeTask.getName());
    }

    /**
     * Verifica a posição do ActiveTask para controlar os comandos
     */
    private void checkActiveIndex() {
        int index = taskList.indexOf(activeTask);
        if (index != 0) {
            gBPrevious.setEnabled(true);
        } else {
            gBPrevious.setEnabled(false);
        }
        if (index != taskList.size() - 1) {
            gBNext.setEnabled(true);
        } else {
            gBNext.setEnabled(false);
        }
    }

    /**
     * Modifica os dados do cabeçalho
     *
     * @param title Titulo do cabeçalho
     * @param description Descrição do cabeçalho
     */
    public void setHeader(String title, String description) {
        this.jLTaskTitle.setText(title);
        this.jLTaskDescription.setText(description);
    }

    /**
     * Modifica os dados do cabeçalho
     *
     * @param task WizardTaskPanel
     */
    public void setHeader(WizardTaskPanel task) {
        this.jLTaskTitle.setText(task.getTitle());
        this.jLTaskDescription.setText(task.getDescription());
    }

    /**
     * Carrega a lista de tarefas
     *
     * @param tasklist Lista de tarefas
     */
    private void loadTaskList(List<WizardTaskPanel> tasklist) {
        this.wizardTaskList.setTaskList(tasklist);
    }

    /**
     * Modifica a task selecionada na lista
     *
     * @param task <b>WizardTaskPanel</b> Task atual
     */
    private void setActualTask(WizardTaskPanel task) {
//        int index = taskList.indexOf(task);
//        for (WizardTaskPanel t : taskList) {
//            if (t.equals(task)) {
//                taskList.get(index).setCompleted(true);
//            } else {
//                taskList.get(index).setCompleted(false);
//            }
//        }
        this.loadTaskList(taskList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testTask = new br.com.gmp.comps.wizard.task.panel.WizardTaskPanel();
        jLabel1 = new javax.swing.JLabel();
        jPCommand = new javax.swing.JPanel();
        gBPrevious = new br.com.gmp.comps.button.GMPButton();
        gBNext = new br.com.gmp.comps.button.GMPButton();
        gBInfo = new br.com.gmp.comps.button.GMPButton();
        jSP = new javax.swing.JScrollPane();
        wizardTaskList = new br.com.gmp.comps.wizard.task.list.WizardTaskList();
        jPHeader = new javax.swing.JPanel();
        jLTaskTitle = new javax.swing.JLabel();
        jLTaskDescription = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSPContent = new javax.swing.JScrollPane();
        jPContent = new javax.swing.JPanel();

        testTask.setDescription("Test task");
        testTask.setTitle("Test");

        jLabel1.setText("<html>\n<p><b>Test Task</b></p>\n<p>This is just a test, that means:</p>\n<ul>\n<li>Your code is fine;</li>\n<li>This task will be gone once you add a new task list;</li>\n</ul>\n</html>");

        javax.swing.GroupLayout testTaskLayout = new javax.swing.GroupLayout(testTask);
        testTask.setLayout(testTaskLayout);
        testTaskLayout.setHorizontalGroup(
            testTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        testTaskLayout.setVerticalGroup(
            testTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPCommand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        gBPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/wizard/16/arrow_left.png"))); // NOI18N
        gBPrevious.setEndColor(new java.awt.Color(51, 153, 255));
        gBPrevious.setStartColor(new java.awt.Color(51, 102, 255));
        gBPrevious.setText("Anterior");
        gBPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBPreviousActionPerformed(evt);
            }
        });
        jPCommand.add(gBPrevious);

        gBNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/wizard/16/arrow_right.png"))); // NOI18N
        gBNext.setEndColor(new java.awt.Color(51, 153, 255));
        gBNext.setStartColor(new java.awt.Color(51, 102, 255));
        gBNext.setText("Próximo");
        gBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBNextActionPerformed(evt);
            }
        });
        jPCommand.add(gBNext);

        gBInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/wizard/16/book_2.png"))); // NOI18N
        gBInfo.setEndColor(new java.awt.Color(51, 153, 255));
        gBInfo.setStartColor(new java.awt.Color(51, 102, 255));
        gBInfo.setText("Informações");
        gBInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBInfoActionPerformed(evt);
            }
        });
        jPCommand.add(gBInfo);

        jSP.setBorder(null);

        wizardTaskList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        wizardTaskList.setSelectionMode(1);
        jSP.setViewportView(wizardTaskList);

        jPHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPHeader.setForeground(new java.awt.Color(153, 153, 153));

        jLTaskTitle.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLTaskTitle.setText("Titulo");

        jLTaskDescription.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLTaskDescription.setText("Descrição");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPHeaderLayout.createSequentialGroup()
                        .addGroup(jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTaskTitle)
                            .addComponent(jLTaskDescription))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTaskTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jSPContent.setBorder(null);

        jPContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPContent.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jSPContent.setViewportView(jPContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPCommand, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSP, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSPContent)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSP, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSPContent)))
                .addGap(0, 0, 0)
                .addComponent(jPCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBPreviousActionPerformed
        previous();
        //event.previous();
    }//GEN-LAST:event_gBPreviousActionPerformed

    private void gBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBNextActionPerformed
        next();
        //event.next();
    }//GEN-LAST:event_gBNextActionPerformed

    private void gBInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBInfoActionPerformed
        info();
        //event.info();
    }//GEN-LAST:event_gBInfoActionPerformed

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    @Override
    public List<WizardTaskPanel> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<WizardTaskPanel> taskList) {
        this.taskList = taskList;
        recharge();
    }

    public WizardListener getEvent() {
        return event;
    }

    public void setEvent(WizardListener event) {
        this.event = event;
    }

    /**
     * Retorna a task ativa
     *
     * @return <WizardTaskPanel> Task ativa
     */
    public WizardTaskPanel getActiveTask() {
        return activeTask;
    }

    /**
     * Modifica a task ativa
     *
     * @param activeTask Task ativa
     */
    public void setActiveTask(WizardTaskPanel activeTask) {
        this.activeTask = activeTask;
    }

    //</editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.button.GMPButton gBInfo;
    private br.com.gmp.comps.button.GMPButton gBNext;
    private br.com.gmp.comps.button.GMPButton gBPrevious;
    private javax.swing.JLabel jLTaskDescription;
    private javax.swing.JLabel jLTaskTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPCommand;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JScrollPane jSP;
    private javax.swing.JScrollPane jSPContent;
    private javax.swing.JSeparator jSeparator1;
    private br.com.gmp.comps.wizard.task.panel.WizardTaskPanel testTask;
    private br.com.gmp.comps.wizard.task.list.WizardTaskList wizardTaskList;
    // End of variables declaration//GEN-END:variables

}
