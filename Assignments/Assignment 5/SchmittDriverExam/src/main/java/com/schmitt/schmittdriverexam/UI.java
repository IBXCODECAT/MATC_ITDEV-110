package com.schmitt.schmittdriverexam;

import java.util.Arrays;
import java.util.Scanner;

public class UI
{
    Scanner keyboard = new Scanner(System.in);
    
    protected char GetAns(int questionNumber)
    {
        System.out.println("What is the answer to question number " + questionNumber);
        String input = keyboard.nextLine().strip();
        
        //Forces wrong answers for blank entry
        if(input.equals("")) input = " ";
        
        return input.charAt(0);
    }
    
    protected boolean takeAnother()
    {
        System.out.println("Would you like to take another exam? 'Q' to quit");
        String input = keyboard.nextLine().strip();
        
        if(input.equals("")) return true;
        return input.charAt(0) != 'Q' && input.charAt(0) != 'q';
    }
    
    protected void printArray(char[] exam)
    {
        for (int row = 0; row < exam.length; row++)
        {
            System.out.print(exam[row] + " ");
        }
        System.out.println();
    }
    
    protected void output(int correct, int incorrect, String missed, boolean passed)
    {
        System.out.println("Your test is over....");
        System.out.println("Total Correct: " + correct);
        System.out.println("Total Incorrect: " + incorrect);
        
        System.out.println("Missed Questions: " + missed);
        
        if(passed)
        {
            System.out.println("You passed!");
        }
        else
        {
            System.out.println("You failed!");
        }
    }
}