/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.schmittinclassexcersise3;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Nathan Schmitt
 */
public class User
{
    
    protected void Introduction()
    {
        //Display an Introduction as to what the app will do
        System.out.println("This app repeates what you just said.");
    }
    
    protected void Directions()
    {
        //Display directions on what the user is to do
        System.out.println("Please enter a the salary you would like to earn in 5 years bellow...");
    }
    
    protected void DisplayUserInput()
    {
        //Get the user input
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00");
        
        String amount = formatter.format(scanner.nextDouble());
        
        System.out.println("Your desired salary is: $" + amount);
    }
}
