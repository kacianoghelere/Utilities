package br.com.gmp.comps.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.TreeNode;

/**
 * An implementation of TreeTableModel that uses reflection to answer TableModel
 * methods. This works off a handful of values. A TreeNode is used to answer all
 * the TreeModel related methods (similiar to AbstractTreeTableModel and
 * DefaultTreeModel). The column names are specified in the constructor. The
 * values for the columns are dynamically obtained via reflection, you simply
 * provide the method names. The methods used to set a particular value are also
 * specified as an array of method names, a null method name, or null array
 * indicates the column isn't editable. And the class types, used for the
 * TableModel method getColumnClass are specified in the constructor.
 *
 * @author Scott Violet
 */
public class DynamicTreeTableModel extends AbstractTreeTableModel {

    /**
     * Names of the columns, used for the TableModel getColumnName method.
     */
    private String[] columnNames;
    /**
     * Method names used to determine a particular value. Used for the
     * TableModel method getValueAt.
     */
    private String[] getterMethodNames;
    /**
     * Setter method names, used to set a particular value. Used for the
     * TableModel method setValueAt. A null entry, or array, indicates the
     * column is not editable.
     */
    private String[] setterMethodNames;
    /**
     * Column classes, used for the TableModel method getColumnClass.
     */
    private Class[] cTypes;

    /**
     * Constructor for creating a DynamicTreeTableModel.
     */
    public DynamicTreeTableModel(TreeNode root, String[] columnNames,
            String[] getterMethodNames,
            String[] setterMethodNames,
            Class[] cTypes) {
        super(root);
        this.columnNames = columnNames;
        this.getterMethodNames = getterMethodNames;
        this.setterMethodNames = setterMethodNames;
        this.cTypes = cTypes;
    }

    //
    // TreeModel interface
    //
    /**
     * TreeModel method to return the number of children of a particular node.
     * Since {@code node} is a TreeNode, this can be answered via the
     * TreeNode method {@code getChildCount}.
     *
     * @param node
     * @return
     */
    @Override
    public int getChildCount(Object node) {
        return ((TreeNode) node).getChildCount();
    }

    /**
     * TreeModel method to locate a particular child of the specified node.
     * Since {@code node} is a TreeNode, this can be answered via the
     * TreeNode method {@code getChild}.
     *
     * @param node
     * @param i
     * @return
     */
    @Override
    public Object getChild(Object node, int i) {
        return ((TreeNode) node).getChildAt(i);
    }

    /**
     * TreeModel method to determine if a node is a leaf. Since
     * {@code node} is a TreeNode, this can be answered via the TreeNode
     * method {@code isLeaf}.
     *
     * @return
     */
    @Override
    public boolean isLeaf(Object node) {
        return ((TreeNode) node).isLeaf();
    }

    //
    //  The TreeTable interface.
    //
    /**
     * Returns the number of column names passed into the constructor.
     *
     * @return
     */
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    /**
     * Returns the column name passed into the constructor.
     *
     * @param column
     * @return
     */
    @Override
    public String getColumnName(int column) {
        if (cTypes == null || column < 0 || column >= cTypes.length) {
            return null;
        }
        return columnNames[column];
    }

    /**
     * Returns the column class for column {@code column}. This is set in
     * the constructor.
     *
     * @param column
     * @return
     */
    @Override
    public Class getColumnClass(int column) {
        if (cTypes == null || column < 0 || column >= cTypes.length) {
            return null;
        }
        return cTypes[column];
    }

    /**
     * Returns the value for the column {@code column} and object
     * {@code node}. The return value is determined by invoking the method
     * specified in constructor for the passed in column.
     *
     * @param node
     * @param column
     * @return
     */
    @Override
    public Object getValueAt(Object node, int column) {
        Object value = null;
        try {
            String methodName = getterMethodNames[column];
            Class cls = node.getClass();
            Method method = cls.getMethod(methodName, cls); // Era null aqui!
            if (method != null) {
                value = method.invoke(node, cls); // Era null aqui!
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException th) {
            Logger.getLogger(DynamicTreeTableModel.class.getName()).log(Level.SEVERE, null, th);
        }
        return value;
    }

    /**
     * Returns true if there is a setter method name for column
     * {@code column}. This is set in the constructor.
     *
     * @param node
     * @param column
     * @return
     */
    @Override
    public boolean isCellEditable(Object node, int column) {
        return (setterMethodNames != null
                && setterMethodNames[column] != null);
    }

    /**
     * Sets the value to {@code aValue} for the object {@code node} in
     * column {@code column}. This is done by using the setter method name,
     * and coercing the passed in value to the specified type.
     *
     * @param aValue
     * @param node
     * @param column
     */
    // Note: This looks up the methods each time! This is rather inefficient;
    // it should really be changed to cache matching methods/constructors
    // based on {@code node}'s class, and {@code aValue}'s class.
    @Override
    public void setValueAt(Object aValue, Object node, int column) {
        boolean found = false;
        try {
            // We have to search through all the methods since the
            // types may not match up.
            Method[] methods = node.getClass().getMethods();

            for (int counter = methods.length - 1; counter >= 0; counter--) {
                if (methods[counter].getName().equals(setterMethodNames[column]) && methods[counter].
                        getParameterTypes() != null && methods[counter].
                        getParameterTypes().length == 1) {
                    // We found a matching method
                    Class param = methods[counter].getParameterTypes()[0];
                    if (param.isInstance(aValue)) {
                        found = true;
                        try {
                            methods[counter].invoke(node, new Object[]{aValue});
                        } catch (InvocationTargetException ex) {
                            //May want to log error message here
                            throw ex;
                        }
                        break;
                    }

                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException th) {
            Logger.getLogger(DynamicTreeTableModel.class.getName()).log(Level.SEVERE, null, th);
        }
        if (found) {
            // The value changed, fire an event to notify listeners.
            TreeNode parent = ((TreeNode) node).getParent();
            if (parent != null) {
                fireTreeNodesChanged(this, getPathToRoot(parent),
                        new int[]{getIndexOfChild(parent, node)},
                        new Object[]{node});
            }
        }
    }

    /**
     * Builds the parents of the node up to and including the root node, where
     * the original node is the last element in the returned array. The length
     * of the returned array gives the node's depth in the tree.
     *
     * @param aNode the TreeNode to get the path for
     * @return aNode array of TreeNodes giving the path from the root to the
     * specified node.
     */
    public TreeNode[] getPathToRoot(TreeNode aNode) {
        return getPathToRoot(aNode, 0);
    }

    /**
     * Builds the parents of the node up to and including the root node, where
     * the original node is the last element in the returned array. The length
     * of the returned array gives the node's depth in the tree.
     *
     * @param aNode the TreeNode to get the path for
     * @param depth an int giving the number of steps already taken towards the
     * root (on recursive calls), used to size the returned array
     * @return an array of TreeNodes giving the path from the root to the
     * specified node
     */
    private TreeNode[] getPathToRoot(TreeNode aNode, int depth) {
        TreeNode[] retNodes;
        // This method recurses, traversing towards the root in order
        // size the array. On the way back, it fills in the nodes,
        // starting from the root and working back to the original node.

        /* Check for null, in case someone passed in a null node, or
         they passed in an element that isn't rooted at root. */
        if (aNode == null) {
            if (depth == 0) {
                return null;
            }
            retNodes = new TreeNode[depth];
        } else {
            depth++;
            if (aNode == root) {
                retNodes = new TreeNode[depth];
            } else {
                retNodes = getPathToRoot(aNode.getParent(), depth);
            }
            retNodes[retNodes.length - depth] = aNode;
        }
        return retNodes;
    }
}
