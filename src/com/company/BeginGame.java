package com.company;

import javax.swing.*;
import java.awt.*;

public class BeginGame {
    String step = "O";
    JButton [] array = new JButton[9];
    JLabel labelWin = new JLabel("u");
    static int x = 10;

    public void start(){
        JPanel panel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        panel.setLayout(borderLayout);
        JPanel panel1 = new JPanel();
        GridLayout gridLayout = new GridLayout(3,3);
        panel1.setLayout(gridLayout);
        panel1.add(array[0] = new JButton("1"));
        array[0].setForeground(Color.CYAN);
        array[0].setBackground(Color.CYAN);
        panel1.add(array[1] = new JButton("2"));
        array[1].setForeground(Color.CYAN);
        array[1].setBackground(Color.CYAN);
        panel1.add(array[2] = new JButton("3"));
        array[2].setForeground(Color.CYAN);
        array[2].setBackground(Color.CYAN);
        panel1.add(array[3] = new JButton("4"));
        array[3].setForeground(Color.CYAN);
        array[3].setBackground(Color.CYAN);
        panel1.add(array[4] = new JButton("5"));
        array[4].setForeground(Color.CYAN);
        array[4].setBackground(Color.CYAN);
        panel1.add(array[5] = new JButton("6"));
        array[5].setForeground(Color.CYAN);
        array[5].setBackground(Color.CYAN);
        panel1.add(array[6] = new JButton("7"));
        array[6].setForeground(Color.CYAN);
        array[6].setBackground(Color.CYAN);
        panel1.add(array[7] = new JButton("8"));
        array[7].setForeground(Color.CYAN);
        array[7].setBackground(Color.CYAN);
        panel1.add(array[8] = new JButton("9"));
        array[8].setForeground(Color.CYAN);
        array[8].setBackground(Color.CYAN);
        panel.setBackground(Color.CYAN);
        array[0].setFocusPainted(false);
        panel.add("Center",panel1);
        JPanel panel2 = new JPanel();
        FlowLayout flowLayout = new FlowLayout();
        panel2.setLayout(flowLayout);
        JLabel textField = new JLabel("TicTacToe");
        panel2.add(textField);
        panel.add("North",panel2);
        JPanel panel3 = new JPanel();
        FlowLayout flowLayout1 = new FlowLayout();
        panel3.setLayout(flowLayout1);
        labelWin.setBackground(Color.cyan);
        panel3.add(labelWin);
        panel.add("South",panel3);
        JFrame frame = new JFrame("TicTacToe");
        frame.setBackground(Color.magenta);
        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        Action action = new Action(this);
        array[0].addActionListener(action);
        array[1].addActionListener(action);
        array[2].addActionListener(action);
        array[3].addActionListener(action);
        array[4].addActionListener(action);
        array[5].addActionListener(action);
        array[6].addActionListener(action);
        array[7].addActionListener(action);
        array[8].addActionListener(action);


    }
}