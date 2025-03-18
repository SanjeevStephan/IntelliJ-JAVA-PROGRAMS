package class_ix.chapter_7;

import java.util.Scanner;

public class Display_Months_and_its_number_of_days {

    public Display_Months_and_its_number_of_days()
    {
        Scanner scanner = new Scanner(System.in);
        int month_num;
        System.out.print("\bEnter Month Number : ");
        month_num = scanner.nextInt();

        switch(month_num)
        {
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                    System.out.println("Following Months Have 31 days");
                    System.out.println("January");
                    System.out.println("March");
                    System.out.println("May");

                    break;
            case 4 : case 6 : case 9 : case 11 :
                    System.out.println("Followign Months Have 30 days");
                    break;
            case 2 :
                    System.out.println("Ony One Month Have 28 Days");
                    System.out.println("February");
                    break;
            default : System.out.println("[INVALID] Choice");

        }
    }

    public static void main(String[] args) {

    }


}
