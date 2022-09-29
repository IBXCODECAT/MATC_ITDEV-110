/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.makemusic;

import java.util.Scanner;


public class UserInput {
    /**
     * Displays Introduction
     */
    protected void Intro()
    {
        System.out.println(
                "Enter one of the following notes, then "
                + "hit [enter] to play a tone, or just type \"STOP\" to exit."
        );
        
        System.out.println("[C, D, E, F, G, A, B, C2]");
    }
    
    /**
     * Get the keyboard input from the user (truncate)
     * @return A string representing the note the user entered
     */
    protected String GetUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        String result = scanner.next();
        
        return result.trim().toUpperCase();
    }
}
