package com.schmitt.schmitt_highlow;

import java.util.Random;

public final class RNG
{
    public static int getRandomNumber(int min, int max)
    {     
        return new Random().nextInt(max - min) + min;
    }
}
