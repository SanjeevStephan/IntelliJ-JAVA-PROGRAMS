package spiralNotes.input;

/**
 * Write a description of class JavaMathInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class JavaMathInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double a = 9.5, b = -3.7, c = 2.0;
        int x = 10, y = -5;
        
        double angle = Math.toRadians(45); // toRadians() method convert 45 degrees to radians.
        
        // Basic Operations
        System.out.println("Math.abs  (" + b + ")=" + Math.abs(b));              // Convert Negative (-ve) digit into Positive(+ve) 
        System.out.println("Math.max  (" + x + "," + y + ")=" + Math.max(x,y)); // Find the Greatest (>) number between two numbers
        System.out.println("Math.min  (" + x + "," + y + ")=" + Math.min(x,y)); // Find the Smallest (<) number between two numbers
        System.out.println("Math.pow  (" + c + "," + ",3)= "  + Math.pow(c,3)); // 
        System.out.println("Math.sqrt (" + 25 + ")=" + Math.sqrt(25));
        System.out.println("Math.cbrt (" + 64 + ")=" + Math.cbrt(64));
        
    }
}

