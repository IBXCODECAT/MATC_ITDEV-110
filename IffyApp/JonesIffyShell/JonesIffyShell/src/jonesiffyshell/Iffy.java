 
package jonesiffyshell;


import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

public class Iffy {
    Scanner keyboard = new Scanner(System.in);
    UI UserInput = new UI();

    final int COMPAREDTO = 5; //final means we cannot change it, static says keep in memory
    int comparenum = 0;
    boolean moreThan;   	//default value is always false
    public Iffy()
    {
    
    }
    
    public void demoCode() throws LineUnavailableException
    {
        boolean quit = true;
        int selection;
     
        do
        {
            //creates a menu for the user to select the method they would like to run
            System.out.println("Enter the number of the method you would like to run. \n\tEnter zero if you want to quit:\t");
            System.out.println("\n\n\t1. Bool is Cool \n\n\t2. If and Else \n\n\t3. And Or \n\n\t4. Nested If ");
            System.out.println("\n\t5. Random number Generator");
            System.out.println("\n\t6. Switch Case with String");
            System.out.println("\n\t7. Play Sounds");
            selection = keyboard.nextInt();


        } while (quit);

    } 

    //Introduce bool with evaluating if a number is more than a set value
    public void BoolisCool()
    {
            //Display initial value for bool variable
            System.out.println("Initial value for bool variable moreThan " + moreThan);

            //Set and display result of comparison for bool
            moreThan = COMPAREDTO > comparenum;
            System.out.println("When comparenum is " + comparenum + " moreThan is " + moreThan);

            //Set and display result of comparision for a higher number
            comparenum = 8;
            moreThan = COMPAREDTO > comparenum;
            System.out.println("When comparenum is " + comparenum + " moreThan is " + moreThan);

           
            //Set bool to either True or False
            moreThan = true;
            System.out.println("\nSet value for bool variable moreThan " + moreThan);

            //Bool used in if statement, simply true or false
            if (moreThan)
            {
                System.out.println("\n\tBool is true so it is cool to display this message");
                //delcare a new bool. Requires initialization before first using in evaluation.

            }
            //Bool set to false will not execute in a If statement as if looks for true
            boolean newbool = false;
            if (newbool)
            {
                System.out.println("\n\tIf newBool is true it will display this message");
            }

    }//End BoolisCool()


    	//Introducing If Else statement
    public void IfAndElse()
    {

        System.out.print("\n\n\n\n\n\n");
        System.out.println("If Else output");

        if (moreThan)
        {
            //If moreThan is True display this
            System.out.println("\n\nmoreThan is " + moreThan);
        }
        else
        {
            //If moreThan is False display this
            System.out.println("moreThan is " + moreThan);
        }

        //Set and use a false bool value
        moreThan = false;

        if (moreThan)
        {
            //If moreThan is True display this
            System.out.println("\n\nmoreThan is " + moreThan);
        }
        else
        {
            //If moreThan is False display this
            System.out.println("moreThan is " + moreThan);
        }


    }//endIfAndElse()


    //Introducing AND && . OR ||
    public void AndOr()
    {

            //User enters three numbers
            UserInput.EnterThreeNum();

            //AND
            if ((UserInput.getUno() == UserInput.getDos()) && (UserInput.getUno() == UserInput.getTres()))
            {
                    System.out.println("\n\tAll three numbers are equal");
            }
            
            if ((UserInput.getUno() == UserInput.getTres()) || (UserInput.getUno() == UserInput.getDos()))
            {
                    System.out.println("\n\tFirst number is equal to either the second or the first number");
            }
    }//end AndOra()

    // Introducting a nested IF to evaluate three values to see if equal
    public void IfNest()
    {
            //User enters three numbers
            UserInput.EnterThreeNum();

            // Nested If
            if (UserInput.getUno() == UserInput.getDos())
            {
                if (UserInput.getUno() == UserInput.getTres())
                {
                    System.out.println("\n\tAll three numbers are equal");
                }
                else
                {
                    System.out.println("\n\tFirst two numbers are equal");
                }
            }
            else
            {
                if (UserInput.getUno() == UserInput.getTres())
                {
                    System.out.println("\n\tFirst and last numbers are equal");
                }
                else
                {
                    System.out.println("\n\tNone of the numbers are equal");
                }    
            }//End of IfNest

    }
    
    public void getRandomNumber()
    {

    }
    public String SwitchCaseStringDemo(String dayOfWeekArg) {

        
    }
        public void playSounds() throws LineUnavailableException
        {
            SoundUtils s = new SoundUtils();
            s.playIntro();
            s.playerSound();
            s.computerSound();
            s.playGoodbye();
        
        }
}
