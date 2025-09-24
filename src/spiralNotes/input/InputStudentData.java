package spiralNotes.input;

/**
 * Write a description of class InputStudentData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class InputStudentData
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);      // Creates a new Scanner Object
        System.out.println("Enter STS.sir.stephan.Student Name : "); // Prompts user to input Name
        String studentName = input.nextLine();       // Input String Value
        
        System.out.println("Enter STS.sir.stephan.Student Rollno : ");
        int studentRollNum = input.nextInt();      // Input Numerical Value
        
        System.out.println("Enter STS.sir.stephan.Student Height (in ft) : ");
        double studentHeight = input.nextDouble();
        
        System.out.println("STS.sir.stephan.Student Name : "    + studentName);
        System.out.println("STS.sir.stephan.Student Roll No : " + studentRollNum);
        System.out.println("STS.sir.stephan.Student Height : "  + studentHeight);
    }
}
