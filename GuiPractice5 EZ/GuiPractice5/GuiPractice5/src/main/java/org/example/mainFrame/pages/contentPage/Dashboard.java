<<<<<<< HEAD
package org.example.mainFrame.pages.contentPage;

import org.example.mainFrame.utilities.Theme.themeManager;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class Dashboard extends JPanel implements themeManager.ThemeChangerListener{
    public Dashboard(){
        setBackground(
                themeManager.getInstance().getBackgroundColor()
        );
        themeManager.getInstance().addThemeChangerListener(this);
    }

    @Override
    public void onThemeChanged(boolean isDarkMode) {
        SwingUtilities.invokeLater(() -> {
            themeManager ThemeManager = themeManager.getInstance();
            setBackground(ThemeManager.getBackgroundColor());
            setForeground(ThemeManager.getForegroundColor());
        });
    }

    @Override
    public void removeNotify() {
        super.removeNotify();
        themeManager.getInstance().removeThemeChangerListener(this);
    }
}
=======
package org.example.mainFrame.pages.contentPage;

import org.example.mainFrame.utilities.Theme.themeManager;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class Dashboard extends JPanel implements themeManager.ThemeChangerListener{
    public Dashboard(){
        setBackground(
                themeManager.getInstance().getBackgroundColor()
        );
        themeManager.getInstance().addThemeChangerListener(this);
    }

    @Override
    public void onThemeChanged(boolean isDarkMode) {
        SwingUtilities.invokeLater(() -> {
            themeManager ThemeManager = themeManager.getInstance();
            setBackground(ThemeManager.getBackgroundColor());
            setForeground(ThemeManager.getForegroundColor());
        });
    }

    @Override
    public void removeNotify() {
        super.removeNotify();
        themeManager.getInstance().removeThemeChangerListener(this);
    }
}
>>>>>>> e44b5e6318e98dfc19f9b6f21c9fb0bbc7c42b0c
