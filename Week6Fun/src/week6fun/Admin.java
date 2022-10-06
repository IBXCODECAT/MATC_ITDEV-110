
package week6fun;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author elija
 */
public class Admin {
   //Constructors
    	public Admin()
    	{
    	}

	//Methods
    	//*****************************
    	public void Consolesetup()
    	{
    	}
   	 

    	//*********************************
    	public void DisplayInfo() throws LineUnavailableException, InterruptedException
    	{
            SoundUtils.tone(600, 100);

            System.out.println("\n\t This is an example of creating and using objects");
            Thread.sleep(5000);
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    	}

    	//**************************************

    	public void SayGoodbye() throws LineUnavailableException, InterruptedException
    	{
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            SoundUtils.tone(600, 300);
            SoundUtils.tone(300, 500);

            System.out.println("\n\n\t\t\t That's all folks!");
            Thread.sleep(3000);

    	}


 
}
