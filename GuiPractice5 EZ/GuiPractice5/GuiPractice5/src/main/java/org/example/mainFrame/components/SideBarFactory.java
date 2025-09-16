<<<<<<< HEAD
package org.example.mainFrame.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class SideBarFactory extends JPanel {

    private static Color DEFAULT_BG = new Color(240, 240, 240);
    private static Color HIGHLIGHTED = new Color(200, 200, 200);


    public static JPanel createNavigationSideBar(int width, Consumer<String> onItemClick) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));

        //navigation items
        addNavigationItem(panel, "Dashboard", "🕛", onItemClick);
        addNavigationItem(panel, "Profile", "😁", onItemClick);

        return panel;
    }

    public static JPanel createCollapseableSidebar(int expWidth, int clpWidth, Consumer<String> onClick){
        JPanel sideBar = new JPanel(new BorderLayout());
        sideBar.setPreferredSize(new Dimension(expWidth, Integer.MAX_VALUE));
        sideBar.setBackground(DEFAULT_BG);


        JButton toggleButton = new JButton("📁");
        toggleButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        toggleButton.setContentAreaFilled(false);
//        toggleButton.setForeground(CO);
        toggleButton.setFocusPainted(false);

        JPanel navItemPanel = new JPanel();
        navItemPanel.setLayout(new BoxLayout(navItemPanel, BoxLayout.Y_AXIS));
        navItemPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        navItemPanel.setBackground(DEFAULT_BG);

        addNavigationItem(navItemPanel, "Dashboard", "🕛", onClick);
        addNavigationItem(navItemPanel, "Profile", "😁", onClick);
        addNavigationItem(navItemPanel, "About", "👤", onClick);
        addNavigationItem(navItemPanel, "Settings", "⚙️", onClick);
        addNavigationItem(navItemPanel, "LogOut", "🚪", onClick);

        sideBar.add(toggleButton, BorderLayout.NORTH);
        sideBar.add(navItemPanel, BorderLayout.CENTER);

        toggleButton.addActionListener(e -> {
            boolean isCollapsed = sideBar.getWidth() == clpWidth;
            int newWidth = isCollapsed ? expWidth : clpWidth;

            sideBar.setPreferredSize(new Dimension(newWidth, Integer.MAX_VALUE));
            toggleButton.setText(isCollapsed ? "📂" : "📁");
            navItemPanel.setVisible(isCollapsed);

            sideBar.revalidate();
            sideBar.repaint();
        });

        return sideBar;
    }


    private static void addNavigationItem(JPanel panel, String text, String icon, Consumer<String> onItemClick) {
        JButton button = new JButton(text + " " + icon);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setMinimumSize(new Dimension(Integer.MAX_VALUE, 12));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 44));
        button.setHorizontalAlignment(JButton.LEFT);
        button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        button.setFocusable(false);
        button.setContentAreaFilled(false);

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                button.setBackground(HIGHLIGHTED);
                button.setOpaque(true);
            }

            public void mouseExited(MouseEvent e){
                button.setBackground(null);
                button.setOpaque(false);
            }
        });
        
        button.addActionListener(e ->{
            if(onItemClick != null){
                onItemClick.accept(text);
            }
        });

        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));

    }
}
=======
package org.example.mainFrame.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class SideBarFactory extends JPanel {

    private static Color DEFAULT_BG = new Color(240, 240, 240);
    private static Color HIGHLIGHTED = new Color(200, 200, 200);


    public static JPanel createNavigationSideBar(int width, Consumer<String> onItemClick) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, Integer.MAX_VALUE));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 1));

        //navigation items
        addNavigationItem(panel, "Dashboard", "🕛", onItemClick);
        addNavigationItem(panel, "Profile", "😁", onItemClick);

        return panel;
    }

    public static JPanel createCollapseableSidebar(int expWidth, int clpWidth, Consumer<String> onClick){
        JPanel sideBar = new JPanel(new BorderLayout());
        sideBar.setPreferredSize(new Dimension(expWidth, Integer.MAX_VALUE));
        sideBar.setBackground(DEFAULT_BG);


        JButton toggleButton = new JButton("📁");
        toggleButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        toggleButton.setContentAreaFilled(false);
//        toggleButton.setForeground(CO);
        toggleButton.setFocusPainted(false);

        JPanel navItemPanel = new JPanel();
        navItemPanel.setLayout(new BoxLayout(navItemPanel, BoxLayout.Y_AXIS));
        navItemPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        navItemPanel.setBackground(DEFAULT_BG);

        addNavigationItem(navItemPanel, "Dashboard", "🕛", onClick);
        addNavigationItem(navItemPanel, "Profile", "😁", onClick);
        addNavigationItem(navItemPanel, "About", "👤", onClick);
        addNavigationItem(navItemPanel, "Settings", "⚙️", onClick);
        addNavigationItem(navItemPanel, "LogOut", "🚪", onClick);

        sideBar.add(toggleButton, BorderLayout.NORTH);
        sideBar.add(navItemPanel, BorderLayout.CENTER);

        toggleButton.addActionListener(e -> {
            boolean isCollapsed = sideBar.getWidth() == clpWidth;
            int newWidth = isCollapsed ? expWidth : clpWidth;

            sideBar.setPreferredSize(new Dimension(newWidth, Integer.MAX_VALUE));
            toggleButton.setText(isCollapsed ? "📂" : "📁");
            navItemPanel.setVisible(isCollapsed);

            sideBar.revalidate();
            sideBar.repaint();
        });

        return sideBar;
    }


    private static void addNavigationItem(JPanel panel, String text, String icon, Consumer<String> onItemClick) {
        JButton button = new JButton(text + " " + icon);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setMinimumSize(new Dimension(Integer.MAX_VALUE, 12));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 44));
        button.setHorizontalAlignment(JButton.LEFT);
        button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        button.setFocusable(false);
        button.setContentAreaFilled(false);

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e){
                button.setBackground(HIGHLIGHTED);
                button.setOpaque(true);
            }

            public void mouseExited(MouseEvent e){
                button.setBackground(null);
                button.setOpaque(false);
            }
        });
        
        button.addActionListener(e ->{
            if(onItemClick != null){
                onItemClick.accept(text);
            }
        });

        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));

    }
}
>>>>>>> e44b5e6318e98dfc19f9b6f21c9fb0bbc7c42b0c
