package com.schmitt.schmittfinalexam;

public final class Controller 
{
    protected static void Execute()
    {
        StudentModel[] students = new StudentModel[10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("\n\nSTUDENT NUMBER " + (i + 1) + "\n\n");
            StudentModel student = View.getStudentInfo();
            
            students[i] = student;
        }
    }
}
