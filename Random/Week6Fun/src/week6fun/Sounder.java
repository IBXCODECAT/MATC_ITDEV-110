/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6fun;

import java.awt.Toolkit;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author elija
 */
public class Sounder {
    
    public void makeSound() throws LineUnavailableException
    {
        Toolkit.getDefaultToolkit().beep();
        SoundUtils.tone(261,500);
        SoundUtils.tone(392,500);
        SoundUtils.tone(523,500);
        
    }
    
}
