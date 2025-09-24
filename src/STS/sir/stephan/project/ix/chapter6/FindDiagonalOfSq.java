/*                              FindDiagonalOfSq.java
    Program No : 06
    Date :
    Program Title : FindDiagonalOfSq
    Program Description : A Program to find diagonal of a square
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package STS.sir.stephan.project.ix.chapter6;

import java.util.Scanner;

public class FindDiagonalOfSq {
    public static void calculateDiagonal() {
        Scanner input = new Scanner(System.in);
        int side;
        double diagonal;
        System.out.print("[?] Enter Side of a Square : ");
        side = input.nextInt();
        diagonal = Math.sqrt(2) * side;
        System.out.println("Side of a Square = " + side);
        System.out.printf("Diagonal of a Square = %.2f", diagonal);
        System.out.println(); // shift the cursor to the next line
    }

//    public static void main(String[] args)
//    {
//        calculateDiagonal();
//    }
}
