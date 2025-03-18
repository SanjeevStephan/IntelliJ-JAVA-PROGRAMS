package class_ix.chapter_7;

import java.util.Scanner;

public class Greater_num_among_the_three {

    public Greater_num_among_the_three()
    {

        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.print("\nEnter the Value of x : ");
        x = scanner.nextInt();
        System.out.print("\nEnter the Value of y : ");
        y = scanner.nextInt();
        System.out.print("\nEnter the Value of z : ");
        z = scanner.nextInt();

        if (x > y)
        {
            System.out.println("x is greater than y");
            if (y > z)
            {
                System.out.println("x is also greater than y and z");
            }
        }
        else
        {
            System.out.println("x is less than or equal to y");
        }

    }

//    public static void main(String[] args) {
//
//
//    }


}
