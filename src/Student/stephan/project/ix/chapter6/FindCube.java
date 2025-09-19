/*                              FindCube.java
    Program No : 09
    Date :
    Program Title : FindCube
    Program Description : A Program to find side of a cube
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package Student.stephan.project.ix.chapter6;

import java.util.Scanner;

public class FindCube {
    public static void displayCube() {
        Scanner input = new Scanner(System.in);
        int volume;
        double side;
        System.out.print("[?] Enter Volume of a Cube : ");
        volume = input.nextInt();
        side = Math.cbrt(volume);
        System.out.println("Volume of a Cube : " + volume);
        /*
        The cube root calculation may result in too many decimal places.
        Using the Floating-Point Formatting for Precision & better readability.
         */
        System.out.printf("Side of the Cube: %.2f\n", side);
        // terminate the scanner object

        // System.out.println("Side of a Cube : " + side);
    }

//    public static void main(String[] args) {
//        displayCube();
//    }
}
