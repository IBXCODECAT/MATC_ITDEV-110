/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonesiffyapp;

/**
 *
 * @author elija
 */
public class JonesIffyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin a = new Admin();
        a.sayHello();
       	 
        Iffy veryIffy = new Iffy();
        veryIffy.demoCode();  
        a.goodBye();
    }
}
