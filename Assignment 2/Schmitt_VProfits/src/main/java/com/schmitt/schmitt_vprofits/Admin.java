package com.schmitt.schmitt_vprofits;

//Import Scanner from java utilities (for user input)
import java.util.Scanner;
//Import DecimalFormatter from java text utilities (for output)
import java.text.DecimalFormat;
//Import java Date for more Date obj
import java.util.Date;

/**
 * This class is responsible for handling IO & IO Logic
 * @author Nathan Schmitt
 */
public class Admin {
    
    String componyName;
    double retailPrice;
    double profitMargin;
    
    /**
     * This method is responsible for introducing the program.
     */
    protected void Intro()
    {
        System.out.println("Thsi program is used to calculate profit of "
                + "circuit boards");
    }
    
    /**
     * This method is responsible for calling the Directions method repeatedly
     * on the condition that the user would like to continue doing profit
     * calculations.
     * 
     * @see Directions()
     * 
     * This method shall be the only method called upon from another class.
     */
    protected void Start()
    {   
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter your compony name...");
        componyName = userInput.next().strip();
        
        //<editor-fold> Continue?_Logic
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
        //</editor-fold> Continue?_Logic
    }
    
    
    /**
     * This method is responsible for gathering profit/price information and
     * displaying results accordingly. This method does instantiate a new
     * class.
     * @see Calculate.java
     */
    protected void Directions()
    {
        Scanner userInput = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("$0.00");
        Calculate calc = new Calculate();
        
        //<editor-fold> Interactibles
        //Get the price of the circuit board from the user (NO EXCEPTION HANDLING)
        System.out.println("\nPlease enter circuit board price (Decimal Expected)...");
        retailPrice = userInput.nextDouble();
        
        //Get the profit percentage from the user (NO EXCEPTION HANDLING)
        System.out.println("Please enter profit percentage (Decimal < 1 expected)...");
        profitMargin = userInput.nextDouble();
        
        //Calculate profits using another class (Third class was required in assignment)
        double profits = calc.CalculateProfits(retailPrice, profitMargin);
        //</editor-fold> Interactibles
        
        
        //<editor-fold> Output_Formatting
        //Create the output string using memory efficient concatanation
        StringBuilder output = new StringBuilder(256);
        
        output.append("\n\n=======================================");
        output.append("\n\nCompony Name:\t");
        output.append(componyName);
        output.append("\nDate:\t\t");
        output.append(new Date());
        output.append("\nRetail price:\t");
        output.append(formatter.format(retailPrice));
        output.append("\nProfit:\t\t");
        output.append(formatter.format(profits));
        //</editor-fold> Output_Fomatting
        
        //Print that lovely output to the screen :)
        System.out.println(output);
    }
}
