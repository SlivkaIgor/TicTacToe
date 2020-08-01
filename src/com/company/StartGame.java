package com.company;

import javax.swing.*;
import java.awt.*;

public class StartGame {
    JButton one   ;
    JButton two   ;
    JButton three ;
    JButton four  ;
    JButton five  ;
    JButton six   ;
    JButton seven ;
    JButton eight ;
    JButton nine  ;
    JLabel label  ;
    String step = "X";

    public void Toy (){
    JPanel panel = new JPanel();
    BorderLayout BL = new BorderLayout();
    panel.setLayout(BL);
    JPanel gridPanel = new JPanel();
    GridLayout gr = new GridLayout(3,3);
    gridPanel.setLayout(gr);
        gridPanel.add(one = new JButton("1"));
        one.setBackground(Color.BLACK);
        one.setForeground(Color.WHITE);
        one.setFont(new Font("ARIA",Font.PLAIN,15));
        one.setFocusPainted(false);
        gridPanel.add(two = new JButton("2"));
        gridPanel.add(three = new JButton("3"));
        gridPanel.add(four = new JButton("4"));
        gridPanel.add(five = new JButton("5"));
        gridPanel.add(six = new JButton("6"));
        gridPanel.add(seven = new JButton("7"));
        gridPanel.add(eight = new JButton("8"));
        gridPanel.add(nine = new JButton("9"));
        panel.add(gridPanel,"Center");
        JPanel flowPanel = new JPanel();
        FlowLayout flowLayout = new FlowLayout();
        flowPanel.setLayout(flowLayout);
        flowPanel.add(label = new JLabel("TicTacToe"));
        label.setFont(new Font(label.getText(),Font.PLAIN,40));
        panel.add(flowPanel,"North");
        JFrame frame = new JFrame("TicTacToe");
        frame.add(panel);
        frame.setSize(400,300);
        frame.setVisible(true);

        PressBotton press = new PressBotton(this);
        one.addActionListener(press);
        two.addActionListener(press);
        three.addActionListener(press);
        four.addActionListener(press);
        five.addActionListener(press);
        six.addActionListener(press);
        seven.addActionListener(press);
        eight.addActionListener(press);
        nine.addActionListener(press);
    }

}
