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
public class ModelCar {
    private int year;
    private String make;
    private int speed;
    
    //Constructor
    public ModelCar(int year, String make, int speed)
    {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }

    //Getters
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    //Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void acelerate()
    {
        speed += 5;
    }
    
    public void brake()
    {
        speed -= 5;
    }
}
