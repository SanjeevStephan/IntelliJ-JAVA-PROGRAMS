package exercises.chapter2;

/*
    Page : 102
    Program : To Input the name, phone number and address of your friend.
              Display the name, phone number and address in different lines
 */
import java.util.Scanner;

public class Display_Contact_Details {

    public void Display_Details()
    {
        Scanner scanner = new Scanner(System.in);
        String name,address;
        int phone_num;
        System.out.print("\nEnter Your Name");
        name = scanner.nextLine();
        System.out.print("\nEnter Your Phone Number");
        phone_num = scanner.nextInt();
        System.out.print("\nEnter the address");
        address = scanner.nextLine();
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phone_num);
        System.out.println("Address : " + address);
    }
    public static void main(String[] args)
    {
        Display_Contact_Details displayContactDetails = new Display_Contact_Details();
        displayContactDetails.Display_Details();
    }
}
