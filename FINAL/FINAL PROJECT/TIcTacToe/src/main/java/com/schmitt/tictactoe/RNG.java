package com.schmitt.tictactoe;

import java.util.ArrayList;
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
    
    protected static byte getRandomOpenSpace()
    {
        //Create a new array list to store availible spaces to choose from
        ArrayList<Byte> openSpaces = new ArrayList<>();
        
        //Clear the opoen spaces, since the list will have shrunk since last round
        openSpaces.clear();
        
        //For each space...
        for(byte space = 0; space < Model.spaceOcupied.size(); space++)
        {
            //Is this space free to use?
            if(!Model.spaceOcupied.get(space))
            {
                //Add the index of this space to the availible spaces
                openSpaces.add(space);
            }
        }
        
        //Calculate the max end of the RNG(equivilent to greatest index)
        int maxRandomIndex = openSpaces.size() - 1;
        
        //Choose a random index from the availible spaces to place RNG piece
        int randomIndex = rng.nextInt(maxRandomIndex - 0) + 0;
        
        //Return the space index the for the computer player to play
        return openSpaces.get(randomIndex);
       
    }
}