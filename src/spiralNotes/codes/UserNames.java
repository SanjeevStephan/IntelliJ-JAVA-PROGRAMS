package spiralNotes.codes;

import java.util.Scanner;

public class UserNames {

    static String askUsername() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Username :");
        return input.next();
    }

    static int askPassword() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Password :");
        return input.nextInt();
    }

    static void verifyPassword(String username,int password)
    {

        String msg = "";
        if(askPassword() == password)
            msg = "Welcome! " + username + "! How are you";
        else
            msg = "Invalid Password";

        System.out.println(msg);

    }
    static void verifyUsername(String username)
    {
        String msg = "";
        switch(username.toLowerCase())
        {
            case "albert":
                verifyPassword("albert", 1234);
                break;
            case "stephan" :
                verifyPassword("stephan",5678 );
                break;
            default :
                msg = "Invalid Username";
                break;
        }

        System.out.println(msg);
    }

    public static void main(String[] args) {

        verifyUsername(askUsername());

    }
}
