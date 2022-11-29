/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.Schmitt_GuessTheWord;

import java.util.Random;

/**
 * @author Nathan Schmitt
 */
public final class RNG
{
    private static Random rng = new Random();
    
    public static int getRandomNumber(int min, int max)
    {     
        return rng.nextInt(max - min) + min;
    }
    
    public static double getRandomValue(double min, double max)
    {
        return rng.nextDouble(max - min) + min;
    }
}