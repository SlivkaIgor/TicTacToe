package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener {
    BeginGame beginGame;

    public Action(BeginGame beginGame) {

        this.beginGame = beginGame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton click = (JButton) e.getSource();
        String number = click.getText();

        if (this.beginGame.startGame == false) {
            if(number=="New game"){
                this.beginGame.startGame =true;
               int i = 1;
                    for (JButton button : this.beginGame.array){
                        button.setText(String.valueOf(i));
                        button.setForeground(Color.CYAN);
                        i++;
                    }
            }
        } else {
            this.beginGame.labelWin.setText("game");

            if (number == "X" || number == "O") {
            } else {
                int x = Integer.parseInt(number);
                x -= 1;
                number = String.valueOf(x);
                if (this.beginGame.step.equals("O")) {
                    this.beginGame.step = "X";
                } else {
                    this.beginGame.step = "O";
                }
            }
            for (int i = 0; i < 9; i++) {
                if (number.equals(String.valueOf(i))) {
                    this.beginGame.array[i].setText(this.beginGame.step);
                    this.beginGame.array[i].setForeground(Color.BLACK);
                }
            }
            Check check = new Check();
            check.checkWin(this.beginGame.array, this.beginGame.labelWin);
            if (this.beginGame.step.equals("O")) {
                this.beginGame.step = "X";
            } else {
                this.beginGame.step = "O";
                StepComputer stepComputer = new StepComputer();
                stepComputer.ai(this.beginGame.array);
            }
        }
    }
}