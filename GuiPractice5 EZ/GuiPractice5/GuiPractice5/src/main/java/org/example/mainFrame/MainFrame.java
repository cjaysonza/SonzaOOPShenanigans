package org.example.mainFrame;

import org.example.mainFrame.pages.Landing;
import org.example.mainFrame.pages.LogIn;
import org.example.mainFrame.pages.SignUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame(){
        initializeFrame();
        setupUi();
    }

    private void initializeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screensize.height * 3/4;
        int width = screensize.width * 3/4;

        setSize(width,height);
        setBackground(Color.WHITE);
        setLocationRelativeTo(null);
    }

    private void setupUi(){
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(new LogIn(this::changeCard), "Login");
        mainPanel.add(new Landing(), "Launch");
        mainPanel.add(new SignUp(this::changeCard), "SignUp");
        this.setContentPane(mainPanel);

        cardLayout.show(mainPanel, "Login");
        changeCard("Login");
    }

    private void changeCard(String text){
        cardLayout.show(mainPanel,text);
    }




}
