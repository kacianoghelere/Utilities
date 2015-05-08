/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.comps.tree;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author kaciano
 */
public class GMPTreeBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( br.com.gmp.comps.tree.GMPTree.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_anchorSelectionPath = 5;
    private static final int PROPERTY_autoscrolls = 6;
    private static final int PROPERTY_background = 7;
    private static final int PROPERTY_backgroundSet = 8;
    private static final int PROPERTY_baselineResizeBehavior = 9;
    private static final int PROPERTY_border = 10;
    private static final int PROPERTY_bounds = 11;
    private static final int PROPERTY_cellEditor = 12;
    private static final int PROPERTY_cellRenderer = 13;
    private static final int PROPERTY_collapsed = 14;
    private static final int PROPERTY_colorModel = 15;
    private static final int PROPERTY_component = 16;
    private static final int PROPERTY_componentCount = 17;
    private static final int PROPERTY_componentListeners = 18;
    private static final int PROPERTY_componentOrientation = 19;
    private static final int PROPERTY_componentPopupMenu = 20;
    private static final int PROPERTY_components = 21;
    private static final int PROPERTY_containerListeners = 22;
    private static final int PROPERTY_cursor = 23;
    private static final int PROPERTY_cursorSet = 24;
    private static final int PROPERTY_debugGraphicsOptions = 25;
    private static final int PROPERTY_displayable = 26;
    private static final int PROPERTY_doubleBuffered = 27;
    private static final int PROPERTY_dragEnabled = 28;
    private static final int PROPERTY_dropLocation = 29;
    private static final int PROPERTY_dropMode = 30;
    private static final int PROPERTY_dropTarget = 31;
    private static final int PROPERTY_editable = 32;
    private static final int PROPERTY_editing = 33;
    private static final int PROPERTY_editingPath = 34;
    private static final int PROPERTY_enabled = 35;
    private static final int PROPERTY_expanded = 36;
    private static final int PROPERTY_expandsSelectedPaths = 37;
    private static final int PROPERTY_fixedRowHeight = 38;
    private static final int PROPERTY_focusable = 39;
    private static final int PROPERTY_focusCycleRoot = 40;
    private static final int PROPERTY_focusCycleRootAncestor = 41;
    private static final int PROPERTY_focusListeners = 42;
    private static final int PROPERTY_focusOwner = 43;
    private static final int PROPERTY_focusTraversable = 44;
    private static final int PROPERTY_focusTraversalKeys = 45;
    private static final int PROPERTY_focusTraversalKeysEnabled = 46;
    private static final int PROPERTY_focusTraversalPolicy = 47;
    private static final int PROPERTY_focusTraversalPolicyProvider = 48;
    private static final int PROPERTY_focusTraversalPolicySet = 49;
    private static final int PROPERTY_font = 50;
    private static final int PROPERTY_fontSet = 51;
    private static final int PROPERTY_foreground = 52;
    private static final int PROPERTY_foregroundSet = 53;
    private static final int PROPERTY_graphics = 54;
    private static final int PROPERTY_graphicsConfiguration = 55;
    private static final int PROPERTY_height = 56;
    private static final int PROPERTY_hierarchyBoundsListeners = 57;
    private static final int PROPERTY_hierarchyListeners = 58;
    private static final int PROPERTY_ignoreRepaint = 59;
    private static final int PROPERTY_inheritsPopupMenu = 60;
    private static final int PROPERTY_inputContext = 61;
    private static final int PROPERTY_inputMap = 62;
    private static final int PROPERTY_inputMethodListeners = 63;
    private static final int PROPERTY_inputMethodRequests = 64;
    private static final int PROPERTY_inputVerifier = 65;
    private static final int PROPERTY_insets = 66;
    private static final int PROPERTY_invokesStopCellEditing = 67;
    private static final int PROPERTY_keyListeners = 68;
    private static final int PROPERTY_largeModel = 69;
    private static final int PROPERTY_lastSelectedPathComponent = 70;
    private static final int PROPERTY_layout = 71;
    private static final int PROPERTY_leadSelectionPath = 72;
    private static final int PROPERTY_leadSelectionRow = 73;
    private static final int PROPERTY_lightweight = 74;
    private static final int PROPERTY_locale = 75;
    private static final int PROPERTY_location = 76;
    private static final int PROPERTY_locationOnScreen = 77;
    private static final int PROPERTY_managingFocus = 78;
    private static final int PROPERTY_maximumSize = 79;
    private static final int PROPERTY_maximumSizeSet = 80;
    private static final int PROPERTY_maxSelectionRow = 81;
    private static final int PROPERTY_minimumSize = 82;
    private static final int PROPERTY_minimumSizeSet = 83;
    private static final int PROPERTY_minSelectionRow = 84;
    private static final int PROPERTY_model = 85;
    private static final int PROPERTY_mouseListeners = 86;
    private static final int PROPERTY_mouseMotionListeners = 87;
    private static final int PROPERTY_mousePosition = 88;
    private static final int PROPERTY_mouseWheelListeners = 89;
    private static final int PROPERTY_name = 90;
    private static final int PROPERTY_nextFocusableComponent = 91;
    private static final int PROPERTY_opaque = 92;
    private static final int PROPERTY_optimizedDrawingEnabled = 93;
    private static final int PROPERTY_paintingForPrint = 94;
    private static final int PROPERTY_paintingTile = 95;
    private static final int PROPERTY_parent = 96;
    private static final int PROPERTY_pathForRow = 97;
    private static final int PROPERTY_peer = 98;
    private static final int PROPERTY_preferredScrollableViewportSize = 99;
    private static final int PROPERTY_preferredSize = 100;
    private static final int PROPERTY_preferredSizeSet = 101;
    private static final int PROPERTY_propertyChangeListeners = 102;
    private static final int PROPERTY_registeredKeyStrokes = 103;
    private static final int PROPERTY_requestFocusEnabled = 104;
    private static final int PROPERTY_rootPane = 105;
    private static final int PROPERTY_rootVisible = 106;
    private static final int PROPERTY_rowBounds = 107;
    private static final int PROPERTY_rowCount = 108;
    private static final int PROPERTY_rowHeight = 109;
    private static final int PROPERTY_rowSelected = 110;
    private static final int PROPERTY_scrollableTracksViewportHeight = 111;
    private static final int PROPERTY_scrollableTracksViewportWidth = 112;
    private static final int PROPERTY_scrollsOnExpand = 113;
    private static final int PROPERTY_selectionCount = 114;
    private static final int PROPERTY_selectionEmpty = 115;
    private static final int PROPERTY_selectionInterval = 116;
    private static final int PROPERTY_selectionModel = 117;
    private static final int PROPERTY_selectionPath = 118;
    private static final int PROPERTY_selectionPaths = 119;
    private static final int PROPERTY_selectionRow = 120;
    private static final int PROPERTY_selectionRows = 121;
    private static final int PROPERTY_showing = 122;
    private static final int PROPERTY_showsRootHandles = 123;
    private static final int PROPERTY_size = 124;
    private static final int PROPERTY_toggleClickCount = 125;
    private static final int PROPERTY_toolkit = 126;
    private static final int PROPERTY_toolTipText = 127;
    private static final int PROPERTY_topLevelAncestor = 128;
    private static final int PROPERTY_transferHandler = 129;
    private static final int PROPERTY_treeExpansionListeners = 130;
    private static final int PROPERTY_treeLock = 131;
    private static final int PROPERTY_treeSelectionListeners = 132;
    private static final int PROPERTY_treeWillExpandListeners = 133;
    private static final int PROPERTY_UI = 134;
    private static final int PROPERTY_UIClassID = 135;
    private static final int PROPERTY_valid = 136;
    private static final int PROPERTY_validateRoot = 137;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 138;
    private static final int PROPERTY_vetoableChangeListeners = 139;
    private static final int PROPERTY_visible = 140;
    private static final int PROPERTY_visibleRect = 141;
    private static final int PROPERTY_visibleRowCount = 142;
    private static final int PROPERTY_width = 143;
    private static final int PROPERTY_x = 144;
    private static final int PROPERTY_y = 145;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[146];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", br.com.gmp.comps.tree.GMPTree.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", br.com.gmp.comps.tree.GMPTree.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", br.com.gmp.comps.tree.GMPTree.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", br.com.gmp.comps.tree.GMPTree.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", br.com.gmp.comps.tree.GMPTree.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_anchorSelectionPath] = new PropertyDescriptor ( "anchorSelectionPath", br.com.gmp.comps.tree.GMPTree.class, "getAnchorSelectionPath", "setAnchorSelectionPath" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", br.com.gmp.comps.tree.GMPTree.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", br.com.gmp.comps.tree.GMPTree.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", br.com.gmp.comps.tree.GMPTree.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", br.com.gmp.comps.tree.GMPTree.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", br.com.gmp.comps.tree.GMPTree.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", br.com.gmp.comps.tree.GMPTree.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_cellEditor] = new PropertyDescriptor ( "cellEditor", br.com.gmp.comps.tree.GMPTree.class, "getCellEditor", "setCellEditor" ); // NOI18N
            properties[PROPERTY_cellRenderer] = new PropertyDescriptor ( "cellRenderer", br.com.gmp.comps.tree.GMPTree.class, "getCellRenderer", "setCellRenderer" ); // NOI18N
            properties[PROPERTY_collapsed] = new IndexedPropertyDescriptor ( "collapsed", br.com.gmp.comps.tree.GMPTree.class, null, null, "isCollapsed", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", br.com.gmp.comps.tree.GMPTree.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", br.com.gmp.comps.tree.GMPTree.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", br.com.gmp.comps.tree.GMPTree.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", br.com.gmp.comps.tree.GMPTree.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", br.com.gmp.comps.tree.GMPTree.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", br.com.gmp.comps.tree.GMPTree.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", br.com.gmp.comps.tree.GMPTree.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", br.com.gmp.comps.tree.GMPTree.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", br.com.gmp.comps.tree.GMPTree.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", br.com.gmp.comps.tree.GMPTree.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", br.com.gmp.comps.tree.GMPTree.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", br.com.gmp.comps.tree.GMPTree.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", br.com.gmp.comps.tree.GMPTree.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", br.com.gmp.comps.tree.GMPTree.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", br.com.gmp.comps.tree.GMPTree.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", br.com.gmp.comps.tree.GMPTree.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", br.com.gmp.comps.tree.GMPTree.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", br.com.gmp.comps.tree.GMPTree.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_editing] = new PropertyDescriptor ( "editing", br.com.gmp.comps.tree.GMPTree.class, "isEditing", null ); // NOI18N
            properties[PROPERTY_editingPath] = new PropertyDescriptor ( "editingPath", br.com.gmp.comps.tree.GMPTree.class, "getEditingPath", null ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", br.com.gmp.comps.tree.GMPTree.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_expanded] = new IndexedPropertyDescriptor ( "expanded", br.com.gmp.comps.tree.GMPTree.class, null, null, "isExpanded", null ); // NOI18N
            properties[PROPERTY_expandsSelectedPaths] = new PropertyDescriptor ( "expandsSelectedPaths", br.com.gmp.comps.tree.GMPTree.class, "getExpandsSelectedPaths", "setExpandsSelectedPaths" ); // NOI18N
            properties[PROPERTY_fixedRowHeight] = new PropertyDescriptor ( "fixedRowHeight", br.com.gmp.comps.tree.GMPTree.class, "isFixedRowHeight", null ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", br.com.gmp.comps.tree.GMPTree.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", br.com.gmp.comps.tree.GMPTree.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", br.com.gmp.comps.tree.GMPTree.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", br.com.gmp.comps.tree.GMPTree.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", br.com.gmp.comps.tree.GMPTree.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", br.com.gmp.comps.tree.GMPTree.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", br.com.gmp.comps.tree.GMPTree.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", br.com.gmp.comps.tree.GMPTree.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", br.com.gmp.comps.tree.GMPTree.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", br.com.gmp.comps.tree.GMPTree.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", br.com.gmp.comps.tree.GMPTree.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", br.com.gmp.comps.tree.GMPTree.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", br.com.gmp.comps.tree.GMPTree.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", br.com.gmp.comps.tree.GMPTree.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", br.com.gmp.comps.tree.GMPTree.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", br.com.gmp.comps.tree.GMPTree.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", br.com.gmp.comps.tree.GMPTree.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", br.com.gmp.comps.tree.GMPTree.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", br.com.gmp.comps.tree.GMPTree.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", br.com.gmp.comps.tree.GMPTree.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", br.com.gmp.comps.tree.GMPTree.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", br.com.gmp.comps.tree.GMPTree.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", br.com.gmp.comps.tree.GMPTree.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", br.com.gmp.comps.tree.GMPTree.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", br.com.gmp.comps.tree.GMPTree.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", br.com.gmp.comps.tree.GMPTree.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", br.com.gmp.comps.tree.GMPTree.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", br.com.gmp.comps.tree.GMPTree.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_invokesStopCellEditing] = new PropertyDescriptor ( "invokesStopCellEditing", br.com.gmp.comps.tree.GMPTree.class, "getInvokesStopCellEditing", "setInvokesStopCellEditing" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", br.com.gmp.comps.tree.GMPTree.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_largeModel] = new PropertyDescriptor ( "largeModel", br.com.gmp.comps.tree.GMPTree.class, "isLargeModel", "setLargeModel" ); // NOI18N
            properties[PROPERTY_lastSelectedPathComponent] = new PropertyDescriptor ( "lastSelectedPathComponent", br.com.gmp.comps.tree.GMPTree.class, "getLastSelectedPathComponent", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", br.com.gmp.comps.tree.GMPTree.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_leadSelectionPath] = new PropertyDescriptor ( "leadSelectionPath", br.com.gmp.comps.tree.GMPTree.class, "getLeadSelectionPath", "setLeadSelectionPath" ); // NOI18N
            properties[PROPERTY_leadSelectionRow] = new PropertyDescriptor ( "leadSelectionRow", br.com.gmp.comps.tree.GMPTree.class, "getLeadSelectionRow", null ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", br.com.gmp.comps.tree.GMPTree.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", br.com.gmp.comps.tree.GMPTree.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", br.com.gmp.comps.tree.GMPTree.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", br.com.gmp.comps.tree.GMPTree.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", br.com.gmp.comps.tree.GMPTree.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", br.com.gmp.comps.tree.GMPTree.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", br.com.gmp.comps.tree.GMPTree.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_maxSelectionRow] = new PropertyDescriptor ( "maxSelectionRow", br.com.gmp.comps.tree.GMPTree.class, "getMaxSelectionRow", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", br.com.gmp.comps.tree.GMPTree.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", br.com.gmp.comps.tree.GMPTree.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_minSelectionRow] = new PropertyDescriptor ( "minSelectionRow", br.com.gmp.comps.tree.GMPTree.class, "getMinSelectionRow", null ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", br.com.gmp.comps.tree.GMPTree.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", br.com.gmp.comps.tree.GMPTree.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", br.com.gmp.comps.tree.GMPTree.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", br.com.gmp.comps.tree.GMPTree.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", br.com.gmp.comps.tree.GMPTree.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", br.com.gmp.comps.tree.GMPTree.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", br.com.gmp.comps.tree.GMPTree.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", br.com.gmp.comps.tree.GMPTree.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", br.com.gmp.comps.tree.GMPTree.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", br.com.gmp.comps.tree.GMPTree.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", br.com.gmp.comps.tree.GMPTree.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", br.com.gmp.comps.tree.GMPTree.class, "getParent", null ); // NOI18N
            properties[PROPERTY_pathForRow] = new IndexedPropertyDescriptor ( "pathForRow", br.com.gmp.comps.tree.GMPTree.class, null, null, "getPathForRow", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", br.com.gmp.comps.tree.GMPTree.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", br.com.gmp.comps.tree.GMPTree.class, "getPreferredScrollableViewportSize", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", br.com.gmp.comps.tree.GMPTree.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", br.com.gmp.comps.tree.GMPTree.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", br.com.gmp.comps.tree.GMPTree.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", br.com.gmp.comps.tree.GMPTree.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", br.com.gmp.comps.tree.GMPTree.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", br.com.gmp.comps.tree.GMPTree.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_rootVisible] = new PropertyDescriptor ( "rootVisible", br.com.gmp.comps.tree.GMPTree.class, "isRootVisible", "setRootVisible" ); // NOI18N
            properties[PROPERTY_rowBounds] = new IndexedPropertyDescriptor ( "rowBounds", br.com.gmp.comps.tree.GMPTree.class, null, null, "getRowBounds", null ); // NOI18N
            properties[PROPERTY_rowCount] = new PropertyDescriptor ( "rowCount", br.com.gmp.comps.tree.GMPTree.class, "getRowCount", null ); // NOI18N
            properties[PROPERTY_rowHeight] = new PropertyDescriptor ( "rowHeight", br.com.gmp.comps.tree.GMPTree.class, "getRowHeight", "setRowHeight" ); // NOI18N
            properties[PROPERTY_rowSelected] = new IndexedPropertyDescriptor ( "rowSelected", br.com.gmp.comps.tree.GMPTree.class, null, null, "isRowSelected", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", br.com.gmp.comps.tree.GMPTree.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", br.com.gmp.comps.tree.GMPTree.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_scrollsOnExpand] = new PropertyDescriptor ( "scrollsOnExpand", br.com.gmp.comps.tree.GMPTree.class, "getScrollsOnExpand", "setScrollsOnExpand" ); // NOI18N
            properties[PROPERTY_selectionCount] = new PropertyDescriptor ( "selectionCount", br.com.gmp.comps.tree.GMPTree.class, "getSelectionCount", null ); // NOI18N
            properties[PROPERTY_selectionEmpty] = new PropertyDescriptor ( "selectionEmpty", br.com.gmp.comps.tree.GMPTree.class, "isSelectionEmpty", null ); // NOI18N
            properties[PROPERTY_selectionInterval] = new IndexedPropertyDescriptor ( "selectionInterval", br.com.gmp.comps.tree.GMPTree.class, null, null, null, "setSelectionInterval" ); // NOI18N
            properties[PROPERTY_selectionModel] = new PropertyDescriptor ( "selectionModel", br.com.gmp.comps.tree.GMPTree.class, "getSelectionModel", "setSelectionModel" ); // NOI18N
            properties[PROPERTY_selectionPath] = new PropertyDescriptor ( "selectionPath", br.com.gmp.comps.tree.GMPTree.class, "getSelectionPath", "setSelectionPath" ); // NOI18N
            properties[PROPERTY_selectionPaths] = new PropertyDescriptor ( "selectionPaths", br.com.gmp.comps.tree.GMPTree.class, "getSelectionPaths", "setSelectionPaths" ); // NOI18N
            properties[PROPERTY_selectionRow] = new PropertyDescriptor ( "selectionRow", br.com.gmp.comps.tree.GMPTree.class, null, "setSelectionRow" ); // NOI18N
            properties[PROPERTY_selectionRows] = new PropertyDescriptor ( "selectionRows", br.com.gmp.comps.tree.GMPTree.class, "getSelectionRows", "setSelectionRows" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", br.com.gmp.comps.tree.GMPTree.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_showsRootHandles] = new PropertyDescriptor ( "showsRootHandles", br.com.gmp.comps.tree.GMPTree.class, "getShowsRootHandles", "setShowsRootHandles" ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", br.com.gmp.comps.tree.GMPTree.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toggleClickCount] = new PropertyDescriptor ( "toggleClickCount", br.com.gmp.comps.tree.GMPTree.class, "getToggleClickCount", "setToggleClickCount" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", br.com.gmp.comps.tree.GMPTree.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", br.com.gmp.comps.tree.GMPTree.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", br.com.gmp.comps.tree.GMPTree.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", br.com.gmp.comps.tree.GMPTree.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeExpansionListeners] = new PropertyDescriptor ( "treeExpansionListeners", br.com.gmp.comps.tree.GMPTree.class, "getTreeExpansionListeners", null ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", br.com.gmp.comps.tree.GMPTree.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_treeSelectionListeners] = new PropertyDescriptor ( "treeSelectionListeners", br.com.gmp.comps.tree.GMPTree.class, "getTreeSelectionListeners", null ); // NOI18N
            properties[PROPERTY_treeWillExpandListeners] = new PropertyDescriptor ( "treeWillExpandListeners", br.com.gmp.comps.tree.GMPTree.class, "getTreeWillExpandListeners", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", br.com.gmp.comps.tree.GMPTree.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", br.com.gmp.comps.tree.GMPTree.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", br.com.gmp.comps.tree.GMPTree.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", br.com.gmp.comps.tree.GMPTree.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", br.com.gmp.comps.tree.GMPTree.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", br.com.gmp.comps.tree.GMPTree.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", br.com.gmp.comps.tree.GMPTree.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", br.com.gmp.comps.tree.GMPTree.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_visibleRowCount] = new PropertyDescriptor ( "visibleRowCount", br.com.gmp.comps.tree.GMPTree.class, "getVisibleRowCount", "setVisibleRowCount" ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", br.com.gmp.comps.tree.GMPTree.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", br.com.gmp.comps.tree.GMPTree.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", br.com.gmp.comps.tree.GMPTree.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_treeExpansionListener = 12;
    private static final int EVENT_treeSelectionListener = 13;
    private static final int EVENT_treeWillExpandListener = 14;
    private static final int EVENT_vetoableChangeListener = 15;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[16];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_treeExpansionListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "treeExpansionListener", javax.swing.event.TreeExpansionListener.class, new String[] {"treeExpanded", "treeCollapsed"}, "addTreeExpansionListener", "removeTreeExpansionListener" ); // NOI18N
            eventSets[EVENT_treeSelectionListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "treeSelectionListener", javax.swing.event.TreeSelectionListener.class, new String[] {"valueChanged"}, "addTreeSelectionListener", "removeTreeSelectionListener" ); // NOI18N
            eventSets[EVENT_treeWillExpandListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "treeWillExpandListener", javax.swing.event.TreeWillExpandListener.class, new String[] {"treeWillExpand", "treeWillCollapse"}, "addTreeWillExpandListener", "removeTreeWillExpandListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( br.com.gmp.comps.tree.GMPTree.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_addSelectionInterval9 = 9;
    private static final int METHOD_addSelectionPath10 = 10;
    private static final int METHOD_addSelectionPaths11 = 11;
    private static final int METHOD_addSelectionRow12 = 12;
    private static final int METHOD_addSelectionRows13 = 13;
    private static final int METHOD_applyComponentOrientation14 = 14;
    private static final int METHOD_areFocusTraversalKeysSet15 = 15;
    private static final int METHOD_bounds16 = 16;
    private static final int METHOD_cancelEditing17 = 17;
    private static final int METHOD_checkImage18 = 18;
    private static final int METHOD_checkImage19 = 19;
    private static final int METHOD_clearSelection20 = 20;
    private static final int METHOD_collapsePath21 = 21;
    private static final int METHOD_collapseRow22 = 22;
    private static final int METHOD_computeVisibleRect23 = 23;
    private static final int METHOD_contains24 = 24;
    private static final int METHOD_contains25 = 25;
    private static final int METHOD_convertValueToText26 = 26;
    private static final int METHOD_countComponents27 = 27;
    private static final int METHOD_createImage28 = 28;
    private static final int METHOD_createImage29 = 29;
    private static final int METHOD_createToolTip30 = 30;
    private static final int METHOD_createVolatileImage31 = 31;
    private static final int METHOD_createVolatileImage32 = 32;
    private static final int METHOD_deliverEvent33 = 33;
    private static final int METHOD_disable34 = 34;
    private static final int METHOD_dispatchEvent35 = 35;
    private static final int METHOD_doLayout36 = 36;
    private static final int METHOD_enable37 = 37;
    private static final int METHOD_enable38 = 38;
    private static final int METHOD_enableInputMethods39 = 39;
    private static final int METHOD_expandPath40 = 40;
    private static final int METHOD_expandRow41 = 41;
    private static final int METHOD_findComponentAt42 = 42;
    private static final int METHOD_findComponentAt43 = 43;
    private static final int METHOD_firePropertyChange44 = 44;
    private static final int METHOD_firePropertyChange45 = 45;
    private static final int METHOD_firePropertyChange46 = 46;
    private static final int METHOD_firePropertyChange47 = 47;
    private static final int METHOD_firePropertyChange48 = 48;
    private static final int METHOD_firePropertyChange49 = 49;
    private static final int METHOD_firePropertyChange50 = 50;
    private static final int METHOD_firePropertyChange51 = 51;
    private static final int METHOD_fireTreeCollapsed52 = 52;
    private static final int METHOD_fireTreeExpanded53 = 53;
    private static final int METHOD_fireTreeWillCollapse54 = 54;
    private static final int METHOD_fireTreeWillExpand55 = 55;
    private static final int METHOD_getActionForKeyStroke56 = 56;
    private static final int METHOD_getBaseline57 = 57;
    private static final int METHOD_getBounds58 = 58;
    private static final int METHOD_getClientProperty59 = 59;
    private static final int METHOD_getClosestPathForLocation60 = 60;
    private static final int METHOD_getClosestRowForLocation61 = 61;
    private static final int METHOD_getComponentAt62 = 62;
    private static final int METHOD_getComponentAt63 = 63;
    private static final int METHOD_getComponentZOrder64 = 64;
    private static final int METHOD_getConditionForKeyStroke65 = 65;
    private static final int METHOD_getDefaultLocale66 = 66;
    private static final int METHOD_getExpandedDescendants67 = 67;
    private static final int METHOD_getFocusTraversalKeys68 = 68;
    private static final int METHOD_getFontMetrics69 = 69;
    private static final int METHOD_getInsets70 = 70;
    private static final int METHOD_getListeners71 = 71;
    private static final int METHOD_getLocation72 = 72;
    private static final int METHOD_getMousePosition73 = 73;
    private static final int METHOD_getNextMatch74 = 74;
    private static final int METHOD_getPathBounds75 = 75;
    private static final int METHOD_getPathForLocation76 = 76;
    private static final int METHOD_getPopupLocation77 = 77;
    private static final int METHOD_getPropertyChangeListeners78 = 78;
    private static final int METHOD_getRowForLocation79 = 79;
    private static final int METHOD_getRowForPath80 = 80;
    private static final int METHOD_getScrollableBlockIncrement81 = 81;
    private static final int METHOD_getScrollableUnitIncrement82 = 82;
    private static final int METHOD_getSize83 = 83;
    private static final int METHOD_getToolTipLocation84 = 84;
    private static final int METHOD_getToolTipText85 = 85;
    private static final int METHOD_gotFocus86 = 86;
    private static final int METHOD_grabFocus87 = 87;
    private static final int METHOD_handleEvent88 = 88;
    private static final int METHOD_hasBeenExpanded89 = 89;
    private static final int METHOD_hasFocus90 = 90;
    private static final int METHOD_hide91 = 91;
    private static final int METHOD_imageUpdate92 = 92;
    private static final int METHOD_insets93 = 93;
    private static final int METHOD_inside94 = 94;
    private static final int METHOD_invalidate95 = 95;
    private static final int METHOD_isAncestorOf96 = 96;
    private static final int METHOD_isCollapsed97 = 97;
    private static final int METHOD_isExpanded98 = 98;
    private static final int METHOD_isFocusCycleRoot99 = 99;
    private static final int METHOD_isLightweightComponent100 = 100;
    private static final int METHOD_isPathEditable101 = 101;
    private static final int METHOD_isPathSelected102 = 102;
    private static final int METHOD_isVisible103 = 103;
    private static final int METHOD_keyDown104 = 104;
    private static final int METHOD_keyUp105 = 105;
    private static final int METHOD_layout106 = 106;
    private static final int METHOD_list107 = 107;
    private static final int METHOD_list108 = 108;
    private static final int METHOD_list109 = 109;
    private static final int METHOD_list110 = 110;
    private static final int METHOD_list111 = 111;
    private static final int METHOD_locate112 = 112;
    private static final int METHOD_location113 = 113;
    private static final int METHOD_lostFocus114 = 114;
    private static final int METHOD_makeVisible115 = 115;
    private static final int METHOD_minimumSize116 = 116;
    private static final int METHOD_mouseDown117 = 117;
    private static final int METHOD_mouseDrag118 = 118;
    private static final int METHOD_mouseEnter119 = 119;
    private static final int METHOD_mouseExit120 = 120;
    private static final int METHOD_mouseMove121 = 121;
    private static final int METHOD_mouseUp122 = 122;
    private static final int METHOD_move123 = 123;
    private static final int METHOD_nextFocus124 = 124;
    private static final int METHOD_paint125 = 125;
    private static final int METHOD_paintAll126 = 126;
    private static final int METHOD_paintComponents127 = 127;
    private static final int METHOD_paintImmediately128 = 128;
    private static final int METHOD_paintImmediately129 = 129;
    private static final int METHOD_postEvent130 = 130;
    private static final int METHOD_preferredSize131 = 131;
    private static final int METHOD_prepareImage132 = 132;
    private static final int METHOD_prepareImage133 = 133;
    private static final int METHOD_print134 = 134;
    private static final int METHOD_printAll135 = 135;
    private static final int METHOD_printComponents136 = 136;
    private static final int METHOD_putClientProperty137 = 137;
    private static final int METHOD_registerKeyboardAction138 = 138;
    private static final int METHOD_registerKeyboardAction139 = 139;
    private static final int METHOD_remove140 = 140;
    private static final int METHOD_remove141 = 141;
    private static final int METHOD_remove142 = 142;
    private static final int METHOD_removeAll143 = 143;
    private static final int METHOD_removeNotify144 = 144;
    private static final int METHOD_removePropertyChangeListener145 = 145;
    private static final int METHOD_removeSelectionInterval146 = 146;
    private static final int METHOD_removeSelectionPath147 = 147;
    private static final int METHOD_removeSelectionPaths148 = 148;
    private static final int METHOD_removeSelectionRow149 = 149;
    private static final int METHOD_removeSelectionRows150 = 150;
    private static final int METHOD_repaint151 = 151;
    private static final int METHOD_repaint152 = 152;
    private static final int METHOD_repaint153 = 153;
    private static final int METHOD_repaint154 = 154;
    private static final int METHOD_repaint155 = 155;
    private static final int METHOD_requestDefaultFocus156 = 156;
    private static final int METHOD_requestFocus157 = 157;
    private static final int METHOD_requestFocus158 = 158;
    private static final int METHOD_requestFocusInWindow159 = 159;
    private static final int METHOD_resetKeyboardActions160 = 160;
    private static final int METHOD_reshape161 = 161;
    private static final int METHOD_resize162 = 162;
    private static final int METHOD_resize163 = 163;
    private static final int METHOD_revalidate164 = 164;
    private static final int METHOD_scrollPathToVisible165 = 165;
    private static final int METHOD_scrollRectToVisible166 = 166;
    private static final int METHOD_scrollRowToVisible167 = 167;
    private static final int METHOD_setBounds168 = 168;
    private static final int METHOD_setComponentZOrder169 = 169;
    private static final int METHOD_setDefaultLocale170 = 170;
    private static final int METHOD_show171 = 171;
    private static final int METHOD_show172 = 172;
    private static final int METHOD_size173 = 173;
    private static final int METHOD_startEditingAtPath174 = 174;
    private static final int METHOD_stopEditing175 = 175;
    private static final int METHOD_toString176 = 176;
    private static final int METHOD_transferFocus177 = 177;
    private static final int METHOD_transferFocusBackward178 = 178;
    private static final int METHOD_transferFocusDownCycle179 = 179;
    private static final int METHOD_transferFocusUpCycle180 = 180;
    private static final int METHOD_treeDidChange181 = 181;
    private static final int METHOD_unregisterKeyboardAction182 = 182;
    private static final int METHOD_update183 = 183;
    private static final int METHOD_updateUI184 = 184;
    private static final int METHOD_validate185 = 185;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[186];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNotify7] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_addSelectionInterval9] = new MethodDescriptor(javax.swing.JTree.class.getMethod("addSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_addSelectionInterval9].setDisplayName ( "" );
            methods[METHOD_addSelectionPath10] = new MethodDescriptor(javax.swing.JTree.class.getMethod("addSelectionPath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_addSelectionPath10].setDisplayName ( "" );
            methods[METHOD_addSelectionPaths11] = new MethodDescriptor(javax.swing.JTree.class.getMethod("addSelectionPaths", new Class[] {javax.swing.tree.TreePath[].class})); // NOI18N
            methods[METHOD_addSelectionPaths11].setDisplayName ( "" );
            methods[METHOD_addSelectionRow12] = new MethodDescriptor(javax.swing.JTree.class.getMethod("addSelectionRow", new Class[] {int.class})); // NOI18N
            methods[METHOD_addSelectionRow12].setDisplayName ( "" );
            methods[METHOD_addSelectionRows13] = new MethodDescriptor(javax.swing.JTree.class.getMethod("addSelectionRows", new Class[] {int[].class})); // NOI18N
            methods[METHOD_addSelectionRows13].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation14] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation14].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet15] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet15].setDisplayName ( "" );
            methods[METHOD_bounds16] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds16].setDisplayName ( "" );
            methods[METHOD_cancelEditing17] = new MethodDescriptor(javax.swing.JTree.class.getMethod("cancelEditing", new Class[] {})); // NOI18N
            methods[METHOD_cancelEditing17].setDisplayName ( "" );
            methods[METHOD_checkImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage18].setDisplayName ( "" );
            methods[METHOD_checkImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage19].setDisplayName ( "" );
            methods[METHOD_clearSelection20] = new MethodDescriptor(javax.swing.JTree.class.getMethod("clearSelection", new Class[] {})); // NOI18N
            methods[METHOD_clearSelection20].setDisplayName ( "" );
            methods[METHOD_collapsePath21] = new MethodDescriptor(javax.swing.JTree.class.getMethod("collapsePath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_collapsePath21].setDisplayName ( "" );
            methods[METHOD_collapseRow22] = new MethodDescriptor(javax.swing.JTree.class.getMethod("collapseRow", new Class[] {int.class})); // NOI18N
            methods[METHOD_collapseRow22].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect23] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect23].setDisplayName ( "" );
            methods[METHOD_contains24] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains24].setDisplayName ( "" );
            methods[METHOD_contains25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains25].setDisplayName ( "" );
            methods[METHOD_convertValueToText26] = new MethodDescriptor(javax.swing.JTree.class.getMethod("convertValueToText", new Class[] {java.lang.Object.class, boolean.class, boolean.class, boolean.class, int.class, boolean.class})); // NOI18N
            methods[METHOD_convertValueToText26].setDisplayName ( "" );
            methods[METHOD_countComponents27] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents27].setDisplayName ( "" );
            methods[METHOD_createImage28] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage28].setDisplayName ( "" );
            methods[METHOD_createImage29] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage29].setDisplayName ( "" );
            methods[METHOD_createToolTip30] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip30].setDisplayName ( "" );
            methods[METHOD_createVolatileImage31] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage31].setDisplayName ( "" );
            methods[METHOD_createVolatileImage32] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage32].setDisplayName ( "" );
            methods[METHOD_deliverEvent33] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent33].setDisplayName ( "" );
            methods[METHOD_disable34] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable34].setDisplayName ( "" );
            methods[METHOD_dispatchEvent35] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent35].setDisplayName ( "" );
            methods[METHOD_doLayout36] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout36].setDisplayName ( "" );
            methods[METHOD_enable37] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable37].setDisplayName ( "" );
            methods[METHOD_enable38] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable38].setDisplayName ( "" );
            methods[METHOD_enableInputMethods39] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods39].setDisplayName ( "" );
            methods[METHOD_expandPath40] = new MethodDescriptor(javax.swing.JTree.class.getMethod("expandPath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_expandPath40].setDisplayName ( "" );
            methods[METHOD_expandRow41] = new MethodDescriptor(javax.swing.JTree.class.getMethod("expandRow", new Class[] {int.class})); // NOI18N
            methods[METHOD_expandRow41].setDisplayName ( "" );
            methods[METHOD_findComponentAt42] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt42].setDisplayName ( "" );
            methods[METHOD_findComponentAt43] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt43].setDisplayName ( "" );
            methods[METHOD_firePropertyChange44] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange44].setDisplayName ( "" );
            methods[METHOD_firePropertyChange45] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange45].setDisplayName ( "" );
            methods[METHOD_firePropertyChange46] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange46].setDisplayName ( "" );
            methods[METHOD_firePropertyChange47] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange47].setDisplayName ( "" );
            methods[METHOD_firePropertyChange48] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange48].setDisplayName ( "" );
            methods[METHOD_firePropertyChange49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange49].setDisplayName ( "" );
            methods[METHOD_firePropertyChange50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange50].setDisplayName ( "" );
            methods[METHOD_firePropertyChange51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange51].setDisplayName ( "" );
            methods[METHOD_fireTreeCollapsed52] = new MethodDescriptor(javax.swing.JTree.class.getMethod("fireTreeCollapsed", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_fireTreeCollapsed52].setDisplayName ( "" );
            methods[METHOD_fireTreeExpanded53] = new MethodDescriptor(javax.swing.JTree.class.getMethod("fireTreeExpanded", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_fireTreeExpanded53].setDisplayName ( "" );
            methods[METHOD_fireTreeWillCollapse54] = new MethodDescriptor(javax.swing.JTree.class.getMethod("fireTreeWillCollapse", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_fireTreeWillCollapse54].setDisplayName ( "" );
            methods[METHOD_fireTreeWillExpand55] = new MethodDescriptor(javax.swing.JTree.class.getMethod("fireTreeWillExpand", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_fireTreeWillExpand55].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke56].setDisplayName ( "" );
            methods[METHOD_getBaseline57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline57].setDisplayName ( "" );
            methods[METHOD_getBounds58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds58].setDisplayName ( "" );
            methods[METHOD_getClientProperty59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty59].setDisplayName ( "" );
            methods[METHOD_getClosestPathForLocation60] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getClosestPathForLocation", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getClosestPathForLocation60].setDisplayName ( "" );
            methods[METHOD_getClosestRowForLocation61] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getClosestRowForLocation", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getClosestRowForLocation61].setDisplayName ( "" );
            methods[METHOD_getComponentAt62] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt62].setDisplayName ( "" );
            methods[METHOD_getComponentAt63] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt63].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder64] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder64].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke65].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale66].setDisplayName ( "" );
            methods[METHOD_getExpandedDescendants67] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getExpandedDescendants", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_getExpandedDescendants67].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys68] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys68].setDisplayName ( "" );
            methods[METHOD_getFontMetrics69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics69].setDisplayName ( "" );
            methods[METHOD_getInsets70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets70].setDisplayName ( "" );
            methods[METHOD_getListeners71] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners71].setDisplayName ( "" );
            methods[METHOD_getLocation72] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation72].setDisplayName ( "" );
            methods[METHOD_getMousePosition73] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition73].setDisplayName ( "" );
            methods[METHOD_getNextMatch74] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getNextMatch", new Class[] {java.lang.String.class, int.class, javax.swing.text.Position.Bias.class})); // NOI18N
            methods[METHOD_getNextMatch74].setDisplayName ( "" );
            methods[METHOD_getPathBounds75] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getPathBounds", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_getPathBounds75].setDisplayName ( "" );
            methods[METHOD_getPathForLocation76] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getPathForLocation", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getPathForLocation76].setDisplayName ( "" );
            methods[METHOD_getPopupLocation77] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation77].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners78] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners78].setDisplayName ( "" );
            methods[METHOD_getRowForLocation79] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getRowForLocation", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getRowForLocation79].setDisplayName ( "" );
            methods[METHOD_getRowForPath80] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getRowForPath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_getRowForPath80].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement81] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement81].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement82] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement82].setDisplayName ( "" );
            methods[METHOD_getSize83] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize83].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation84] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation84].setDisplayName ( "" );
            methods[METHOD_getToolTipText85] = new MethodDescriptor(javax.swing.JTree.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText85].setDisplayName ( "" );
            methods[METHOD_gotFocus86] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus86].setDisplayName ( "" );
            methods[METHOD_grabFocus87] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus87].setDisplayName ( "" );
            methods[METHOD_handleEvent88] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent88].setDisplayName ( "" );
            methods[METHOD_hasBeenExpanded89] = new MethodDescriptor(javax.swing.JTree.class.getMethod("hasBeenExpanded", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_hasBeenExpanded89].setDisplayName ( "" );
            methods[METHOD_hasFocus90] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus90].setDisplayName ( "" );
            methods[METHOD_hide91] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide91].setDisplayName ( "" );
            methods[METHOD_imageUpdate92] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate92].setDisplayName ( "" );
            methods[METHOD_insets93] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets93].setDisplayName ( "" );
            methods[METHOD_inside94] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside94].setDisplayName ( "" );
            methods[METHOD_invalidate95] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate95].setDisplayName ( "" );
            methods[METHOD_isAncestorOf96] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf96].setDisplayName ( "" );
            methods[METHOD_isCollapsed97] = new MethodDescriptor(javax.swing.JTree.class.getMethod("isCollapsed", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isCollapsed97].setDisplayName ( "" );
            methods[METHOD_isExpanded98] = new MethodDescriptor(javax.swing.JTree.class.getMethod("isExpanded", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isExpanded98].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot99] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot99].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent100] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent100].setDisplayName ( "" );
            methods[METHOD_isPathEditable101] = new MethodDescriptor(javax.swing.JTree.class.getMethod("isPathEditable", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isPathEditable101].setDisplayName ( "" );
            methods[METHOD_isPathSelected102] = new MethodDescriptor(javax.swing.JTree.class.getMethod("isPathSelected", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isPathSelected102].setDisplayName ( "" );
            methods[METHOD_isVisible103] = new MethodDescriptor(javax.swing.JTree.class.getMethod("isVisible", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isVisible103].setDisplayName ( "" );
            methods[METHOD_keyDown104] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown104].setDisplayName ( "" );
            methods[METHOD_keyUp105] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp105].setDisplayName ( "" );
            methods[METHOD_layout106] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout106].setDisplayName ( "" );
            methods[METHOD_list107] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list107].setDisplayName ( "" );
            methods[METHOD_list108] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list108].setDisplayName ( "" );
            methods[METHOD_list109] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list109].setDisplayName ( "" );
            methods[METHOD_list110] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list110].setDisplayName ( "" );
            methods[METHOD_list111] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list111].setDisplayName ( "" );
            methods[METHOD_locate112] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate112].setDisplayName ( "" );
            methods[METHOD_location113] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location113].setDisplayName ( "" );
            methods[METHOD_lostFocus114] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus114].setDisplayName ( "" );
            methods[METHOD_makeVisible115] = new MethodDescriptor(javax.swing.JTree.class.getMethod("makeVisible", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_makeVisible115].setDisplayName ( "" );
            methods[METHOD_minimumSize116] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize116].setDisplayName ( "" );
            methods[METHOD_mouseDown117] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown117].setDisplayName ( "" );
            methods[METHOD_mouseDrag118] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag118].setDisplayName ( "" );
            methods[METHOD_mouseEnter119] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter119].setDisplayName ( "" );
            methods[METHOD_mouseExit120] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit120].setDisplayName ( "" );
            methods[METHOD_mouseMove121] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove121].setDisplayName ( "" );
            methods[METHOD_mouseUp122] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp122].setDisplayName ( "" );
            methods[METHOD_move123] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move123].setDisplayName ( "" );
            methods[METHOD_nextFocus124] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus124].setDisplayName ( "" );
            methods[METHOD_paint125] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint125].setDisplayName ( "" );
            methods[METHOD_paintAll126] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll126].setDisplayName ( "" );
            methods[METHOD_paintComponents127] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents127].setDisplayName ( "" );
            methods[METHOD_paintImmediately128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately128].setDisplayName ( "" );
            methods[METHOD_paintImmediately129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately129].setDisplayName ( "" );
            methods[METHOD_postEvent130] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent130].setDisplayName ( "" );
            methods[METHOD_preferredSize131] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize131].setDisplayName ( "" );
            methods[METHOD_prepareImage132] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage132].setDisplayName ( "" );
            methods[METHOD_prepareImage133] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage133].setDisplayName ( "" );
            methods[METHOD_print134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print134].setDisplayName ( "" );
            methods[METHOD_printAll135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll135].setDisplayName ( "" );
            methods[METHOD_printComponents136] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents136].setDisplayName ( "" );
            methods[METHOD_putClientProperty137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty137].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction138].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction139].setDisplayName ( "" );
            methods[METHOD_remove140] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove140].setDisplayName ( "" );
            methods[METHOD_remove141] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove141].setDisplayName ( "" );
            methods[METHOD_remove142] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove142].setDisplayName ( "" );
            methods[METHOD_removeAll143] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll143].setDisplayName ( "" );
            methods[METHOD_removeNotify144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify144].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener145] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener145].setDisplayName ( "" );
            methods[METHOD_removeSelectionInterval146] = new MethodDescriptor(javax.swing.JTree.class.getMethod("removeSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_removeSelectionInterval146].setDisplayName ( "" );
            methods[METHOD_removeSelectionPath147] = new MethodDescriptor(javax.swing.JTree.class.getMethod("removeSelectionPath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_removeSelectionPath147].setDisplayName ( "" );
            methods[METHOD_removeSelectionPaths148] = new MethodDescriptor(javax.swing.JTree.class.getMethod("removeSelectionPaths", new Class[] {javax.swing.tree.TreePath[].class})); // NOI18N
            methods[METHOD_removeSelectionPaths148].setDisplayName ( "" );
            methods[METHOD_removeSelectionRow149] = new MethodDescriptor(javax.swing.JTree.class.getMethod("removeSelectionRow", new Class[] {int.class})); // NOI18N
            methods[METHOD_removeSelectionRow149].setDisplayName ( "" );
            methods[METHOD_removeSelectionRows150] = new MethodDescriptor(javax.swing.JTree.class.getMethod("removeSelectionRows", new Class[] {int[].class})); // NOI18N
            methods[METHOD_removeSelectionRows150].setDisplayName ( "" );
            methods[METHOD_repaint151] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint151].setDisplayName ( "" );
            methods[METHOD_repaint152] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint152].setDisplayName ( "" );
            methods[METHOD_repaint153] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint153].setDisplayName ( "" );
            methods[METHOD_repaint154] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint154].setDisplayName ( "" );
            methods[METHOD_repaint155] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint155].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus156] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus156].setDisplayName ( "" );
            methods[METHOD_requestFocus157] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus157].setDisplayName ( "" );
            methods[METHOD_requestFocus158] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus158].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow159] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow159].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions160] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions160].setDisplayName ( "" );
            methods[METHOD_reshape161] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape161].setDisplayName ( "" );
            methods[METHOD_resize162] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize162].setDisplayName ( "" );
            methods[METHOD_resize163] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize163].setDisplayName ( "" );
            methods[METHOD_revalidate164] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate164].setDisplayName ( "" );
            methods[METHOD_scrollPathToVisible165] = new MethodDescriptor(javax.swing.JTree.class.getMethod("scrollPathToVisible", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_scrollPathToVisible165].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible166] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible166].setDisplayName ( "" );
            methods[METHOD_scrollRowToVisible167] = new MethodDescriptor(javax.swing.JTree.class.getMethod("scrollRowToVisible", new Class[] {int.class})); // NOI18N
            methods[METHOD_scrollRowToVisible167].setDisplayName ( "" );
            methods[METHOD_setBounds168] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds168].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder169] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder169].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale170] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale170].setDisplayName ( "" );
            methods[METHOD_show171] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show171].setDisplayName ( "" );
            methods[METHOD_show172] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show172].setDisplayName ( "" );
            methods[METHOD_size173] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size173].setDisplayName ( "" );
            methods[METHOD_startEditingAtPath174] = new MethodDescriptor(javax.swing.JTree.class.getMethod("startEditingAtPath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_startEditingAtPath174].setDisplayName ( "" );
            methods[METHOD_stopEditing175] = new MethodDescriptor(javax.swing.JTree.class.getMethod("stopEditing", new Class[] {})); // NOI18N
            methods[METHOD_stopEditing175].setDisplayName ( "" );
            methods[METHOD_toString176] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString176].setDisplayName ( "" );
            methods[METHOD_transferFocus177] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus177].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward178] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward178].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle179] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle179].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle180] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle180].setDisplayName ( "" );
            methods[METHOD_treeDidChange181] = new MethodDescriptor(javax.swing.JTree.class.getMethod("treeDidChange", new Class[] {})); // NOI18N
            methods[METHOD_treeDidChange181].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction182] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction182].setDisplayName ( "" );
            methods[METHOD_update183] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update183].setDisplayName ( "" );
            methods[METHOD_updateUI184] = new MethodDescriptor(javax.swing.JTree.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI184].setDisplayName ( "" );
            methods[METHOD_validate185] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate185].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/ComponentIcons/tree/tree.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/ComponentIcons/tree/tree.png";
    private static String iconNameM16 = "/ComponentIcons/tree/tree.png";
    private static String iconNameM32 = "/ComponentIcons/tree/tree.png";//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's {@code BeanDescriptor}s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's {@code PropertyDescriptor}s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's {@code EventSetDescriptor}s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's {@code MethodDescriptor}s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
