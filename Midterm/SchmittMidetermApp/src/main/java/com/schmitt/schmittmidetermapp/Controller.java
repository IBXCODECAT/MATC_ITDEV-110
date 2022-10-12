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
public class Controller {
    
    public void missionControl()
    {
        Admin admin = new Admin();
        View view = new View();
        
        admin.DisplayYearPrompt();
        int year = view.GetYearInput();
        
        admin.DisplayMakePrompt();
        String make = view.GetMakeInput();
        
        admin.DisplaySpeedPrompt();
        int speed = view.GetSpeedInput();
        
        
        ModelCar car = new ModelCar(year, make, speed);
        
        view.DisplayCar(car);
        
        for(int i = 0; i < 3; i++)
        {
            car.acelerate();
            view.DisplaySpeedIncrease(car);
        }
        
        for(int i = 0; i < 3; i++)
        {
            car.brake();
            view.DisplaySpeedDecrease(car);
        }
        
        admin.ProgramDone();
    }
}
