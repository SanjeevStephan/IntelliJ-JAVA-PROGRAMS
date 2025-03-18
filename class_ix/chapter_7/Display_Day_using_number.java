package class_ix.chapter_7;

import java.util.Scanner;

public class Display_Day_using_number {

    public Display_Day_using_number()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Number of the Day");
        int dayNum = scanner.nextInt();

        switch(dayNum)
        {
            case 1 :
                System.out.println("1. Monday");
                break;
            case 2 :
                System.out.println("2. Tuesday");
                break;
            case 3 :
                System.out.println("3. Wednesday");
                break;
            case 4 :
                System.out.println("4. Thursday");
                break;
            case 5 :
                System.out.println("5. Friday");
                break;
            case 6 :
                System.out.println("6. Saturday");
                break;
            case 7:
                System.out.println("7. Sunday");
                break;
            default: System.out.println("[INVALID] Number of the Day");
        }
    }


    public static void main(String[] args)
    {
        Display_Day_using_number dayNum = new Display_Day_using_number();

    }

}
