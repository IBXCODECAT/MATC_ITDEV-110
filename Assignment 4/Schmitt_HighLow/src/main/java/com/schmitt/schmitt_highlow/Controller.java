package com.schmitt.schmitt_highlow;

import javax.sound.sampled.LineUnavailableException;

public class Controller
{
    public Controller() throws LineUnavailableException, InterruptedException
    {
        final int STARTING_CREDITS = 1000;
        
        boolean keepGoing = true;
        
        int wagerAmount;
        
        int gameCredits = STARTING_CREDITS;
        
        wagerAmount = View.getWager(gameCredits);
            
        while(keepGoing)
        {
            
            //Start game isntructions
            View.GameStart();
            Thread.sleep(500);
            
            
            int max = 2;
            int min = 1;
            
            int difficulty = View.getRange();
            
            switch(difficulty)
            {
                case 1 -> max = 20;
                case 2 -> max = 50;
                case 3 -> max = 100;
                default -> System.out.println("Error setting difficulty...");
            }
            
            
            //Generage our random number
            int targetNumber = RNG.getRandomNumber(min, max);
            
            View.Instructions();
            System.out.println("Number is in between 1 and " + max);
            
            int guess = -2;
            int attempts = 0;
            
            while(targetNumber != guess)
            {
                attempts++;
                guess = View.Guess();
                
                if(guess < 0) break;
                
                if(guess == targetNumber)
                {
                    System.out.println(wagerAmount * 10 + " game credits added!");
                    gameCredits += wagerAmount * 10;
                    View.Correct(attempts, gameCredits);
                }
                else
                {
                    gameCredits -= wagerAmount;
                    
                    if(gameCredits <= 0)
                    {
                        View.NoCredits();
                        gameCredits = STARTING_CREDITS;
                        System.out.println("Your credits have been reset to 1000 for the next game...");
                        break;
                    }
                    
                    if(targetNumber > guess) View.ToLow(guess, gameCredits); else View.ToHigh(guess, gameCredits);
                }
            }
            
            keepGoing = View.Continue();
        }
        
        View.GameEnd();
    }
}
