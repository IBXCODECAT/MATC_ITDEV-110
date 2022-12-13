/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schmitt.inclasspassingobjects;

/**
 *
 * @author natha
 */
public class Controller {
    
    public void missionControl()
    {
        ClassCatcher catcher = new ClassCatcher();
        
        Ball baseball = new Ball(3d, 3.65, 9.25, "White", "baseball");
        Ball basketball = new Ball(16d, 7.25, 28.25, "Orange", "basketball");
        Ball soccerBall = new Ball(16d, 7.25, 28.25, "Black", "soccerball");
        Ball tennisBall = new Ball(3d, 3.65, 9.25, "Line", "tennisball");
        
        catcher.CatchBall(baseball);
        catcher.CatchBall(basketball);
        catcher.CatchBall(soccerBall);
        catcher.CatchBall(tennisBall);
    }
}
