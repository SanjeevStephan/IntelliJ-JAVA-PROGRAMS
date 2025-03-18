package class_ix.chapter_8;

import java.util.Scanner;

public class Table_Num_input_by_User {

    public static void main(String[] args) {
        Table_Num_input_by_User table = new Table_Num_input_by_User();
    }

    public Table_Num_input_by_User()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Number between (1-20) to Generate Multiplication Table : ");
        int table_for_num = scanner.nextInt();
        System.out.println("=========[ Multiplication Table - " + table_for_num + " ]=======================");
        int i = 1;
        while(i <= 10)
        {
            System.out.println("||               " + table_for_num + " x " + i + " = " + ( table_for_num * i ) + "          ");
            i++;
        }
        scanner.close();
        System.out.println("==========================================================");
    }
}
