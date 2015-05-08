/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gmp.comps.dialog;

import java.beans.*;

/**
 *
 * @author kaciano
 */
public class GDialogBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( br.com.gmp.comps.dialog.GDialog.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_active = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_alwaysOnTop = 4;
    private static final int PROPERTY_alwaysOnTopSupported = 5;
    private static final int PROPERTY_autoRequestFocus = 6;
    private static final int PROPERTY_background = 7;
    private static final int PROPERTY_backgroundSet = 8;
    private static final int PROPERTY_baselineResizeBehavior = 9;
    private static final int PROPERTY_bounds = 10;
    private static final int PROPERTY_bufferStrategy = 11;
    private static final int PROPERTY_colorModel = 12;
    private static final int PROPERTY_component = 13;
    private static final int PROPERTY_componentCount = 14;
    private static final int PROPERTY_componentListeners = 15;
    private static final int PROPERTY_componentOrientation = 16;
    private static final int PROPERTY_components = 17;
    private static final int PROPERTY_containerListeners = 18;
    private static final int PROPERTY_contentPane = 19;
    private static final int PROPERTY_cursor = 20;
    private static final int PROPERTY_cursorSet = 21;
    private static final int PROPERTY_defaultCloseOperation = 22;
    private static final int PROPERTY_displayable = 23;
    private static final int PROPERTY_doubleBuffered = 24;
    private static final int PROPERTY_dropTarget = 25;
    private static final int PROPERTY_enabled = 26;
    private static final int PROPERTY_focusable = 27;
    private static final int PROPERTY_focusableWindow = 28;
    private static final int PROPERTY_focusableWindowState = 29;
    private static final int PROPERTY_focusCycleRoot = 30;
    private static final int PROPERTY_focusCycleRootAncestor = 31;
    private static final int PROPERTY_focused = 32;
    private static final int PROPERTY_focusListeners = 33;
    private static final int PROPERTY_focusOwner = 34;
    private static final int PROPERTY_focusTraversable = 35;
    private static final int PROPERTY_focusTraversalKeys = 36;
    private static final int PROPERTY_focusTraversalKeysEnabled = 37;
    private static final int PROPERTY_focusTraversalPolicy = 38;
    private static final int PROPERTY_focusTraversalPolicyProvider = 39;
    private static final int PROPERTY_focusTraversalPolicySet = 40;
    private static final int PROPERTY_font = 41;
    private static final int PROPERTY_fontSet = 42;
    private static final int PROPERTY_foreground = 43;
    private static final int PROPERTY_foregroundSet = 44;
    private static final int PROPERTY_glassPane = 45;
    private static final int PROPERTY_graphics = 46;
    private static final int PROPERTY_graphicsConfiguration = 47;
    private static final int PROPERTY_height = 48;
    private static final int PROPERTY_hierarchyBoundsListeners = 49;
    private static final int PROPERTY_hierarchyListeners = 50;
    private static final int PROPERTY_iconImage = 51;
    private static final int PROPERTY_iconImages = 52;
    private static final int PROPERTY_ignoreRepaint = 53;
    private static final int PROPERTY_inputContext = 54;
    private static final int PROPERTY_inputMethodListeners = 55;
    private static final int PROPERTY_inputMethodRequests = 56;
    private static final int PROPERTY_insets = 57;
    private static final int PROPERTY_JMenuBar = 58;
    private static final int PROPERTY_keyListeners = 59;
    private static final int PROPERTY_layeredPane = 60;
    private static final int PROPERTY_layout = 61;
    private static final int PROPERTY_lightweight = 62;
    private static final int PROPERTY_locale = 63;
    private static final int PROPERTY_location = 64;
    private static final int PROPERTY_locationByPlatform = 65;
    private static final int PROPERTY_locationOnScreen = 66;
    private static final int PROPERTY_locationRelativeTo = 67;
    private static final int PROPERTY_maximumSize = 68;
    private static final int PROPERTY_maximumSizeSet = 69;
    private static final int PROPERTY_minimumSize = 70;
    private static final int PROPERTY_minimumSizeSet = 71;
    private static final int PROPERTY_modal = 72;
    private static final int PROPERTY_modalExclusionType = 73;
    private static final int PROPERTY_modalityType = 74;
    private static final int PROPERTY_mostRecentFocusOwner = 75;
    private static final int PROPERTY_mouseListeners = 76;
    private static final int PROPERTY_mouseMotionListeners = 77;
    private static final int PROPERTY_mousePosition = 78;
    private static final int PROPERTY_mouseWheelListeners = 79;
    private static final int PROPERTY_name = 80;
    private static final int PROPERTY_opacity = 81;
    private static final int PROPERTY_opaque = 82;
    private static final int PROPERTY_ownedWindows = 83;
    private static final int PROPERTY_owner = 84;
    private static final int PROPERTY_parent = 85;
    private static final int PROPERTY_peer = 86;
    private static final int PROPERTY_preferredSize = 87;
    private static final int PROPERTY_preferredSizeSet = 88;
    private static final int PROPERTY_propertyChangeListeners = 89;
    private static final int PROPERTY_resizable = 90;
    private static final int PROPERTY_rootPane = 91;
    private static final int PROPERTY_shape = 92;
    private static final int PROPERTY_showing = 93;
    private static final int PROPERTY_size = 94;
    private static final int PROPERTY_title = 95;
    private static final int PROPERTY_toolkit = 96;
    private static final int PROPERTY_transferHandler = 97;
    private static final int PROPERTY_treeLock = 98;
    private static final int PROPERTY_type = 99;
    private static final int PROPERTY_undecorated = 100;
    private static final int PROPERTY_valid = 101;
    private static final int PROPERTY_validateRoot = 102;
    private static final int PROPERTY_visible = 103;
    private static final int PROPERTY_warningString = 104;
    private static final int PROPERTY_width = 105;
    private static final int PROPERTY_windowFocusListeners = 106;
    private static final int PROPERTY_windowListeners = 107;
    private static final int PROPERTY_windowStateListeners = 108;
    private static final int PROPERTY_x = 109;
    private static final int PROPERTY_y = 110;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[111];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", br.com.gmp.comps.dialog.GDialog.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_active] = new PropertyDescriptor ( "active", br.com.gmp.comps.dialog.GDialog.class, "isActive", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", br.com.gmp.comps.dialog.GDialog.class, "getAlignmentX", null ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", br.com.gmp.comps.dialog.GDialog.class, "getAlignmentY", null ); // NOI18N
            properties[PROPERTY_alwaysOnTop] = new PropertyDescriptor ( "alwaysOnTop", br.com.gmp.comps.dialog.GDialog.class, "isAlwaysOnTop", "setAlwaysOnTop" ); // NOI18N
            properties[PROPERTY_alwaysOnTopSupported] = new PropertyDescriptor ( "alwaysOnTopSupported", br.com.gmp.comps.dialog.GDialog.class, "isAlwaysOnTopSupported", null ); // NOI18N
            properties[PROPERTY_autoRequestFocus] = new PropertyDescriptor ( "autoRequestFocus", br.com.gmp.comps.dialog.GDialog.class, "isAutoRequestFocus", "setAutoRequestFocus" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", br.com.gmp.comps.dialog.GDialog.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_background].setPreferred ( true );
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", br.com.gmp.comps.dialog.GDialog.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", br.com.gmp.comps.dialog.GDialog.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", br.com.gmp.comps.dialog.GDialog.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_bufferStrategy] = new PropertyDescriptor ( "bufferStrategy", br.com.gmp.comps.dialog.GDialog.class, "getBufferStrategy", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", br.com.gmp.comps.dialog.GDialog.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", br.com.gmp.comps.dialog.GDialog.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", br.com.gmp.comps.dialog.GDialog.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", br.com.gmp.comps.dialog.GDialog.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", br.com.gmp.comps.dialog.GDialog.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", br.com.gmp.comps.dialog.GDialog.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", br.com.gmp.comps.dialog.GDialog.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentPane] = new PropertyDescriptor ( "contentPane", br.com.gmp.comps.dialog.GDialog.class, "getContentPane", "setContentPane" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", br.com.gmp.comps.dialog.GDialog.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", br.com.gmp.comps.dialog.GDialog.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_defaultCloseOperation] = new PropertyDescriptor ( "defaultCloseOperation", br.com.gmp.comps.dialog.GDialog.class, "getDefaultCloseOperation", "setDefaultCloseOperation" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", br.com.gmp.comps.dialog.GDialog.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", br.com.gmp.comps.dialog.GDialog.class, "isDoubleBuffered", null ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", br.com.gmp.comps.dialog.GDialog.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", br.com.gmp.comps.dialog.GDialog.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", br.com.gmp.comps.dialog.GDialog.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusableWindow] = new PropertyDescriptor ( "focusableWindow", br.com.gmp.comps.dialog.GDialog.class, "isFocusableWindow", null ); // NOI18N
            properties[PROPERTY_focusableWindowState] = new PropertyDescriptor ( "focusableWindowState", br.com.gmp.comps.dialog.GDialog.class, "getFocusableWindowState", "setFocusableWindowState" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", br.com.gmp.comps.dialog.GDialog.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", br.com.gmp.comps.dialog.GDialog.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focused] = new PropertyDescriptor ( "focused", br.com.gmp.comps.dialog.GDialog.class, "isFocused", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", br.com.gmp.comps.dialog.GDialog.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", br.com.gmp.comps.dialog.GDialog.class, "getFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", br.com.gmp.comps.dialog.GDialog.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", br.com.gmp.comps.dialog.GDialog.class, null, null, "getFocusTraversalKeys", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", br.com.gmp.comps.dialog.GDialog.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", br.com.gmp.comps.dialog.GDialog.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", br.com.gmp.comps.dialog.GDialog.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", br.com.gmp.comps.dialog.GDialog.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", br.com.gmp.comps.dialog.GDialog.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_font].setPreferred ( true );
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", br.com.gmp.comps.dialog.GDialog.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", br.com.gmp.comps.dialog.GDialog.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foreground].setPreferred ( true );
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", br.com.gmp.comps.dialog.GDialog.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_glassPane] = new PropertyDescriptor ( "glassPane", br.com.gmp.comps.dialog.GDialog.class, "getGlassPane", "setGlassPane" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", br.com.gmp.comps.dialog.GDialog.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", br.com.gmp.comps.dialog.GDialog.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", br.com.gmp.comps.dialog.GDialog.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", br.com.gmp.comps.dialog.GDialog.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", br.com.gmp.comps.dialog.GDialog.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_iconImage] = new PropertyDescriptor ( "iconImage", br.com.gmp.comps.dialog.GDialog.class, null, "setIconImage" ); // NOI18N
            properties[PROPERTY_iconImages] = new PropertyDescriptor ( "iconImages", br.com.gmp.comps.dialog.GDialog.class, null, "setIconImages" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", br.com.gmp.comps.dialog.GDialog.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", br.com.gmp.comps.dialog.GDialog.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", br.com.gmp.comps.dialog.GDialog.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", br.com.gmp.comps.dialog.GDialog.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", br.com.gmp.comps.dialog.GDialog.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_JMenuBar] = new PropertyDescriptor ( "JMenuBar", br.com.gmp.comps.dialog.GDialog.class, "getJMenuBar", "setJMenuBar" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", br.com.gmp.comps.dialog.GDialog.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layeredPane] = new PropertyDescriptor ( "layeredPane", br.com.gmp.comps.dialog.GDialog.class, "getLayeredPane", "setLayeredPane" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", br.com.gmp.comps.dialog.GDialog.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", br.com.gmp.comps.dialog.GDialog.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", br.com.gmp.comps.dialog.GDialog.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", br.com.gmp.comps.dialog.GDialog.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationByPlatform] = new PropertyDescriptor ( "locationByPlatform", br.com.gmp.comps.dialog.GDialog.class, "isLocationByPlatform", "setLocationByPlatform" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", br.com.gmp.comps.dialog.GDialog.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_locationRelativeTo] = new PropertyDescriptor ( "locationRelativeTo", br.com.gmp.comps.dialog.GDialog.class, null, "setLocationRelativeTo" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", br.com.gmp.comps.dialog.GDialog.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", br.com.gmp.comps.dialog.GDialog.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", br.com.gmp.comps.dialog.GDialog.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", br.com.gmp.comps.dialog.GDialog.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_modal] = new PropertyDescriptor ( "modal", br.com.gmp.comps.dialog.GDialog.class, "isModal", "setModal" ); // NOI18N
            properties[PROPERTY_modal].setPreferred ( true );
            properties[PROPERTY_modalExclusionType] = new PropertyDescriptor ( "modalExclusionType", br.com.gmp.comps.dialog.GDialog.class, "getModalExclusionType", "setModalExclusionType" ); // NOI18N
            properties[PROPERTY_modalityType] = new PropertyDescriptor ( "modalityType", br.com.gmp.comps.dialog.GDialog.class, "getModalityType", "setModalityType" ); // NOI18N
            properties[PROPERTY_mostRecentFocusOwner] = new PropertyDescriptor ( "mostRecentFocusOwner", br.com.gmp.comps.dialog.GDialog.class, "getMostRecentFocusOwner", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", br.com.gmp.comps.dialog.GDialog.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", br.com.gmp.comps.dialog.GDialog.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", br.com.gmp.comps.dialog.GDialog.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", br.com.gmp.comps.dialog.GDialog.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", br.com.gmp.comps.dialog.GDialog.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_opacity] = new PropertyDescriptor ( "opacity", br.com.gmp.comps.dialog.GDialog.class, "getOpacity", "setOpacity" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", br.com.gmp.comps.dialog.GDialog.class, "isOpaque", null ); // NOI18N
            properties[PROPERTY_ownedWindows] = new PropertyDescriptor ( "ownedWindows", br.com.gmp.comps.dialog.GDialog.class, "getOwnedWindows", null ); // NOI18N
            properties[PROPERTY_owner] = new PropertyDescriptor ( "owner", br.com.gmp.comps.dialog.GDialog.class, "getOwner", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", br.com.gmp.comps.dialog.GDialog.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", br.com.gmp.comps.dialog.GDialog.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", br.com.gmp.comps.dialog.GDialog.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", br.com.gmp.comps.dialog.GDialog.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", br.com.gmp.comps.dialog.GDialog.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_resizable] = new PropertyDescriptor ( "resizable", br.com.gmp.comps.dialog.GDialog.class, "isResizable", "setResizable" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", br.com.gmp.comps.dialog.GDialog.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_shape] = new PropertyDescriptor ( "shape", br.com.gmp.comps.dialog.GDialog.class, "getShape", "setShape" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", br.com.gmp.comps.dialog.GDialog.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", br.com.gmp.comps.dialog.GDialog.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_title] = new PropertyDescriptor ( "title", br.com.gmp.comps.dialog.GDialog.class, "getTitle", "setTitle" ); // NOI18N
            properties[PROPERTY_title].setPreferred ( true );
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", br.com.gmp.comps.dialog.GDialog.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", br.com.gmp.comps.dialog.GDialog.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", br.com.gmp.comps.dialog.GDialog.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_type] = new PropertyDescriptor ( "type", br.com.gmp.comps.dialog.GDialog.class, "getType", "setType" ); // NOI18N
            properties[PROPERTY_undecorated] = new PropertyDescriptor ( "undecorated", br.com.gmp.comps.dialog.GDialog.class, "isUndecorated", "setUndecorated" ); // NOI18N
            properties[PROPERTY_undecorated].setPreferred ( true );
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", br.com.gmp.comps.dialog.GDialog.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", br.com.gmp.comps.dialog.GDialog.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", br.com.gmp.comps.dialog.GDialog.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_warningString] = new PropertyDescriptor ( "warningString", br.com.gmp.comps.dialog.GDialog.class, "getWarningString", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", br.com.gmp.comps.dialog.GDialog.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_windowFocusListeners] = new PropertyDescriptor ( "windowFocusListeners", br.com.gmp.comps.dialog.GDialog.class, "getWindowFocusListeners", null ); // NOI18N
            properties[PROPERTY_windowListeners] = new PropertyDescriptor ( "windowListeners", br.com.gmp.comps.dialog.GDialog.class, "getWindowListeners", null ); // NOI18N
            properties[PROPERTY_windowStateListeners] = new PropertyDescriptor ( "windowStateListeners", br.com.gmp.comps.dialog.GDialog.class, "getWindowStateListeners", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", br.com.gmp.comps.dialog.GDialog.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", br.com.gmp.comps.dialog.GDialog.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_componentListener = 0;
    private static final int EVENT_containerListener = 1;
    private static final int EVENT_focusListener = 2;
    private static final int EVENT_hierarchyBoundsListener = 3;
    private static final int EVENT_hierarchyListener = 4;
    private static final int EVENT_inputMethodListener = 5;
    private static final int EVENT_keyListener = 6;
    private static final int EVENT_mouseListener = 7;
    private static final int EVENT_mouseMotionListener = 8;
    private static final int EVENT_mouseWheelListener = 9;
    private static final int EVENT_propertyChangeListener = 10;
    private static final int EVENT_windowFocusListener = 11;
    private static final int EVENT_windowListener = 12;
    private static final int EVENT_windowStateListener = 13;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[14];
    
        try {
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_windowFocusListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "windowFocusListener", java.awt.event.WindowFocusListener.class, new String[] {"windowGainedFocus", "windowLostFocus"}, "addWindowFocusListener", "removeWindowFocusListener" ); // NOI18N
            eventSets[EVENT_windowListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "windowListener", java.awt.event.WindowListener.class, new String[] {"windowOpened", "windowClosing", "windowClosed", "windowIconified", "windowDeiconified", "windowActivated", "windowDeactivated"}, "addWindowListener", "removeWindowListener" ); // NOI18N
            eventSets[EVENT_windowStateListener] = new EventSetDescriptor ( br.com.gmp.comps.dialog.GDialog.class, "windowStateListener", java.awt.event.WindowStateListener.class, new String[] {"windowStateChanged"}, "addWindowStateListener", "removeWindowStateListener" ); // NOI18N
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
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_applyResourceBundle10 = 10;
    private static final int METHOD_applyResourceBundle11 = 11;
    private static final int METHOD_areFocusTraversalKeysSet12 = 12;
    private static final int METHOD_bounds13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_checkImage15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createBufferStrategy19 = 19;
    private static final int METHOD_createBufferStrategy20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_deliverEvent25 = 25;
    private static final int METHOD_disable26 = 26;
    private static final int METHOD_dispatchEvent27 = 27;
    private static final int METHOD_dispose28 = 28;
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
    private static final int METHOD_getBaseline41 = 41;
    private static final int METHOD_getBounds42 = 42;
    private static final int METHOD_getComponentAt43 = 43;
    private static final int METHOD_getComponentAt44 = 44;
    private static final int METHOD_getComponentZOrder45 = 45;
    private static final int METHOD_getFontMetrics46 = 46;
    private static final int METHOD_getIconImages47 = 47;
    private static final int METHOD_getListeners48 = 48;
    private static final int METHOD_getLocation49 = 49;
    private static final int METHOD_getMousePosition50 = 50;
    private static final int METHOD_getOwnerlessWindows51 = 51;
    private static final int METHOD_getPropertyChangeListeners52 = 52;
    private static final int METHOD_getSize53 = 53;
    private static final int METHOD_getWindows54 = 54;
    private static final int METHOD_gotFocus55 = 55;
    private static final int METHOD_handleEvent56 = 56;
    private static final int METHOD_hasFocus57 = 57;
    private static final int METHOD_hide58 = 58;
    private static final int METHOD_imageUpdate59 = 59;
    private static final int METHOD_insets60 = 60;
    private static final int METHOD_inside61 = 61;
    private static final int METHOD_invalidate62 = 62;
    private static final int METHOD_isAncestorOf63 = 63;
    private static final int METHOD_isDefaultLookAndFeelDecorated64 = 64;
    private static final int METHOD_isFocusCycleRoot65 = 65;
    private static final int METHOD_isFocusOwner66 = 66;
    private static final int METHOD_keyDown67 = 67;
    private static final int METHOD_keyUp68 = 68;
    private static final int METHOD_layout69 = 69;
    private static final int METHOD_list70 = 70;
    private static final int METHOD_list71 = 71;
    private static final int METHOD_list72 = 72;
    private static final int METHOD_list73 = 73;
    private static final int METHOD_list74 = 74;
    private static final int METHOD_locate75 = 75;
    private static final int METHOD_location76 = 76;
    private static final int METHOD_lostFocus77 = 77;
    private static final int METHOD_minimumSize78 = 78;
    private static final int METHOD_mouseDown79 = 79;
    private static final int METHOD_mouseDrag80 = 80;
    private static final int METHOD_mouseEnter81 = 81;
    private static final int METHOD_mouseExit82 = 82;
    private static final int METHOD_mouseMove83 = 83;
    private static final int METHOD_mouseUp84 = 84;
    private static final int METHOD_move85 = 85;
    private static final int METHOD_nextFocus86 = 86;
    private static final int METHOD_pack87 = 87;
    private static final int METHOD_paint88 = 88;
    private static final int METHOD_paintAll89 = 89;
    private static final int METHOD_paintComponents90 = 90;
    private static final int METHOD_postEvent91 = 91;
    private static final int METHOD_preferredSize92 = 92;
    private static final int METHOD_prepareImage93 = 93;
    private static final int METHOD_prepareImage94 = 94;
    private static final int METHOD_print95 = 95;
    private static final int METHOD_printAll96 = 96;
    private static final int METHOD_printComponents97 = 97;
    private static final int METHOD_remove98 = 98;
    private static final int METHOD_remove99 = 99;
    private static final int METHOD_remove100 = 100;
    private static final int METHOD_removeAll101 = 101;
    private static final int METHOD_removeNotify102 = 102;
    private static final int METHOD_removePropertyChangeListener103 = 103;
    private static final int METHOD_repaint104 = 104;
    private static final int METHOD_repaint105 = 105;
    private static final int METHOD_repaint106 = 106;
    private static final int METHOD_repaint107 = 107;
    private static final int METHOD_requestFocus108 = 108;
    private static final int METHOD_requestFocusInWindow109 = 109;
    private static final int METHOD_reshape110 = 110;
    private static final int METHOD_resize111 = 111;
    private static final int METHOD_resize112 = 112;
    private static final int METHOD_revalidate113 = 113;
    private static final int METHOD_setBounds114 = 114;
    private static final int METHOD_setComponentZOrder115 = 115;
    private static final int METHOD_setDefaultLookAndFeelDecorated116 = 116;
    private static final int METHOD_setFocusTraversalKeys117 = 117;
    private static final int METHOD_show118 = 118;
    private static final int METHOD_show119 = 119;
    private static final int METHOD_size120 = 120;
    private static final int METHOD_toBack121 = 121;
    private static final int METHOD_toFront122 = 122;
    private static final int METHOD_toString123 = 123;
    private static final int METHOD_transferFocus124 = 124;
    private static final int METHOD_transferFocusBackward125 = 125;
    private static final int METHOD_transferFocusDownCycle126 = 126;
    private static final int METHOD_transferFocusUpCycle127 = 127;
    private static final int METHOD_update128 = 128;
    private static final int METHOD_validate129 = 129;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[130];
    
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
            methods[METHOD_addNotify7] = new MethodDescriptor(java.awt.Dialog.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Window.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle10] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.util.ResourceBundle.class})); // NOI18N
            methods[METHOD_applyResourceBundle10].setDisplayName ( "" );
            methods[METHOD_applyResourceBundle11] = new MethodDescriptor(java.awt.Window.class.getMethod("applyResourceBundle", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_applyResourceBundle11].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet12] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet12].setDisplayName ( "" );
            methods[METHOD_bounds13] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_checkImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy19] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class})); // NOI18N
            methods[METHOD_createBufferStrategy19].setDisplayName ( "" );
            methods[METHOD_createBufferStrategy20] = new MethodDescriptor(java.awt.Window.class.getMethod("createBufferStrategy", new Class[] {int.class, java.awt.BufferCapabilities.class})); // NOI18N
            methods[METHOD_createBufferStrategy20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_deliverEvent25] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent25].setDisplayName ( "" );
            methods[METHOD_disable26] = new MethodDescriptor(java.awt.Component.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable26].setDisplayName ( "" );
            methods[METHOD_dispatchEvent27] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent27].setDisplayName ( "" );
            methods[METHOD_dispose28] = new MethodDescriptor(java.awt.Window.class.getMethod("dispose", new Class[] {})); // NOI18N
            methods[METHOD_dispose28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enableInputMethods32] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_getBaseline41] = new MethodDescriptor(java.awt.Component.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline41].setDisplayName ( "" );
            methods[METHOD_getBounds42] = new MethodDescriptor(java.awt.Component.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds42].setDisplayName ( "" );
            methods[METHOD_getComponentAt43] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt43].setDisplayName ( "" );
            methods[METHOD_getComponentAt44] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt44].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder45] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder45].setDisplayName ( "" );
            methods[METHOD_getFontMetrics46] = new MethodDescriptor(java.awt.Component.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics46].setDisplayName ( "" );
            methods[METHOD_getIconImages47] = new MethodDescriptor(java.awt.Window.class.getMethod("getIconImages", new Class[] {})); // NOI18N
            methods[METHOD_getIconImages47].setDisplayName ( "" );
            methods[METHOD_getListeners48] = new MethodDescriptor(java.awt.Window.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners48].setDisplayName ( "" );
            methods[METHOD_getLocation49] = new MethodDescriptor(java.awt.Component.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation49].setDisplayName ( "" );
            methods[METHOD_getMousePosition50] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition50].setDisplayName ( "" );
            methods[METHOD_getOwnerlessWindows51] = new MethodDescriptor(java.awt.Window.class.getMethod("getOwnerlessWindows", new Class[] {})); // NOI18N
            methods[METHOD_getOwnerlessWindows51].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners52] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners52].setDisplayName ( "" );
            methods[METHOD_getSize53] = new MethodDescriptor(java.awt.Component.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize53].setDisplayName ( "" );
            methods[METHOD_getWindows54] = new MethodDescriptor(java.awt.Window.class.getMethod("getWindows", new Class[] {})); // NOI18N
            methods[METHOD_getWindows54].setDisplayName ( "" );
            methods[METHOD_gotFocus55] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus55].setDisplayName ( "" );
            methods[METHOD_handleEvent56] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent56].setDisplayName ( "" );
            methods[METHOD_hasFocus57] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus57].setDisplayName ( "" );
            methods[METHOD_hide58] = new MethodDescriptor(java.awt.Dialog.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide58].setDisplayName ( "" );
            methods[METHOD_imageUpdate59] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate59].setDisplayName ( "" );
            methods[METHOD_insets60] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets60].setDisplayName ( "" );
            methods[METHOD_inside61] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside61].setDisplayName ( "" );
            methods[METHOD_invalidate62] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate62].setDisplayName ( "" );
            methods[METHOD_isAncestorOf63] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf63].setDisplayName ( "" );
            methods[METHOD_isDefaultLookAndFeelDecorated64] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("isDefaultLookAndFeelDecorated", new Class[] {})); // NOI18N
            methods[METHOD_isDefaultLookAndFeelDecorated64].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot65] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot65].setDisplayName ( "" );
            methods[METHOD_isFocusOwner66] = new MethodDescriptor(java.awt.Component.class.getMethod("isFocusOwner", new Class[] {})); // NOI18N
            methods[METHOD_isFocusOwner66].setDisplayName ( "" );
            methods[METHOD_keyDown67] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown67].setDisplayName ( "" );
            methods[METHOD_keyUp68] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp68].setDisplayName ( "" );
            methods[METHOD_layout69] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout69].setDisplayName ( "" );
            methods[METHOD_list70] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list70].setDisplayName ( "" );
            methods[METHOD_list71] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list71].setDisplayName ( "" );
            methods[METHOD_list72] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list72].setDisplayName ( "" );
            methods[METHOD_list73] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list73].setDisplayName ( "" );
            methods[METHOD_list74] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list74].setDisplayName ( "" );
            methods[METHOD_locate75] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate75].setDisplayName ( "" );
            methods[METHOD_location76] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location76].setDisplayName ( "" );
            methods[METHOD_lostFocus77] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus77].setDisplayName ( "" );
            methods[METHOD_minimumSize78] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize78].setDisplayName ( "" );
            methods[METHOD_mouseDown79] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown79].setDisplayName ( "" );
            methods[METHOD_mouseDrag80] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag80].setDisplayName ( "" );
            methods[METHOD_mouseEnter81] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter81].setDisplayName ( "" );
            methods[METHOD_mouseExit82] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit82].setDisplayName ( "" );
            methods[METHOD_mouseMove83] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove83].setDisplayName ( "" );
            methods[METHOD_mouseUp84] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp84].setDisplayName ( "" );
            methods[METHOD_move85] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move85].setDisplayName ( "" );
            methods[METHOD_nextFocus86] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus86].setDisplayName ( "" );
            methods[METHOD_pack87] = new MethodDescriptor(java.awt.Window.class.getMethod("pack", new Class[] {})); // NOI18N
            methods[METHOD_pack87].setDisplayName ( "" );
            methods[METHOD_paint88] = new MethodDescriptor(java.awt.Window.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint88].setDisplayName ( "" );
            methods[METHOD_paintAll89] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll89].setDisplayName ( "" );
            methods[METHOD_paintComponents90] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents90].setDisplayName ( "" );
            methods[METHOD_postEvent91] = new MethodDescriptor(java.awt.Window.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent91].setDisplayName ( "" );
            methods[METHOD_preferredSize92] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize92].setDisplayName ( "" );
            methods[METHOD_prepareImage93] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage93].setDisplayName ( "" );
            methods[METHOD_prepareImage94] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage94].setDisplayName ( "" );
            methods[METHOD_print95] = new MethodDescriptor(java.awt.Container.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print95].setDisplayName ( "" );
            methods[METHOD_printAll96] = new MethodDescriptor(java.awt.Component.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll96].setDisplayName ( "" );
            methods[METHOD_printComponents97] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents97].setDisplayName ( "" );
            methods[METHOD_remove98] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove98].setDisplayName ( "" );
            methods[METHOD_remove99] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove99].setDisplayName ( "" );
            methods[METHOD_remove100] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove100].setDisplayName ( "" );
            methods[METHOD_removeAll101] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll101].setDisplayName ( "" );
            methods[METHOD_removeNotify102] = new MethodDescriptor(java.awt.Window.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify102].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener103] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener103].setDisplayName ( "" );
            methods[METHOD_repaint104] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint104].setDisplayName ( "" );
            methods[METHOD_repaint105] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint105].setDisplayName ( "" );
            methods[METHOD_repaint106] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint106].setDisplayName ( "" );
            methods[METHOD_repaint107] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint107].setDisplayName ( "" );
            methods[METHOD_requestFocus108] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus108].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow109] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow109].setDisplayName ( "" );
            methods[METHOD_reshape110] = new MethodDescriptor(java.awt.Window.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape110].setDisplayName ( "" );
            methods[METHOD_resize111] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize111].setDisplayName ( "" );
            methods[METHOD_resize112] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize112].setDisplayName ( "" );
            methods[METHOD_revalidate113] = new MethodDescriptor(java.awt.Component.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate113].setDisplayName ( "" );
            methods[METHOD_setBounds114] = new MethodDescriptor(java.awt.Window.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds114].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder115] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder115].setDisplayName ( "" );
            methods[METHOD_setDefaultLookAndFeelDecorated116] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("setDefaultLookAndFeelDecorated", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_setDefaultLookAndFeelDecorated116].setDisplayName ( "" );
            methods[METHOD_setFocusTraversalKeys117] = new MethodDescriptor(java.awt.Container.class.getMethod("setFocusTraversalKeys", new Class[] {int.class, java.util.Set.class})); // NOI18N
            methods[METHOD_setFocusTraversalKeys117].setDisplayName ( "" );
            methods[METHOD_show118] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show118].setDisplayName ( "" );
            methods[METHOD_show119] = new MethodDescriptor(java.awt.Dialog.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show119].setDisplayName ( "" );
            methods[METHOD_size120] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size120].setDisplayName ( "" );
            methods[METHOD_toBack121] = new MethodDescriptor(java.awt.Dialog.class.getMethod("toBack", new Class[] {})); // NOI18N
            methods[METHOD_toBack121].setDisplayName ( "" );
            methods[METHOD_toFront122] = new MethodDescriptor(java.awt.Window.class.getMethod("toFront", new Class[] {})); // NOI18N
            methods[METHOD_toFront122].setDisplayName ( "" );
            methods[METHOD_toString123] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString123].setDisplayName ( "" );
            methods[METHOD_transferFocus124] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus124].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward125] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward125].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle126] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle126].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle127] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle127].setDisplayName ( "" );
            methods[METHOD_update128] = new MethodDescriptor(javax.swing.JDialog.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update128].setDisplayName ( "" );
            methods[METHOD_validate129] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate129].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/ComponentIcons/optionpane/optionpane.png";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/ComponentIcons/optionpane/optionpane.png";
    private static String iconNameM16 = "/ComponentIcons/optionpane/optionpane.png";
    private static String iconNameM32 = "/ComponentIcons/optionpane/optionpane.png";//GEN-END:Icons

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
