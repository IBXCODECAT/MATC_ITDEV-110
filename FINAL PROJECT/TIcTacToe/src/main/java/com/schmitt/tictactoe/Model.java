package com.schmitt.tictactoe;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * @author Nathan Schmitt
 */
public final class Model
{
    protected static interface GRAPHICS
    {
        static final byte SPACE_HEIGHT = 3;
        static final byte TOKEN_WIDTH = 5;
        static final byte TOKEN_HEIGHT = 3;
        
        static final byte BOARD_LINE_WIDTH = 1;
        
        static final String[] BOARD_GRAPHIC = 
        {
            "     |     |     ",
            " [0] | [1] | [2] ",
            "     |     |     ",
            "-----+-----+-----",
            "     |     |     ",
            " [3] | [4] | [5] ",
            "     |     |     ",
            "-----+-----+-----",
            "     |     |     ",
            " [6] | [7] | [8] ",
            "     |     |     "
        };
        
        static final String[] PLAYER_GRAPHIC =
        {
            " \\ / ",
            "  X  ",
            " / \\ "
        };
        
        static final String[] COMPUTER_GRAPHIC =
        {
            "  _  ",
            " | | ",
            " \\_/ "
        };
        
    }
    
    //Dynamic Data
    protected static ArrayList<Boolean> spaceOcupied = new ArrayList<>(Arrays.asList(new Boolean[9]));
    protected static ArrayList<Boolean> boardPiece = new ArrayList<>(Arrays.asList(new Boolean[9]));
    
    protected static void init()
    {
        for (int i = 0; i < spaceOcupied.size(); i++)
        {
            spaceOcupied.set(i, false);
        }
    }
}
