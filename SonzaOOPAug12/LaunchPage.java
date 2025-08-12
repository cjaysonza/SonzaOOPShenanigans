import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class LaunchPage extends JFrame {
    ArrayList<JPanel> panels = new ArrayList<>();
    JFrame frame = new JFrame();

    public LaunchPage() {
        frame.setSize(1080, 420);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Gui Shenanigans");
        frame.setLocationRelativeTo(null);

        panels.add(createPanel(new Dimension(0, 50))); // N
        panels.add(createPanel(new Dimension(0, 50))); // S
        panels.add(createPanel(new Dimension(50, 0))); // E
        panels.add(createPanel(new Dimension(50, 0))); // W
        panels.add(createPanel(new Dimension(0, 0))); // C

        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(100, 30));
        input.setText("Next Page");
        // input.setEditable(false);
        input.setBackground(Color.BLACK);
        input.setForeground(Color.green);

        JButton button = new JButton("Submit");
        button.setPreferredSize(new Dimension(100, 30));
        button.addActionListener(e ->{
            frame.dispose();
            NextPage np = new NextPage(input.getText());
        });

        panels.get(4).add(input);
        panels.get(4).add(button);

        frame.add(panels.get(0),BorderLayout.NORTH);
        frame.add(panels.get(1),BorderLayout.SOUTH);
        frame.add(panels.get(2),BorderLayout.EAST);
        frame.add(panels.get(3),BorderLayout.WEST);
        frame.add(panels.get(4),BorderLayout.CENTER);

        frame.setVisible(true);

    }

    private JPanel createPanel(Dimension dim) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(dim);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.BLUE);
                panel.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
                panel.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                panel.setBackground(Color.DARK_GRAY);
                panel.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                panel.setBackground(Color.CYAN);
                panel.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // frame.dispose();
                frame.setVisible(false);
                String username = JOptionPane.showInputDialog("Enter Username: ");
                String password = JOptionPane.showInputDialog("Enter User Password:");
                if (username.equals("Alejandro") && password.equals("Samantha")) {
                    NextPage np = new NextPage(username, password);
                } else {
                    JOptionPane.showMessageDialog(null, "Who tf is u ???");
                    frame.setVisible(true);
                }
            }


        });


        return panel;
    }
}