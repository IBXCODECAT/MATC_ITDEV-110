package com.schmitt.tictactoe;

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