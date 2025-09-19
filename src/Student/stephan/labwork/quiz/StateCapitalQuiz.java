package Student.stephan.labwork.quiz;


/**
 * Write a description of class StateCapitalQuiz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;


public class StateCapitalQuiz
{
 public static void main(String[] args)
 {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter the Capital of Jharkhand");
     String answer1 = input.nextLine().trim();
     
     if(answer1.equalsIgnoreCase("ranchi")){  
         System.out.println("Correct Answer") ; 
     }
     else { System.out.println("Wrong Answer"); }
 
     System.out.println("Enter the Capital of Bihar");
     String answer2 = input.nextLine().trim();
     
     if(answer2.equalsIgnoreCase("patna"))
     {  System.out.println("Correct Answer") ; }
     else { System.out.println("Wrong Answer"); }
     
     System.out.println("Enter the Capital of Maharashtra");
     String answer3 = input.nextLine().trim();
     
     if(answer3.equalsIgnoreCase("mumbai"))
     {  System.out.println("Correct Answer") ; }
     else { System.out.println("Wrong Answer"); }
     
     
     System.out.println("Enter the Capital of Tamil Nadu");
     String answer4 = input.nextLine().trim();
     
     if(answer4.equalsIgnoreCase("chennai"))
     {  System.out.println("Correct Answer") ; }
     else { System.out.println("Wrong Answer"); }
     
     
     System.out.println("Enter the Capital of Uttar Pradesh");
     String answer5 = input.nextLine().trim();
     
     if(answer5.equalsIgnoreCase("lucknow"))
     {  System.out.println("Correct Answer") ; }
     else { System.out.println("Wrong Answer"); }
     
 }
 
}
