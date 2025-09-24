// Package declaration, specifying the location of the class within the project
package spiralNotes.java.basic;

import java.util.Scanner; // Importing Scanner class to take user input

public class JavaIfElseIf_Statement {
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.println("Enter Any Number");

        // Reading an integer value from the user and storing it in variable 'num'
        int num = input.nextInt();

        // Conditional statements to check the value of 'num'
        if(num == 0 ) { // If the number is zero
            System.out.println("You have Entered A Zero");
        } else if(num > 0) { // If the number is positive
            System.out.println("Number is Positive");
        } else if(num < 0) { // If the number is negative
            System.out.println("Number is Negative");
        } else { // This condition is unnecessary, as all possibilities are already covered
            System.out.println("Try Again!");
        }
    }
}
