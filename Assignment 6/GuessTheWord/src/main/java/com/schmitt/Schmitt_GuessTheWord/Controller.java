package com.schmitt.Schmitt_GuessTheWord;

import java.util.ArrayList;
import javax.sound.sampled.LineUnavailableException;

/**
 * @author Nathan Schmitt
 */
public final class Controller 
{
    private static final int NUM_WORDS = Model.arrWords.length;
    
    protected static void Execute()
    {
        boolean play = true;
        
        while(play)
        {
            int guessCounter = 0;
            final int GUESSES_ALLOTED = 7;
        
            //Select a word stored in the mdoel to use for this game
            int wordLookupIndex = RNG.getRandomNumber(0, NUM_WORDS);
            String word = Model.arrWords[wordLookupIndex];
            
            //Display an introduction message to the user
            View.PrintIntroudction();
            
            //Play a sound to show that the game is ready
            try { Sound.PlayNote (500, 100); } catch (LineUnavailableException ex){}
            
            //Prompt the user to move on
            View.PressToContinue();
            
            //While we are able to guess letters...
            while(guessCounter < GUESSES_ALLOTED)
            {
                boolean enableGuessValidationLoop = true;
                
                ArrayList<Character> alreadyGuessed = Model.guessedChars;
                    
                //Loop to run until user enters a valid guess
                while(enableGuessValidationLoop)
                {
                    
                    Character guess = View.GuessLetter();
                    boolean invalidGuess = false;
                    
                    //For each char that haa already been guessed
                    for(char chr : alreadyGuessed)
                    {
                        //Is the char guessed already guessed
                        if(chr == guess)
                        {
                            //Set invalidGuess and break out of loop
                            invalidGuess = true;
                        }
                    }
                    
                    if(invalidGuess)
                    {
                        View.InvalidGuess(guess);
                    }
                    else
                    {
                        enableGuessValidationLoop = false;
                        alreadyGuessed.add(guess);
                        guessCounter++;
                    }
                }
            }
            
            
            
            play = false;
        }
    }
}
