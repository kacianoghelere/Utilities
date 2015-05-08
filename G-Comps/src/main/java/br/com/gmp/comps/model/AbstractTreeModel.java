package br.com.gmp.comps.model;

import javax.swing.event.EventListenerList;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public abstract class AbstractTreeModel implements TreeModel {

    protected EventListenerList listenerList = new EventListenerList();

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        listenerList.add(TreeModelListener.class, l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        listenerList.remove(TreeModelListener.class, l);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
    }

    public TreeModelListener[] getTreeModelListeners() {
        return listenerList.getListeners(TreeModelListener.class);
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * parameters passed into the fire method.
     *
     * @param source the node being changed
     * @param path the path to the root node
     * @param childIndices the indices of the changed elements
     * @param children the changed elements
     * @see EventListenerList
     */
    protected void fireTreeNodesChanged(Object source, Object[] path,
            int[] childIndices, Object[] children) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        TreeModelEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == TreeModelListener.class) {
                // Lazily create the event:
                if (e == null) {
                    e = new TreeModelEvent(source, path, childIndices, children);
                }
                ((TreeModelListener) listeners[i + 1]).treeNodesChanged(e);
            }
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * parameters passed into the fire method.
     *
     * @param source the node where new elements are being inserted
     * @param path the path to the root node
     * @param childIndices the indices of the new elements
     * @param children the new elements
     * @see EventListenerList
     */
    protected void fireTreeNodesInserted(Object source, Object[] path,
            int[] childIndices, Object[] children) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        TreeModelEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == TreeModelListener.class) {
                // Lazily create the event:
                if (e == null) {
                    e = new TreeModelEvent(source, path, childIndices, children);
                }
                ((TreeModelListener) listeners[i + 1]).treeNodesInserted(e);
            }
        }
    }

    /**
     * Notifies all listeners that have registered interest for notification on
     * this event type. The event instance is lazily created using the
     * parameters passed into the fire method.
     *
     * @param source the node where elements are being removed
     * @param path the path to the root node
     * @param childIndices the indices of the removed elements
     * @param children the removed elements
     * @see EventListenerList
     */
    protected void fireTreeNodesRemoved(Object source, Object[] path,
            int[] childIndices, Object[] children) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        TreeModelEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == TreeModelListener.class) {
                // Lazily create the event:
                if (e == null) {
                    e = new TreeModelEvent(source, path, childIndices, children);
                }
                ((TreeModelListener) listeners[i + 1]).treeNodesRemoved(e);
            }
        }
    }

    public void fireTreeStructureChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        TreeModelEvent e = null;
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == TreeModelListener.class) {
                // Lazily create the event:
                if (e == null) {
                    e = new TreeModelEvent(this, new TreePath(getRoot()));
                }
                ((TreeModelListener) listeners[i + 1]).treeStructureChanged(e);
            }
        }
    }

    public void fireLastPathComponentChanged(Object... path) {
        fireLastPathComponentChanged(new TreePath(path));
    }

    public void fireLastPathComponentChanged(TreePath path) {
        fireTreeNodesChanged(this, path.getPath(), new int[]{},
                new Object[]{});
    }

    public void fireLastPathComponentInserted(TreePath treePath) {
        Object parent = treePath.getParentPath().getLastPathComponent();
        Object leaf = treePath.getLastPathComponent();

        int index = getIndexOfChild(parent, leaf);

        fireTreeNodesInserted(this, treePath.getParentPath().getPath(),
                new int[]{index}, new Object[]{leaf});
    }

    public void fireLastPathComponentInserted(Object... path) {
        fireLastPathComponentInserted(new TreePath(path));
    }

    public void fireLastPathComponentRemoved(TreePath treePath) {
        Object parent = treePath.getParentPath().getLastPathComponent();
        Object leaf = treePath.getLastPathComponent();

        int index = getIndexOfChild(parent, leaf);

        fireTreeNodesRemoved(this, treePath.getParentPath().getPath(),
                new int[]{index}, new Object[]{leaf});
    }

    public void fireLastPathComponentRemoved(Object... path) {
        fireLastPathComponentRemoved(new TreePath(path));
    }

    public TreePath newTreePath(Object... path) {
        return new TreePath(path);
    }
}