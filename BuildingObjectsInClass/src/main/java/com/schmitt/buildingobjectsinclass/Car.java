/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.schmitt.buildingobjectsinclass;

/**
 * @author Nathan Schmitt
 */
public class Car
{
    private String make;
    private String model;
    private String VIN;
    private String color;
    
    private short year;
    
    public Car(String make, String model, String VIN, String color, short year)
    {
        this.make = make;
        this.model = model;
        this.VIN = VIN;
        this.color = color;
        
        this.year = year;        
    }
    
    public Car()
    {
        System.out.println("Hey look you created an object without parameters using polymorphism!");
    }
    
    public Car(String myString)
    {
        System.out.println("");
    }

    //Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVIN() {
        return VIN;
    }

    public String getColor() {
        return color;
    }

    public short getYear() {
        return year;
    }

    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(short year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" + "make=" + make + ", model=" + model + ", VIN=" + VIN + ", color=" + color + ", year=" + year + '}';
    }
}