/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.schmittinclassexcersise3;

import java.util.Scanner;

/**
 *
 * @author Nathan Schmitt
 */
public class User
{
    public User()
    {
        Introduction();
        String input = Directions();
        DisplayUserInput(input);
    }
    
    protected void Introduction()
    {
        //Display an Introduction as to what the app will do
    }
    
    protected String Directions()
    {
        //Display directions on what the user is to do
        System.out.println("Please enter a word bellow...");
        
        //Get the user input
        Scanner scanner = new Scanner(System.in);
        
        return scanner.next();
    }
    
    protected void DisplayUserInput(String input)
    {
        System.out.println(input);
    }
}
