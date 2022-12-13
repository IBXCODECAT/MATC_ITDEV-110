/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.schmitt.makemusic;

/**
 * @CourseNumber ITDEV-110-004
 * @date 09/29/22
 * @Authors Nathan, Maxon, Renad, Jack, Tyler, Sonny
 */
public class MakeMusic {

    public static void main(String[] args) {
        UserInput input = new UserInput();
        SoundGenerator generator = new SoundGenerator();
        
        while(true)
        {
            input.Intro();
            
            String res = input.GetUserInput();
            
            if(res.equals("STOP")) break;
            
            generator.GenerateSound(res);
        }
        
        System.out.println("Thank you!");
    }
}
