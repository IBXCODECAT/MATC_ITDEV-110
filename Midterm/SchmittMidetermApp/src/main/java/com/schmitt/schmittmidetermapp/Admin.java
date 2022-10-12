/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.schmittmidetermapp;

/**
 * @CourseNumber ITDEV-110-004
 * @AssignmentNumber midterm
 * @author Nathan Schmitt
 */
public class Admin 
{
    public Admin()
    {
        System.out.println("Welcome to the model car program!");
    }
    
    public void DisplayYearPrompt()
    {
        System.out.println("Type a year (int) for this car then press [ENTER]:");
    }
    
    public void DisplayMakePrompt()
    {
        System.out.println("Type a make (String) for this car then press [ENTER]:");
    }
    
    public void DisplaySpeedPrompt()
    {
        System.out.println("Type a speed (int) for this car then press [ENTER]:");
    }
    
    public void ProgramDone()
    {
        System.out.println("\nDone!");
    }
}
