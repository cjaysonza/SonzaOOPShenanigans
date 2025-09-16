<<<<<<< HEAD
package org.example.mainFrame.pages;

import org.example.mainFrame.components.SideBarFactory;
import org.example.mainFrame.pages.contentPage.Dashboard;
import org.example.mainFrame.pages.contentPage.Profile;
import org.example.mainFrame.utilities.Theme.DarkOneToggle;

import javax.smartcardio.Card;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Landing extends JPanel {
    private CardLayout cardLayout;
    private JPanel contentPanel;

    public Landing(){
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);
        initializePage();
    }

    private void changeCard(String text){
        cardLayout.show(contentPanel,text);
    }

    private void initializePage(){
        setLayout(new BorderLayout());

        JPanel topPanel = new DarkOneToggle();
        add(topPanel,BorderLayout.NORTH);

        contentPanel.add(new Dashboard(), "Dashboard");
        contentPanel.add(new Profile(), "Profile");
        add(contentPanel, BorderLayout.CENTER);

        JPanel sidebar = SideBarFactory.createCollapseableSidebar(250, 50,this::handleSideBarSelection);
        add(sidebar, BorderLayout.WEST);
    }

    private void handleSideBarSelection(String text){
        System.out.println("Selected: " + text);
        switch(text){
            case "Dashboard":
                cardLayout.show(contentPanel, "Dashboard");
                break;
            case "Profile":
                cardLayout.show(contentPanel,"Profile");
                break;

        }
    }
}
=======
package org.example.mainFrame.pages;

import org.example.mainFrame.components.SideBarFactory;
import org.example.mainFrame.pages.contentPage.Dashboard;
import org.example.mainFrame.pages.contentPage.Profile;
import org.example.mainFrame.utilities.Theme.DarkOneToggle;

import javax.smartcardio.Card;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Landing extends JPanel {
    private CardLayout cardLayout;
    private JPanel contentPanel;

    public Landing(){
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);
        initializePage();
    }

    private void changeCard(String text){
        cardLayout.show(contentPanel,text);
    }

    private void initializePage(){
        setLayout(new BorderLayout());

        JPanel topPanel = new DarkOneToggle();
        add(topPanel,BorderLayout.NORTH);

        contentPanel.add(new Dashboard(), "Dashboard");
        contentPanel.add(new Profile(), "Profile");
        add(contentPanel, BorderLayout.CENTER);

        JPanel sidebar = SideBarFactory.createCollapseableSidebar(250, 50,this::handleSideBarSelection);
        add(sidebar, BorderLayout.WEST);
    }

    private void handleSideBarSelection(String text){
        System.out.println("Selected: " + text);
        switch(text){
            case "Dashboard":
                cardLayout.show(contentPanel, "Dashboard");
                break;
            case "Profile":
                cardLayout.show(contentPanel,"Profile");
                break;

        }
    }
}
>>>>>>> e44b5e6318e98dfc19f9b6f21c9fb0bbc7c42b0c
