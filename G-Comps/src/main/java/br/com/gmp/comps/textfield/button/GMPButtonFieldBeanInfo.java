package br.com.gmp.comps.textfield.button;

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
public class GMPButtonFieldBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( br.com.gmp.comps.textfield.button.GMPButtonField.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_action = 1;
    private static final int PROPERTY_actionCommand = 2;
    private static final int PROPERTY_actionListener = 3;
    private static final int PROPERTY_actionListeners = 4;
    private static final int PROPERTY_actionMap = 5;
    private static final int PROPERTY_actions = 6;
    private static final int PROPERTY_alignmentX = 7;
    private static final int PROPERTY_alignmentY = 8;
    private static final int PROPERTY_ancestorListeners = 9;
    private static final int PROPERTY_autoscrolls = 10;
    private static final int PROPERTY_background = 11;
    private static final int PROPERTY_backgroundSet = 12;
    private static final int PROPERTY_baselineResizeBehavior = 13;
    private static final int PROPERTY_boolean = 14;
    private static final int PROPERTY_border = 15;
    private static final int PROPERTY_bounds = 16;
    private static final int PROPERTY_buttonPosition = 17;
    private static final int PROPERTY_caret = 18;
    private static final int PROPERTY_caretColor = 19;
    private static final int PROPERTY_caretListeners = 20;
    private static final int PROPERTY_caretPosition = 21;
    private static final int PROPERTY_colorModel = 22;
    private static final int PROPERTY_columns = 23;
    private static final int PROPERTY_component = 24;
    private static final int PROPERTY_componentCount = 25;
    private static final int PROPERTY_componentListeners = 26;
    private static final int PROPERTY_componentOrientation = 27;
    private static final int PROPERTY_componentPopupMenu = 28;
    private static final int PROPERTY_components = 29;
    private static final int PROPERTY_containerListeners = 30;
    private static final int PROPERTY_cursor = 31;
    private static final int PROPERTY_cursorSet = 32;
    private static final int PROPERTY_debugGraphicsOptions = 33;
    private static final int PROPERTY_disabledTextColor = 34;
    private static final int PROPERTY_displayable = 35;
    private static final int PROPERTY_document = 36;
    private static final int PROPERTY_doubleBuffered = 37;
    private static final int PROPERTY_dragEnabled = 38;
    private static final int PROPERTY_dropLocation = 39;
    private static final int PROPERTY_dropMode = 40;
    private static final int PROPERTY_dropTarget = 41;
    private static final int PROPERTY_editable = 42;
    private static final int PROPERTY_enabled = 43;
    private static final int PROPERTY_focusable = 44;
    private static final int PROPERTY_focusAccelerator = 45;
    private static final int PROPERTY_focusCycleRoot = 46;
    private static final int PROPERTY_focusCycleRootAncestor = 47;
    private static final int PROPERTY_focusListeners = 48;
    private static final int PROPERTY_focusOwner = 49;
    private static final int PROPERTY_focusTraversable = 50;
    private static final int PROPERTY_focusTraversalKeys = 51;
    private static final int PROPERTY_focusTraversalKeysEnabled = 52;
    private static final int PROPERTY_focusTraversalPolicy = 53;
    private static final int PROPERTY_focusTraversalPolicyProvider = 54;
    private static final int PROPERTY_focusTraversalPolicySet = 55;
    private static final int PROPERTY_font = 56;
    private static final int PROPERTY_fontSet = 57;
    private static final int PROPERTY_force = 58;
    private static final int PROPERTY_foreground = 59;
    private static final int PROPERTY_foregroundSet = 60;
    private static final int PROPERTY_graphics = 61;
    private static final int PROPERTY_graphicsConfiguration = 62;
    private static final int PROPERTY_height = 63;
    private static final int PROPERTY_hierarchyBoundsListeners = 64;
    private static final int PROPERTY_hierarchyListeners = 65;
    private static final int PROPERTY_highlighter = 66;
    private static final int PROPERTY_horizontalAlignment = 67;
    private static final int PROPERTY_horizontalVisibility = 68;
    private static final int PROPERTY_icon = 69;
    private static final int PROPERTY_ignoreRepaint = 70;
    private static final int PROPERTY_inheritsPopupMenu = 71;
    private static final int PROPERTY_inputContext = 72;
    private static final int PROPERTY_inputMap = 73;
    private static final int PROPERTY_inputMethodListeners = 74;
    private static final int PROPERTY_inputMethodRequests = 75;
    private static final int PROPERTY_inputVerifier = 76;
    private static final int PROPERTY_insets = 77;
    private static final int PROPERTY_int = 78;
    private static final int PROPERTY_integer = 79;
    private static final int PROPERTY_invalidMsg = 80;
    private static final int PROPERTY_keyListeners = 81;
    private static final int PROPERTY_keymap = 82;
    private static final int PROPERTY_layout = 83;
    private static final int PROPERTY_lightweight = 84;
    private static final int PROPERTY_locale = 85;
    private static final int PROPERTY_location = 86;
    private static final int PROPERTY_locationOnScreen = 87;
    private static final int PROPERTY_long = 88;
    private static final int PROPERTY_managingFocus = 89;
    private static final int PROPERTY_margin = 90;
    private static final int PROPERTY_maximumlength = 91;
    private static final int PROPERTY_maximumSize = 92;
    private static final int PROPERTY_maximumSizeSet = 93;
    private static final int PROPERTY_minimallength = 94;
    private static final int PROPERTY_minimumSize = 95;
    private static final int PROPERTY_minimumSizeSet = 96;
    private static final int PROPERTY_mouseListeners = 97;
    private static final int PROPERTY_mouseMotionListeners = 98;
    private static final int PROPERTY_mousePosition = 99;
    private static final int PROPERTY_mouseWheelListeners = 100;
    private static final int PROPERTY_name = 101;
    private static final int PROPERTY_navigationFilter = 102;
    private static final int PROPERTY_nextFocusableComponent = 103;
    private static final int PROPERTY_opaque = 104;
    private static final int PROPERTY_optimizedDrawingEnabled = 105;
    private static final int PROPERTY_paintingForPrint = 106;
    private static final int PROPERTY_paintingTile = 107;
    private static final int PROPERTY_parent = 108;
    private static final int PROPERTY_peer = 109;
    private static final int PROPERTY_placeholder = 110;
    private static final int PROPERTY_preferredScrollableViewportSize = 111;
    private static final int PROPERTY_preferredSize = 112;
    private static final int PROPERTY_preferredSizeSet = 113;
    private static final int PROPERTY_propertyChangeListeners = 114;
    private static final int PROPERTY_registeredKeyStrokes = 115;
    private static final int PROPERTY_requestFocusEnabled = 116;
    private static final int PROPERTY_rootPane = 117;
    private static final int PROPERTY_scrollableTracksViewportHeight = 118;
    private static final int PROPERTY_scrollableTracksViewportWidth = 119;
    private static final int PROPERTY_scrollOffset = 120;
    private static final int PROPERTY_selectedText = 121;
    private static final int PROPERTY_selectedTextColor = 122;
    private static final int PROPERTY_selectionColor = 123;
    private static final int PROPERTY_selectionEnd = 124;
    private static final int PROPERTY_selectionStart = 125;
    private static final int PROPERTY_showing = 126;
    private static final int PROPERTY_size = 127;
    private static final int PROPERTY_text = 128;
    private static final int PROPERTY_toolkit = 129;
    private static final int PROPERTY_toolTipText = 130;
    private static final int PROPERTY_topLevelAncestor = 131;
    private static final int PROPERTY_transferHandler = 132;
    private static final int PROPERTY_treeLock = 133;
    private static final int PROPERTY_UI = 134;
    private static final int PROPERTY_UIClassID = 135;
    private static final int PROPERTY_valid = 136;
    private static final int PROPERTY_validateRoot = 137;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 138;
    private static final int PROPERTY_vetoableChangeListeners = 139;
    private static final int PROPERTY_visible = 140;
    private static final int PROPERTY_visibleRect = 141;
    private static final int PROPERTY_width = 142;
    private static final int PROPERTY_x = 143;
    private static final int PROPERTY_y = 144;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[145];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", br.com.gmp.comps.textfield.button.GMPButtonField.class, null, "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListener] = new PropertyDescriptor ( "actionListener", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getActionListener", "setActionListener" ); // NOI18N
            properties[PROPERTY_actionListener].setPreferred ( true );
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actions] = new PropertyDescriptor ( "actions", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getActions", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_boolean] = new PropertyDescriptor ( "boolean", br.com.gmp.comps.textfield.button.GMPButtonField.class, null, "setBoolean" ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_buttonPosition] = new PropertyDescriptor ( "buttonPosition", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getButtonPosition", "setButtonPosition" ); // NOI18N
            properties[PROPERTY_caret] = new PropertyDescriptor ( "caret", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getCaret", "setCaret" ); // NOI18N
            properties[PROPERTY_caretColor] = new PropertyDescriptor ( "caretColor", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getCaretColor", "setCaretColor" ); // NOI18N
            properties[PROPERTY_caretListeners] = new PropertyDescriptor ( "caretListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getCaretListeners", null ); // NOI18N
            properties[PROPERTY_caretPosition] = new PropertyDescriptor ( "caretPosition", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getCaretPosition", "setCaretPosition" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_columns] = new PropertyDescriptor ( "columns", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getColumns", "setColumns" ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", br.com.gmp.comps.textfield.button.GMPButtonField.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_disabledTextColor] = new PropertyDescriptor ( "disabledTextColor", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getDisabledTextColor", "setDisabledTextColor" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_document] = new PropertyDescriptor ( "document", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getDocument", "setDocument" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusAccelerator] = new PropertyDescriptor ( "focusAccelerator", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getFocusAccelerator", "setFocusAccelerator" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", br.com.gmp.comps.textfield.button.GMPButtonField.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_font].setPreferred ( true );
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_force] = new PropertyDescriptor ( "force", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isForce", "setForce" ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_highlighter] = new PropertyDescriptor ( "highlighter", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getHighlighter", "setHighlighter" ); // NOI18N
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalVisibility] = new PropertyDescriptor ( "horizontalVisibility", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getHorizontalVisibility", null ); // NOI18N
            properties[PROPERTY_icon] = new PropertyDescriptor ( "icon", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getIcon", "setIcon" ); // NOI18N
            properties[PROPERTY_icon].setPreferred ( true );
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_int] = new PropertyDescriptor ( "int", br.com.gmp.comps.textfield.button.GMPButtonField.class, null, "setInt" ); // NOI18N
            properties[PROPERTY_integer] = new PropertyDescriptor ( "integer", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInteger", null ); // NOI18N
            properties[PROPERTY_invalidMsg] = new PropertyDescriptor ( "invalidMsg", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getInvalidMsg", "setInvalidMsg" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_keymap] = new PropertyDescriptor ( "keymap", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getKeymap", "setKeymap" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_long] = new PropertyDescriptor ( "long", br.com.gmp.comps.textfield.button.GMPButtonField.class, null, "setLong" ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumlength] = new PropertyDescriptor ( "maximumlength", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMaximumlength", "setMaximumlength" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimallength] = new PropertyDescriptor ( "minimallength", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMinimallength", "setMinimallength" ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_navigationFilter] = new PropertyDescriptor ( "navigationFilter", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getNavigationFilter", "setNavigationFilter" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_placeholder] = new PropertyDescriptor ( "placeholder", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getPlaceholder", "setPlaceholder" ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getPreferredScrollableViewportSize", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_scrollOffset] = new PropertyDescriptor ( "scrollOffset", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getScrollOffset", "setScrollOffset" ); // NOI18N
            properties[PROPERTY_selectedText] = new PropertyDescriptor ( "selectedText", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getSelectedText", null ); // NOI18N
            properties[PROPERTY_selectedTextColor] = new PropertyDescriptor ( "selectedTextColor", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getSelectedTextColor", "setSelectedTextColor" ); // NOI18N
            properties[PROPERTY_selectionColor] = new PropertyDescriptor ( "selectionColor", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getSelectionColor", "setSelectionColor" ); // NOI18N
            properties[PROPERTY_selectionEnd] = new PropertyDescriptor ( "selectionEnd", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getSelectionEnd", "setSelectionEnd" ); // NOI18N
            properties[PROPERTY_selectionStart] = new PropertyDescriptor ( "selectionStart", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getSelectionStart", "setSelectionStart" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_text].setPreferred ( true );
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_toolTipText].setPreferred ( true );
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", br.com.gmp.comps.textfield.button.GMPButtonField.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", br.com.gmp.comps.textfield.button.GMPButtonField.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_caretListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_keyListener = 9;
    private static final int EVENT_mouseListener = 10;
    private static final int EVENT_mouseMotionListener = 11;
    private static final int EVENT_mouseWheelListener = 12;
    private static final int EVENT_propertyChangeListener = 13;
    private static final int EVENT_vetoableChangeListener = 14;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[15];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_caretListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "caretListener", javax.swing.event.CaretListener.class, new String[] {"caretUpdate"}, "addCaretListener", "removeCaretListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( br.com.gmp.comps.textfield.button.GMPButtonField.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addKeymap7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_copy18 = 18;
    private static final int METHOD_countComponents19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createToolTip22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_cut25 = 25;
    private static final int METHOD_deliverEvent26 = 26;
    private static final int METHOD_disable27 = 27;
    private static final int METHOD_dispatchEvent28 = 28;
    private static final int METHOD_doLayout29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enableInputMethods32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_focusGained43 = 43;
    private static final int METHOD_focusLost44 = 44;
    private static final int METHOD_getActionForKeyStroke45 = 45;
    private static final int METHOD_getBaseline46 = 46;
    private static final int METHOD_getBoolean47 = 47;
    private static final int METHOD_getBounds48 = 48;
    private static final int METHOD_getClientProperty49 = 49;
    private static final int METHOD_getComponentAt50 = 50;
    private static final int METHOD_getComponentAt51 = 51;
    private static final int METHOD_getComponentZOrder52 = 52;
    private static final int METHOD_getConditionForKeyStroke53 = 53;
    private static final int METHOD_getDefaultLocale54 = 54;
    private static final int METHOD_getFocusTraversalKeys55 = 55;
    private static final int METHOD_getFontMetrics56 = 56;
    private static final int METHOD_getInsets57 = 57;
    private static final int METHOD_getKeymap58 = 58;
    private static final int METHOD_getListeners59 = 59;
    private static final int METHOD_getLocation60 = 60;
    private static final int METHOD_getLong61 = 61;
    private static final int METHOD_getMousePosition62 = 62;
    private static final int METHOD_getPopupLocation63 = 63;
    private static final int METHOD_getPrintable64 = 64;
    private static final int METHOD_getPropertyChangeListeners65 = 65;
    private static final int METHOD_getScrollableBlockIncrement66 = 66;
    private static final int METHOD_getScrollableUnitIncrement67 = 67;
    private static final int METHOD_getSize68 = 68;
    private static final int METHOD_getText69 = 69;
    private static final int METHOD_getToolTipLocation70 = 70;
    private static final int METHOD_getToolTipText71 = 71;
    private static final int METHOD_gotFocus72 = 72;
    private static final int METHOD_grabFocus73 = 73;
    private static final int METHOD_handleEvent74 = 74;
    private static final int METHOD_hasFocus75 = 75;
    private static final int METHOD_hide76 = 76;
    private static final int METHOD_imageUpdate77 = 77;
    private static final int METHOD_insets78 = 78;
    private static final int METHOD_inside79 = 79;
    private static final int METHOD_invalidate80 = 80;
    private static final int METHOD_isAncestorOf81 = 81;
    private static final int METHOD_isFocusCycleRoot82 = 82;
    private static final int METHOD_isLightweightComponent83 = 83;
    private static final int METHOD_keyDown84 = 84;
    private static final int METHOD_keyPressed85 = 85;
    private static final int METHOD_keyReleased86 = 86;
    private static final int METHOD_keyTyped87 = 87;
    private static final int METHOD_keyUp88 = 88;
    private static final int METHOD_layout89 = 89;
    private static final int METHOD_list90 = 90;
    private static final int METHOD_list91 = 91;
    private static final int METHOD_list92 = 92;
    private static final int METHOD_list93 = 93;
    private static final int METHOD_list94 = 94;
    private static final int METHOD_loadKeymap95 = 95;
    private static final int METHOD_locate96 = 96;
    private static final int METHOD_location97 = 97;
    private static final int METHOD_lostFocus98 = 98;
    private static final int METHOD_minimumSize99 = 99;
    private static final int METHOD_modelToView100 = 100;
    private static final int METHOD_mouseDown101 = 101;
    private static final int METHOD_mouseDrag102 = 102;
    private static final int METHOD_mouseEnter103 = 103;
    private static final int METHOD_mouseExit104 = 104;
    private static final int METHOD_mouseMove105 = 105;
    private static final int METHOD_mouseUp106 = 106;
    private static final int METHOD_move107 = 107;
    private static final int METHOD_moveCaretPosition108 = 108;
    private static final int METHOD_nextFocus109 = 109;
    private static final int METHOD_paint110 = 110;
    private static final int METHOD_paintAll111 = 111;
    private static final int METHOD_paintComponents112 = 112;
    private static final int METHOD_paintImmediately113 = 113;
    private static final int METHOD_paintImmediately114 = 114;
    private static final int METHOD_paste115 = 115;
    private static final int METHOD_postActionEvent116 = 116;
    private static final int METHOD_postEvent117 = 117;
    private static final int METHOD_preferredSize118 = 118;
    private static final int METHOD_prepareImage119 = 119;
    private static final int METHOD_prepareImage120 = 120;
    private static final int METHOD_print121 = 121;
    private static final int METHOD_print122 = 122;
    private static final int METHOD_print123 = 123;
    private static final int METHOD_print124 = 124;
    private static final int METHOD_printAll125 = 125;
    private static final int METHOD_printComponents126 = 126;
    private static final int METHOD_putClientProperty127 = 127;
    private static final int METHOD_read128 = 128;
    private static final int METHOD_registerKeyboardAction129 = 129;
    private static final int METHOD_registerKeyboardAction130 = 130;
    private static final int METHOD_remove131 = 131;
    private static final int METHOD_remove132 = 132;
    private static final int METHOD_remove133 = 133;
    private static final int METHOD_removeAll134 = 134;
    private static final int METHOD_removeKeymap135 = 135;
    private static final int METHOD_removeNotify136 = 136;
    private static final int METHOD_removePropertyChangeListener137 = 137;
    private static final int METHOD_repaint138 = 138;
    private static final int METHOD_repaint139 = 139;
    private static final int METHOD_repaint140 = 140;
    private static final int METHOD_repaint141 = 141;
    private static final int METHOD_repaint142 = 142;
    private static final int METHOD_replaceSelection143 = 143;
    private static final int METHOD_requestDefaultFocus144 = 144;
    private static final int METHOD_requestFocus145 = 145;
    private static final int METHOD_requestFocus146 = 146;
    private static final int METHOD_requestFocusInWindow147 = 147;
    private static final int METHOD_resetKeyboardActions148 = 148;
    private static final int METHOD_reshape149 = 149;
    private static final int METHOD_resize150 = 150;
    private static final int METHOD_resize151 = 151;
    private static final int METHOD_revalidate152 = 152;
    private static final int METHOD_scrollRectToVisible153 = 153;
    private static final int METHOD_select154 = 154;
    private static final int METHOD_selectAll155 = 155;
    private static final int METHOD_setBounds156 = 156;
    private static final int METHOD_setComponentZOrder157 = 157;
    private static final int METHOD_setDefaultLocale158 = 158;
    private static final int METHOD_show159 = 159;
    private static final int METHOD_show160 = 160;
    private static final int METHOD_size161 = 161;
    private static final int METHOD_toString162 = 162;
    private static final int METHOD_transferFocus163 = 163;
    private static final int METHOD_transferFocusBackward164 = 164;
    private static final int METHOD_transferFocusDownCycle165 = 165;
    private static final int METHOD_transferFocusUpCycle166 = 166;
    private static final int METHOD_unregisterKeyboardAction167 = 167;
    private static final int METHOD_update168 = 168;
    private static final int METHOD_updateUI169 = 169;
    private static final int METHOD_validate170 = 170;
    private static final int METHOD_validateComponent171 = 171;
    private static final int METHOD_viewToModel172 = 172;
    private static final int METHOD_write173 = 173;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[174];
    
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
            methods[METHOD_addKeymap7] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("addKeymap", new Class[] {java.lang.String.class, javax.swing.text.Keymap.class})); // NOI18N
            methods[METHOD_addKeymap7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_copy18] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("copy", new Class[] {})); // NOI18N
            methods[METHOD_copy18].setDisplayName ( "" );
            methods[METHOD_countComponents19] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createToolTip22] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_cut25] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("cut", new Class[] {})); // NOI18N
            methods[METHOD_cut25].setDisplayName ( "" );
            methods[METHOD_deliverEvent26] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent26].setDisplayName ( "" );
            methods[METHOD_disable27] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable27].setDisplayName ( "" );
            methods[METHOD_dispatchEvent28] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enableInputMethods32] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_focusGained43] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("focusGained", new Class[] {java.awt.event.FocusEvent.class})); // NOI18N
            methods[METHOD_focusGained43].setDisplayName ( "" );
            methods[METHOD_focusLost44] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("focusLost", new Class[] {java.awt.event.FocusEvent.class})); // NOI18N
            methods[METHOD_focusLost44].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke45].setDisplayName ( "" );
            methods[METHOD_getBaseline46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline46].setDisplayName ( "" );
            methods[METHOD_getBoolean47] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("getBoolean", new Class[] {})); // NOI18N
            methods[METHOD_getBoolean47].setDisplayName ( "" );
            methods[METHOD_getBounds48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds48].setDisplayName ( "" );
            methods[METHOD_getClientProperty49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty49].setDisplayName ( "" );
            methods[METHOD_getComponentAt50] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt50].setDisplayName ( "" );
            methods[METHOD_getComponentAt51] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt51].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder52] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder52].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke53].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale54].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys55] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys55].setDisplayName ( "" );
            methods[METHOD_getFontMetrics56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics56].setDisplayName ( "" );
            methods[METHOD_getInsets57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets57].setDisplayName ( "" );
            methods[METHOD_getKeymap58] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getKeymap58].setDisplayName ( "" );
            methods[METHOD_getListeners59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners59].setDisplayName ( "" );
            methods[METHOD_getLocation60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation60].setDisplayName ( "" );
            methods[METHOD_getLong61] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("getLong", new Class[] {})); // NOI18N
            methods[METHOD_getLong61].setDisplayName ( "" );
            methods[METHOD_getMousePosition62] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition62].setDisplayName ( "" );
            methods[METHOD_getPopupLocation63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation63].setDisplayName ( "" );
            methods[METHOD_getPrintable64] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getPrintable", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable64].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners65] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners65].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement66] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement66].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement67] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement67].setDisplayName ( "" );
            methods[METHOD_getSize68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize68].setDisplayName ( "" );
            methods[METHOD_getText69] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getText", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getText69].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation70].setDisplayName ( "" );
            methods[METHOD_getToolTipText71] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText71].setDisplayName ( "" );
            methods[METHOD_gotFocus72] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus72].setDisplayName ( "" );
            methods[METHOD_grabFocus73] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus73].setDisplayName ( "" );
            methods[METHOD_handleEvent74] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent74].setDisplayName ( "" );
            methods[METHOD_hasFocus75] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus75].setDisplayName ( "" );
            methods[METHOD_hide76] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide76].setDisplayName ( "" );
            methods[METHOD_imageUpdate77] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate77].setDisplayName ( "" );
            methods[METHOD_insets78] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets78].setDisplayName ( "" );
            methods[METHOD_inside79] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside79].setDisplayName ( "" );
            methods[METHOD_invalidate80] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate80].setDisplayName ( "" );
            methods[METHOD_isAncestorOf81] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf81].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot82] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot82].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent83] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent83].setDisplayName ( "" );
            methods[METHOD_keyDown84] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown84].setDisplayName ( "" );
            methods[METHOD_keyPressed85] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("keyPressed", new Class[] {java.awt.event.KeyEvent.class})); // NOI18N
            methods[METHOD_keyPressed85].setDisplayName ( "" );
            methods[METHOD_keyReleased86] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("keyReleased", new Class[] {java.awt.event.KeyEvent.class})); // NOI18N
            methods[METHOD_keyReleased86].setDisplayName ( "" );
            methods[METHOD_keyTyped87] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("keyTyped", new Class[] {java.awt.event.KeyEvent.class})); // NOI18N
            methods[METHOD_keyTyped87].setDisplayName ( "" );
            methods[METHOD_keyUp88] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp88].setDisplayName ( "" );
            methods[METHOD_layout89] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout89].setDisplayName ( "" );
            methods[METHOD_list90] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list90].setDisplayName ( "" );
            methods[METHOD_list91] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list91].setDisplayName ( "" );
            methods[METHOD_list92] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list92].setDisplayName ( "" );
            methods[METHOD_list93] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list93].setDisplayName ( "" );
            methods[METHOD_list94] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list94].setDisplayName ( "" );
            methods[METHOD_loadKeymap95] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("loadKeymap", new Class[] {javax.swing.text.Keymap.class, javax.swing.text.JTextComponent.KeyBinding[].class, javax.swing.Action[].class})); // NOI18N
            methods[METHOD_loadKeymap95].setDisplayName ( "" );
            methods[METHOD_locate96] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate96].setDisplayName ( "" );
            methods[METHOD_location97] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location97].setDisplayName ( "" );
            methods[METHOD_lostFocus98] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus98].setDisplayName ( "" );
            methods[METHOD_minimumSize99] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize99].setDisplayName ( "" );
            methods[METHOD_modelToView100] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("modelToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_modelToView100].setDisplayName ( "" );
            methods[METHOD_mouseDown101] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown101].setDisplayName ( "" );
            methods[METHOD_mouseDrag102] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag102].setDisplayName ( "" );
            methods[METHOD_mouseEnter103] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter103].setDisplayName ( "" );
            methods[METHOD_mouseExit104] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit104].setDisplayName ( "" );
            methods[METHOD_mouseMove105] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove105].setDisplayName ( "" );
            methods[METHOD_mouseUp106] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp106].setDisplayName ( "" );
            methods[METHOD_move107] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move107].setDisplayName ( "" );
            methods[METHOD_moveCaretPosition108] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("moveCaretPosition", new Class[] {int.class})); // NOI18N
            methods[METHOD_moveCaretPosition108].setDisplayName ( "" );
            methods[METHOD_nextFocus109] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus109].setDisplayName ( "" );
            methods[METHOD_paint110] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint110].setDisplayName ( "" );
            methods[METHOD_paintAll111] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll111].setDisplayName ( "" );
            methods[METHOD_paintComponents112] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents112].setDisplayName ( "" );
            methods[METHOD_paintImmediately113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately113].setDisplayName ( "" );
            methods[METHOD_paintImmediately114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately114].setDisplayName ( "" );
            methods[METHOD_paste115] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("paste", new Class[] {})); // NOI18N
            methods[METHOD_paste115].setDisplayName ( "" );
            methods[METHOD_postActionEvent116] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("postActionEvent", new Class[] {})); // NOI18N
            methods[METHOD_postActionEvent116].setDisplayName ( "" );
            methods[METHOD_postEvent117] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent117].setDisplayName ( "" );
            methods[METHOD_preferredSize118] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize118].setDisplayName ( "" );
            methods[METHOD_prepareImage119] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage119].setDisplayName ( "" );
            methods[METHOD_prepareImage120] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage120].setDisplayName ( "" );
            methods[METHOD_print121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print121].setDisplayName ( "" );
            methods[METHOD_print122] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print122].setDisplayName ( "" );
            methods[METHOD_print123] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print123].setDisplayName ( "" );
            methods[METHOD_print124] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.PrintService.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print124].setDisplayName ( "" );
            methods[METHOD_printAll125] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll125].setDisplayName ( "" );
            methods[METHOD_printComponents126] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents126].setDisplayName ( "" );
            methods[METHOD_putClientProperty127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty127].setDisplayName ( "" );
            methods[METHOD_read128] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("read", new Class[] {java.io.Reader.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_read128].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction129].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction130].setDisplayName ( "" );
            methods[METHOD_remove131] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove131].setDisplayName ( "" );
            methods[METHOD_remove132] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove132].setDisplayName ( "" );
            methods[METHOD_remove133] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove133].setDisplayName ( "" );
            methods[METHOD_removeAll134] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll134].setDisplayName ( "" );
            methods[METHOD_removeKeymap135] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_removeKeymap135].setDisplayName ( "" );
            methods[METHOD_removeNotify136] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify136].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener137] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener137].setDisplayName ( "" );
            methods[METHOD_repaint138] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint138].setDisplayName ( "" );
            methods[METHOD_repaint139] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint139].setDisplayName ( "" );
            methods[METHOD_repaint140] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint140].setDisplayName ( "" );
            methods[METHOD_repaint141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint141].setDisplayName ( "" );
            methods[METHOD_repaint142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint142].setDisplayName ( "" );
            methods[METHOD_replaceSelection143] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("replaceSelection", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_replaceSelection143].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus144].setDisplayName ( "" );
            methods[METHOD_requestFocus145] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus145].setDisplayName ( "" );
            methods[METHOD_requestFocus146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus146].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow147].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions148] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions148].setDisplayName ( "" );
            methods[METHOD_reshape149] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape149].setDisplayName ( "" );
            methods[METHOD_resize150] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize150].setDisplayName ( "" );
            methods[METHOD_resize151] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize151].setDisplayName ( "" );
            methods[METHOD_revalidate152] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate152].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible153] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible153].setDisplayName ( "" );
            methods[METHOD_select154] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("select", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_select154].setDisplayName ( "" );
            methods[METHOD_selectAll155] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll155].setDisplayName ( "" );
            methods[METHOD_setBounds156] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds156].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder157] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder157].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale158] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale158].setDisplayName ( "" );
            methods[METHOD_show159] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show159].setDisplayName ( "" );
            methods[METHOD_show160] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show160].setDisplayName ( "" );
            methods[METHOD_size161] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size161].setDisplayName ( "" );
            methods[METHOD_toString162] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString162].setDisplayName ( "" );
            methods[METHOD_transferFocus163] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus163].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward164] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward164].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle165] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle165].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle166] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle166].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction167] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction167].setDisplayName ( "" );
            methods[METHOD_update168] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update168].setDisplayName ( "" );
            methods[METHOD_updateUI169] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI169].setDisplayName ( "" );
            methods[METHOD_validate170] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate170].setDisplayName ( "" );
            methods[METHOD_validateComponent171] = new MethodDescriptor(br.com.gmp.comps.textfield.GTextField.class.getMethod("validateComponent", new Class[] {})); // NOI18N
            methods[METHOD_validateComponent171].setDisplayName ( "" );
            methods[METHOD_viewToModel172] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("viewToModel", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_viewToModel172].setDisplayName ( "" );
            methods[METHOD_write173] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("write", new Class[] {java.io.Writer.class})); // NOI18N
            methods[METHOD_write173].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/ComponentIcons/field/field.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/ComponentIcons/field/field.png";
    private static String iconNameM16 = "/ComponentIcons/field/field.png";
    private static String iconNameM32 = "/ComponentIcons/field/field.png";//GEN-END:Icons

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
