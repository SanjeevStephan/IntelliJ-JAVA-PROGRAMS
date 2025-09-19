package Student.stephan.labwork.quiz;


/**
 * Write a description of class testprogram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Testprogram
{   
     static int Score = 0;
     static void AskQuestion(String question,String correctAnswer)
     {
        
         System.out.println(question);
         Scanner input = new Scanner(System.in);
         String userAnswer = input.nextLine().trim();
        // System.out.println(userAnswer);
         
         if(userAnswer.equalsIgnoreCase(correctAnswer))
         {
             System.out.println("You have given Correct Answer");
             Score = Score + 1;
             System.out.println("Total Questions Answer : " + Score);
         }
         else
         {
              System.out.println("InCorrect Answer ");
              System.out.println("Correct Answer is : " + correctAnswer);
         }
         
     }
    
    
     public static void main(String[] args)
     {
         
         AskQuestion("Enter the capital of Jharkhand","ranchi"); // +1 
         
         AskQuestion("Enter the capital of Bihar","PATNA");  // 1 +1 
         
     }
}
