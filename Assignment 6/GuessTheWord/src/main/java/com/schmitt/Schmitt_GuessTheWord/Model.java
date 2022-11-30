package com.schmitt.Schmitt_GuessTheWord;

import java.util.ArrayList;

/**
 * @author Nathan Schmitt
 */
public final class Model
{
    //Variable & Non-Static Data
    protected static ArrayList<Character> guessedChars = new ArrayList<>();
    protected static ArrayList<Character> incorrectChars = new ArrayList<>();
    protected static boolean wordComplete = false;
    
    //Constant Data
    protected final static int ALLOWED_GUESSES = 7;
    
    protected final static String[] arrWords = {
        "excess", "poison", "ethics", "haunt", "worry", "trade", "period",
        "add", "tile", "troop", "slot", "variable", "symbol", "intensify",
        "failure", "mastermind", "humor", "efflux", "grass", "manufacture",
        "red", "reason", "infastructure", "definition", "child", "accident",
        "clue", "tie", "alive", "application", "retiree", "glimpse", "tender",
        "arm", "catalogue", "conenction", "internet", "guest"
    };
    
    protected final static String[] HANGMAN_GRAPHICS = {
        """
          +---+
              |
              |
              |
              |
              |
        =========
        """,
        """
          +---+
          |   |
              |
              |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
              |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
          |   |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|   |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|\\  |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|\\  |
         /    |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|\\  |
         / \\  |
              |
        =========
        """
    };
}
