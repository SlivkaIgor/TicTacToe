package com.company;

import javax.swing.*;
import java.awt.*;
public class Check extends BeginGame {
    public void checkWin(JButton[] beginGame,JLabel label){
        boolean gameOver = false;
        if(beginGame[0].getText() == "X" && beginGame[1].getText() == "X" && beginGame[2].getText() == "X" ){
            label.setText(" X win!");
            gameOver = true;
            beginGame[0].setForeground(Color.RED);
            beginGame[1].setForeground(Color.RED);
            beginGame[2].setForeground(Color.RED);
        }
        if(beginGame[3].getText() == "X" && beginGame[4].getText() == "X" && beginGame[5].getText() == "X"){
            label.setText(" X win!");
            gameOver = true;
            beginGame[3].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[5].setForeground(Color.RED);
        }
        if(beginGame[6].getText() == "X" && beginGame[7].getText() == "X" && beginGame[8].getText() == "X"){
            label.setText(" X win!");
            gameOver = true;
            beginGame[6].setForeground(Color.RED);
            beginGame[7].setForeground(Color.RED);
            beginGame[8].setForeground(Color.RED);
        }
        if(beginGame[0].getText() == "X" && beginGame[3].getText() == "X" && beginGame[6].getText() == "X" ) {
            label.setText(" X win!");
            gameOver = true;
            beginGame[0].setForeground(Color.RED);
            beginGame[3].setForeground(Color.RED);
            beginGame[6].setForeground(Color.RED);
        }
        if(beginGame[1].getText() == "X" && beginGame[4].getText() == "X" && beginGame[7].getText() == "X"){
            label.setText(" X win!");
            gameOver = true;
            beginGame[1].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[7].setForeground(Color.RED);
        }
        if(beginGame[2].getText() == "X" && beginGame[5].getText() == "X" && beginGame[8].getText() == "X" ){
            label.setText(" X win!");
            gameOver = true;
            beginGame[2].setForeground(Color.RED);
            beginGame[5].setForeground(Color.RED);
            beginGame[8].setForeground(Color.RED);
        }
        if(beginGame[0].getText() == "X" && beginGame[4].getText() == "X" && beginGame[8].getText() == "X" ){
            label.setText(" X win!");
            gameOver = true;
            beginGame[0].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[8].setForeground(Color.RED);
        }
        if(beginGame[2].getText() == "X" && beginGame[4].getText() == "X" && beginGame[6].getText() == "X" ){
            label.setText(" X win!");
            gameOver = true;
            beginGame[2].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[6].setForeground(Color.RED);
        }


        if(beginGame[0].getText() == "O" && beginGame[1].getText() == "O" && beginGame[2].getText() == "O" ){
            label.setText(" O win!");
            gameOver = true;
            beginGame[0].setForeground(Color.RED);
            beginGame[1].setForeground(Color.RED);
            beginGame[2].setForeground(Color.RED);
        }
        if(beginGame[3].getText() == "O" && beginGame[4].getText() == "O" && beginGame[5].getText() == "O"){
            label.setText(" O win!");
            gameOver = true;
            beginGame[3].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[5].setForeground(Color.RED);
        }
        if(beginGame[6].getText() == "O" && beginGame[7].getText() == "O" && beginGame[8].getText() == "O"){
            label.setText(" O win!");
            gameOver = true;
            beginGame[6].setForeground(Color.RED);
            beginGame[7].setForeground(Color.RED);
            beginGame[8].setForeground(Color.RED);
        }
        if(beginGame[0].getText() == "O" && beginGame[3].getText() == "O" && beginGame[6].getText() == "O" ) {
            label.setText(" O win!");
            gameOver = true;
            beginGame[0].setForeground(Color.RED);
            beginGame[3].setForeground(Color.RED);
            beginGame[6].setForeground(Color.RED);
        }
        if(beginGame[1].getText() == "O" && beginGame[4].getText() == "O" && beginGame[7].getText() == "O"){
            label.setText(" O win!");
            gameOver = true;
            beginGame[1].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[7].setForeground(Color.RED);
        }
        if(beginGame[2].getText() == "O" && beginGame[5].getText() == "O" && beginGame[8].getText() == "O" ){
            label.setText(" O win!");
            gameOver = true;
            beginGame[2].setForeground(Color.RED);
            beginGame[5].setForeground(Color.RED);
            beginGame[8].setForeground(Color.RED);
        }
        if(beginGame[0].getText() == "O" && beginGame[4].getText() == "O" && beginGame[8].getText() == "O" ){
            label.setText(" O win!");
            gameOver = true;
            beginGame[0].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[8].setForeground(Color.RED);
        }
        if(beginGame[2].getText() == "O" && beginGame[4].getText() == "O" && beginGame[6].getText() == "O" ){
            label.setText(" O win!");
            gameOver = true;
            beginGame[2].setForeground(Color.RED);
            beginGame[4].setForeground(Color.RED);
            beginGame[6].setForeground(Color.RED);
        }
        boolean draw = true;
        for (JButton c: beginGame){
            if(c.getText().equals("O")||c.getText().equals("X")){

        }else{
          draw = false;
          break;
         } }

        if (gameOver == true || draw == true) {
            int i = 1;
            startGame = false;
        }
            if(draw == true){
                label.setText("draw");
            }
        }
}