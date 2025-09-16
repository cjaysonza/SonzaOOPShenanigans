<<<<<<< HEAD
package org.example.mainFrame.utilities.Theme;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class themeManager {
    private static themeManager instance;
    private boolean isDarkMode = false;

    private final ArrayList<ThemeChangerListener> listeners = new ArrayList<>();

    private Color lightBackground = new Color(0xFFFFFF);
    private Color lightForeground = Color.BLACK;
    private Color lightComponents = new Color(240,240,240);

    private Color darkBackground = new Color(0x100D0D);
    private Color darkForeground = Color.WHITE;
    private Color darkComponents = new Color(60,60,60);

    private themeManager(){
    }

    public void toggleDarkMode(){
        isDarkMode = !isDarkMode;
        applyThemetoAllComponents();
        notifyListeners();
    }

    public void setDarkMode(boolean isDark){
        this.isDarkMode = isDark;
        applyThemetoAllComponents();
        notifyListeners();
    }


    public void addThemeChangerListener(ThemeChangerListener listener){
        listeners.add(listener);
    }

    public void removeThemeChangerListener(ThemeChangerListener listener){
        listeners.remove(listener);
    }

    private void notifyListeners(){
        for(ThemeChangerListener listener : listeners){
            listener.onThemeChanged(isDarkMode);
        }
    }

    public void applyThemetoAllComponents(){
        for(Window window : Window.getWindows()) {
            applyThemetoContainer(window);
        }
    }

    public static themeManager getInstance(){
        if(instance == null){
            instance = new themeManager();
        }
        return instance;
    }

    public void applyThemetoContainer(Container container){
        applyThemeComponent(container);

        for(Component comp: container.getComponents()){
            if(comp instanceof Container){
                applyThemetoContainer((Container)comp);
            } else {
                applyThemeComponent(comp);
            }
        }
    }

    private void applyThemeComponent(Component comp){
        if(isDarkMode){
            applyDarkTheme(comp);
        } else {
            applyLightTheme(comp);
        }
    }

    private void applyDarkTheme(Component comp){
        comp.setForeground(darkForeground);
        if(comp instanceof JComponent jcomp){
            if(jcomp instanceof JPanel || jcomp instanceof JLabel){
                jcomp.setBackground(darkBackground);
            } else if(jcomp instanceof JButton || jcomp instanceof JTextField || jcomp instanceof JComboBox || jcomp instanceof JList){
                jcomp.setBackground(darkComponents);
                jcomp.setBorder(BorderFactory.createLineBorder(new Color(100,100,100)));
            }
        }
    }

    private void applyLightTheme(Component comp){
        comp.setForeground(lightForeground);
        if(comp instanceof JComponent jcomp){
            if(jcomp instanceof JPanel || jcomp instanceof JLabel){
                jcomp.setBackground(lightBackground);
            } else if(jcomp instanceof JButton || jcomp instanceof JTextField || jcomp instanceof JComboBox || jcomp instanceof JList){
                jcomp.setBackground(lightBackground);
                jcomp.setBorder(BorderFactory.createLineBorder(new Color(100,100,100)));
            }
        }
    }

    public boolean isDarkMode() {
        return isDarkMode;
    }

    public Color getBackgroundColor() {
        return isDarkMode ? darkBackground : lightBackground;
    }

    public Color getForegroundColor() {
        return isDarkMode ? darkForeground : lightForeground ;
    }

    public Color getComponentsColor() {
        return isDarkMode ? darkComponents : lightComponents;
    }

    public interface ThemeChangerListener{
        void onThemeChanged(boolean isDarkMode);
    }
}

=======
package org.example.mainFrame.utilities.Theme;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class themeManager {
    private static themeManager instance;
    private boolean isDarkMode = false;

    private final ArrayList<ThemeChangerListener> listeners = new ArrayList<>();

    private Color lightBackground = new Color(0xFFFFFF);
    private Color lightForeground = Color.BLACK;
    private Color lightComponents = new Color(240,240,240);

    private Color darkBackground = new Color(0x100D0D);
    private Color darkForeground = Color.WHITE;
    private Color darkComponents = new Color(60,60,60);

    private themeManager(){
    }

    public void toggleDarkMode(){
        isDarkMode = !isDarkMode;
        applyThemetoAllComponents();
        notifyListeners();
    }

    public void setDarkMode(boolean isDark){
        this.isDarkMode = isDark;
        applyThemetoAllComponents();
        notifyListeners();
    }


    public void addThemeChangerListener(ThemeChangerListener listener){
        listeners.add(listener);
    }

    public void removeThemeChangerListener(ThemeChangerListener listener){
        listeners.remove(listener);
    }

    private void notifyListeners(){
        for(ThemeChangerListener listener : listeners){
            listener.onThemeChanged(isDarkMode);
        }
    }

    public void applyThemetoAllComponents(){
        for(Window window : Window.getWindows()) {
            applyThemetoContainer(window);
        }
    }

    public static themeManager getInstance(){
        if(instance == null){
            instance = new themeManager();
        }
        return instance;
    }

    public void applyThemetoContainer(Container container){
        applyThemeComponent(container);

        for(Component comp: container.getComponents()){
            if(comp instanceof Container){
                applyThemetoContainer((Container)comp);
            } else {
                applyThemeComponent(comp);
            }
        }
    }

    private void applyThemeComponent(Component comp){
        if(isDarkMode){
            applyDarkTheme(comp);
        } else {
            applyLightTheme(comp);
        }
    }

    private void applyDarkTheme(Component comp){
        comp.setForeground(darkForeground);
        if(comp instanceof JComponent jcomp){
            if(jcomp instanceof JPanel || jcomp instanceof JLabel){
                jcomp.setBackground(darkBackground);
            } else if(jcomp instanceof JButton || jcomp instanceof JTextField || jcomp instanceof JComboBox || jcomp instanceof JList){
                jcomp.setBackground(darkComponents);
                jcomp.setBorder(BorderFactory.createLineBorder(new Color(100,100,100)));
            }
        }
    }

    private void applyLightTheme(Component comp){
        comp.setForeground(lightForeground);
        if(comp instanceof JComponent jcomp){
            if(jcomp instanceof JPanel || jcomp instanceof JLabel){
                jcomp.setBackground(lightBackground);
            } else if(jcomp instanceof JButton || jcomp instanceof JTextField || jcomp instanceof JComboBox || jcomp instanceof JList){
                jcomp.setBackground(lightBackground);
                jcomp.setBorder(BorderFactory.createLineBorder(new Color(100,100,100)));
            }
        }
    }

    public boolean isDarkMode() {
        return isDarkMode;
    }

    public Color getBackgroundColor() {
        return isDarkMode ? darkBackground : lightBackground;
    }

    public Color getForegroundColor() {
        return isDarkMode ? darkForeground : lightForeground ;
    }

    public Color getComponentsColor() {
        return isDarkMode ? darkComponents : lightComponents;
    }

    public interface ThemeChangerListener{
        void onThemeChanged(boolean isDarkMode);
    }
}

>>>>>>> e44b5e6318e98dfc19f9b6f21c9fb0bbc7c42b0c
