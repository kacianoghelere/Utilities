package br.com.gmp.comps.table;

import java.beans.*;

/**
 *
 * @author kaciano
 */
public class GMPTableBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( br.com.gmp.comps.table.GMPTable.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_actualPage = 2;
    private static final int PROPERTY_alignmentX = 3;
    private static final int PROPERTY_alignmentY = 4;
    private static final int PROPERTY_ancestorListeners = 5;
    private static final int PROPERTY_autoCreateColumnsFromModel = 6;
    private static final int PROPERTY_autoCreateRowSorter = 7;
    private static final int PROPERTY_autoResizeMode = 8;
    private static final int PROPERTY_autoscrolls = 9;
    private static final int PROPERTY_background = 10;
    private static final int PROPERTY_backgroundSet = 11;
    private static final int PROPERTY_baselineResizeBehavior = 12;
    private static final int PROPERTY_border = 13;
    private static final int PROPERTY_bounds = 14;
    private static final int PROPERTY_cellEditor = 15;
    private static final int PROPERTY_cellSelectionEnabled = 16;
    private static final int PROPERTY_colorModel = 17;
    private static final int PROPERTY_columnClass = 18;
    private static final int PROPERTY_columnCount = 19;
    private static final int PROPERTY_columnModel = 20;
    private static final int PROPERTY_columnName = 21;
    private static final int PROPERTY_columnSelected = 22;
    private static final int PROPERTY_columnSelectionAllowed = 23;
    private static final int PROPERTY_columnSelectionInterval = 24;
    private static final int PROPERTY_component = 25;
    private static final int PROPERTY_componentCount = 26;
    private static final int PROPERTY_componentListeners = 27;
    private static final int PROPERTY_componentOrientation = 28;
    private static final int PROPERTY_componentPopupMenu = 29;
    private static final int PROPERTY_components = 30;
    private static final int PROPERTY_containerListeners = 31;
    private static final int PROPERTY_cursor = 32;
    private static final int PROPERTY_cursorSet = 33;
    private static final int PROPERTY_debugGraphicsOptions = 34;
    private static final int PROPERTY_displayable = 35;
    private static final int PROPERTY_doubleBuffered = 36;
    private static final int PROPERTY_dragEnabled = 37;
    private static final int PROPERTY_dropLocation = 38;
    private static final int PROPERTY_dropMode = 39;
    private static final int PROPERTY_dropTarget = 40;
    private static final int PROPERTY_editing = 41;
    private static final int PROPERTY_editingColumn = 42;
    private static final int PROPERTY_editingRow = 43;
    private static final int PROPERTY_editorComponent = 44;
    private static final int PROPERTY_enabled = 45;
    private static final int PROPERTY_fillsViewportHeight = 46;
    private static final int PROPERTY_focusable = 47;
    private static final int PROPERTY_focusCycleRoot = 48;
    private static final int PROPERTY_focusCycleRootAncestor = 49;
    private static final int PROPERTY_focusListeners = 50;
    private static final int PROPERTY_focusOwner = 51;
    private static final int PROPERTY_focusTraversable = 52;
    private static final int PROPERTY_focusTraversalKeys = 53;
    private static final int PROPERTY_focusTraversalKeysEnabled = 54;
    private static final int PROPERTY_focusTraversalPolicy = 55;
    private static final int PROPERTY_focusTraversalPolicyProvider = 56;
    private static final int PROPERTY_focusTraversalPolicySet = 57;
    private static final int PROPERTY_font = 58;
    private static final int PROPERTY_fontSet = 59;
    private static final int PROPERTY_foreground = 60;
    private static final int PROPERTY_foregroundSet = 61;
    private static final int PROPERTY_gmpModel = 62;
    private static final int PROPERTY_graphics = 63;
    private static final int PROPERTY_graphicsConfiguration = 64;
    private static final int PROPERTY_gridColor = 65;
    private static final int PROPERTY_height = 66;
    private static final int PROPERTY_hierarchyBoundsListeners = 67;
    private static final int PROPERTY_hierarchyListeners = 68;
    private static final int PROPERTY_ignoreRepaint = 69;
    private static final int PROPERTY_inheritsPopupMenu = 70;
    private static final int PROPERTY_inputContext = 71;
    private static final int PROPERTY_inputMap = 72;
    private static final int PROPERTY_inputMethodListeners = 73;
    private static final int PROPERTY_inputMethodRequests = 74;
    private static final int PROPERTY_inputVerifier = 75;
    private static final int PROPERTY_insets = 76;
    private static final int PROPERTY_intercellSpacing = 77;
    private static final int PROPERTY_keyListeners = 78;
    private static final int PROPERTY_layout = 79;
    private static final int PROPERTY_lightweight = 80;
    private static final int PROPERTY_locale = 81;
    private static final int PROPERTY_location = 82;
    private static final int PROPERTY_locationOnScreen = 83;
    private static final int PROPERTY_managingFocus = 84;
    private static final int PROPERTY_maximumSize = 85;
    private static final int PROPERTY_maximumSizeSet = 86;
    private static final int PROPERTY_maxRows = 87;
    private static final int PROPERTY_minimumSize = 88;
    private static final int PROPERTY_minimumSizeSet = 89;
    private static final int PROPERTY_model = 90;
    private static final int PROPERTY_mouseListeners = 91;
    private static final int PROPERTY_mouseMotionListeners = 92;
    private static final int PROPERTY_mousePosition = 93;
    private static final int PROPERTY_mouseWheelListeners = 94;
    private static final int PROPERTY_name = 95;
    private static final int PROPERTY_nextFocusableComponent = 96;
    private static final int PROPERTY_opaque = 97;
    private static final int PROPERTY_optimizedDrawingEnabled = 98;
    private static final int PROPERTY_paintingForPrint = 99;
    private static final int PROPERTY_paintingTile = 100;
    private static final int PROPERTY_parent = 101;
    private static final int PROPERTY_peer = 102;
    private static final int PROPERTY_preferredScrollableViewportSize = 103;
    private static final int PROPERTY_preferredSize = 104;
    private static final int PROPERTY_preferredSizeSet = 105;
    private static final int PROPERTY_propertyChangeListeners = 106;
    private static final int PROPERTY_registeredKeyStrokes = 107;
    private static final int PROPERTY_requestFocusEnabled = 108;
    private static final int PROPERTY_rootPane = 109;
    private static final int PROPERTY_rowCount = 110;
    private static final int PROPERTY_rowHeight = 111;
    private static final int PROPERTY_rowMargin = 112;
    private static final int PROPERTY_rowSelected = 113;
    private static final int PROPERTY_rowSelectionAllowed = 114;
    private static final int PROPERTY_rowSelectionInterval = 115;
    private static final int PROPERTY_rowSorter = 116;
    private static final int PROPERTY_scrollableTracksViewportHeight = 117;
    private static final int PROPERTY_scrollableTracksViewportWidth = 118;
    private static final int PROPERTY_selectedColumn = 119;
    private static final int PROPERTY_selectedColumnCount = 120;
    private static final int PROPERTY_selectedColumns = 121;
    private static final int PROPERTY_selectedRow = 122;
    private static final int PROPERTY_selectedRowCount = 123;
    private static final int PROPERTY_selectedRows = 124;
    private static final int PROPERTY_selectionBackground = 125;
    private static final int PROPERTY_selectionForeground = 126;
    private static final int PROPERTY_selectionMode = 127;
    private static final int PROPERTY_selectionModel = 128;
    private static final int PROPERTY_showGrid = 129;
    private static final int PROPERTY_showHorizontalLines = 130;
    private static final int PROPERTY_showing = 131;
    private static final int PROPERTY_showVerticalLines = 132;
    private static final int PROPERTY_size = 133;
    private static final int PROPERTY_source = 134;
    private static final int PROPERTY_surrendersFocusOnKeystroke = 135;
    private static final int PROPERTY_tableHeader = 136;
    private static final int PROPERTY_toolkit = 137;
    private static final int PROPERTY_toolTipText = 138;
    private static final int PROPERTY_topLevelAncestor = 139;
    private static final int PROPERTY_transferHandler = 140;
    private static final int PROPERTY_treeLock = 141;
    private static final int PROPERTY_UI = 142;
    private static final int PROPERTY_UIClassID = 143;
    private static final int PROPERTY_updateSelectionOnSort = 144;
    private static final int PROPERTY_valid = 145;
    private static final int PROPERTY_validateRoot = 146;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 147;
    private static final int PROPERTY_vetoableChangeListeners = 148;
    private static final int PROPERTY_visible = 149;
    private static final int PROPERTY_visibleRect = 150;
    private static final int PROPERTY_width = 151;
    private static final int PROPERTY_x = 152;
    private static final int PROPERTY_y = 153;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[154];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", br.com.gmp.comps.table.GMPTable.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", br.com.gmp.comps.table.GMPTable.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actualPage] = new PropertyDescriptor ( "actualPage", br.com.gmp.comps.table.GMPTable.class, "getActualPage", "setActualPage" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", br.com.gmp.comps.table.GMPTable.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", br.com.gmp.comps.table.GMPTable.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", br.com.gmp.comps.table.GMPTable.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoCreateColumnsFromModel] = new PropertyDescriptor ( "autoCreateColumnsFromModel", br.com.gmp.comps.table.GMPTable.class, "getAutoCreateColumnsFromModel", "setAutoCreateColumnsFromModel" ); // NOI18N
            properties[PROPERTY_autoCreateRowSorter] = new PropertyDescriptor ( "autoCreateRowSorter", br.com.gmp.comps.table.GMPTable.class, "getAutoCreateRowSorter", "setAutoCreateRowSorter" ); // NOI18N
            properties[PROPERTY_autoResizeMode] = new PropertyDescriptor ( "autoResizeMode", br.com.gmp.comps.table.GMPTable.class, "getAutoResizeMode", "setAutoResizeMode" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", br.com.gmp.comps.table.GMPTable.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", br.com.gmp.comps.table.GMPTable.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", br.com.gmp.comps.table.GMPTable.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", br.com.gmp.comps.table.GMPTable.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", br.com.gmp.comps.table.GMPTable.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", br.com.gmp.comps.table.GMPTable.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_cellEditor] = new PropertyDescriptor ( "cellEditor", br.com.gmp.comps.table.GMPTable.class, "getCellEditor", "setCellEditor" ); // NOI18N
            properties[PROPERTY_cellSelectionEnabled] = new PropertyDescriptor ( "cellSelectionEnabled", br.com.gmp.comps.table.GMPTable.class, "getCellSelectionEnabled", "setCellSelectionEnabled" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", br.com.gmp.comps.table.GMPTable.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_columnClass] = new IndexedPropertyDescriptor ( "columnClass", br.com.gmp.comps.table.GMPTable.class, null, null, "getColumnClass", null ); // NOI18N
            properties[PROPERTY_columnCount] = new PropertyDescriptor ( "columnCount", br.com.gmp.comps.table.GMPTable.class, "getColumnCount", null ); // NOI18N
            properties[PROPERTY_columnModel] = new PropertyDescriptor ( "columnModel", br.com.gmp.comps.table.GMPTable.class, "getColumnModel", "setColumnModel" ); // NOI18N
            properties[PROPERTY_columnName] = new IndexedPropertyDescriptor ( "columnName", br.com.gmp.comps.table.GMPTable.class, null, null, "getColumnName", null ); // NOI18N
            properties[PROPERTY_columnSelected] = new IndexedPropertyDescriptor ( "columnSelected", br.com.gmp.comps.table.GMPTable.class, null, null, "isColumnSelected", null ); // NOI18N
            properties[PROPERTY_columnSelectionAllowed] = new PropertyDescriptor ( "columnSelectionAllowed", br.com.gmp.comps.table.GMPTable.class, "getColumnSelectionAllowed", "setColumnSelectionAllowed" ); // NOI18N
            properties[PROPERTY_columnSelectionInterval] = new IndexedPropertyDescriptor ( "columnSelectionInterval", br.com.gmp.comps.table.GMPTable.class, null, null, null, "setColumnSelectionInterval" ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", br.com.gmp.comps.table.GMPTable.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", br.com.gmp.comps.table.GMPTable.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", br.com.gmp.comps.table.GMPTable.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", br.com.gmp.comps.table.GMPTable.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", br.com.gmp.comps.table.GMPTable.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", br.com.gmp.comps.table.GMPTable.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", br.com.gmp.comps.table.GMPTable.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", br.com.gmp.comps.table.GMPTable.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", br.com.gmp.comps.table.GMPTable.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", br.com.gmp.comps.table.GMPTable.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", br.com.gmp.comps.table.GMPTable.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", br.com.gmp.comps.table.GMPTable.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", br.com.gmp.comps.table.GMPTable.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", br.com.gmp.comps.table.GMPTable.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", br.com.gmp.comps.table.GMPTable.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", br.com.gmp.comps.table.GMPTable.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editing] = new PropertyDescriptor ( "editing", br.com.gmp.comps.table.GMPTable.class, "isEditing", null ); // NOI18N
            properties[PROPERTY_editingColumn] = new PropertyDescriptor ( "editingColumn", br.com.gmp.comps.table.GMPTable.class, "getEditingColumn", "setEditingColumn" ); // NOI18N
            properties[PROPERTY_editingRow] = new PropertyDescriptor ( "editingRow", br.com.gmp.comps.table.GMPTable.class, "getEditingRow", "setEditingRow" ); // NOI18N
            properties[PROPERTY_editorComponent] = new PropertyDescriptor ( "editorComponent", br.com.gmp.comps.table.GMPTable.class, "getEditorComponent", null ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", br.com.gmp.comps.table.GMPTable.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_fillsViewportHeight] = new PropertyDescriptor ( "fillsViewportHeight", br.com.gmp.comps.table.GMPTable.class, "getFillsViewportHeight", "setFillsViewportHeight" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", br.com.gmp.comps.table.GMPTable.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", br.com.gmp.comps.table.GMPTable.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", br.com.gmp.comps.table.GMPTable.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", br.com.gmp.comps.table.GMPTable.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", br.com.gmp.comps.table.GMPTable.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", br.com.gmp.comps.table.GMPTable.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", br.com.gmp.comps.table.GMPTable.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", br.com.gmp.comps.table.GMPTable.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", br.com.gmp.comps.table.GMPTable.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", br.com.gmp.comps.table.GMPTable.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", br.com.gmp.comps.table.GMPTable.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", br.com.gmp.comps.table.GMPTable.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", br.com.gmp.comps.table.GMPTable.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", br.com.gmp.comps.table.GMPTable.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", br.com.gmp.comps.table.GMPTable.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_gmpModel] = new PropertyDescriptor ( "gmpModel", br.com.gmp.comps.table.GMPTable.class, "getGmpModel", "setGmpModel" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", br.com.gmp.comps.table.GMPTable.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", br.com.gmp.comps.table.GMPTable.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_gridColor] = new PropertyDescriptor ( "gridColor", br.com.gmp.comps.table.GMPTable.class, "getGridColor", "setGridColor" ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", br.com.gmp.comps.table.GMPTable.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", br.com.gmp.comps.table.GMPTable.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", br.com.gmp.comps.table.GMPTable.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", br.com.gmp.comps.table.GMPTable.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", br.com.gmp.comps.table.GMPTable.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", br.com.gmp.comps.table.GMPTable.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", br.com.gmp.comps.table.GMPTable.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", br.com.gmp.comps.table.GMPTable.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", br.com.gmp.comps.table.GMPTable.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", br.com.gmp.comps.table.GMPTable.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", br.com.gmp.comps.table.GMPTable.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_intercellSpacing] = new PropertyDescriptor ( "intercellSpacing", br.com.gmp.comps.table.GMPTable.class, "getIntercellSpacing", "setIntercellSpacing" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", br.com.gmp.comps.table.GMPTable.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", br.com.gmp.comps.table.GMPTable.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", br.com.gmp.comps.table.GMPTable.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", br.com.gmp.comps.table.GMPTable.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", br.com.gmp.comps.table.GMPTable.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", br.com.gmp.comps.table.GMPTable.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", br.com.gmp.comps.table.GMPTable.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", br.com.gmp.comps.table.GMPTable.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", br.com.gmp.comps.table.GMPTable.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_maxRows] = new PropertyDescriptor ( "maxRows", br.com.gmp.comps.table.GMPTable.class, "getMaxRows", "setMaxRows" ); // NOI18N
            properties[PROPERTY_maxRows].setPreferred ( true );
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", br.com.gmp.comps.table.GMPTable.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", br.com.gmp.comps.table.GMPTable.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", br.com.gmp.comps.table.GMPTable.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", br.com.gmp.comps.table.GMPTable.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", br.com.gmp.comps.table.GMPTable.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", br.com.gmp.comps.table.GMPTable.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", br.com.gmp.comps.table.GMPTable.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", br.com.gmp.comps.table.GMPTable.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", br.com.gmp.comps.table.GMPTable.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", br.com.gmp.comps.table.GMPTable.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", br.com.gmp.comps.table.GMPTable.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", br.com.gmp.comps.table.GMPTable.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", br.com.gmp.comps.table.GMPTable.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", br.com.gmp.comps.table.GMPTable.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", br.com.gmp.comps.table.GMPTable.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", br.com.gmp.comps.table.GMPTable.class, "getPreferredScrollableViewportSize", "setPreferredScrollableViewportSize" ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", br.com.gmp.comps.table.GMPTable.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", br.com.gmp.comps.table.GMPTable.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", br.com.gmp.comps.table.GMPTable.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", br.com.gmp.comps.table.GMPTable.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", br.com.gmp.comps.table.GMPTable.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", br.com.gmp.comps.table.GMPTable.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_rowCount] = new PropertyDescriptor ( "rowCount", br.com.gmp.comps.table.GMPTable.class, "getRowCount", null ); // NOI18N
            properties[PROPERTY_rowHeight] = new PropertyDescriptor ( "rowHeight", br.com.gmp.comps.table.GMPTable.class, "getRowHeight", "setRowHeight" ); // NOI18N
            properties[PROPERTY_rowMargin] = new PropertyDescriptor ( "rowMargin", br.com.gmp.comps.table.GMPTable.class, "getRowMargin", "setRowMargin" ); // NOI18N
            properties[PROPERTY_rowSelected] = new IndexedPropertyDescriptor ( "rowSelected", br.com.gmp.comps.table.GMPTable.class, null, null, "isRowSelected", null ); // NOI18N
            properties[PROPERTY_rowSelectionAllowed] = new PropertyDescriptor ( "rowSelectionAllowed", br.com.gmp.comps.table.GMPTable.class, "getRowSelectionAllowed", "setRowSelectionAllowed" ); // NOI18N
            properties[PROPERTY_rowSelectionInterval] = new IndexedPropertyDescriptor ( "rowSelectionInterval", br.com.gmp.comps.table.GMPTable.class, null, null, null, "setRowSelectionInterval" ); // NOI18N
            properties[PROPERTY_rowSorter] = new PropertyDescriptor ( "rowSorter", br.com.gmp.comps.table.GMPTable.class, "getRowSorter", "setRowSorter" ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", br.com.gmp.comps.table.GMPTable.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", br.com.gmp.comps.table.GMPTable.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_selectedColumn] = new PropertyDescriptor ( "selectedColumn", br.com.gmp.comps.table.GMPTable.class, "getSelectedColumn", null ); // NOI18N
            properties[PROPERTY_selectedColumnCount] = new PropertyDescriptor ( "selectedColumnCount", br.com.gmp.comps.table.GMPTable.class, "getSelectedColumnCount", null ); // NOI18N
            properties[PROPERTY_selectedColumns] = new PropertyDescriptor ( "selectedColumns", br.com.gmp.comps.table.GMPTable.class, "getSelectedColumns", null ); // NOI18N
            properties[PROPERTY_selectedRow] = new PropertyDescriptor ( "selectedRow", br.com.gmp.comps.table.GMPTable.class, "getSelectedRow", null ); // NOI18N
            properties[PROPERTY_selectedRowCount] = new PropertyDescriptor ( "selectedRowCount", br.com.gmp.comps.table.GMPTable.class, "getSelectedRowCount", null ); // NOI18N
            properties[PROPERTY_selectedRows] = new PropertyDescriptor ( "selectedRows", br.com.gmp.comps.table.GMPTable.class, "getSelectedRows", null ); // NOI18N
            properties[PROPERTY_selectionBackground] = new PropertyDescriptor ( "selectionBackground", br.com.gmp.comps.table.GMPTable.class, "getSelectionBackground", "setSelectionBackground" ); // NOI18N
            properties[PROPERTY_selectionForeground] = new PropertyDescriptor ( "selectionForeground", br.com.gmp.comps.table.GMPTable.class, "getSelectionForeground", "setSelectionForeground" ); // NOI18N
            properties[PROPERTY_selectionMode] = new PropertyDescriptor ( "selectionMode", br.com.gmp.comps.table.GMPTable.class, null, "setSelectionMode" ); // NOI18N
            properties[PROPERTY_selectionModel] = new PropertyDescriptor ( "selectionModel", br.com.gmp.comps.table.GMPTable.class, "getSelectionModel", "setSelectionModel" ); // NOI18N
            properties[PROPERTY_showGrid] = new PropertyDescriptor ( "showGrid", br.com.gmp.comps.table.GMPTable.class, null, "setShowGrid" ); // NOI18N
            properties[PROPERTY_showHorizontalLines] = new PropertyDescriptor ( "showHorizontalLines", br.com.gmp.comps.table.GMPTable.class, "getShowHorizontalLines", "setShowHorizontalLines" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", br.com.gmp.comps.table.GMPTable.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_showVerticalLines] = new PropertyDescriptor ( "showVerticalLines", br.com.gmp.comps.table.GMPTable.class, "getShowVerticalLines", "setShowVerticalLines" ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", br.com.gmp.comps.table.GMPTable.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_source] = new PropertyDescriptor ( "source", br.com.gmp.comps.table.GMPTable.class, "getSource", "setSource" ); // NOI18N
            properties[PROPERTY_source].setPreferred ( true );
            properties[PROPERTY_surrendersFocusOnKeystroke] = new PropertyDescriptor ( "surrendersFocusOnKeystroke", br.com.gmp.comps.table.GMPTable.class, "getSurrendersFocusOnKeystroke", "setSurrendersFocusOnKeystroke" ); // NOI18N
            properties[PROPERTY_tableHeader] = new PropertyDescriptor ( "tableHeader", br.com.gmp.comps.table.GMPTable.class, "getTableHeader", "setTableHeader" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", br.com.gmp.comps.table.GMPTable.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", br.com.gmp.comps.table.GMPTable.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", br.com.gmp.comps.table.GMPTable.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", br.com.gmp.comps.table.GMPTable.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", br.com.gmp.comps.table.GMPTable.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", br.com.gmp.comps.table.GMPTable.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", br.com.gmp.comps.table.GMPTable.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_updateSelectionOnSort] = new PropertyDescriptor ( "updateSelectionOnSort", br.com.gmp.comps.table.GMPTable.class, "getUpdateSelectionOnSort", "setUpdateSelectionOnSort" ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", br.com.gmp.comps.table.GMPTable.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", br.com.gmp.comps.table.GMPTable.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", br.com.gmp.comps.table.GMPTable.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", br.com.gmp.comps.table.GMPTable.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", br.com.gmp.comps.table.GMPTable.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", br.com.gmp.comps.table.GMPTable.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", br.com.gmp.comps.table.GMPTable.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", br.com.gmp.comps.table.GMPTable.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", br.com.gmp.comps.table.GMPTable.class, "getY", null ); // NOI18N
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
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( br.com.gmp.comps.table.GMPTable.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addColumn7 = 7;
    private static final int METHOD_addColumnSelectionInterval8 = 8;
    private static final int METHOD_addNotify9 = 9;
    private static final int METHOD_addPropertyChangeListener10 = 10;
    private static final int METHOD_addRowSelectionInterval11 = 11;
    private static final int METHOD_applyComponentOrientation12 = 12;
    private static final int METHOD_areFocusTraversalKeysSet13 = 13;
    private static final int METHOD_bounds14 = 14;
    private static final int METHOD_changeSelection15 = 15;
    private static final int METHOD_checkImage16 = 16;
    private static final int METHOD_checkImage17 = 17;
    private static final int METHOD_clearSelection18 = 18;
    private static final int METHOD_columnAdded19 = 19;
    private static final int METHOD_columnAtPoint20 = 20;
    private static final int METHOD_columnMarginChanged21 = 21;
    private static final int METHOD_columnMoved22 = 22;
    private static final int METHOD_columnRemoved23 = 23;
    private static final int METHOD_columnSelectionChanged24 = 24;
    private static final int METHOD_computeVisibleRect25 = 25;
    private static final int METHOD_contains26 = 26;
    private static final int METHOD_contains27 = 27;
    private static final int METHOD_convertColumnIndexToModel28 = 28;
    private static final int METHOD_convertColumnIndexToView29 = 29;
    private static final int METHOD_convertRowIndexToModel30 = 30;
    private static final int METHOD_convertRowIndexToView31 = 31;
    private static final int METHOD_countComponents32 = 32;
    private static final int METHOD_createDefaultColumnsFromModel33 = 33;
    private static final int METHOD_createImage34 = 34;
    private static final int METHOD_createImage35 = 35;
    private static final int METHOD_createScrollPaneForTable36 = 36;
    private static final int METHOD_createToolTip37 = 37;
    private static final int METHOD_createVolatileImage38 = 38;
    private static final int METHOD_createVolatileImage39 = 39;
    private static final int METHOD_deliverEvent40 = 40;
    private static final int METHOD_disable41 = 41;
    private static final int METHOD_dispatchEvent42 = 42;
    private static final int METHOD_doLayout43 = 43;
    private static final int METHOD_editCellAt44 = 44;
    private static final int METHOD_editCellAt45 = 45;
    private static final int METHOD_editingCanceled46 = 46;
    private static final int METHOD_editingStopped47 = 47;
    private static final int METHOD_enable48 = 48;
    private static final int METHOD_enable49 = 49;
    private static final int METHOD_enableInputMethods50 = 50;
    private static final int METHOD_findComponentAt51 = 51;
    private static final int METHOD_findComponentAt52 = 52;
    private static final int METHOD_firePropertyChange53 = 53;
    private static final int METHOD_firePropertyChange54 = 54;
    private static final int METHOD_firePropertyChange55 = 55;
    private static final int METHOD_firePropertyChange56 = 56;
    private static final int METHOD_firePropertyChange57 = 57;
    private static final int METHOD_firePropertyChange58 = 58;
    private static final int METHOD_firePropertyChange59 = 59;
    private static final int METHOD_firePropertyChange60 = 60;
    private static final int METHOD_getActionForKeyStroke61 = 61;
    private static final int METHOD_getBaseline62 = 62;
    private static final int METHOD_getBounds63 = 63;
    private static final int METHOD_getCellEditor64 = 64;
    private static final int METHOD_getCellRect65 = 65;
    private static final int METHOD_getCellRenderer66 = 66;
    private static final int METHOD_getClientProperty67 = 67;
    private static final int METHOD_getColumn68 = 68;
    private static final int METHOD_getComponentAt69 = 69;
    private static final int METHOD_getComponentAt70 = 70;
    private static final int METHOD_getComponentZOrder71 = 71;
    private static final int METHOD_getConditionForKeyStroke72 = 72;
    private static final int METHOD_getDefaultEditor73 = 73;
    private static final int METHOD_getDefaultLocale74 = 74;
    private static final int METHOD_getDefaultRenderer75 = 75;
    private static final int METHOD_getFocusTraversalKeys76 = 76;
    private static final int METHOD_getFontMetrics77 = 77;
    private static final int METHOD_getInsets78 = 78;
    private static final int METHOD_getListeners79 = 79;
    private static final int METHOD_getLocation80 = 80;
    private static final int METHOD_getMousePosition81 = 81;
    private static final int METHOD_getPopupLocation82 = 82;
    private static final int METHOD_getPrintable83 = 83;
    private static final int METHOD_getPropertyChangeListeners84 = 84;
    private static final int METHOD_getScrollableBlockIncrement85 = 85;
    private static final int METHOD_getScrollableUnitIncrement86 = 86;
    private static final int METHOD_getSize87 = 87;
    private static final int METHOD_getToolTipLocation88 = 88;
    private static final int METHOD_getToolTipText89 = 89;
    private static final int METHOD_getValueAt90 = 90;
    private static final int METHOD_gotFocus91 = 91;
    private static final int METHOD_grabFocus92 = 92;
    private static final int METHOD_handleEvent93 = 93;
    private static final int METHOD_hasFocus94 = 94;
    private static final int METHOD_hide95 = 95;
    private static final int METHOD_imageUpdate96 = 96;
    private static final int METHOD_insets97 = 97;
    private static final int METHOD_inside98 = 98;
    private static final int METHOD_invalidate99 = 99;
    private static final int METHOD_isAncestorOf100 = 100;
    private static final int METHOD_isCellEditable101 = 101;
    private static final int METHOD_isCellSelected102 = 102;
    private static final int METHOD_isFocusCycleRoot103 = 103;
    private static final int METHOD_isLightweightComponent104 = 104;
    private static final int METHOD_keyDown105 = 105;
    private static final int METHOD_keyUp106 = 106;
    private static final int METHOD_layout107 = 107;
    private static final int METHOD_list108 = 108;
    private static final int METHOD_list109 = 109;
    private static final int METHOD_list110 = 110;
    private static final int METHOD_list111 = 111;
    private static final int METHOD_list112 = 112;
    private static final int METHOD_locate113 = 113;
    private static final int METHOD_location114 = 114;
    private static final int METHOD_lostFocus115 = 115;
    private static final int METHOD_minimumSize116 = 116;
    private static final int METHOD_mouseDown117 = 117;
    private static final int METHOD_mouseDrag118 = 118;
    private static final int METHOD_mouseEnter119 = 119;
    private static final int METHOD_mouseExit120 = 120;
    private static final int METHOD_mouseMove121 = 121;
    private static final int METHOD_mouseUp122 = 122;
    private static final int METHOD_move123 = 123;
    private static final int METHOD_moveColumn124 = 124;
    private static final int METHOD_nextFocus125 = 125;
    private static final int METHOD_paint126 = 126;
    private static final int METHOD_paintAll127 = 127;
    private static final int METHOD_paintComponents128 = 128;
    private static final int METHOD_paintImmediately129 = 129;
    private static final int METHOD_paintImmediately130 = 130;
    private static final int METHOD_postEvent131 = 131;
    private static final int METHOD_preferredSize132 = 132;
    private static final int METHOD_prepareEditor133 = 133;
    private static final int METHOD_prepareImage134 = 134;
    private static final int METHOD_prepareImage135 = 135;
    private static final int METHOD_print136 = 136;
    private static final int METHOD_print137 = 137;
    private static final int METHOD_print138 = 138;
    private static final int METHOD_print139 = 139;
    private static final int METHOD_print140 = 140;
    private static final int METHOD_print141 = 141;
    private static final int METHOD_printAll142 = 142;
    private static final int METHOD_printComponents143 = 143;
    private static final int METHOD_putClientProperty144 = 144;
    private static final int METHOD_registerKeyboardAction145 = 145;
    private static final int METHOD_registerKeyboardAction146 = 146;
    private static final int METHOD_remove147 = 147;
    private static final int METHOD_remove148 = 148;
    private static final int METHOD_remove149 = 149;
    private static final int METHOD_removeAll150 = 150;
    private static final int METHOD_removeColumn151 = 151;
    private static final int METHOD_removeColumnSelectionInterval152 = 152;
    private static final int METHOD_removeEditor153 = 153;
    private static final int METHOD_removeNotify154 = 154;
    private static final int METHOD_removePropertyChangeListener155 = 155;
    private static final int METHOD_removeRowSelectionInterval156 = 156;
    private static final int METHOD_repaint157 = 157;
    private static final int METHOD_repaint158 = 158;
    private static final int METHOD_repaint159 = 159;
    private static final int METHOD_repaint160 = 160;
    private static final int METHOD_repaint161 = 161;
    private static final int METHOD_requestDefaultFocus162 = 162;
    private static final int METHOD_requestFocus163 = 163;
    private static final int METHOD_requestFocus164 = 164;
    private static final int METHOD_requestFocusInWindow165 = 165;
    private static final int METHOD_resetKeyboardActions166 = 166;
    private static final int METHOD_reshape167 = 167;
    private static final int METHOD_resize168 = 168;
    private static final int METHOD_resize169 = 169;
    private static final int METHOD_revalidate170 = 170;
    private static final int METHOD_rowAtPoint171 = 171;
    private static final int METHOD_scrollRectToVisible172 = 172;
    private static final int METHOD_selectAll173 = 173;
    private static final int METHOD_setBounds174 = 174;
    private static final int METHOD_setComponentZOrder175 = 175;
    private static final int METHOD_setDefaultEditor176 = 176;
    private static final int METHOD_setDefaultLocale177 = 177;
    private static final int METHOD_setDefaultRenderer178 = 178;
    private static final int METHOD_setRowHeight179 = 179;
    private static final int METHOD_setValueAt180 = 180;
    private static final int METHOD_show181 = 181;
    private static final int METHOD_show182 = 182;
    private static final int METHOD_size183 = 183;
    private static final int METHOD_sizeColumnsToFit184 = 184;
    private static final int METHOD_sizeColumnsToFit185 = 185;
    private static final int METHOD_sorterChanged186 = 186;
    private static final int METHOD_tableChanged187 = 187;
    private static final int METHOD_toString188 = 188;
    private static final int METHOD_transferFocus189 = 189;
    private static final int METHOD_transferFocusBackward190 = 190;
    private static final int METHOD_transferFocusDownCycle191 = 191;
    private static final int METHOD_transferFocusUpCycle192 = 192;
    private static final int METHOD_unregisterKeyboardAction193 = 193;
    private static final int METHOD_update194 = 194;
    private static final int METHOD_updateUI195 = 195;
    private static final int METHOD_validate196 = 196;
    private static final int METHOD_valueChanged197 = 197;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[198];
    
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
            methods[METHOD_addColumn7] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addColumn", new Class[] {javax.swing.table.TableColumn.class})); // NOI18N
            methods[METHOD_addColumn7].setDisplayName ( "" );
            methods[METHOD_addColumnSelectionInterval8] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addColumnSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_addColumnSelectionInterval8].setDisplayName ( "" );
            methods[METHOD_addNotify9] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify9].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener10] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener10].setDisplayName ( "" );
            methods[METHOD_addRowSelectionInterval11] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addRowSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_addRowSelectionInterval11].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation12] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation12].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet13] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet13].setDisplayName ( "" );
            methods[METHOD_bounds14] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds14].setDisplayName ( "" );
            methods[METHOD_changeSelection15] = new MethodDescriptor(javax.swing.JTable.class.getMethod("changeSelection", new Class[] {int.class, int.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_changeSelection15].setDisplayName ( "" );
            methods[METHOD_checkImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage16].setDisplayName ( "" );
            methods[METHOD_checkImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage17].setDisplayName ( "" );
            methods[METHOD_clearSelection18] = new MethodDescriptor(javax.swing.JTable.class.getMethod("clearSelection", new Class[] {})); // NOI18N
            methods[METHOD_clearSelection18].setDisplayName ( "" );
            methods[METHOD_columnAdded19] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnAdded", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnAdded19].setDisplayName ( "" );
            methods[METHOD_columnAtPoint20] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnAtPoint", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_columnAtPoint20].setDisplayName ( "" );
            methods[METHOD_columnMarginChanged21] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnMarginChanged", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_columnMarginChanged21].setDisplayName ( "" );
            methods[METHOD_columnMoved22] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnMoved", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnMoved22].setDisplayName ( "" );
            methods[METHOD_columnRemoved23] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnRemoved", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnRemoved23].setDisplayName ( "" );
            methods[METHOD_columnSelectionChanged24] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnSelectionChanged", new Class[] {javax.swing.event.ListSelectionEvent.class})); // NOI18N
            methods[METHOD_columnSelectionChanged24].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect25].setDisplayName ( "" );
            methods[METHOD_contains26] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains26].setDisplayName ( "" );
            methods[METHOD_contains27] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains27].setDisplayName ( "" );
            methods[METHOD_convertColumnIndexToModel28] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertColumnIndexToModel", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertColumnIndexToModel28].setDisplayName ( "" );
            methods[METHOD_convertColumnIndexToView29] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertColumnIndexToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertColumnIndexToView29].setDisplayName ( "" );
            methods[METHOD_convertRowIndexToModel30] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertRowIndexToModel", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertRowIndexToModel30].setDisplayName ( "" );
            methods[METHOD_convertRowIndexToView31] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertRowIndexToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertRowIndexToView31].setDisplayName ( "" );
            methods[METHOD_countComponents32] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents32].setDisplayName ( "" );
            methods[METHOD_createDefaultColumnsFromModel33] = new MethodDescriptor(javax.swing.JTable.class.getMethod("createDefaultColumnsFromModel", new Class[] {})); // NOI18N
            methods[METHOD_createDefaultColumnsFromModel33].setDisplayName ( "" );
            methods[METHOD_createImage34] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage34].setDisplayName ( "" );
            methods[METHOD_createImage35] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage35].setDisplayName ( "" );
            methods[METHOD_createScrollPaneForTable36] = new MethodDescriptor(javax.swing.JTable.class.getMethod("createScrollPaneForTable", new Class[] {javax.swing.JTable.class})); // NOI18N
            methods[METHOD_createScrollPaneForTable36].setDisplayName ( "" );
            methods[METHOD_createToolTip37] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip37].setDisplayName ( "" );
            methods[METHOD_createVolatileImage38] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage38].setDisplayName ( "" );
            methods[METHOD_createVolatileImage39] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage39].setDisplayName ( "" );
            methods[METHOD_deliverEvent40] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent40].setDisplayName ( "" );
            methods[METHOD_disable41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable41].setDisplayName ( "" );
            methods[METHOD_dispatchEvent42] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent42].setDisplayName ( "" );
            methods[METHOD_doLayout43] = new MethodDescriptor(javax.swing.JTable.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout43].setDisplayName ( "" );
            methods[METHOD_editCellAt44] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editCellAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_editCellAt44].setDisplayName ( "" );
            methods[METHOD_editCellAt45] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editCellAt", new Class[] {int.class, int.class, java.util.EventObject.class})); // NOI18N
            methods[METHOD_editCellAt45].setDisplayName ( "" );
            methods[METHOD_editingCanceled46] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editingCanceled", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_editingCanceled46].setDisplayName ( "" );
            methods[METHOD_editingStopped47] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editingStopped", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_editingStopped47].setDisplayName ( "" );
            methods[METHOD_enable48] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable48].setDisplayName ( "" );
            methods[METHOD_enable49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable49].setDisplayName ( "" );
            methods[METHOD_enableInputMethods50] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods50].setDisplayName ( "" );
            methods[METHOD_findComponentAt51] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt51].setDisplayName ( "" );
            methods[METHOD_findComponentAt52] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt52].setDisplayName ( "" );
            methods[METHOD_firePropertyChange53] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange53].setDisplayName ( "" );
            methods[METHOD_firePropertyChange54] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange54].setDisplayName ( "" );
            methods[METHOD_firePropertyChange55] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange55].setDisplayName ( "" );
            methods[METHOD_firePropertyChange56] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange56].setDisplayName ( "" );
            methods[METHOD_firePropertyChange57] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange57].setDisplayName ( "" );
            methods[METHOD_firePropertyChange58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange58].setDisplayName ( "" );
            methods[METHOD_firePropertyChange59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange59].setDisplayName ( "" );
            methods[METHOD_firePropertyChange60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange60].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke61].setDisplayName ( "" );
            methods[METHOD_getBaseline62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline62].setDisplayName ( "" );
            methods[METHOD_getBounds63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds63].setDisplayName ( "" );
            methods[METHOD_getCellEditor64] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getCellEditor", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getCellEditor64].setDisplayName ( "" );
            methods[METHOD_getCellRect65] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getCellRect", new Class[] {int.class, int.class, boolean.class})); // NOI18N
            methods[METHOD_getCellRect65].setDisplayName ( "" );
            methods[METHOD_getCellRenderer66] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getCellRenderer", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getCellRenderer66].setDisplayName ( "" );
            methods[METHOD_getClientProperty67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty67].setDisplayName ( "" );
            methods[METHOD_getColumn68] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getColumn", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getColumn68].setDisplayName ( "" );
            methods[METHOD_getComponentAt69] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt69].setDisplayName ( "" );
            methods[METHOD_getComponentAt70] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt70].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder71] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder71].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke72] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke72].setDisplayName ( "" );
            methods[METHOD_getDefaultEditor73] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getDefaultEditor", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getDefaultEditor73].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale74] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale74].setDisplayName ( "" );
            methods[METHOD_getDefaultRenderer75] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getDefaultRenderer", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getDefaultRenderer75].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys76] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys76].setDisplayName ( "" );
            methods[METHOD_getFontMetrics77] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics77].setDisplayName ( "" );
            methods[METHOD_getInsets78] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets78].setDisplayName ( "" );
            methods[METHOD_getListeners79] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners79].setDisplayName ( "" );
            methods[METHOD_getLocation80] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation80].setDisplayName ( "" );
            methods[METHOD_getMousePosition81] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition81].setDisplayName ( "" );
            methods[METHOD_getPopupLocation82] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation82].setDisplayName ( "" );
            methods[METHOD_getPrintable83] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getPrintable", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable83].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners84] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners84].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement85] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement85].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement86] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement86].setDisplayName ( "" );
            methods[METHOD_getSize87] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize87].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation88] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation88].setDisplayName ( "" );
            methods[METHOD_getToolTipText89] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText89].setDisplayName ( "" );
            methods[METHOD_getValueAt90] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getValueAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getValueAt90].setDisplayName ( "" );
            methods[METHOD_gotFocus91] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus91].setDisplayName ( "" );
            methods[METHOD_grabFocus92] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus92].setDisplayName ( "" );
            methods[METHOD_handleEvent93] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent93].setDisplayName ( "" );
            methods[METHOD_hasFocus94] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus94].setDisplayName ( "" );
            methods[METHOD_hide95] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide95].setDisplayName ( "" );
            methods[METHOD_imageUpdate96] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate96].setDisplayName ( "" );
            methods[METHOD_insets97] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets97].setDisplayName ( "" );
            methods[METHOD_inside98] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside98].setDisplayName ( "" );
            methods[METHOD_invalidate99] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate99].setDisplayName ( "" );
            methods[METHOD_isAncestorOf100] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf100].setDisplayName ( "" );
            methods[METHOD_isCellEditable101] = new MethodDescriptor(javax.swing.JTable.class.getMethod("isCellEditable", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_isCellEditable101].setDisplayName ( "" );
            methods[METHOD_isCellSelected102] = new MethodDescriptor(javax.swing.JTable.class.getMethod("isCellSelected", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_isCellSelected102].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot103] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot103].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent104] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent104].setDisplayName ( "" );
            methods[METHOD_keyDown105] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown105].setDisplayName ( "" );
            methods[METHOD_keyUp106] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp106].setDisplayName ( "" );
            methods[METHOD_layout107] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout107].setDisplayName ( "" );
            methods[METHOD_list108] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list108].setDisplayName ( "" );
            methods[METHOD_list109] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list109].setDisplayName ( "" );
            methods[METHOD_list110] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list110].setDisplayName ( "" );
            methods[METHOD_list111] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list111].setDisplayName ( "" );
            methods[METHOD_list112] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list112].setDisplayName ( "" );
            methods[METHOD_locate113] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate113].setDisplayName ( "" );
            methods[METHOD_location114] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location114].setDisplayName ( "" );
            methods[METHOD_lostFocus115] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus115].setDisplayName ( "" );
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
            methods[METHOD_moveColumn124] = new MethodDescriptor(javax.swing.JTable.class.getMethod("moveColumn", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_moveColumn124].setDisplayName ( "" );
            methods[METHOD_nextFocus125] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus125].setDisplayName ( "" );
            methods[METHOD_paint126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint126].setDisplayName ( "" );
            methods[METHOD_paintAll127] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll127].setDisplayName ( "" );
            methods[METHOD_paintComponents128] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents128].setDisplayName ( "" );
            methods[METHOD_paintImmediately129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately129].setDisplayName ( "" );
            methods[METHOD_paintImmediately130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately130].setDisplayName ( "" );
            methods[METHOD_postEvent131] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent131].setDisplayName ( "" );
            methods[METHOD_preferredSize132] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize132].setDisplayName ( "" );
            methods[METHOD_prepareEditor133] = new MethodDescriptor(javax.swing.JTable.class.getMethod("prepareEditor", new Class[] {javax.swing.table.TableCellEditor.class, int.class, int.class})); // NOI18N
            methods[METHOD_prepareEditor133].setDisplayName ( "" );
            methods[METHOD_prepareImage134] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage134].setDisplayName ( "" );
            methods[METHOD_prepareImage135] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage135].setDisplayName ( "" );
            methods[METHOD_print136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print136].setDisplayName ( "" );
            methods[METHOD_print137] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print137].setDisplayName ( "" );
            methods[METHOD_print138] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class})); // NOI18N
            methods[METHOD_print138].setDisplayName ( "" );
            methods[METHOD_print139] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print139].setDisplayName ( "" );
            methods[METHOD_print140] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print140].setDisplayName ( "" );
            methods[METHOD_print141] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class, javax.print.PrintService.class})); // NOI18N
            methods[METHOD_print141].setDisplayName ( "" );
            methods[METHOD_printAll142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll142].setDisplayName ( "" );
            methods[METHOD_printComponents143] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents143].setDisplayName ( "" );
            methods[METHOD_putClientProperty144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty144].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction145] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction145].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction146].setDisplayName ( "" );
            methods[METHOD_remove147] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove147].setDisplayName ( "" );
            methods[METHOD_remove148] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove148].setDisplayName ( "" );
            methods[METHOD_remove149] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove149].setDisplayName ( "" );
            methods[METHOD_removeAll150] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll150].setDisplayName ( "" );
            methods[METHOD_removeColumn151] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeColumn", new Class[] {javax.swing.table.TableColumn.class})); // NOI18N
            methods[METHOD_removeColumn151].setDisplayName ( "" );
            methods[METHOD_removeColumnSelectionInterval152] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeColumnSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_removeColumnSelectionInterval152].setDisplayName ( "" );
            methods[METHOD_removeEditor153] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeEditor", new Class[] {})); // NOI18N
            methods[METHOD_removeEditor153].setDisplayName ( "" );
            methods[METHOD_removeNotify154] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify154].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener155] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener155].setDisplayName ( "" );
            methods[METHOD_removeRowSelectionInterval156] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeRowSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_removeRowSelectionInterval156].setDisplayName ( "" );
            methods[METHOD_repaint157] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint157].setDisplayName ( "" );
            methods[METHOD_repaint158] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint158].setDisplayName ( "" );
            methods[METHOD_repaint159] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint159].setDisplayName ( "" );
            methods[METHOD_repaint160] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint160].setDisplayName ( "" );
            methods[METHOD_repaint161] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint161].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus162] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus162].setDisplayName ( "" );
            methods[METHOD_requestFocus163] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus163].setDisplayName ( "" );
            methods[METHOD_requestFocus164] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus164].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow165] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow165].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions166] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions166].setDisplayName ( "" );
            methods[METHOD_reshape167] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape167].setDisplayName ( "" );
            methods[METHOD_resize168] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize168].setDisplayName ( "" );
            methods[METHOD_resize169] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize169].setDisplayName ( "" );
            methods[METHOD_revalidate170] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate170].setDisplayName ( "" );
            methods[METHOD_rowAtPoint171] = new MethodDescriptor(javax.swing.JTable.class.getMethod("rowAtPoint", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_rowAtPoint171].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible172] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible172].setDisplayName ( "" );
            methods[METHOD_selectAll173] = new MethodDescriptor(javax.swing.JTable.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll173].setDisplayName ( "" );
            methods[METHOD_setBounds174] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds174].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder175] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder175].setDisplayName ( "" );
            methods[METHOD_setDefaultEditor176] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setDefaultEditor", new Class[] {java.lang.Class.class, javax.swing.table.TableCellEditor.class})); // NOI18N
            methods[METHOD_setDefaultEditor176].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale177] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale177].setDisplayName ( "" );
            methods[METHOD_setDefaultRenderer178] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setDefaultRenderer", new Class[] {java.lang.Class.class, javax.swing.table.TableCellRenderer.class})); // NOI18N
            methods[METHOD_setDefaultRenderer178].setDisplayName ( "" );
            methods[METHOD_setRowHeight179] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setRowHeight", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_setRowHeight179].setDisplayName ( "" );
            methods[METHOD_setValueAt180] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setValueAt", new Class[] {java.lang.Object.class, int.class, int.class})); // NOI18N
            methods[METHOD_setValueAt180].setDisplayName ( "" );
            methods[METHOD_show181] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show181].setDisplayName ( "" );
            methods[METHOD_show182] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show182].setDisplayName ( "" );
            methods[METHOD_size183] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size183].setDisplayName ( "" );
            methods[METHOD_sizeColumnsToFit184] = new MethodDescriptor(javax.swing.JTable.class.getMethod("sizeColumnsToFit", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_sizeColumnsToFit184].setDisplayName ( "" );
            methods[METHOD_sizeColumnsToFit185] = new MethodDescriptor(javax.swing.JTable.class.getMethod("sizeColumnsToFit", new Class[] {int.class})); // NOI18N
            methods[METHOD_sizeColumnsToFit185].setDisplayName ( "" );
            methods[METHOD_sorterChanged186] = new MethodDescriptor(javax.swing.JTable.class.getMethod("sorterChanged", new Class[] {javax.swing.event.RowSorterEvent.class})); // NOI18N
            methods[METHOD_sorterChanged186].setDisplayName ( "" );
            methods[METHOD_tableChanged187] = new MethodDescriptor(javax.swing.JTable.class.getMethod("tableChanged", new Class[] {javax.swing.event.TableModelEvent.class})); // NOI18N
            methods[METHOD_tableChanged187].setDisplayName ( "" );
            methods[METHOD_toString188] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString188].setDisplayName ( "" );
            methods[METHOD_transferFocus189] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus189].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward190] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward190].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle191] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle191].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle192] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle192].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction193] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction193].setDisplayName ( "" );
            methods[METHOD_update194] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update194].setDisplayName ( "" );
            methods[METHOD_updateUI195] = new MethodDescriptor(javax.swing.JTable.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI195].setDisplayName ( "" );
            methods[METHOD_validate196] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate196].setDisplayName ( "" );
            methods[METHOD_valueChanged197] = new MethodDescriptor(javax.swing.JTable.class.getMethod("valueChanged", new Class[] {javax.swing.event.ListSelectionEvent.class})); // NOI18N
            methods[METHOD_valueChanged197].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/res/table.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/res/table_32.png";
    private static String iconNameM16 = "/res/table_gray.png";
    private static String iconNameM32 = "/res/table_gray_32.png";//GEN-END:Icons

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
