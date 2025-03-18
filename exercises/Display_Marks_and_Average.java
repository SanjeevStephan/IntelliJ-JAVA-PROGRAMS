package exercises;

/*  Page No : 102
    Program : To Input the Name of a Student.
              Also, input the marks obtained by him in three subjects and find the average.
 */

import java.util.Scanner;

public class Display_Marks_and_Average {

    public void Average_Marks()
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        double marks1, marks2, marks3;
        double average;

        System.out.print("\nEnter the Name of the Student : ");
        name = scanner.nextLine();
        System.out.print("\nEnter the Marks obtained in three subjects");
        System.out.print("\nMarks Obtained in 1st Subject : " );
        marks1 = scanner.nextDouble();
        System.out.print("\nMarks Obtained in 2nd Subject : " );
        marks2 = scanner.nextDouble();
        System.out.print("\nMarks Obtained in 3rd Subject : " );
        marks3 = scanner.nextDouble();

        average = (marks1 + marks2 + marks3)/3.0;
        System.out.println("Average Marks : " + average);
    }

    public static void main(String[] args)
    {
        Display_Marks_and_Average displayMarksAndAverage = new Display_Marks_and_Average();
        displayMarksAndAverage.Average_Marks();
    }

}
