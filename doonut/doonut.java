// package com.mycompany.exam.prelim;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class doonut {

    static char[] gradient = new char[]{'.', ',', '-', '~', ':', ';', '=', '!', '*', '#', '$', '@'};

    static void show(String s, JTextArea messageLabel) {
        messageLabel.setText(s);
    }

    static String getFrame(double A, double B, char[] b, double[] z) {
        Arrays.fill(b, 0, 1760, ' ');
        Arrays.fill(z, 0, 1760, 0);
        for (double j = 0; 6.28 > j; j += 0.07) {
            for (double i = 0; 6.28 > i; i += 0.02) {
                double c = Math.sin(i),
                        d = Math.cos(j),
                        e = Math.sin(A),
                        f = Math.sin(j),
                        g = Math.cos(A),
                        h = d + 2,
                        D = 1 / (c * h * e + f * g + 5),
                        l = Math.cos(i),
                        m = Math.cos(B),
                        n = Math.sin(B),
                        t = c * h * g - f * e;
                int x = (int) (40 + 30 * D * (l * h * m - t * n)),
                        y = (int) (12 + 15 * D * (l * h * n + t * m)),
                        o = x + 80 * y,
                        N = (int) (8 * ((f * e - c * d * g) * m - c * d * e - f * g - l * d * n));
                if (22 > y && y > 0 && x > 0 && 80 > x && D > z[o]) {
                    z[o] = D;
                    b[o] = gradient[Math.max(N, 0)];
                }
            }
        }
        StringBuilder s = new StringBuilder();
        for (int k = 0; 1761 > k; k++) {
            s.append(k % 80 > 0 ? b[k] : 10);
        }
        return s.toString();
    }

    // ✅ Helper method to create a new donut frame
    static void createDonutFrame() {
        
        // First donut frame
        JFrame frame = new JFrame("Spinning Donut");
        frame.setSize(new Dimension(800, 800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        double[] z = new double[1760];
        char[] b = new char[1760];

        JTextArea messageLabel = new JTextArea();
        messageLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setBackground(Color.BLACK);
        messageLabel.setText(getFrame(0, 0, b, z));
        frame.add(messageLabel);
        frame.pack();

        // RANDOM POS
        // Get screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sw = screenSize.width;
        int sh = screenSize.height;

        // Get frame dimensions
        int w = frame.getWidth();
        int h = frame.getHeight();

        // Generate random x,y position where the frame fully fits
        Random rand = new Random();
        int x = rand.nextInt(sw - w + 1);
        int y = rand.nextInt(sh - h + 1);

        // Set the location
        frame.setLocation(x, y);
        // RANDOM POS

        int delay = 1000 / 60;
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double t = System.currentTimeMillis();
                double A = 0.04 * t * 60 / 1000;
                double B = 0.02 * t * 60 / 1000;
                String s = getFrame(A, B, b, z);
                messageLabel.setText(s);
            }
        });
        timer.start();

        // ✅ Add mouse listener to spawn another donut frame
        messageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createDonutFrame();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createDonutFrame();
    }
}
