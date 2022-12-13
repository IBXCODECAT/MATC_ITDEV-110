package com.schmitt.schmittdriverexam;

public final class Exam {
    protected static char[] answerKey = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
    protected static char[] studentAns = new char[answerKey.length];
    protected static double passingGradeMin = 65.0;
    
    protected static int totalCorrect()
    {
        int numCorrect = 0;
        for (int i = 0; i < answerKey.length; i++)
        {
            if (answerKey[i] == studentAns[i])
            {
                numCorrect++;
            }
	}
        
        return numCorrect;
    }
    
    protected static int totalIncorrect()
    {
        int numIncorrect = 0;
        for (int i = 0; i < answerKey.length; i++)
        {
            if (answerKey[i] != studentAns[i])
            {
                numIncorrect++;
            }
	}
        
        return numIncorrect;
    }
    
    protected static String questionMissed()
    {
        int[] missedQuestions = new int[answerKey.length];
        for (int i = 0; i < answerKey.length; i++)
        {
            if (answerKey[i] != studentAns[i])
            {
                missedQuestions[i] = (i+1);
            }
            else
            {
                missedQuestions[i] = -1;
            }
        }
        
        String missed = "";
        
        for(int i : missedQuestions)
        {
            if(i != -1)
            {
                missed += "" + i + ", ";
            }
        }

        return missed;
    }
    
    protected static boolean passed(int correct)
    {
        double percentageCorrect = ((double)correct / 20.0) * 100.0;   
        return (percentageCorrect >= passingGradeMin);
    }    
}
