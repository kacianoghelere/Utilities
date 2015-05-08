package br.com.gmp.comps.model;

import br.com.gmp.comps.tree.node.DynamicTreeNode;

/**
 * The {@code TreeModel} implementation that works with
 * {@code DynamicTreeNode}s.
 *
 * @see DynamicTreeNode
 */
public class DynamicTreeModel {// implements TreeModel {

//    private final EventListenerList listenerList = new EventListenerList();
//
//    private final DynamicTreeNode root;
//
//    /**
//     * Creates a new {@code DynamicTreeModel}.
//     *
//     * @param root the root node
//     *
//     * @throws IllegalArgumentException if {@code root} is {@code null}
//     */
//    public DynamicTreeModel(DynamicTreeNode root) {
//        if (root == null) {
//            throw new IllegalArgumentException("root is null");
//        }
//        this.root = root;
//        root.connect();
//        root.addDynamicTreeNodeListener(new DynamicTreeNodeListener() {
//            @Override
//            public void nodeInserted(DynamicTreeNodeEvent event) {
//                fireNodeInserted(event.getSource(), event.getIndex(), event.getNode());
//            }
//
//            @Override
//            public void nodeRemoved(DynamicTreeNodeEvent event) {
//                fireNodeRemoved(event.getSource(), event.getIndex(), event.getNode());
//            }
//
//            @Override
//            public void nodeChanged(DynamicTreeNodeEvent event) {
//                fireNodeChanged(event.getSource());
//            }
//        });
//    }
//
//    public void dispose() {
//        root.disconnect();
//    }
//
//    @Override
//    public DynamicTreeNode getRoot() {
//        return root;
//    }
//
//    @Override
//    public int getChildCount(Object parent) {
//        if (parent == null) {
//            throw new IllegalArgumentException("parent is null");
//        }
//        return ((DynamicTreeNode) parent).getChildCount();
//    }
//
//    @Override
//    public Object getChild(Object parent, int index) {
//        if (parent == null) {
//            throw new IllegalArgumentException("parent is null");
//        }
//        return ((DynamicTreeNode) parent).getChild(index);
//    }
//
//    @Override
//    public int getIndexOfChild(Object parent, Object child) {
//        if (parent == null) {
//            throw new IllegalArgumentException("parent is null");
//        }
//        if (child == null) {
//            throw new IllegalArgumentException("child is null");
//        }
//        return ((DynamicTreeNode) parent).getChildIndex((DynamicTreeNode) child);
//    }
//
//    @Override
//    public boolean isLeaf(Object node) {
//        return ((DynamicTreeNode) node).isLeaf();
//    }
//
//    /**
//     * Returns whether the last node in the specified path is editable.
//     *
//     * @param path the path to the node
//     *
//     * @return {@code true} if the node indicated by the {@code path} is
//     * editable
//     */
//    public boolean isPathEditable(TreePath path) {
//        DynamicTreeNode node = (DynamicTreeNode) path.getLastPathComponent();
//        return node.isEditable();
//    }
//
//    @Override
//    public void valueForPathChanged(TreePath path, Object newValue) {
//        DynamicTreeNode node = (DynamicTreeNode) path.getLastPathComponent();
//        node.setEditableValue((String) newValue);
//    }
//
//    @Override
//    public void addTreeModelListener(TreeModelListener listener) {
//        listenerList.addListener(TreeModelListener.class, listener);
//    }
//
//    @Override
//    public void removeTreeModelListener(TreeModelListener listener) {
//        listenerList.removeListener(TreeModelListener.class, listener);
//    }
//
//    private void fireNodeInserted(DynamicTreeNode parent, int index, DynamicTreeNode node) {
//        TreeModelEvent event = null;
//        Object[] listeners = listenerList.getListeners();
//        for (int i = listeners.length - 2; i >= 0; i -= 2) {
//            if (listeners[ i] == TreeModelListener.class) {
//                if (event == null) {
//                    event = new TreeModelEvent(this, parent.getPath(), new int[]{index}, new Object[]{node});
//                }
//                ((TreeModelListener) listeners[ i + 1]).treeNodesInserted(event);
//            }
//        }
//    }
//
//    private void fireNodeRemoved(DynamicTreeNode parent, int index, DynamicTreeNode node) {
//        TreeModelEvent event = null;
//        Object[] listeners = listenerList.getListeners();
//        for (int i = listeners.length - 2; i >= 0; i -= 2) {
//            if (listeners[ i] == TreeModelListener.class) {
//                if (event == null) {
//                    event = new TreeModelEvent(this, parent.getPath(), new int[]{index}, new Object[]{node});
//                }
//                ((TreeModelListener) listeners[ i + 1]).treeNodesRemoved(event);
//            }
//        }
//    }
//
//    private void fireNodeChanged(DynamicTreeNode node) {
//        TreeModelEvent event = null;
//        Object[] listeners = listenerList.getListeners();
//        for (int i = listeners.length - 2; i >= 0; i -= 2) {
//            if (listeners[ i] == TreeModelListener.class) {
//                if (event == null) {
//                    if (node == root) {
//                        event = new TreeModelEvent(this, node.getPath(), null, null);
//                    } else {
//                        DynamicTreeNode parent = node.getParent();
//                        event = new TreeModelEvent(this, parent.getPath(), new int[]{parent.getChildIndex(node)}, new Object[]{node});
//                    }
//                }
//                ((TreeModelListener) listeners[ i + 1]).treeNodesChanged(event);
//            }
//        }
//    }
}
