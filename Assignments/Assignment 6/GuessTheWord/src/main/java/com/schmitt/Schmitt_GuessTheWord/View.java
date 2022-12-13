package com.schmitt.Schmitt_GuessTheWord;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Nathan Schmitt
 */
public final class View 
{
    static Scanner keyBuffer = new Scanner(System.in);
        
    protected static void PrintIntroudction()
    {
        
        System.out.println
        (
                """
                Welcome to guess the word! (This is really just a knockoff of
                hangman). I have a word in mind and I want you to try and guess
                letters that will be in that word. If the letter is in the word
                I will let you know by writing it in the blanks, and if it is
                not in the word I will let you know that too! You only have a
                few chances to guess the word so I wish you luck!
                """
        );
    }
    
    protected static void PressToContinue()
    {
        System.out.println("Press [ENTER] to continue...");
        
        //Read the next buffer for '\n'
        keyBuffer.nextLine();
    }
    
    protected static char GuessLetter()
    {
        System.out.println("Guess a letter | Type ':' to quit...:");
        
        //Read the next buffer, cut white space, make String upercase, and return the first character
        return keyBuffer.next().strip().toUpperCase().charAt(0);
    }
    
    protected static void InvalidGuess(char c)
    {
        System.out.println("You have already guessed the letter [" + c + "].");
    }
    
    protected static void DrawBoard(String word, int incorrectGuess)
    {
        boolean blankDrawn = false;
        
        ArrayList<Character> guessed = Model.guessedChars;
        
        System.out.print(Model.HANGMAN_GRAPHICS[incorrectGuess]);
        
        for(int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);
            
            if(guessed.contains(letter))
            {
                System.out.print(letter + " ");
            }
            else
            {
                blankDrawn = true;
                System.out.print("_ ");
            }
        }
        
        if(!blankDrawn) Model.wordComplete = true;
        
        System.out.print("Incorrect Guesses: ");
        
        for(char letter : Model.incorrectChars)
        {
            System.out.print("[" + letter + "] ");
        }
        
        System.out.println("\nIncorrect Guessses Remaining: " + (Model.ALLOWED_GUESSES - incorrectGuess));
    }
    
    protected static boolean PlayAgainPrompt()
    {
        System.out.println("\n\nGame Over! Would you like to play again (Y/N):");
        
        char ans = keyBuffer.next().strip().toUpperCase().charAt(0);
        
        return ans == 'Y';
    }
}