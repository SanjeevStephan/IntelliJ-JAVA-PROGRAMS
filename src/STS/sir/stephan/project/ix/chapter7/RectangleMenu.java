/*                              GradeTheStudent.java
    Program No : 14
    Date :
    Program Title : RectangleMenu
    Program Description : Program to calculate the area, perimeter and diagonal of a rectangle
                         as per the user's choice.

    Note : below method is executed from public static void main(String[] args){..} method only
 */
package STS.sir.stephan.project.ix.chapter7;

import java.util.Scanner;

public class RectangleMenu {
    static int askUserFor(String info)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + info + ":");
        return input.nextInt();
    }

    public static void solveRectangle()
    {
        int length, breadth, area, perimeter, userChoice;
        double diagonal;

        length  = askUserFor("length of a rectangle");
        breadth = askUserFor("breadth of a rectangle");

        // The Menu

        System.out.println("---[ Rectangle Menu ]---");
        System.out.println("\t 1. Area");
        System.out.println("\t 2. Perimeter");
        System.out.println("\t 3. Diagonal");
        System.out.print("Enter Your Choice (1-3) : ");

        Scanner input = new Scanner(System.in);
        userChoice = input.nextInt();

        switch(userChoice)
        {
            case 1 :
                area = length * breadth;
                System.out.println("Area of Rectangle = " + area);
                break;
            case 2 :
                perimeter = 2 * (length + breadth);
                System.out.println("Perimeter of Rectangle = " + perimeter);
                break;
            case 3 :
                diagonal = Math.sqrt((length * length) + (breadth * breadth));
                System.out.println("Diagonal of Rectangle = " + diagonal);
                break;
            default:
                System.out.println("Wrong Choice Entered!");
                System.out.println("Please! enter number between (1-3)");

        }
    }

    public static void main(String[] args) {
        solveRectangle();
    }
}
