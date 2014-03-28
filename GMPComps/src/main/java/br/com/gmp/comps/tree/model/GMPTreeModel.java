package br.com.gmp.comps.tree.model;

import br.com.gmp.comps.model.AbstractTreeModel;
import br.com.gmp.utils.annotations.TreeItem;
import br.com.gmp.utils.annotations.TreeLeaf;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modelo para GMPTrees
 *
 * @author kaciano
 * @version 1.0
 */
public class GMPTreeModel extends AbstractTreeModel {

    private final String root = "TreeModel";
    private List data;
    private final Class<?> objectclass;

    public GMPTreeModel(Class<?> objectclass) {
        this.data = new ArrayList();
        this.objectclass = objectclass;
    }

    public GMPTreeModel(List data, Class<?> objectclass) {
        this.data = data;
        this.objectclass = objectclass;
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {
        if (parent.equals(getRoot())) {
            return data.get(index);
        }
        if (parent.getClass().isAnnotationPresent(TreeItem.class)) {
            Field field = parent.getClass().getDeclaredFields()[index];
            field.setAccessible(true);
            try {
                return field.get(parent);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(GMPTreeModel.class.getName()).log(Level.SEVERE, null, ex);
                return new Object();
            }
        }
        return new Object();
    }

    @Override
    public int getChildCount(Object parent) {
        int count = 0;
        for (Field field : parent.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(TreeItem.class) || field.isAnnotationPresent(TreeLeaf.class)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isLeaf(Object node) {
        return node.getClass().isAnnotationPresent(TreeLeaf.class);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        int count = 0;
        for (Field field : parent.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(TreeItem.class) || field.isAnnotationPresent(TreeLeaf.class)) {
                try {
                    if (child.equals(field.get(parent))) {
                        return count;
                    }
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(GMPTreeModel.class.getName()).log(Level.SEVERE, null, ex);
                }
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @return
     */
    public Class<?> getObjectclass() {
        return objectclass;
    }

    /**
     *
     * @return
     */
    public List getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(List data) {
        this.data = data;
    }

}
