package com.schmitt.schmittfinalexam;

import java.util.Scanner;

public class View
{
    private static Scanner keyboardBuffer = new Scanner(System.in);
    
    protected static StudentModel getStudentInfo()
    {
        StudentModel model = new StudentModel();
        
        System.out.println("Please enter student id (int)...");
        model.setStudentID(keyboardBuffer.nextInt());
        
        System.out.println("Please enter student first name...");
        model.setFirstName(keyboardBuffer.nextLine().strip());
        
        System.out.println("Please enter student last name...");
        model.setLastName(keyboardBuffer.nextLine().strip());
        
        System.out.println("Please enter student email address...");
        model.setEmailAddress(keyboardBuffer.nextLine().strip());
        
        System.out.println("Please enter student project score...");
        
        //Handle project score...
        int projectScore = 0;
        boolean invalidProjectScore = true;
        
        while(invalidProjectScore)
        {    
            try
            {
                projectScore = keyboardBuffer.nextInt();
                
                if(projectScore >= 0 && projectScore <= 200)
                {
                    invalidProjectScore = false;
                }
                else
                {
                    System.out.println("Project score must be 0-200");
                }
            }
            catch(Exception ex)
            {
                System.out.println("Please enter a number");
            }
        }
        
        model.setProjectScore(projectScore);
        
        
        //Handle exam scores...
        int[] examScores = new int[2];
        
        for(int i = 0; i < 2; i++)
        {
            boolean invalidExamScores = true;
            
            System.out.println("Please enter exam score " + (i + 1) + "...");
            
            while(invalidExamScores)
            {
                try
                {
                    int score = keyboardBuffer.nextInt();
                    
                    if(score >= 0 && score <= 100)
                    {
                        examScores[i] = score;
                        invalidExamScores = false;
                    }
                    else
                    {
                        System.out.println("Exam score must be 1-100");
                    }
                }
                catch(Exception ex)
                {
                    System.out.println("Please enter a number...");
                }
            }
        }
        
        model.setExamScores(examScores);
        
        //Handle assignment scores...
        int[] assignmentScores = new int[6];
        
        for(int i = 0; i < 6; i++)
        {
            boolean invaldiAssignmentScores = true;
            
            System.out.println("Please enter assignment score " + (i + 1) + "...");
            
            while(invaldiAssignmentScores)
            {
                try
                {
                    int score = keyboardBuffer.nextInt();
                    
                    if(score >= 0 && score <= 100)
                    {
                        assignmentScores[i] = score;
                        invaldiAssignmentScores = false;
                    }
                    else
                    {
                        System.out.println("Exam score must be 1-100");
                    }
                }
                catch(Exception ex)
                {
                    System.out.println("Please enter a number...");
                }
            }
        }
        
        model.setExamScores(assignmentScores);
        
        return model;
    }
}