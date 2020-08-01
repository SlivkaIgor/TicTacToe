package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressBotton implements ActionListener {
    StartGame startGame;
    public PressBotton(StartGame startGame) {
    this.startGame = startGame;
    }
    int iteracia = 1;

    public PressBotton() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton click = (JButton) e.getSource();
        String botton = click.getText();
        if(iteracia == 1){
        }else{
        if(this.startGame.step == "X"){
            this.startGame.step = "O";
        }else{
            this.startGame.step = "X";
        }
        }
        iteracia +=1;
        if(botton.equals("1")){
            this.startGame.one.setText(this.startGame.step);
        }else if(botton.equals("2")){
            this.startGame.two.setText(this.startGame.step);
        }else if(botton.equals("3")){
            this.startGame.three.setText(this.startGame.step);
        }else if(botton.equals("4")){
            this.startGame.four.setText(this.startGame.step);
        }else if(botton.equals("5")){
            this.startGame.five.setText(this.startGame.step);
        }else if(botton.equals("6")){
            this.startGame.six.setText(this.startGame.step);
        }else if(botton.equals("7")){
            this.startGame.seven.setText(this.startGame.step);
        }else if(botton.equals("8")){
            this.startGame.eight.setText(this.startGame.step);
        }else if(botton.equals("9")) {
            this.startGame.nine.setText(this.startGame.step);
        }
        Check  check= new Check();
        String win = check.checkWin();
    }

}
