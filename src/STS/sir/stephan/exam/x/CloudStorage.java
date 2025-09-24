package STS.sir.stephan.exam.x;


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
    int acno;
    int space;
    double bill;
    
    // memeber methods
    void accept()
    {
        // create a object of the scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        acno = input.nextInt();
        System.out.println("Enter Storage space : ");
        space = input.nextInt();
        input.close();
    }
    
    void calculate()
    {
        if(space <= 15)
        {
            bill = space * 15;
        }
        else if(space <=30)
        {
            bill = 15 * 15 + ((space - 15) * 13);
        }
        else 
        {
            bill = 15 * 15 + 15 * 13 + ((space - 30) * 11);
        }
        
    }
    
    void display()
    {
        System.out.println("Account Number : " + acno);
        System.out.println("Storage Space : " + space + " GB");
        System.out.println("Bill Amount : " + bill);
        
    }
    
    
    
    
    public static void main(String[] args)
    {

        
        // <classname> <objname> = new <classname>();
        CloudStorage obj = new CloudStorage();
        obj.accept();
        obj.calculate();
        obj.display();
        
        
        
        
    }
}
