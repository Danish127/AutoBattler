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
public class Grind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Interface().setVisible(true);
        
        /*
        try {
            // TODO code application logic here
            Robot Grinder = new Robot();
            Grinder.setAutoDelay(40);
            Grinder.setAutoWaitForIdle(true);

            String phase = "Walk";
            int roundcount = 0;
            boolean enabled = true;

            while (enabled) {
                switch (phase) {
                    case "Walk":
                        for (int i = 0; i < 10; i++) {
                            System.out.println("Walk cycle " + i);
                            Grinder.keyPress(KeyEvent.VK_A);
                            Grinder.delay(1000);
                            Grinder.keyRelease(KeyEvent.VK_A);
                            Grinder.delay(500);
                            Grinder.keyPress(KeyEvent.VK_D);
                            Grinder.delay(1000);
                            Grinder.keyRelease(KeyEvent.VK_D);
                        }
                        phase = "Battle";
                        System.out.println("Switching to Battle");
                        break;
                    case "Battle":
                        System.out.println("Clearing queue");
                        for (int i = 0; i < 3; i++) {
                            Grinder.keyPress(KeyEvent.VK_BACK_SPACE);
                            Grinder.delay(500);
                            Grinder.keyRelease(KeyEvent.VK_BACK_SPACE);
                        }
                        for (int i = 0; i < 10; i++) {
                            System.out.println("Battle cycle " + i);
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
                        System.out.println("Post battle");
                        for (int i = 0; i < 11; i++) {
                            Grinder.keyPress(KeyEvent.VK_ENTER);
                            Grinder.delay(500);
                            Grinder.keyRelease(KeyEvent.VK_ENTER);
                        }

                        roundcount++;
                        if (roundcount > 2) {
                            phase = "Heal";
                            System.out.println("Switching to Heal");
                        } else {
                            phase = "Walk";
                            System.out.println("Switching to Walk");
                        }
                        break;
                    case "Heal":

                        //enabled = false;
                        Grinder.keyPress(KeyEvent.VK_TAB);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_TAB);
                        Grinder.delay(1000);
                        Grinder.keyPress(KeyEvent.VK_ENTER);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_ENTER);
                        for (int i = 0; i < 5; i++) {
                            Grinder.keyPress(KeyEvent.VK_S);
                            Grinder.delay(500);
                            Grinder.keyRelease(KeyEvent.VK_S);
                            Grinder.delay(500);
                        }

                        Grinder.keyPress(KeyEvent.VK_ENTER);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_ENTER);
                        Grinder.keyPress(KeyEvent.VK_ENTER);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_ENTER);
                        Grinder.keyPress(KeyEvent.VK_ENTER);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_ENTER);
                        Grinder.keyPress(KeyEvent.VK_S);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_S);
                        Grinder.keyPress(KeyEvent.VK_ENTER);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_ENTER);
                        Grinder.keyPress(KeyEvent.VK_S);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_S);
                        Grinder.keyPress(KeyEvent.VK_ENTER);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_ENTER);
                        Grinder.keyPress(KeyEvent.VK_S);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_S);
                        Grinder.keyPress(KeyEvent.VK_ENTER);
                        Grinder.delay(500);
                        Grinder.keyRelease(KeyEvent.VK_ENTER);
                        for (int i = 0; i < 5; i++) {
                            Grinder.keyPress(KeyEvent.VK_BACK_SPACE);
                            Grinder.delay(500);
                            Grinder.keyRelease(KeyEvent.VK_BACK_SPACE);
                        }
                        phase = "Walk";
                        roundcount = 0;
                        break;
                }
            }
        } catch (AWTException ex) {
            Logger.getLogger(Grind.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

}
