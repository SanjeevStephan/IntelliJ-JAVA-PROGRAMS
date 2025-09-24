package spiralNotes.java.basic;

import java.util.Scanner;

public class JavaSimpleInputSwitchCase {

    public static void main(String[] args) {

        System.out.println("Enter the Day of the Week (1-6) : ");
        Scanner input = new Scanner(System.in);
        int dayNum = input.nextInt();
        String day = "";

        switch(dayNum)
        {
            case 1 :
                day = "Sunday";
                break;
            case 2 :
                day = "Monday";
                break;
            case 3 :
                day = "Tuesday";
                break;
            case 4 :
                day = "Wednesday";
                break;
            case 5 :
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7 :
                day = "Saturday";
                break;
            default :
                day = "Invalid! ";
        }

        System.out.println(day);

    }
}
