/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.schmittpracticeobjects;

/**
 * @Assignment Assignment 3
 * @CourseNumber ITDEV-110-04
 * @author Nathan Schmitt
 */
public class Employee
{
    private String name;
    private String department;
    private String position;
    
    private int idNumber;
    
    //Constructors
    //<editor-fold>
    public Employee(String name, int idNumber, String department, String position)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    
    public Employee(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    
    public Employee()
    {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }
    //</editor-fold>

    //Setter Methods
    //<editor-fold>
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public void setPosition(String position) 
    {
        this.position = position;
    }

    public void setIdNumber(int idNumber) 
    {
        this.idNumber = idNumber;
    }
    //</editor-fold>
    
    //Getter Methdos
    //<editor-fold>
    public String getName()
    {
        return name;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public int getIdNumber()
    {
        return idNumber;
    }
    //</editor-fold>
}
