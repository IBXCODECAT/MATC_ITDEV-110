/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.schmitt.schmittinclassweek3;

/**
 * @author Nathan Schmitt
 */
public class Demo {
    /*
    * VARIABLES:
    * Variables are a named space in memory that can change (duh)
    * Bellow will be some examples of a variable
    *
    * To start off declaring variables we start with a data type
    * Primitive Data types: byte, short, int, long. and char
    *
    * We can also give our variables an initial value
    *
    * Variable declarations: int x = 2;
    */
    
    //String class
    String collegeName = "Milwaukee Area Technical College";
    String firstName = "Nathan";
    String lastName = "Schmitt";
    
    //Character Primitive Type
    char middleInitial = 'S';
    
    //Intagers
    int studentAge = 18;
    
    //Big int
    long x = 1249039423;
    
    //Small int
    short y = 32767;
    
    //Byte (-127-127)
    byte z = 127;
    
    //Doubles (acurate decimals)
    double tuitionBalance = 0.3;
    
    //Floats (fast decimals)
    float xyz = 0.2f;
    
    /*
    * Acess specifiers (EX: public, private, protected)
    * Return type (any type)
    * Paramerters (data accepted between parenthisis)
    */
    
    public void method1(int x)
    {
        //This method can be acessed from anywhere
    }
    
    protected boolean method2(double y)
    {
        //This method must be acessed within this package
        return false;
    }
    
    private double method3(String name)
    {
        //This method can only be acessed in this class
        return 0d;
    }
}
