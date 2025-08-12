import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LaunchPage extends JFrame {
    ArrayList<JPanel> panels = new ArrayList<>();
    JFrame frame = new JFrame();

    public LaunchPage() {
        frame.setSize(1080, 420);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI-Quiz Sonza");
        frame.setLocationRelativeTo(null);

        JPanel center = new JPanel();

        for (int i = 0; i < 8;i++) {
            JPanel panel = createPanel();
            center.add(panel);
        }

        this.add(center, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);

    }

    private JPanel createPanel() {
        Random random = new Random();
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 400));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,5, 5));

        JLabel bottom_label = new JLabel();
        // bottom_label.setText("CSA-" + (random.nextInt(900) + 100));
        // bottom_label.setPreferredSize(new Dimension(100, 20));
        // bottom_label.setForeground(Color.BLACK);
        // bottom_label.setVisible(true);

        JLabel label = new JLabel();
        label.setText("CSA-" + (random.nextInt(900) + 100));

        // (100+random.nextInt(900))
        label.setPreferredSize(new Dimension(100, 20));
        label.setForeground(Color.BLACK);
        // label.setHorizontalAlignment(label.CENTER);
        // label.setVerticalTextPosition(label.CENTER);
        // label.setHorizontalTextPosition(label.SOUTH);
        label.add(bottom_label, BorderLayout.SOUTH);

        panel.add(label);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.DARK_GRAY);
                panel.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
                panel.repaint();
            }

            // @Override
            // public void mousePressed(MouseEvent e) {
            //     panel.setBackground(Color.RED);
            //     panel.repaint();
            // }

            @Override
            public void mouseReleased(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
                panel.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                panel.setBackground(Color.RED);
                panel.repaint();
            }


        });


        return panel;
    }
}