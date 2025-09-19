/*                              ElectricityBill.java
    Program No : 15
    Date :
    Program Title : ElectricityBill
    Program Description : Program to calculate and display the electricity bill with all the details
                          1. Name of the Consumer
                          2. Consumer Number
                          3. Month
                          4. Units Consumed.

    Note : below method is executed from public static void main(String[] args){..} method only
 */

package Student.stephan.project.ix.chapter7;

import java.util.Scanner;

public class ElectricityBillOutdated {

    static void askUserFor(String txt)
    {
        System.out.print("Enter " + txt + " : ");
    }
    static void showOnScreen(String title, String data)
    {
        System.out.println(title + " : " + data);
    }
    static void showOnScreen(String title, int data)
    {
        System.out.println(title + " : " + data);
    }
    static void showOnScreen(String title, double data)
    {
        System.out.println(title + " : " + data);
    }
    public static void calculateBill()
    {
        // input details
        double amountToPay,rate;
        Scanner input = new Scanner(System.in);
        // call user-defined methods() -> askUserFor()
        askUserFor("Consumer Name");
        String name = input.nextLine();
        askUserFor("Month");
        String month = input.next();
        askUserFor("Consumer Number");
        int consumer_no = input.nextInt();
        askUserFor("Units Consumed");
        int units_consumed = input.nextInt();

        // apply rate as per units consumed
        if (units_consumed <= 100)
        {
            rate = 4.80;
            amountToPay = units_consumed * rate;
        }

        if (units_consumed > 100 && units_consumed <= 300)
            amountToPay = units_consumed * 5.30;
        if (units_consumed > 300 && units_consumed <= 500)
            amountToPay = units_consumed * 6.80;
        if (units_consumed > 500)
            amountToPay = units_consumed * 7.50;

        // display electricity bill
        showOnScreen("---[Electricity]---","--[Bill]--");
        showOnScreen("Consumer Name : " , name);
        showOnScreen("Consumer Number", consumer_no);
        showOnScreen("Electricity Bill for the Month", month);
        showOnScreen("Units Consumed : ", units_consumed);
//        showOnScreen("Rate Applied",rate);
//        showOnScreen("Amount to be Paid", amountToPay);

    }

    public static void main(String[] args) {
        calculateBill();
    }
}
