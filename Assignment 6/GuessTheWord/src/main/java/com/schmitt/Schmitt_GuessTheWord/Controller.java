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
            int incorrectGuessCounter = 0;
            final int GUESSES_ALLOTED = 7;
        
            //Clear the guess data from the previous match
            Model.guessedChars.clear();
            Model.incorrectChars.clear();
            
            //Set the word as incomplete
            Model.wordComplete = false;
            
            //Select a word stored in the mdoel to use for this game
            int wordLookupIndex = RNG.getRandomNumber(0, NUM_WORDS);
            String word = Model.arrWords[wordLookupIndex].toUpperCase();
            System.out.println("DEBUG: Word is " + word);
            
            //Display an introduction message to the user
            View.PrintIntroudction();
            
            //Play a sound to show that the game is ready
            try { Sound.PlayNote (500, 100); } catch (LineUnavailableException ex){}
            
            //Prompt the user to move on
            View.PressToContinue();
            
            //Draw an empty hangman board
            View.DrawBoard(word, 0);
            
            //While we are playing the game and are able to guess letters...
            while(incorrectGuessCounter < GUESSES_ALLOTED && play)
            {
                if(!Model.wordComplete)
                {
                    boolean enableGuessValidationLoop = true;
                
                    ArrayList<Character> alreadyGuessed = Model.guessedChars;

                    //Loop to run until user enters a valid guess
                    while(enableGuessValidationLoop)
                    {

                        Character guess = View.GuessLetter();
                        boolean invalidGuess = false;

                        if(guess != ':')
                        {
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
                                //Break out of char validation loop on next run
                                enableGuessValidationLoop = false;

                                //Add this guess to the guessed chars
                                alreadyGuessed.add(guess);

                                //Increase total guess count
                                guessCounter++;

                                //Does the word have the character we guessed?
                                if(!word.contains(guess.toString()))
                                {
                                    //Add this guess to the incorrectly guessed letters
                                    Model.incorrectChars.add(guess);

                                    //Increment our incorrect guess counter
                                    incorrectGuessCounter++;

                                    //Play an "incorrect" tone
                                    try
                                    {
                                        Sound.PlayNote(200, 150);
                                    }
                                    catch ( LineUnavailableException ex ) {}
                                }
                                else
                                {   
                                    //Play a "correct" tone
                                    try
                                    {
                                        Sound.PlayNote(1300, 150);
                                    }
                                    catch ( LineUnavailableException ex ) {}
                                }

                                //Draw our hangman board
                                View.DrawBoard(word, incorrectGuessCounter);
                            }
                        }
                        else
                        {
                            //Quit Game, break loops
                            enableGuessValidationLoop = false;
                            play = false;
                        }
                    }
                }
                else
                {
                    //Play a "celebration" tone, word was guessed
                    try
                    {
                        Sound.PlayNote(1300, 150);
                        Sound.PlayNote(1400, 150);
                        Sound.PlayNote(1500, 150);
                        Sound.PlayNote(1200, 150);
                        Sound.PlayNote(1300, 150);
                    }
                    catch ( LineUnavailableException ex ) {}
                    break;
                }
            }
            
            //If we are currenlty playing ask the user if they would like to play again
            if(play) play = View.PlayAgainPrompt();
        }
    }
}
