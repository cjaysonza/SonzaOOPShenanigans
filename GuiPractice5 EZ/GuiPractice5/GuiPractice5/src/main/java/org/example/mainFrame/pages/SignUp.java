<<<<<<< HEAD
package org.example.mainFrame.pages;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class SignUp extends JPanel {
    public SignUp(Consumer<String> onClick){
        this.setBackground(Color.RED);
    }

    public JButton createButton(String text, Consumer<String> onClick){
        JButton button = new JButton(text);
        button.setBackground(Color.RED);
        button.setPreferredSize(new Dimension(200,44));
        button.setMinimumSize(new Dimension(100,22));
        button.setMaximumSize(new Dimension(400,88));
        button.addActionListener(e ->{
            onClick.accept("Launch");
        });

        return button;



    }
}
=======
package org.example.mainFrame.pages;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class SignUp extends JPanel {
    public SignUp(Consumer<String> onClick){
        this.setBackground(Color.RED);
    }

    public JButton createButton(String text, Consumer<String> onClick){
        JButton button = new JButton(text);
        button.setBackground(Color.RED);
        button.setPreferredSize(new Dimension(200,44));
        button.setMinimumSize(new Dimension(100,22));
        button.setMaximumSize(new Dimension(400,88));
        button.addActionListener(e ->{
            onClick.accept("Launch");
        });

        return button;



    }
}
>>>>>>> e44b5e6318e98dfc19f9b6f21c9fb0bbc7c42b0c
