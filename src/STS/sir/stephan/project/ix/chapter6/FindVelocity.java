/*                              FindVelocity.java
    Program No : 11
    Date :
    Program Title : FindVelocity
    Program Description : A Program to calculate the final velocity
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package STS.sir.stephan.project.ix.chapter6;

import java.util.Scanner;

public class FindVelocity {
    public static void calculateVelocity() {
        Scanner input = new Scanner(System.in);
        int u, a, s;
        double v;
        System.out.print("[?] Enter the Value for u : ");
        u = input.nextInt();
        System.out.print("[?] Enter the Value for a : ");
        a = input.nextInt();
        System.out.print("[?] Enter the Value for s : ");
        s = input.nextInt();
        v = Math.sqrt(Math.pow(u, 2) + 2 * a * s);
        System.out.println("Final Velocity = " + v);
//        input.close();
    }
}
