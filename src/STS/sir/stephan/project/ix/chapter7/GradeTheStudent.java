/*                              GradeTheStudent.java
    Program No : 13
    Date :
    Program Title : GradeTheStudent
    Program Description : Program to Input Marks in Physics, Chemistry and Biology and name of STS.sir.stephan.Student.
                          Give Grades accordingly.
    Note : below method is executed from public static void main(String[] args){..} method only
 */

package STS.sir.stephan.project.ix.chapter7;

import java.util.Scanner;

public class GradeTheStudent {

     static int inputMarkFor(String subject) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Marks for " + subject + " :");
         int marks = input.nextInt();
//         input.close();
         return marks;
    }
    static String decideGrades(int average) {
        String grade = "";
        if (average >= 80)
            grade = "Exceptional";
        if(average >= 60 && average < 80)
            grade = "1st Division";
        if(average >= 45 && average < 60)
            grade = "2nd Division";
        if(average >= 40 && average < 45)
            grade = "Pass";
        if(average < 40)
            grade = "Promotion not Granted";
        return grade;
    }

    public static void displayGrades() {

        int phy = inputMarkFor("Physics");
        int chem = inputMarkFor("Chemistry");
        int bio = inputMarkFor("Biology");

        int average = (phy + chem + bio) / 3;
        String grade = decideGrades(average);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter STS.sir.stephan.Student Name : ");
        String name = scanner.nextLine();
        System.out.println("------------------------");
        System.out.println("Name : " + name);
        System.out.println("Average Marks : " + average);
        System.out.println("Grade : " + grade);
    }

    public static void main(String[] args) {
        displayGrades();
    }


}
