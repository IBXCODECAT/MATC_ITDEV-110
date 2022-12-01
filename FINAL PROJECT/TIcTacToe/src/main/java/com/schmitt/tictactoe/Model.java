package com.schmitt.tictactoe;

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
        
        static final byte BOARD_LINE_WIDTH = 1;
        
        static final String[] BOARD_GRAPHIC = 
        {
            "     |     |     ",
            "     |     |     ",
            "     |     |     ",
            "-----+-----+-----",
            "     |     |     ",
            "     |     |     ",
            "     |     |     ",
            "-----+-----+-----",
            "     |     |     ",
            "     |     |     ",
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
    //Const Data
    
    
    
    
    
    //Dynamic Data
    protected static ArrayList<Boolean> spaceOcupied = new ArrayList<>(9);
    protected static ArrayList<Boolean> boardPiece = new ArrayList<>(9);
}
