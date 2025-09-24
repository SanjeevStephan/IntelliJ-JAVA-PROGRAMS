package STS.sir.stephan.labwork.quiz;


/**
 * Write a description of class StateCapitalQuizInFunction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class StateCapitalQuizInFunction
{
     static int Score = 0;
     static void AskQuestion(String question,String correctAnswer)
     {
         Scanner input = new Scanner(System.in);
         System.out.println(question);
         String userAnswer = input.nextLine().trim();
         // checkAnswer
         if(userAnswer.equalsIgnoreCase(correctAnswer))
         {
             System.out.println("Correct Answer");
             Score = Score + 1;
         }
         else
         {
             System.out.println("Wrong Answer");
         }
         
         System.out.println("Total Questions Answered : " + Score);
     }
    
    
     public static void main(String[] args)
     {
         AskQuestion("Enter the Capital of Jharkhand","ranchi");
         AskQuestion("Enter the Capital of Bihar","patna");
         AskQuestion("Enter the Capital of Maharashtra","mumbai");
         AskQuestion("Enter the Capital of Tamil Nadu","chennai");
         AskQuestion("Enter the Capital of Uttar Pradesh","lucknow");

     }
    
    
}
