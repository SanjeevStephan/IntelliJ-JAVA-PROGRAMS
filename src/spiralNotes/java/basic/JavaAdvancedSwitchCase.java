package spiralNotes.java.basic;

import java.util.Scanner;

public class JavaAdvancedSwitchCase {

    static String[] weekDays = {"Sunday","Monday", "Tuesday", "Wednesday","Thursday","Friday", "Saturday" };

    static void displayWeekDay()
    {
        System.out.println("Days of Week");
        for(int i=0 ; i <=6 ; i++)
        {
            System.out.println("[" + i + "]" + weekDays[i]);
        }
    }

    static int askUser()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter (0-6) to Select A Day");
        return input.nextInt();
    }

    static void selectWeekDay(int dayNum)
    {
        String msg = "";
        switch(dayNum)
        {
            case 0 :
                msg = "Today is Sunday";
                break;
            case 1 :
                msg = "Today is Monday";
                break;
            case 2:
                msg = "Today is Tuesday";
                break;
            case 3:
                msg = "Today is Wednesday";
                break;
            case 4:
                msg = "Today is Thursday";
                break;
            case 5:
                msg = "Today is Friday";
                break;
            case 6:
                msg = "Today is Saturday";
                break;
            default :
                msg = "Invalid Choice ";
        }

        System.out.println(msg);
    }

    public static void main(String[] args) {
        displayWeekDay();
        selectWeekDay(askUser());
    }

}
