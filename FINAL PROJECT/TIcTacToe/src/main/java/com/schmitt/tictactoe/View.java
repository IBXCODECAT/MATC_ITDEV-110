package com.schmitt.tictactoe;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

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
    }
    
    protected static void DrawBoard()
    {
        //Fetch the base board graphic we will manipulate
        String[] boardGraphic = Model.GRAPHICS.BOARD_GRAPHIC;
        
        //Pull in constant data required to draw the baord
        final String[] playerGraphic = Model.GRAPHICS.PLAYER_GRAPHIC;
        final String[] computerGraphic = Model.GRAPHICS.COMPUTER_GRAPHIC;
        
        final byte cellHeight = Model.GRAPHICS.SPACE_HEIGHT;
        final byte tokenWidth = Model.GRAPHICS.TOKEN_WIDTH;
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
                        System.out.println("(" + row + "," + chr + ")");
                        
                        //Update the board graphic by replacing ASCII data for each row the token ocupies
                        for(int tokenRow = 0; tokenRow < playerGraphic.length; tokenRow++)
                        {
                            //Create the ASCII data to replace a row
                            String replaceRow =
                                //Keep the existing visual board data before this token
                                boardGraphic[row + tokenRow].substring(0, chr) +
                                //Use the token data instead of the visual board data
                                playerGraphic[tokenRow] +
                                //Keep existing visual board data after this token
                                boardGraphic[row + tokenRow].substring(chr + 5, boardGraphic[row + tokenRow].length());
                            
                            //Update the ASCII data in the row where the symbol is offset by the draw row for the token
                            boardGraphic[row + tokenRow] = replaceRow;
                        }    
                    }
                }
            }
        }
        
        for (String line : boardGraphic)
        {
            System.out.println(line);
        }
        
        //System.out.print("\u001B[A");
    }
}
