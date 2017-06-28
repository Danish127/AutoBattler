/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoBattler;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbm3
 */
public class Battler {
    private Robot Grinder;

    public Battler() {
        try {
            Grinder = new Robot();
            Grinder.setAutoDelay(40);
            Grinder.setAutoWaitForIdle(true);
        } catch (AWTException ex) {
            Logger.getLogger(Battler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void walk(boolean leftright, boolean updown) {
        if (leftright) {
            Grinder.keyPress(KeyEvent.VK_A);
            Grinder.delay(1000);
            Grinder.keyRelease(KeyEvent.VK_A);
            Grinder.delay(500);
            Grinder.keyPress(KeyEvent.VK_D);
            Grinder.delay(1000);
            Grinder.keyRelease(KeyEvent.VK_D);
        }
        if (updown) {
            Grinder.keyPress(KeyEvent.VK_W);
            Grinder.delay(1000);
            Grinder.keyRelease(KeyEvent.VK_W);
            Grinder.delay(500);
            Grinder.keyPress(KeyEvent.VK_S);
            Grinder.delay(1000);
            Grinder.keyRelease(KeyEvent.VK_S);
        }

    }

    public void walk(boolean leftright, boolean updown, short cycles) {
        for (int i = 0; i < cycles; i++) {
            walk(leftright, updown);
        }

    }

    public void walk(boolean leftright, boolean updown, short leftrightSteps, short updownSteps) {
        if (leftright) {
            Grinder.keyPress(KeyEvent.VK_A);
            Grinder.delay(leftrightSteps * 100);
            Grinder.keyRelease(KeyEvent.VK_A);
            Grinder.delay(500);
            Grinder.keyPress(KeyEvent.VK_D);
            Grinder.delay(leftrightSteps * 100);
            Grinder.keyRelease(KeyEvent.VK_D);
        }
        if (updown) {
            Grinder.keyPress(KeyEvent.VK_W);
            Grinder.delay(leftrightSteps * 100);
            Grinder.keyRelease(KeyEvent.VK_W);
            Grinder.delay(500);
            Grinder.keyPress(KeyEvent.VK_S);
            Grinder.delay(leftrightSteps * 100);
            Grinder.keyRelease(KeyEvent.VK_S);
        }
    }

    public void walk(boolean leftright, boolean updown, short leftrightSteps, short updownSteps, short cycles) {
        System.out.println("Thread starting");
        Thread t = new Thread(() -> {
            for (short i = 0; i < cycles; i++) {
                walk(leftright, updown, leftrightSteps, updownSteps);
            }
        });
        t.start();
        
    }

    public void battle(boolean firstRun, short player1, short player2, short player3, short player4, short cycles, boolean player1clevel, boolean player1jlevel, boolean player2clevel, boolean player2jlevel, boolean player3clevel, boolean player3jlevel, boolean player4clevel, boolean player4jlevel) {
        if (firstRun) {
            for(int i = 0; i < player1; i++){
                Grinder.keyPress(KeyEvent.VK_S);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_S);
            }
            Grinder.keyPress(KeyEvent.VK_ENTER);
            Grinder.delay(500);
            Grinder.keyRelease(KeyEvent.VK_ENTER);
            for(int i = 0; i < player2; i++){
                Grinder.keyPress(KeyEvent.VK_S);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_S);
            }
            Grinder.keyPress(KeyEvent.VK_ENTER);
            Grinder.delay(500);
            Grinder.keyRelease(KeyEvent.VK_ENTER);
            for(int i = 0; i < player3; i++){
                Grinder.keyPress(KeyEvent.VK_S);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_S);
            }
            Grinder.keyPress(KeyEvent.VK_ENTER);
            Grinder.delay(500);
            Grinder.keyRelease(KeyEvent.VK_ENTER);
            for(int i = 0; i < player4; i++){
                Grinder.keyPress(KeyEvent.VK_S);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_S);
            }
            Grinder.keyPress(KeyEvent.VK_ENTER);
            Grinder.delay(500);
            Grinder.keyRelease(KeyEvent.VK_ENTER);
            firstRun = false;
        } else {
            for (int i = 0; i < cycles; i++) {
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
                Grinder.delay(12000);
            }
            for (int i = 0; i < 11; i++) {
                if(!(i == 2 && player1clevel) || !(i == 3 && player1jlevel) || !(i == 4 && player2clevel) || !(i == 5 && player2jlevel) || !(i == 6 && player3clevel) || !(i == 7 && player3jlevel) || !(i == 8 && player4clevel)  || !(i == 9 && player4jlevel)){
                    continue;
                }
                Grinder.keyPress(KeyEvent.VK_ENTER);
                Grinder.delay(500);
                Grinder.keyRelease(KeyEvent.VK_ENTER);
            }
        }
    }

}
