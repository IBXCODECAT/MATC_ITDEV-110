/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.schmitt.schmittpracticeobjects;

/**
 * @Assignment Assignment 3
 * @CourseNumber ITDEV-110-04
 * @author Nathan Schmitt
 */
public class SchmittPracticeObjects
{
    public static void main(String[] args)
    {
        //Object Creation
        //<editor-fold>
        Employee meyers = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee jones = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee rogers = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        //</editor-fold>
        
        //Console Log
        //<editor-fold>
        System.out.println(
                meyers.getName() + "\t" + 
                meyers.getIdNumber() + "\t" +
                meyers.getDepartment() + "\t" +
                meyers.getPosition()
        );
        
        System.out.println(
                jones.getName() + "\t" + 
                jones.getIdNumber() + "\t" +
                jones.getDepartment() + "\t\t" +
                jones.getPosition()
        );
        
        System.out.println(
                rogers.getName() + "\t" + 
                rogers.getIdNumber() + "\t" +
                rogers.getDepartment() + "\t" +
                rogers.getPosition()
        );
        //</editor-fold>
    }
}
