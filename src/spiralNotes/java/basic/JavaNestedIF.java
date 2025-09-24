package spiralNotes.java.basic;

import java.util.Scanner;
public class JavaNestedIF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number:");
        int num = input.nextInt();

        if(num > 0) { // Outer if statement
            System.out.println("The number is Positive");

            if(num % 2 == 0)
            {
                System.out.println("Even Number");
            }
            else
            {
                System.out.println("Odd Number");
            }

        }
        else
        {
            System.out.println("The Number is Not Positive");
        }
    }
}
