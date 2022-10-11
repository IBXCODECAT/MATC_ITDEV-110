/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.schmitt.schmittmidetermapp;

import java.util.Scanner;

/**
 * @CourseNumber ITDEV-110-004
 * @AssignmentNumber midterm
 * @author Nathan Schmitt
 */
public class View {
    
        
    //Inputs
    public int GetYearInput()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    public String GetMakeInput()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public int GetSpeedInput()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    //Outputs
    
    public void DisplayCar(ModelCar car)
    {
        
    }
}
