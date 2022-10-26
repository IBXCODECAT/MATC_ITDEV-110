package com.schmitt.schmitt_highlow;

import java.util.InputMismatchException;
import javax.sound.sampled.LineUnavailableException;
import java.util.Scanner;

public final class View
{
    protected static void GameStart() throws LineUnavailableException
    {
        System.out.println("Welcome to the guessing (high/low) program!");
        SoundUtility.playNote(500, 100);
        SoundUtility.playNote(700, 100);
        SoundUtility.playNote(800, 300);
    }
    
    protected static void GameEnd() throws LineUnavailableException
    {
        System.out.println("Thanks for playing!");
        SoundUtility.playNote(800, 100);
        SoundUtility.playNote(700, 100);
        SoundUtility.playNote(500, 300);
    }
    
    protected static void RangeInstructions() throws LineUnavailableException
    {
        System.out.println("""
        This game is a number guessing game. Before we play though, you will need to specify a range for the computer to pick its number from.
        You will do this by entering "boundires". These boundries will automaticly be converted into a range. For example, if you entered the
        boundries '-6' and '2', these would be converted into a range that would contiain all integers 2-6. Note: Negative numbers will be
        converted into thier absolute form.
        """);
        
        SoundUtility.playNote(700, 100);
    }
    
    protected static int getRange() throws LineUnavailableException
    {
        boolean invalid = true;
        int value = 0;
        
        while(invalid)
        {
            System.out.println("Enter a boundy for the reandom number genrerator. (Integer)");
            
            Scanner scanner = new Scanner(System.in);
            
            try
            {
                //Assign value to the absolute value of the int entered
                value = Math.abs(scanner.nextInt());
                
                //Input is no longer invalid and we can break from this loop
                invalid = false;
            }
            catch (InputMismatchException ex)
            {
                //Play an error sound if they dun goofed
                SoundUtility.playNote(400, 150);
                SoundUtility.playNote(400, 150);
                System.out.println("Error: Invalid Entry.");
            }      
        }
        
        return value;
    }
    
    protected static void Instructions() throws LineUnavailableException
    {
        System.out.println("""
        The computer has picked a random number between the range you sepcified above.
        The goal of this game is for you (the human) to guess this number as quickly as possible.
        The computer will let you know wether the number it has chosen is grater or less than the number you have entered.
        Once you have guessed the number correctly, the computer will let you know and you will be given the option to play again!
        """);
        
        SoundUtility.playNote(700, 100);
    }
    
    protected static int Guess() throws LineUnavailableException
    {
        boolean invalid = true; //Invalid input loop control
        String inValue = ""; //Value of the input raw
        int value = -1; //Integer input conversion if possible
        
        while(invalid)
        {
            System.out.println("Enter your guess bellow. ('Q' to quit)");
            
            Scanner scanner = new Scanner(System.in);
            
            try
            {
                //Get input as String (for quit option)
                inValue = scanner.next().strip().toUpperCase();
                
                //Assign value to the absolute value of the possible int entered
                value = Math.abs(Integer.parseInt(inValue));
                
                //If successfull input is no longer invalid and we can break from this loop
                invalid = false;
            }
            catch (NumberFormatException ex)
            {
                if(inValue.equals("Q"))
                {
                    //Negative number singnifies quitting
                    value = -1;
                    
                    //Input not invalid for quiting
                    invalid = false;
                    
                    //Play sound on exit
                    SoundUtility.playNote(400, 150);
                }
                else
                {
                    //Play an error sound if they dun goofed
                    SoundUtility.playNote(400, 150);
                    SoundUtility.playNote(400, 150);
                    System.out.println("Error: Invalid Entry.");
                }
            }      
        }
        
        return value;
    }
    
    protected static void Correct(int attempts) throws LineUnavailableException
    {
        System.out.println("Correct! It took you " + attempts + " attempts.");
        
        SoundUtility.playNote(700, 150);
        SoundUtility.playNote(700, 150);
        SoundUtility.playNote(700, 150);
    }
    
    protected static void ToHigh(int guess) throws LineUnavailableException
    {
        System.out.println("Your too high! The number is lower than " + guess + "... Try again!");
        SoundUtility.playNote(900, 150);
    }
    
    protected static void ToLow(int guess) throws LineUnavailableException
    {
        System.out.println("Your too low! The number is higher than " + guess + "... Try Again!");
        SoundUtility.playNote(300, 150);
    }
    
    protected static boolean Continue()
    {
        System.out.println("Would you like to play again (Y/N):");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.next().strip().toUpperCase();
        return res.equals("Y");
    }
}
