package com.schmitt.schmittdriverexam;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;

public class Admin
{
    protected void MissionControl()
    {
        UI ui = new UI();
        
        boolean takeExam = true;
        
        while(takeExam)
        {
            Controller cont = new Controller();

            try {
                Sound.playNote(200, 200);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }

            cont.AskQuestions();

            try {
                Sound.playNote(200, 200);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            takeExam = ui.takeAnother();
        }
           
    }
}
