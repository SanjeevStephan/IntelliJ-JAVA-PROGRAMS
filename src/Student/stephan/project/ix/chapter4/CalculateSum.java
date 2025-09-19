/**                              DisplayGST.java
    Program No : 02
    Program Title : CalculateSum
    Program Description : A Program in Java to find the sum of two numbers.
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package Student.stephan.project.ix.chapter4;

import java.util.Scanner;

public class CalculateSum {

    public static void inputAndDisplaySum() {
        // Declare the required variables first
        int a, b , sum;
        // Create A Scanner Class's object to enable the Scanner feature to receive input from keyboard
        Scanner input = new Scanner(System.in);
        // Prompt to Enter First Number
        System.out.print("[?] Enter First Number : ");
        // Store the value receive from keyboard into an int variable
        a = input.nextInt(); // using nextInt() to accept integer value only
        // Prompt for the Second Number
        System.out.print("[?] Enter Second Number : ");
        b = input.nextInt();
        // Display the Sum of those two number
        sum = a + b;
        // Display the Result on the Screen
        System.out.println("The Sum of Two Number (a + b) : " + sum);
    }
}
