package com.company;

import javax.swing.*;
import java.awt.*;

public class Check {


    public void checkWin(JButton[] beginGame,JLabel label){
        boolean gameOver = false;
        if(beginGame[0].getText() == "X" && beginGame[1].getText() == "X" && beginGame[2].getText() == "X" || beginGame[3].getText() == "X" && beginGame[4].getText() == "X" && beginGame[5].getText() == "X" || beginGame[6].getText() == "X" && beginGame[7].getText() == "X" && beginGame[8].getText() == "X"){
            label.setText(" X win!");
            gameOver = true;
        }
        if(beginGame[0].getText() == "X" && beginGame[3].getText() == "X" && beginGame[6].getText() == "X" || beginGame[1].getText() == "X" && beginGame[4].getText() == "X" && beginGame[7].getText() == "X" || beginGame[2].getText() == "X" && beginGame[5].getText() == "X" && beginGame[8].getText() == "X" ){
            label.setText(" X win!");
            gameOver = true;
        }
        if(beginGame[0].getText() == "X" && beginGame[4].getText() == "X" && beginGame[8].getText() == "X" || beginGame[2].getText() == "X" && beginGame[4].getText() == "X" && beginGame[6].getText() == "X"){
            label.setText(" X win!");
            gameOver = true;
        }
        if(beginGame[0].getText() == "O" && beginGame[1].getText() == "O" && beginGame[2].getText() == "O" || beginGame[3].getText() == "O" && beginGame[4].getText() == "O" && beginGame[5].getText() == "O" || beginGame[6].getText() == "O" && beginGame[7].getText() == "O" && beginGame[8].getText() == "O"){
            label.setText(" O win!");gameOver = true;

        }
        if(beginGame[0].getText() == "O" && beginGame[3].getText() == "O" && beginGame[6].getText() == "O" || beginGame[1].getText() == "O" && beginGame[4].getText() == "O" && beginGame[7].getText() == "O" || beginGame[2].getText() == "O" && beginGame[5].getText() == "O" && beginGame[8].getText() == "O" ){
            label.setText(" O win!");gameOver = true;
        }
        if(beginGame[0].getText() == "O" && beginGame[4].getText() == "O" && beginGame[8].getText() == "O" || beginGame[2].getText() == "O" && beginGame[4].getText() == "O" && beginGame[6].getText() == "O"){
            label.setText(" O win!");gameOver = true;
        }
        if (gameOver == true) {
            int i = 1;
            for (JButton button : beginGame){

                button.setText(String.valueOf(i));
                button.setForeground(Color.CYAN);
                i+=1;
            }
        }


    }
}