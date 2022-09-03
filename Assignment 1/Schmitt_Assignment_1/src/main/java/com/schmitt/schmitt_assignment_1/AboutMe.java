/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.schmitt_assignment_1;

import java.util.Date;

/**
 * @CourseNumber ITDEV 110-004
 * @AssignmentNumber 1
 * @author Nathan Schmitt
 */
public class AboutMe
{
    protected AboutMe()
    {
        DisplayInfo();
    }
    
    private void DisplayInfo()
    {
        System.out.println("Nathan Schmitt\t\tAssignment 1");
        System.out.println("ITDEV-110-104\t\tIntro to Object-Oriented Prgmg");
        System.out.println("Elijah Jones\t\t" + new Date());
    }
}
