
package week6fun;

import java.util.Random;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author elija
 */
public class Week6FunApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException, InterruptedException {
        int i = 0;
        int s = 0;

        //Instatiate a new object of the Admin class and use two methods in the class.
        Admin adminthis = new Admin();
        adminthis.Consolesetup();
        adminthis.DisplayInfo();

        //Instantiate and displays a new object of the Geek Class
        Geek geek1 = new Geek();
        System.out.println("Behold the power of Geek1 at birth");
     	 
        //Displays the Property of an object
        System.out.println(geek1.getPowerIndex()); 

        //Calls a Method of an object to activate
        System.out.println("Behold the power of Geek1 after power calculation");
        geek1.CalcPowerIndex();
 
   
        System.out.println(geek1.getPowerIndex());
        
        //Instantiates another object of the Geek class with property values
        Geek geek2 = new Geek(140, 90);
        System.out.println("Behold the power of Geek2 at birth");
        
        //calculates power index
        geek2.CalcPowerIndex();

    
        System.out.println(geek2.getPowerIndex());
        
        //Instantiates an object of the Random class
        Random numb = new Random();
        
        //Random number generated for IQ and Strength
        i = 1 + numb.nextInt(140);  //1 is 1 to 10. get a random number from 1 to 140.
        s = 1 + numb.nextInt(100);  //1 is 1 to 10. get a random number from 1 to 100.
       	System.out.println("value for IQ :" + i);
       	System.out.println("value for strength :" + s);

        //Instantiate another object of the Geek class with random property values
        Geek geek3 = new Geek(i, s);
        System.out.println("Behold the power of Geek3 at birth");

        //calculates power index
        geek3.CalcPowerIndex();

        //Displays the Property of an object
        System.out.println(geek3.getPowerIndex());
       
 	 
        adminthis.SayGoodbye();


    }
    
}
