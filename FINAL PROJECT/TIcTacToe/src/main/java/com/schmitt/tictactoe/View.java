package com.schmitt.tictactoe;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Nathan Schmitt
 */
public final class View 
{
    final static Scanner keyboardBuffer = new Scanner(System.in);
    
    protected static void PressToContinue()
    {
        System.out.println("Press [ENTER] to continue...");
        keyboardBuffer.nextLine();
    }
    
    protected static void ClearScreen()
    {
        //Wait a while to prevent text/sound clashing
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) { }
        
        try
        {
            final Robot pressBot = new Robot();
            pressBot.keyPress(17); //Press CTRL Key
            pressBot.keyPress(76); //Press L Key
            pressBot.keyRelease(17); //Release CTRL Key
            pressBot.keyRelease(76); //Release L Key
        }
        catch (AWTException ex)
        {
            System.out.println("Exception Handled: AWTRobot could not clear the console...");
        }
        
        //Wait a while to prevent text/sound clashing
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) { }
    }
    
    protected static void DeclareWinner(byte winner)
    {
        switch(winner)
        {
            case 0->System.out.println("Player 1 wins!");
            case 1->System.out.println("Player 2 wins!");
            default->System.out.println("It was a tie!");
        }
    }
    
    protected static byte SetPlayers()
    {
        //Create the byte to return
        byte ret = 0;
        
        //Prompt the user to enter the number of players
        System.out.println("Please enter the number of human players:");
        
        //Assume input given is invalid
        boolean invalid = true;
        
        //While we do not have valid input...
        while(invalid)
        {
            //Read the keyboard buffer's first word
            String in = keyboardBuffer.next().strip();
            
            try
            {
                //Attempt to parse, if successfull, the value is valid
                ret = Byte.parseByte(in);
                
                //Players must be 1, or 2
                if(ret == 1 || ret == 2)
                {
                    System.out.println("You have selected a " + ret + " player game!");
                    invalid = false;
                }
                else
                {
                    System.out.println("Invalid option: You must have between 0 and 2 players!");
                    Sound.PlayError();
                }
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Invallid option: Please enter a number!");
                Sound.PlayError();
            }
        }
            
        //Wait a while
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) { }
        
        //Return the chosen value
        return ret;
    }
    
    protected static byte SelectPosition(int turn)
    {
        //Create the byte to return
        byte ret = 0;
        
        //Prompt the user according to whose turn it is
        if(turn % 2 == 0)
        {
            System.out.println("Player 1: Select move...");
            Sound.PlayPlayer1();
        }
        else
        {
            Sound.PlayPlayer2();
            System.out.println("Player 2: Select move...");
        }
             
        //Assume input given is invalid
        boolean invalid = true;
        
        //While we do not have valid input...
        while(invalid)
        {
            //Read the keyboard buffer's first word
            String in = keyboardBuffer.next().strip();
            
            try
            {
                //Attempt to parse, if successfull, the value is valid
                ret = Byte.parseByte(in);
                
                //Did the user enter a value 1-9?
                if(ret >= 0 && ret <= 8)
                {
                    //If the space is not ocupied this is a valid move
                    if(!Model.spaceOcupied.get(ret))
                        invalid = false;
                    //Otherwise we will let the user know and stay in this loop
                    else
                    {
                        System.out.println("Invalid Option: Space " + ret + " already occupied!");
                        Sound.PlayError();            
                    }
                }
                else
                {
                    System.out.println("Invalid Option: Space " + ret + " does not exist!");
                    Sound.PlayError();
                }
                
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Invallid option: Please enter a number!");
                Sound.PlayError();
            }
        }
        
        Sound.PlaySubmit();
        
        //Wait a while to prevent text/sound clashing
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) { }
        
        return ret;
    }
    
    protected static void DrawBoard()
    {
        //Create space counter (for indexing model data)
        byte space = 0;
        
        //Fetch the base board graphic we will manipulate
        String[] boardGraphic = Model.GRAPHICS.BOARD_GRAPHIC;
        
        //Pull in constant data required in multiple instances to draw the baord
        final byte cellHeight = Model.GRAPHICS.SPACE_HEIGHT;
        final byte tokenWidth = Model.GRAPHICS.TOKEN_WIDTH;
        final byte tokenHeight = Model.GRAPHICS.TOKEN_HEIGHT;
        final byte borderThickness = Model.GRAPHICS.BOARD_LINE_WIDTH;
        
        //Fore each ASCII row of the board graphic...
        for (int row = 0; row < boardGraphic.length; row++)
        {
            //Are we on a row where we could start drawing a piece?
            if(row % (borderThickness + cellHeight) == 0)
            {
                //For each character in this row...
                for(int chr = 0; chr < boardGraphic[row].length(); chr++)
                {
                    //Are we on the first character of a drawable cell?
                    if(chr % (borderThickness + tokenWidth) == 0)
                    {
                        //Does this space have an X or an O in it?
                        if(Model.spaceOcupied.get(space))
                        {
                            //Update the board graphic by replacing ASCII data for each row the token ocupies
                            for(int tokenRow = 0; tokenRow < tokenHeight; tokenRow++)
                            {
                                //Create the ASCII data to replace a row
                                String replaceRow =
                                    //Concat the existing visual board data before this token
                                    boardGraphic[row + tokenRow].substring(0, chr);
                                
                                    if(Model.boardPiece.get(space))
                                    {
                                        //Concat the player token data instead of the visual board data
                                        replaceRow += Model.GRAPHICS.PLAYER_GRAPHIC[tokenRow];
                                    }
                                    else
                                    {
                                        //Concat the computer token data instead of the visual board data
                                        replaceRow += Model.GRAPHICS.COMPUTER_GRAPHIC[tokenRow];
                                    }
                                    
                                    //Concat existing visual board data after this token
                                    replaceRow += boardGraphic[row + tokenRow].substring(chr + 5, boardGraphic[row + tokenRow].length());

                                //Update the ASCII data in the row where the symbol is offset by the draw row for the token
                                boardGraphic[row + tokenRow] = replaceRow;
                            }
                        }
                        
                        space++;
                    }
                }
            }
        }
        
        for (String line : boardGraphic)
        {
            System.out.println(line);
        }
    }
}
