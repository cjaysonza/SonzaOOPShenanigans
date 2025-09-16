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
