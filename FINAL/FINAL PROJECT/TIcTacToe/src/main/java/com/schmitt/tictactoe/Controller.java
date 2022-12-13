package com.schmitt.tictactoe;

import java.util.Arrays;

/**
 * @author Nathan Schmitt
 */
public class Controller
{
    //-1 = noWin, 0 = FlaseWin, 1 = TrueWin
    private static byte detectWin()
    {
        //Get all ocupation-only data (does not include which piece is in a cell)
        final boolean zeroOcupied = Model.spaceOcupied.get(0);
        final boolean oneOcupied = Model.spaceOcupied.get(1);
        final boolean twoOcupied = Model.spaceOcupied.get(2);
        final boolean threeOcupied = Model.spaceOcupied.get(3);
        final boolean fourOcupied = Model.spaceOcupied.get(4);
        final boolean fiveOcupied = Model.spaceOcupied.get(5);
        final boolean sixOcupied = Model.spaceOcupied.get(6);
        final boolean sevenOcupied = Model.spaceOcupied.get(7);
        final boolean eightOcupied = Model.spaceOcupied.get(8);
        
        //========================ROW===============================
        
        //Is the first row entirely occupied?
        if(zeroOcupied && oneOcupied && twoOcupied)
        {
            //Pull piece data as needed
            final boolean zeroPrimaryPiece = Model.boardPiece.get(0);
            final boolean onePrimaryPiece = Model.boardPiece.get(1);
            final boolean twoPrimaryPiece = Model.boardPiece.get(2);
        
            //Is the first row entirely primary pieces?
            if(zeroPrimaryPiece && onePrimaryPiece && twoPrimaryPiece) return 1;
            //Is the first row entirely secondary pieces?
            if(!zeroPrimaryPiece && !onePrimaryPiece && !twoPrimaryPiece) return 0;
        }
        
        //Is the second row entirely occupied?
        if(threeOcupied && fourOcupied && fiveOcupied)
        {
            //Pull piece data as needed
            final boolean threePrimaryPiece = Model.boardPiece.get(3);
            final boolean fourPrimaryPiece = Model.boardPiece.get(4);
            final boolean fivePrimaryPiece = Model.boardPiece.get(5);
        
            //Is the second row entirely primary pieces?
            if(threePrimaryPiece && fourPrimaryPiece && fivePrimaryPiece) return 1;
            //Is the second row entirely secondary pieces?
            if(!threePrimaryPiece && !fourPrimaryPiece && !fivePrimaryPiece) return 0;
        }
        
        //Is the third row entirely occupied?
        if(sixOcupied && sevenOcupied && eightOcupied)
        {
            //Pull piece data as needed
            final boolean sixPrimaryPiece = Model.boardPiece.get(6);
            final boolean sevenPrimaryPiece = Model.boardPiece.get(7);
            final boolean eightPrimaryPiece = Model.boardPiece.get(8);
        
            //Is the third row entirely primary pieces?
            if(sixPrimaryPiece && sevenPrimaryPiece && eightPrimaryPiece) return 1;
            //Is the third row entirely secondary pieces?
            if(!sixPrimaryPiece && !sevenPrimaryPiece && !eightPrimaryPiece) return 0;
        }
        
        //========================COLUMN============================
        
        //Is the first column entirely occupied?
        if(zeroOcupied && threeOcupied && sixOcupied)
        {
            //Pull piece data as needed
            final boolean zeroPrimaryPiece = Model.boardPiece.get(0);
            final boolean threePrimaryPiece = Model.boardPiece.get(3);
            final boolean sixPrimaryPiece = Model.boardPiece.get(6);
        
            //Is the first column entirely primary pieces?
            if(zeroPrimaryPiece && threePrimaryPiece && sixPrimaryPiece) return 1;
            //Is the first column entirely secondary pieces?
            if(!zeroPrimaryPiece && !threePrimaryPiece && !sixPrimaryPiece) return 0;
        }
        
        //Is the second column entirely occupied?
        if(oneOcupied && fourOcupied && sevenOcupied)
        {
            //Pull piece data as needed
            final boolean onePrimaryPiece = Model.boardPiece.get(1);
            final boolean fourPrimaryPiece = Model.boardPiece.get(4);
            final boolean sevenPrimaryPiece = Model.boardPiece.get(7);
        
            //Is the second column entirely primary pieces?
            if(onePrimaryPiece && fourPrimaryPiece && sevenPrimaryPiece) return 1;
            //Is the second column entirely secondary pieces?
            if(!onePrimaryPiece && !fourPrimaryPiece && !sevenPrimaryPiece) return 0;
        }
        
        //Is the third column entirely occupied?
        if(twoOcupied && fiveOcupied && eightOcupied)
        {
            //Pull piece data as needed
            final boolean twoPrimaryPiece = Model.boardPiece.get(2);
            final boolean fivePrimaryPiece = Model.boardPiece.get(5);
            final boolean eightPrimaryPiece = Model.boardPiece.get(8);
        
            //Is the third column entirely primary pieces?
            if(twoPrimaryPiece && fivePrimaryPiece && eightPrimaryPiece) return 1;
            //Is the third column entirely secondary pieces?
            if(!twoPrimaryPiece && !fivePrimaryPiece && !eightPrimaryPiece) return 0;
        }
        
        //========================DIAGNAL===========================
        
        //Is the '\' diaganal entirely ocupied?
        if(zeroOcupied && fourOcupied && eightOcupied)
        {
            //Pull piece data as needed
            final boolean zeroPrimaryPiece = Model.boardPiece.get(0);
            final boolean fourPrimaryPiece = Model.boardPiece.get(4);
            final boolean eightPrimaryPiece = Model.boardPiece.get(8);
        
            //Is the '\' diaganal entirely primary pieces?
            if(zeroPrimaryPiece && fourPrimaryPiece && eightPrimaryPiece) return 1;
            //Is the '\' diaganal entirely secondary pieces?
            if(!zeroPrimaryPiece && !fourPrimaryPiece && !eightPrimaryPiece) return 0;
        }
        
        //Is the '/' diaganal entirely ocupied?
        if(twoOcupied && fourOcupied && sixOcupied)
        {
            //Pull piece data as needed
            final boolean twoPrimaryPiece = Model.boardPiece.get(2);
            final boolean fourPrimaryPiece = Model.boardPiece.get(4);
            final boolean sixPrimaryPiece = Model.boardPiece.get(6);
        
            //Is the '/' diaganal entirely primary pieces?
            if(twoPrimaryPiece && fourPrimaryPiece && sixPrimaryPiece) return 1;
            //Is the '/' diaganal entirely secondary pieces?
            if(!twoPrimaryPiece && !fourPrimaryPiece && !sixPrimaryPiece) return 0;
        }
        
        //========================NO_WIN============================
        
        return -1;
    }
       
    protected static void exec()
    {   
        byte winner = -1;
        
        Sound.PlayNote(1000, 100);
        Model.init();
        
        View.PressToContinue();
        View.ClearScreen();
        
        final byte totalPlayers = View.SetPlayers();
        
        //If we are playing with two human players...
        if(totalPlayers == 2)
        {   
            //For each possible turn (9 turns)
            for(int turnCounter = 0; turnCounter < 9; turnCounter++)
            {
                //Clear the screen and draw the game board
                View.ClearScreen();
                View.DrawBoard();
                
                //Ask the user what position they would like
                byte pos = View.SelectPosition(turnCounter);
                
                //Set the position chosen to ocupied
                Model.spaceOcupied.set(pos, true);
                    
                //Set the piece to the corasponding player based on the turn number
                if(turnCounter % 2 == 0) 
                    Model.boardPiece.set(pos, false);
                else
                    Model.boardPiece.set(pos, true);
                
                //Set winner to the output of the detect winner function
                winner = detectWin();
                
                //If there was a win from any player...
                if(winner != -1) 
                {
                    //breakout of the gameplay loop
                    break;
                }
            }
            
            //Clear the screen and draw the boad
            View.ClearScreen();
            View.DrawBoard();
            
            //Declare a winner!
            View.DeclareWinner(winner);
        }
        else
        {
            for(int turnCounter = 0; turnCounter < 9; turnCounter++)
            {
                //Clear the screen and draw the game board
                View.ClearScreen();
                View.DrawBoard();
                
                //Сreate a position byte to be updated by user or RNG player
                byte pos = -1;
                
                //Get the input from the human player or the RNG depending on turn number
                if(turnCounter % 2 == 0)
                    pos = View.SelectPosition(turnCounter);
                else
                    pos = RNG.getRandomOpenSpace();
                
                //Set the position chosen to ocupied
                Model.spaceOcupied.set(pos, true);
                
                //Set the piece to the corasponding player based on the turn number
                if(turnCounter % 2 == 0) 
                    Model.boardPiece.set(pos, false);
                else
                    Model.boardPiece.set(pos, true);
                
                //Set winner to the output of the detect winner function
                winner = detectWin();
                
                //If there was a win from any player...
                if(winner != -1) 
                {
                    //breakout of the gameplay loop
                    break;
                }
            }
            
            //Clear the screen and draw the board
            View.ClearScreen();
            View.DrawBoard();
            
            //Declare a winner!
            View.DeclareWinner(winner);
        }
    }
}
