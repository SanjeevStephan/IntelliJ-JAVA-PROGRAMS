/*                              DisplayGST.java
    Program No : 10
    Date :
    Program Title : FindValueOfExpression
    Program Description : A Program to find value of an expression.
    Note : below method is executed from public static void main(String[] args){..} method only
 */

package STS.sir.stephan.project.ix.chapter6;

import java.util.Scanner;

public class FindValueOfExpression {
    public static void findExpression() {
        Scanner input = new Scanner(System.in);
        int a, b , c;
        double d;
        System.out.print("[?] Enter Value for a : ");
        a = input.nextInt();
        System.out.print("[?] Enter Value for b : ");
        b = input.nextInt();
        System.out.print("[?] Enter Value for c : ");
        c = input.nextInt();
        double firstExpression = 1 / Math.pow(a, 2);
        double secondExpression = 1 / Math.pow(b, 3);
        double thirdExpression = 1 / Math.pow(c, 4);
        d = firstExpression + secondExpression + thirdExpression;
        System.out.printf("Value of the Expression : %.3f\n", d);
    }
//    public static void main(String[] args) {
//        findExpression();
//    }
}


