package org.example.mainFrame.utilities.Theme;

import javax.swing.*;
import java.awt.*;

public class DarkOneToggle extends JPanel {
    private final JToggleButton toggleButton;

    public DarkOneToggle() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setOpaque(false);
        toggleButton = new JToggleButton();
        updateButtonAppearance();

        toggleButton.addActionListener(e -> {
            themeManager.getInstance().toggleDarkMode();
            updateButtonAppearance();
        });

        add(toggleButton);
    }

    private void updateButtonAppearance(){
        boolean isDarkMode = themeManager.getInstance().isDarkMode();
        if(isDarkMode){
            toggleButton.setText("☀️ Lighter");
            toggleButton.setToolTipText("Switch to Light Mode.");
        } else {
            toggleButton.setText("🌙 Darker");
            toggleButton.setToolTipText("Switch to Dark Mode.");
        }

        toggleButton.setBackground(themeManager.getInstance().getBackgroundColor());
        toggleButton.setForeground(themeManager.getInstance().getForegroundColor());
    }
}

