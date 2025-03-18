package class_ix.chapter_5;

import java.util.Scanner;

public class Display_various_numeric_Data {

    public static void main(String[] args)
    {
        int a;
        short b;
        long c;
        double d;
        float e;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integer Value : ");
        a = scanner.nextInt();
        System.out.print("\nEnter Short Value : ");
        b = scanner.nextShort();
        System.out.print("\nEnter Long Value : ");
        c = scanner.nextLong();
        System.out.print("\nEnter Double Value : ");
        d = scanner.nextDouble();
        System.out.print("\nEnter Float Value : ");
        e = scanner.nextFloat();

        String[] numeric_data_types = {"integer","short","long","double","float"};
        Object[] mixed_data_types = new Object[5];
        mixed_data_types[0] = a;
        mixed_data_types[1] = b;
        mixed_data_types[2] = c;
        mixed_data_types[3] = d;
        mixed_data_types[4] = e;

        for(int i = 0 ; i < numeric_data_types.length; i++)
        {
            System.out.println(numeric_data_types[i] + " : " + mixed_data_types[i]);
        }


    }
}
