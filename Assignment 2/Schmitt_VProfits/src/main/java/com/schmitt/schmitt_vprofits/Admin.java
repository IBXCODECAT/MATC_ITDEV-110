package com.schmitt.schmitt_vprofits;

//Import Scanner from java utilities (for user input)
import java.util.Scanner;

//Import InputmimatchException from java utilities (for validation of user input)
import java.util.InputMismatchException;

/**
 * This class is responsible for stating the instructions f
 * @author Nathan Schmitt
 */
public class Admin {
    
    String componyName;
    double circuitBoardPrice;
    byte circuitBoardPercentage;
    
    
    protected void Intro()
    {
        System.out.println("Thsi program is used to calculate profit of "
                + "circuit boards");
    }
    
    protected void Start()
    {   
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter your compony name...");
        componyName = userInput.next();
        
        boolean isDone = false;
        final String escapeChar = "N"; 
        
        while(!isDone)
        {
            Scanner scanner = new Scanner(System.in);
            String continueInput = "";
            
            while(!continueInput.equals(escapeChar))
            {
                this.Directions();
                System.out.println("Continue? (Y/N):");
                continueInput = scanner.next().strip().toUpperCase();
            }
            
            isDone = true;
            System.out.println("Thanks! [END OF PROGRAM]");
        }
    }
    
    protected void Directions()
    {
        Scanner userInput = new Scanner(System.in);
        
        //Get the price of the circuit board from the user (NO EXCEPTION HANDLING)
        System.out.println("Please enter circuit board price...");
        circuitBoardPrice = userInput.nextDouble();
        
        //Get the profit percentage from the user (NO EXCEPTION HANDLING)
        System.out.println("Please enter profit percentage...");
        circuitBoardPercentage = userInput.nextByte();  
    }
}
