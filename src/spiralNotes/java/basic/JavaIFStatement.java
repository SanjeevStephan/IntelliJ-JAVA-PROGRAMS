package spiralNotes.java.basic;

import java.util.Scanner;
public class JavaIFStatement {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int num = input.nextInt();

        if (num > 0)
            System.out.println("Number is Positive");
        // in case of false - it will print nothing!
    }
}
