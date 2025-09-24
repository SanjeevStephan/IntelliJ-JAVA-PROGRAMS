/*                              DisplayGST.java
    Program No : 12
    Date :
    Program Title :
    Program Description : A Program to calculate the second-smallest number
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package STS.sir.stephan.project.ix.chapter7;

import java.util.Scanner;
public class SecondSmallestNum {
     static int inputNumber(String digit) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + digit + " Number : ");
        int num = input.nextInt();
//         input.close();
        return num;
    }
    static void the2ndSmallestNumIs(int num) {
        System.out.println("The Second Smallest Number : " + num);
    }
    public static void find2ndSmallestNum() {
        int a = inputNumber("First");
        int b = inputNumber("Second");
        int c = inputNumber("Third");

        String nums = "The Numbers are : " + a + " " + b + " " + c;
        System.out.println(nums);
        if ((a < b) && (a < c))
        {
            if (b < c)
                the2ndSmallestNumIs(b);
            else
                the2ndSmallestNumIs(c);
        }

        if ((b < c) && (b < a))
        {
            if (c < a)
                the2ndSmallestNumIs(c);
            else
                the2ndSmallestNumIs(a);

        }

        if ((c < a) && (c < b))
        {
            if (a < b)
                the2ndSmallestNumIs(a);
            else
                the2ndSmallestNumIs(b);
        }
    }

    public static void main(String[] args) {
        find2ndSmallestNum();
    }
}
