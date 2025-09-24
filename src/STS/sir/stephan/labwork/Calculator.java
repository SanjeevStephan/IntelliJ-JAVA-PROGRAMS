package STS.sir.stephan.labwork;

/**
    Program Title : Calculator
    Description : This Program takes two numbers and performs calculation based on the operator selected
    @version : 24th-Sep-2025
    @Author : Sanjeev Stephan Murmu
 */
import java.util.Scanner;
import lazy.coder.Header;
import lazy.coder.*;


public class Calculator {

    static void MakeItLookGoodFirst()
    {
        Header.DisplayTopography("Calculator");
        Header.title("Calculator");
        Header.sign("24-09-2025");
    }

    static void DisplayMenu()
    {
        System.out.println("----------[ Calculator Menu ]---------");
        String menu[] = {"Add","Subtract","Divide","Multiply"};
        char operators[] = {' ','+', '-', '/', '*'};
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < menu.length ; i++)
        {
            int num = i + 1;
            System.out.println("[" + num + "] " + menu[i]);
        }
       System.out.print("Enter Your Choice (1-4) : ");
       // char choice = input.next().charAt(0);
        int choice = input.nextInt();

        int num[] =  Ask.ForInput(2, "Enter Number : ");

        int total = switch(choice) {
            case 1 -> num[0] + num[1] ;
            case 2 -> num[0] - num[1] ;
            case 3 -> num[0] / num[1] ;
            case 4 -> num[0] * num[1] ;
            default -> 0;
        };

        System.out.println("Total of " + num[0]  + operators[choice] + num[1] + " = " + total);
    }

    public static void main(String[] args)
    {
        // Warning : Infinite Loophole below!
        do {
            Clear.Terminal();
            MakeItLookGoodFirst();
            DisplayMenu();
        } while (true);

    }

}
