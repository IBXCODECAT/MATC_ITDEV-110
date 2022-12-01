package com.schmitt.tictactoe;

import javax.sound.sampled.*;

public final class Sound 
{
    public static float SAMPLE_RATE = 8000;
    
    public static void tone(int hz, int msecs) throws LineUnavailableException 
    {
        tone(hz, msecs, 1.0);
    }

    public static void tone(int hz, int msecs, double vol)throws LineUnavailableException 
    {
        byte[] buf = new byte[1];
        
        AudioFormat af = 
            new AudioFormat(
              SAMPLE_RATE,
              8,
              1,
              true,
              false);
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
    
    public static void PlayNote(int freq, int delay)
    {
        try { tone(freq,delay); } catch (LineUnavailableException ex) { }
    }
    
    public static void PlaySubmit()
    {
        try { tone(1000,100); } catch (LineUnavailableException ex) { }
    }
    
    public static void PlayPlayer1()
    {
        try { tone(600,150); } catch (LineUnavailableException ex) { }
    }
    
    public static void PlayPlayer2()
    {
        try { tone(500,150); } catch (LineUnavailableException ex) { }
    }
    
    public static void PlayError()    
    {
        try 
        {
            tone(400, 150);
            tone(400, 150);
        } 
        catch (LineUnavailableException ex) {}
    }
}