
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopclass;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.JToolBar;
/**
 *
 * @author csonza
 */
public class menu extends JFrame implements ActionListener{
//    private JFrame _frame;

        JButton button1;
        JPanel btnPanel;

    public menu(){
        
        JFrame _frame = new JFrame();
        this.setSize(550,550);
        this.setTitle("Spotify");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        setLayout(new BorderLayout());
//        setLayout();
//
        // ImageIcon icon = new ImageIcon("C:\\Users\\kmagno\\Downloads\\spoti.png");
        // this.setIconImage(icon.getImage());
//        
//        
        _frame.getContentPane().setBackground(Color.BLACK);
        // frame.getContentPane(new Color (Color.gray));
        _frame.getContentPane().setBackground(new Color(0,0,0));
        this.getContentPane().setBackground(new Color(0xFFFFF));
//        
//        //label
//        
        JLabel label = new JLabel();
        label.setText("Spotify");
//       
//        
//        ImageIcon labelIcon = new ImageIcon(icon.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
//        label.setIcon(labelIcon);
//        
//        //label customization
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setVerticalTextPosition(JLabel.CENTER);
//        label.setForeground(new Color(0xFFFFFF));
//        label.setFont(new Font("Montserrat", Font.BOLD, 20));
// 
//        Border border = BorderFactory.createLineBorder(new Color(0x1DB954),3);
//        label.setBorder(border);
//        
//        label.setBounds(50,50,300,300);
//        
        //label
        
        button1 = new JButton("THIS IS A BUTTON!");
        button1.setPreferredSize(new Dimension(200, 50));
        button1.setFocusable(false);
        button1.setVerticalTextPosition(JButton.BOTTOM);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setBackground(Color.YELLOW);
        button1.addActionListener(this);

        ImageIcon randomImage = new ImageIcon("C:\\Users\\csonza\\Downloads\\randomImage.png");
        ImageIcon btIcon = new ImageIcon(randomImage.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        button1.setIcon(btIcon);
        button1.setBackground(Color.CYAN);

        btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(300, 300));
        btnPanel.setBackground(Color.BLACK);
        btnPanel.setVisible(false);

        button1.addActionListener(e -> {
                btnPanel.setVisible(!btnPanel.isVisible()); }
        );

        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        JPanel Panel5 = new JPanel();
        JPanel Panel6 = new JPanel();
        JPanel Panel7 = new JPanel();
        JPanel Panel8 = new JPanel();
        JPanel Panel9 = new JPanel();
        JPanel Panel10 = new JPanel();
        JPanel Panel11 = new JPanel();
        JPanel Panel12 = new JPanel();
        JPanel Panel13 = new JPanel();
        
        Panel1.setBackground(Color.RED);
        Panel1.setPreferredSize(new Dimension(50,50));
        Panel2.setBackground(Color.ORANGE);        
        
        Panel2.setPreferredSize(new Dimension(50,50));       
//        Panel 3
        Panel3.setBackground(Color.RED);
        
        Panel6.setBackground(Color.GRAY);
        Panel7.setBackground(Color.WHITE);
        Panel8.setBackground(Color.PINK);        
        Panel9.setBackground(Color.RED);
        Panel10.setBackground(Color.BLUE);
        Panel11.setBackground(Color.WHITE);
        Panel12.setBackground(Color.GRAY);
        Panel13.setBackground(Color.CYAN);     
        
        Panel3.setPreferredSize(new Dimension(100,100));
        Panel4.setBackground(Color.CYAN);
        Panel4.setPreferredSize(new Dimension(110,110));
        Panel5.setBackground(new Color(45, 67, 145));
//        Panel1.setBounds(0,0,400,400);
        //add panel        Panel.add(label);
        
// OG PANELS       
        add(Panel1, BorderLayout.NORTH);
        add(Panel2, BorderLayout.SOUTH);
        add(Panel3, BorderLayout.EAST);
        add(Panel4, BorderLayout.WEST);
        add(Panel5, BorderLayout.CENTER);
        
        
// PANEL1        
        Panel1.setLayout(new BorderLayout());
        Panel1.add(Panel9, BorderLayout.NORTH);
        Panel1.add(Panel10, BorderLayout.SOUTH);
        Panel1.add(Panel11, BorderLayout.WEST);
        Panel1.add(Panel12, BorderLayout.EAST);
        Panel1.add(Panel13, BorderLayout.CENTER);
        

//  PANEL2
        Panel2.setLayout(new BorderLayout());
        Panel2.add(Panel6, BorderLayout.WEST);    
        Panel6.setPreferredSize(new Dimension(100,100));
        Panel2.add(Panel7, BorderLayout.EAST);
        Panel7.setPreferredSize(new Dimension(100,100));
        Panel2.add(Panel8, BorderLayout.CENTER);
        Panel8.setPreferredSize(new Dimension(300,300));


//  PANEL3
//         JPanel Panel14 = new JPanel();
//         JPanel Panel15 = new JPanel();
//         JPanel Panel16 = new JPanel();
//         JPanel Panel17 = new JPanel();
//         JPanel Panel18 = new JPanel();
// //  Color

//         Panel14.setBackground(new Color(67, 67, 130));
//         Panel15.setBackground(new Color(56, 145, 76));
//         Panel16.setBackground(new Color(67, 67, 130));
//         Panel17.setBackground(new Color(56, 145, 76));
//         Panel18.setBackground(new Color(67, 67, 130));
// //    Size
//         Panel14.setPreferredSize(new Dimension(30,80));
//         Panel15.setPreferredSize(new Dimension(30,80));
//         Panel16.setPreferredSize(new Dimension(30,80));
//         Panel17.setPreferredSize(new Dimension(30,80));
//         Panel18.setPreferredSize(new Dimension(30,80));
        
        // Panel3.add(Panel14);
        // Panel3.add(Panel15);
        // Panel3.add(Panel16);
        // Panel3.add(Panel17);
        // Panel3.add(Panel18);

        JButton redButton = new JButton();
        JButton greenButton = new JButton();
        JButton blueButton = new JButton();
        JButton blackButton = new JButton();

        // button1 = new JButton("THIS IS A BUTTON!");
        redButton.setIcon(btIcon);
        redButton.setPreferredSize(new Dimension(60, 60));
        redButton.setFocusable(false);
        redButton.setVerticalTextPosition(JButton.BOTTOM);
        redButton.setHorizontalTextPosition(JButton.CENTER);
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        Panel3.add(redButton);

        greenButton.setIcon(btIcon);

        greenButton.setPreferredSize(new Dimension(60, 60));
        greenButton.setFocusable(false);
        greenButton.setVerticalTextPosition(JButton.BOTTOM);
        greenButton.setHorizontalTextPosition(JButton.CENTER);
        greenButton.setBackground(Color.GREEN);
        greenButton.addActionListener(this);
        Panel3.add(greenButton);

        blueButton.setIcon(btIcon);

        blueButton.setPreferredSize(new Dimension(60, 60));
        blueButton.setFocusable(false);
        blueButton.setVerticalTextPosition(JButton.BOTTOM);
        blueButton.setHorizontalTextPosition(JButton.CENTER);
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        Panel3.add(blueButton);

        blackButton.setIcon(btIcon);

        blackButton.setPreferredSize(new Dimension(60, 60));
        blackButton.setFocusable(false);
        blackButton.setVerticalTextPosition(JButton.BOTTOM);
        blackButton.setHorizontalTextPosition(JButton.CENTER);
        blackButton.setBackground(Color.GRAY);
        blackButton.addActionListener(this);
        Panel3.add(blackButton);

        redButton.addActionListener(e -> {
                btnPanel.setBackground(Color.RED); }
        );

        greenButton.addActionListener(e -> {
                btnPanel.setBackground(Color.GREEN); }
        );

        blueButton.addActionListener(e -> {
                btnPanel.setBackground(Color.BLUE); }
        );

        blackButton.addActionListener(e -> {
                btnPanel.setBackground(Color.BLACK); }
        );

        
// PANEL4
        JPanel Panel19 = new JPanel();
        JPanel Panel20 = new JPanel();
        JPanel Panel21 = new JPanel();
        JPanel Panel22 = new JPanel();
        JPanel Panel23 = new JPanel();
        JPanel Panel24 = new JPanel();
        JPanel Panel25 = new JPanel();
        JPanel Panel26 = new JPanel();
        JPanel Panel27 = new JPanel();
//Color 
        Panel19.setBackground(Color.ORANGE);
        Panel20.setBackground(Color.YELLOW);
        Panel21.setBackground(Color.ORANGE);
        Panel22.setBackground(Color.YELLOW);
        Panel23.setBackground(Color.ORANGE);
        Panel24.setBackground(Color.YELLOW);
        Panel25.setBackground(Color.ORANGE);
        Panel26.setBackground(Color.YELLOW);
        Panel27.setBackground(Color.ORANGE);
//SIZE
        Panel19.setPreferredSize(new Dimension(30,80));    
        Panel20.setPreferredSize(new Dimension(30,80));    
        Panel21.setPreferredSize(new Dimension(30,80));    
        Panel22.setPreferredSize(new Dimension(30,80));    
        Panel23.setPreferredSize(new Dimension(30,80));    
        Panel24.setPreferredSize(new Dimension(30,80));    
        Panel25.setPreferredSize(new Dimension(30,80));    
        Panel26.setPreferredSize(new Dimension(30,80));    
        Panel27.setPreferredSize(new Dimension(30,80));    

        Panel4.add(Panel19);
        Panel4.add(Panel20);
        Panel4.add(Panel21);
        Panel4.add(Panel22);
        Panel4.add(Panel23);
        Panel4.add(Panel24);
        Panel4.add(Panel25);
        Panel4.add(Panel26);
        Panel4.add(Panel27);
        
        Panel5.add(button1);
        Panel5.add(btnPanel);









        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button1) {
                // if (!btnPanel.isVisible()) {
                //         btnPanel.setVisible(true);
                // } else {
                //         btnPanel.setVisible(false);
                // }

                System.out.println("HELLO !");
        }
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
