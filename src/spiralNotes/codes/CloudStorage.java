package spiralNotes.codes;


/**
 * Write a description of class CloudStorage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class CloudStorage
{
    // Member Variables
    int acno;   // stores account number 
    int space;   // store storage space
    double bill;  // stores the bill amount
    
    // Memeber Methodss
    void accept()
    {
        // Create an object of the class
        // <classname> <objname> = new <classname>();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number : ");
        acno = input.nextInt(); // scanner.nextInt();
        System.out.println("Enter your storage space : ");
        space = input.nextInt();
        input.close();
    }
    
    void calculate()
    {
        if(space <= 15)
        {
           bill = space * 15;
           //System.out.println("Storage space is less than 15");
           
        }
        else if(space <= 30)
        {
            bill = 15 * 15 + ((space - 15) * 13);
           // System.out.println("Storage space is less than 30");
        }
        else if(space > 30)
        {
            bill = 15 * 15 + 15 * 13 + ((space - 30) * 11);
        }
        
    }
    
    void display()
    {
        System.out.println("Account Number : " + acno);
        System.out.println("Storage Space : " + space);
        System.out.println("Bill to be Paid : " + bill);  
        
    }
    
    public static void main(String[] args)
    {
        
        CloudStorage myobj = new CloudStorage();
        myobj.accept();
        myobj.calculate();
        myobj.display();
    }
}
