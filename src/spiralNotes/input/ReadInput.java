package spiralNotes.input;

/**
 * Write a description of class ReadInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class ReadInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask user to enter their username 
        System.out.println("Enter Username : " );  
        String userName = input.nextLine();  // Read userinput
        // Display the username on the screen
        System.out.println("Username :  " + userName);
        
        
        
    }
}
