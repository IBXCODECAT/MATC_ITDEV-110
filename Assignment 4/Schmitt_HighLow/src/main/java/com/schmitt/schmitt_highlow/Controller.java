package com.schmitt.schmitt_highlow;

import javax.sound.sampled.LineUnavailableException;

public class Controller
{
    public Controller() throws LineUnavailableException, InterruptedException
    {
        boolean keepGoing = true;
        
        while(keepGoing)
        {
            View.GameStart();
            
            
            Thread.sleep(500);
            
            View.RangeInstructions();
            
            Thread.sleep(500);
            
            int max;
            int min;
            
            int val1 = View.getRange();
            int val2 = View.getRange();
            
            if(val1 > val2)
            {
                //If value 1 is grater than value 2 set min and max acordingly
                max = val1;
                min = val2; //NOTE (EXCLUSIVE IN RNG)   
            }
            else if (val1 < val2)
            {
                //If value 1 is less than value 2 set min and max acordingly
                max = val2;
                min = val1; //NOTE (EXCLUSIVE IN RNG)
            }
            else
            {
                //If value 1 is equal than value 2 set min and max acordingly
                min = val1;
                max = min + 1; //NOTE (EXCLUSIVE IN RNG) so we add 1
            }
            
            //Generage our random number
            int targetNumber = RNG.getRandomNumber(min, max);
            
            View.Instructions();
            
            int guess = -2;
            int attempts = 0;
            
            while(targetNumber != guess)
            {
                attempts++;
                guess = View.Guess();
                
                if(guess < 0) break;
                
                if(guess == targetNumber)
                {
                    View.Correct(attempts);
                }
                else
                {
                    if(targetNumber > guess) View.ToLow(guess); else View.ToHigh(guess);
                }
            }
            
            keepGoing = View.Continue();
        }
        
        View.GameEnd();
    }
}
