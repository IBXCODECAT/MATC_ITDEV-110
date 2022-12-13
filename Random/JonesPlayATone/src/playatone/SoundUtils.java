/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playatone;

/**

 C3	130.81	263.74
 C#3/Db3 	138.59	248.93
D3	146.83	234.96
 D#3/Eb3 	155.56	221.77
E3	164.81	209.33
F3	174.61	197.58
 F#3/Gb3 	185.00	186.49
G3	196.00	176.02
 G#3/Ab3 	207.65	166.14
A3	220.00	156.82
 A#3/Bb3 	233.08	148.02
B3	246.94	139.71
C4	261.63	131.87
 
 */
import javax.sound.sampled.*;

public class SoundUtils 
{

  public static float SAMPLE_RATE = 8000f;

  public static void tone(int hz, int msecs) throws LineUnavailableException 
  {
     tone(hz, msecs, 1.0);
  }

  public static void tone(int hz, int msecs, double vol)throws LineUnavailableException 
  {
    byte[] buf = new byte[1];
    AudioFormat af = 
        new AudioFormat(
            SAMPLE_RATE, // sampleRate
            8,           // sampleSizeInBits
            1,           // channels
            true,        // signed
            false);      // bigEndian
    SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
    sdl.open(af);
    sdl.start();
    
    for (int i=0; i < msecs*8; i++) {
      double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
      buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
      sdl.write(buf,0,1);
    }
    sdl.drain();
    sdl.stop();
    sdl.close();
  } 
  
  public void playNote() throws LineUnavailableException {
         SoundUtils.tone(600,75);
         SoundUtils.tone(600,75);
         SoundUtils.tone(130,300);  //C
         SoundUtils.tone(147,300);  //D
         SoundUtils.tone(164,300);  //E
         SoundUtils.tone(174,300);  //F
         SoundUtils.tone(196,300);  //G
         SoundUtils.tone(220,300);  //A
         SoundUtils.tone(246,300);  //B
         SoundUtils.tone(261,300);  //C
    }
}