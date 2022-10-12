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
        System.out.println("\n========================================\n");
        
        System.out.println("Car Year:\t\t\t" + car.getYear());
        System.out.println("Car Model:\t\t\t" + car.getMake());
        System.out.println("Car Speed:\t\t\t" + car.getSpeed());
        System.out.println("");
    }
    
    public void DisplaySpeedIncrease(ModelCar car)
    {
        System.out.println("Speed after aceleration:\t" + car.getSpeed());
    }
    
    public void DisplaySpeedDecrease(ModelCar car)
    {
        System.out.println("Speed after braking:\t\t" + car.getSpeed());
    }
}
