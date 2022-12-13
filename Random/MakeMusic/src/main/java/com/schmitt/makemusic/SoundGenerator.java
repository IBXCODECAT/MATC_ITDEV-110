/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.makemusic;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

public class SoundGenerator {
    
    private HashMap<String, Integer> notes = new HashMap<String, Integer>();
    
    private static float SAMPLE_RATE = 8000f;
    
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
    
    public SoundGenerator()
    {
        notes.put("C", 264);
        notes.put("D", 297);
        notes.put("E", 330);
        notes.put("F", 352);
        notes.put("G", 396);
        notes.put("A", 440);
        notes.put("B", 495);
        notes.put("C2", 528);
    }
    
    /**
     * Generates sounds requested by the user
     */
    protected void GenerateSound(String note){
        Integer value = notes.get(note);
        
        int intValue = Integer.valueOf(value);
        try {
            SoundGenerator.tone(intValue, 200);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(SoundGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}