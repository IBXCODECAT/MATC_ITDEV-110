package com.schmitt.tictactoe;

import java.util.Arrays;

/**
 * @author Nathan Schmitt
 */
public class Controller
{
    protected static void exec()
    {
        View.PressToContinue();
        View.ClearScreen();
        
        Sound.PlayNote(1000, 100);
        
        View.DrawBoard();
    }
}
