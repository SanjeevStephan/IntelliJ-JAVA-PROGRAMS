package Student.stephan.labwork.quiz;


/**
 * Write a description of class StateCapitalQuizInSwitchCase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class StateCapitalQuizInSwitchCase
{
     static int Score = 0;
     static void CheckAnswer(String answer)
     {
         
         switch(answer.toLowerCase())
         {
             case "ranchi" : 
                 System.out.println("Correct Answer");
                 Score = Score + 1;
                 break;
             case "patna":
                 System.out.println("Correct Answer");
                 Score = Score + 1;
                 break;
             case "mumbai":
                 System.out.println("Correct Answer");
                 Score = Score + 1;
                 break;
             case "chennai":
                 System.out.println("Correct Answer");
                 Score = Score + 1;
                 break;
             case "lucknow":
                 System.out.println("Correct Answer");
                 Score = Score + 1;
                 break;
             default : System.out.println("Wrong Answer");
                 break;
         }
         
         System.out.println("Total Questions Answered : " + Score);
     }
    
    
    
     public static void main(String[] args)
     {
         int Score = 0;
         Scanner input = new Scanner(System.in);
         
         System.out.println("Enter the Capital of Jharkhand");
         String answer1 = input.nextLine().trim();
         
         CheckAnswer(answer1);
         
         System.out.println("Enter the Capital of Bihar");
         String answer2 = input.nextLine().trim();
         
         CheckAnswer(answer2);
         
         System.out.println("Enter the Capital of Maharashtra");
         String answer3 = input.nextLine().trim();
         
         CheckAnswer(answer3);
         
         
         System.out.println("Enter the Capital of Tamil Nadu");
         String answer4 = input.nextLine().trim();
         
         CheckAnswer(answer4);
         
         System.out.println("Enter the Capital of Uttar Pradesh");
         String answer5 = input.nextLine().trim();
         
         CheckAnswer(answer5);
         

         
     }
    
}
