/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.schmittcodecamp;

import java.util.Scanner;

/**
 *
 * @author natha
 */
public class Camp {
    int age = 25;
    int yearsFromNow = 15;
    
    int currentYear;
    int yob;
    
    String firstName;
    String lastName;
    char middleInit = 'S';
    
    Scanner keyboard = new Scanner(System.in);
    
    public void MissionControl()
    {
        GetUserInput();
        CalcFutureAge();
        age = DetermineAge(2022, 2004);
        DisplayInfo();
    }
    
    public void DisplayInfo()
    {
        double shoeSize = 15;
        System.out.println(firstName + " " + middleInit + " " + lastName +
                " " + age);
        System.out.println("Shoe Size: " + shoeSize);
        
    }
    
    public int CalcFutureAge()
    {
        int futureAge = yearsFromNow + age;
        System.out.println(futureAge);
        return futureAge;
    }
    
    public void GetUserInput()
    {
        System.out.println("Please enter your first name:");
        firstName = keyboard.nextLine();
        System.out.println("Please enter your last name:");
        lastName = keyboard.nextLine();
        
        System.out.println("Enter current year:");
        currentYear = keyboard.nextInt();
        
        System.out.println("Enter YOB:");
        yob = keyboard.nextInt();
        
        
    }
    
    
    
    public int DetermineAge(int currentyear, int yob)
    {
        return currentYear - yob;
    }
}
