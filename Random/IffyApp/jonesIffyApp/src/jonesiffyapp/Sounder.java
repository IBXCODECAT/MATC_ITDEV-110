/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonesiffyapp;

import java.awt.Toolkit;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author elija
 */
public class Sounder {
    
    public void playIntro() throws LineUnavailableException
    {
       // Toolkit.getDefaultToolkit().beep();
        SoundUtils.tone(261,100);
        SoundUtils.tone(392,100);
        SoundUtils.tone(523,100);
        SoundUtils.tone(523,100);
        SoundUtils.tone(523,100);
        SoundUtils.tone(392,100);
        SoundUtils.tone(523,100);
    }
    
    public void playGoodbye() throws LineUnavailableException
    {
      // Toolkit.getDefaultToolkit().beep();
        SoundUtils.tone(1000,100);
        SoundUtils.tone(1000,100);
        SoundUtils.tone(1000,100);
        SoundUtils.tone(523,100);
        SoundUtils.tone(392,100);
        SoundUtils.tone(523,100);
    }
    
    public void computerSound() throws LineUnavailableException
    {
      //  Toolkit.getDefaultToolkit().beep();
        SoundUtils.tone(523,200);
        SoundUtils.tone(392,100);
        SoundUtils.tone(392,100);
        SoundUtils.tone(523,200);
    }
    
       public void playerSound() throws LineUnavailableException
    {
     //   Toolkit.getDefaultToolkit().beep();
        SoundUtils.tone(392,200);
        SoundUtils.tone(523,100);
        SoundUtils.tone(523,100);
        SoundUtils.tone(392,200);
       
    }
    
    
}
