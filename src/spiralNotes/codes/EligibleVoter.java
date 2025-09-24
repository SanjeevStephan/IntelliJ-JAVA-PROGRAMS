package spiralNotes.codes;

import java.util.Scanner;
/**
 * Real-Life Example Code-#7
 * File Name : CheckAge.java
 * Class Name : CheckAge
 * Description : Here's a real-life based example to stores a person name and prints it :
 */

public class EligibleVoter {

    // Create a checkAge() method with an integer parameter titled "age"
    public static void checkAge(int age) {
        // If age is less than 18, print "Access Denied"
        if (age < 18) {
            System.out.println("Sorry! You are not old enough to be a voter");

//            int differenceInYear = 18 - age;

        }
        else {
            System.out.println("Congratulation - You are eligible to be a voter");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = input.nextInt();
        checkAge(age);
    }
}
