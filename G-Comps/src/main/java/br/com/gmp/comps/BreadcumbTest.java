package br.com.gmp.comps;

import br.com.gmp.comps.breadcumb.ToggleButtonBarCellIcon;
import br.com.gmp.comps.ui.BreadcrumbLayerUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author kaciano
 */
public class BreadcumbTest extends JPanel {

    private final JPanel breadcrumb = makePanel(10 + 1);
    private final JTree tree = new JTree();

    public BreadcumbTest() {
        super(new BorderLayout());
        tree.setSelectionRow(0);
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (node == null || node.isLeaf()) {
                    return;
                } else {
                    initBreadcrumbList(breadcrumb, tree);
                    breadcrumb.revalidate();
                    breadcrumb.repaint();
                }
            }
        });

        initBreadcrumbList(breadcrumb, tree);
        add(new JLayer<JPanel>(breadcrumb, new BreadcrumbLayerUI()), BorderLayout.NORTH);

        JComponent c = makeBreadcrumbList(Arrays.asList("aaa", "bb", "c"));
        add(c, BorderLayout.SOUTH);
        add(new JScrollPane(tree));
        setPreferredSize(new Dimension(320, 240));
    }

    private static JPanel makePanel(int overlap) {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEADING, -overlap, 0));
        p.setBorder(BorderFactory.createEmptyBorder(4, overlap + 4, 4, 4));
        p.setOpaque(false);
        return p;
    }

    private static void initBreadcrumbList(JPanel p, JTree tree) {
        p.removeAll();
        ButtonGroup bg = new ButtonGroup();
        TreePath tp = tree.getSelectionPath();
        Object[] list = tp.getPath();
        ArrayList<Object> al = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            al.add(list[i]);
            TreePath cur = new TreePath(al.toArray());
            AbstractButton b = makeButton(tree, cur, Color.ORANGE);
            p.add(b);
            bg.add(b);
        }
    }

    private static JComponent makeBreadcrumbList(List<String> list) {
        JPanel p = makePanel(5 + 1);
        ButtonGroup bg = new ButtonGroup();
        for (String title : list) {
            AbstractButton b = makeButton(null, new TreePath(title), Color.PINK);
            p.add(b);
            bg.add(b);
        }
        return p;
    }

    private static AbstractButton makeButton(final JTree tree, final TreePath path, Color color) {
        final ToggleButtonBarCellIcon icon = new ToggleButtonBarCellIcon();
        AbstractButton b = new JRadioButton(path.getLastPathComponent().toString()) {
            @Override
            public boolean contains(int x, int y) {
                if (icon == null || icon.area == null) {
                    return super.contains(x, y);
                } else {
                    return icon.area.contains(x, y);
                }
            }
        };
        if (tree != null) {
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JRadioButton r = (JRadioButton) e.getSource();
                    tree.setSelectionPath(path);
                    r.setSelected(true);
                }
            });
        }
        b.setIcon(icon);
        b.setContentAreaFilled(false);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setVerticalAlignment(SwingConstants.CENTER);
        b.setVerticalTextPosition(SwingConstants.CENTER);
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setHorizontalTextPosition(SwingConstants.CENTER);
        b.setFocusPainted(false);
        b.setOpaque(false);
        b.setBackground(color);
        return b;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        JFrame frame = new JFrame("BreadcrumbList");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BreadcumbTest());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}