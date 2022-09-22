/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playatone;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author elija
 */
public class PlayATone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException {
        SoundUtils s = new SoundUtils();
        s.playNote();
    }
    
}
