package spiralNotes.codes;

public class CheckAge {
    static void passIntToCheckAge(int age) {
        // if age is less than 18, print "access denied"
        if(age < 18) {
            System.out.println("Access Denied : You are Not Old Enough");
        }
        else {
            System.out.println("Access Granted - You are Old Enough");
        }
    }
}
