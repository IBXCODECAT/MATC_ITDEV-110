package com.schmitt.schmittdriverexam;

public class Controller 
{
    
    UI ui = new UI();  
    protected void AskQuestions()
    {
        for (int i = 0; i < Exam.answerKey.length; i++)
      	{
            Exam.studentAns[i] = ui.GetAns(i + 1);
        }
        
        int correct = Exam.totalCorrect();
        
        ui.output(correct, Exam.totalIncorrect(), Exam.questionMissed(), Exam.passed(correct));
        
    }
}
