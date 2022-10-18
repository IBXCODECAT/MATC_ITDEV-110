/*

 */
package jonesiffyshell;

/**
 *
 * @author elija
 */
import javax.sound.sampled.*;
import java.awt.Toolkit;
import javax.sound.sampled.LineUnavailableException;
public class SoundUtils 
{

  public static float SAMPLE_RATE = 8000f;

  public static void tone(int hz, int msecs) 
     throws LineUnavailableException 
  {
     tone(hz, msecs, 1.0);
  }

  public static void tone(int hz, int msecs, double vol)
      throws LineUnavailableException 
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