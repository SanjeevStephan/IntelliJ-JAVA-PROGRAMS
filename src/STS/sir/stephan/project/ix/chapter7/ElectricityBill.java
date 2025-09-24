/**                                                             ElectricityBill.java
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

package STS.sir.stephan.project.ix.chapter7;

import java.util.Scanner;

public class ElectricityBill {

    static void askUserFor(String txt) {
        System.out.print("Enter " + txt + " : ");
    }

    static void showOnScreen(String title, String data) {
        System.out.println(title + " : " + data);
    }

    static void showOnScreen(String title, int data) {
        System.out.println(title + " : " + data);
    }

    static void showOnScreen(String title, double data) {
        System.out.println(title + " : " + data);
    }

    public static void calculateBill() {
        // Input details
        double amountToPay = 0.0, rate = 0.0; // Initialize `rate`
        Scanner input = new Scanner(System.in);

        // Call user-defined methods() -> askUserFor()
        askUserFor("Consumer Name");
        String name = input.nextLine();
        askUserFor("Month");
        String month = input.next();
        askUserFor("Consumer Number");
        int consumer_no = input.nextInt();
        askUserFor("Units Consumed");
        int units_consumed = input.nextInt();

        // Apply rate as per units consumed
        if (units_consumed <= 100) {
            rate = 4.80;
        } else if (units_consumed <= 300) {
            rate = 5.30;
        } else if (units_consumed <= 500) {
            rate = 6.80;
        } else {
            rate = 7.50;
        }

        // formula to calculate the amount to pay for electricity consumed
        amountToPay = units_consumed * rate;

        // Display details
        System.out.println("---[Electricity Bill]---");
        showOnScreen("Consumer Name", name);
        showOnScreen("Consumer Number", consumer_no);
        showOnScreen("Electricity Bill for the Month", month);
        showOnScreen("Units Consumed", units_consumed);
        showOnScreen("Rate Applied", rate);
        showOnScreen("Amount to be Paid", amountToPay);

        // Close scanner to prevent resource leak
        input.close();
    }

    public static void main(String[] args) {
        calculateBill();
    }
}
