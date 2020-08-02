package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class StepComputer extends BeginGame {
    JButton[] resolt = new JButton[9];
    public void ai(JButton[] resolt){
        this.resolt = resolt;
        Random random = new Random();
        boolean stepComuter = false;
        while(stepComuter == false) {
            int step = random.nextInt(9);
            if(step == 0){
            }else{
                step -= 1;
            }
            if ( resolt[step].getText().equals("X") || resolt[step].getText().equals("O") ){
                continue;
            }else{
                resolt[step].setText("O");
                resolt[step].setForeground(Color.BLACK);
                stepComuter = true;
            }
        }
        Check check  = new Check();
        check.checkWin(resolt,super.labelWin);
    }
}