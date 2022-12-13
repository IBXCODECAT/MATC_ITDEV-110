/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonesiffyapp;

import java.util.Scanner;

public class UI {
   
    	public UI()
    	{
       	// EnterThreeNum();
    	}

    	//declare variables
    	int uno, dos, tres;

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    public int getTres() {
        return tres;
    }

    public void setTres(int tres) {
        this.tres = tres;
    }

    Scanner keyboard = new Scanner(System.in);

    // Enter three numbers
    public void EnterThreeNum()
    {
        System.out.print("\n\n\n\n\n");
        System.out.println("You will be asked to enter three numbers. ");
        System.out.print("\nEnter your first number:  ");
        uno = keyboard.nextInt();

        System.out.print("\nEnter your second number:  ");
        dos = keyboard.nextInt();

        System.out.print("\nEnter your third number:  ");
        tres = keyboard.nextInt();

    }//End EnterThreeNum

 
}
