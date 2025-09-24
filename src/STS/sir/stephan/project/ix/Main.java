/**
    Program No : 00
    Program Title : Main
    Description :  This is the entry point of a Java program.
                   When you run a Java application, execution starts from this method.
 */
package STS.sir.stephan.project.ix;

import STS.sir.stephan.project.ix.chapter4.*;
import STS.sir.stephan.project.ix.chapter6.*;
import STS.sir.stephan.project.ix.chapter7.ElectricityBill;
import STS.sir.stephan.project.ix.chapter7.GradeTheStudent;
import STS.sir.stephan.project.ix.chapter7.RectangleMenu;
import STS.sir.stephan.project.ix.chapter7.SecondSmallestNum;
import STS.sir.stephan.project.ix.chapter4.*;
import STS.sir.stephan.project.ix.chapter6.*;
import STS.sir.stephan.project.ix.chapter7.*;

public class Main 
{
    static int programNo = 0;
        /*
         *     static void displayOnScreen(String msg)
            {
               // programNo = programNo + 1;
                String txt = "-------------[ " + programNo + "." + msg + " ]------------";
                String txt = "-------------[ " + msg + " ]------------";
               System.out.println(txt);
            }
         * 
         */
    
        public static void main(String[] args) 
        {
            System.out.println("---[ 01. STS.sir.stephan.Student Bio-Data ]---");
            StudentBioData.displayStudentBioData("Sanjeev Stephan"); // Write your own name here
    
            System.out.println("---[ 02. Add Two Numbers ]---");
            CalculateSum.inputAndDisplaySum();     //calling method() from class CalculateSum
    
            System.out.println("---[ 03. Area of Square ]---");
            AreaOfSquare.calculateSquare(25);   //calling method() from class AreaOfSquare
    
            System.out.println("---[ 04. Goods & Service Tax ]---");
            CalculateGST.calculateGST(10000);  //calling method() from class AreaOfSquare
    
            System.out.println("---[ 05. Discounts ]---");
            CalculateDiscount.calculateDiscount();  //calling method() from class AreaOfSquare
    
            System.out.println("---[ 06. Diagonal of Square ]---");
            FindDiagonalOfSq.calculateDiagonal(); //calling method() from class FindDiagonalOfSq
    
            System.out.println("---[ 07. Display Smallest Number ]---");
            FindSmallestNum.findSmallestNum(12,16,19); //calling method() from class FindSmallestNum
    
            System.out.println("---[ 08. Find Smallest Number ]---");
            InputAndFindSmallestNum.inputAndFind();
    
            System.out.println("---[ 09. Find Side of Cube ]---");
            FindCube.displayCube(); //calling method() from class FindCube
    
            System.out.println("---[ 10. Find Value of Expression ]---");
            FindValueOfExpression.findExpression(); //calling method() from class FindVelocity
    
            System.out.println("---[ 11. Find Velocity ]---");
            FindVelocity.calculateVelocity(); //calling method() from class FindVelocity
    
            System.out.println("---[ 12. Display Second Smallest Number ]---");
            SecondSmallestNum.find2ndSmallestNum();
    
            System.out.println("---[ 13. Display STS.sir.stephan.Student Grades ]---");
            GradeTheStudent.displayGrades();
    
            System.out.println("---[ 14. Calculate Rectangle ]---");
            RectangleMenu.solveRectangle();
    
            System.out.println("---[ 15. Calculate Electricity Bill ]---");
            ElectricityBill.calculateBill();
    
    
    
        }
}
