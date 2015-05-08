package br.com.gmp.comps.tree;

import br.com.gmp.utils.annotations.TreeItem;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * Componente de árvore de dados
 *
 * @author kaciano
 * @version 1.0
 * @see javax.swing.JTree
 */
public class GMPTree extends JTree {

    private Object root;

    /**
     * Cria nova instancia de GMPTree
     */
    public GMPTree() {
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        initComponents();
    }

    /**
     * Monta a nova árvore
     *
     * @param cl {@code Class(?)} Classe da montagem
     * @param data {@code List} Dados da montagem
     */
    public void mount(Class<?> cl, List data) {
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(root);
        for (Object object : data) {
            addChild(rootNode, object);
        }
        DefaultTreeModel model = new DefaultTreeModel(rootNode);
        setModel(model);
        this.repaint();
        this.revalidate();
    }

    /**
     * Mapeia os dados
     *
     * @param parent {@code DefaultMutableTreeNode} Nó pai
     * @param value {@code Object} Object
     */
    private void addChild(DefaultMutableTreeNode parent, Object value) {
        try {
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(value);

            for (Field field : value.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object get = field.get(value);
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(get);
                if (get != null && get.getClass().isAnnotationPresent(TreeItem.class)) {
                    addChild(node, get);
                }
                newNode.add(node);
            }

            parent.add(newNode);
        } catch (SecurityException ex) {
            Logger.getLogger(GMPTree.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(GMPTree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Dados gerados automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setShowsRootHandles(false);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
