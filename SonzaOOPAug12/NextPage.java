import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class NextPage extends JFrame{

    public NextPage(String input) {
        this.setSize(300, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle(input);
        this.setBackground(Color.MAGENTA);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public NextPage(String username, String password) {
        this.setSize(300, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Da Next Page");
        this.setBackground(Color.PINK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        
    
    }
}
