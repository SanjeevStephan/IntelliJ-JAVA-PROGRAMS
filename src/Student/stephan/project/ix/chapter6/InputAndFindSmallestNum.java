/*                              InputAndFindSmallestNum.java
    Program No : 08
    Date :
    Program Title : InputAndFindSmallestNum
    Program Description : A Program In Java to input three numbers using Scanner Class and display the smallest number
    Note : below method is executed from public static void main(String[] args){..} method only
    Hint : Use Math.min(int num1, int num2);
 */
package Student.stephan.project.ix.chapter6;

import java.util.Scanner;
public class InputAndFindSmallestNum {
    public static void inputAndFind() {
        int a, b, c, d, e;
        Scanner input = new Scanner(System.in);
        System.out.print("[?] Enter First Number :");
        a = input.nextInt();
        System.out.print("[?] Enter Second Number : ");
        b = input.nextInt();
        System.out.print("[?] Enter Third Number :");
        c = input.nextInt();
        // Find the smallest between a & b
        d = Math.min(a, b);
        // Find the smallest between c & d
        e = Math.min(c, d);
        System.out.println("The Smallest Number is : " + e);
    }
}
