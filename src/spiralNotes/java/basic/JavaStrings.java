package spiralNotes.java.basic;

public class JavaStrings {
    public static void main(String[] args) {
        // Strings Variable
        String greeting = "hello";
        System.out.println(greeting); // Outputs : hello
        
        // Get String's Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The Length of the 'txt' String is : " + txt.length()); // Outputs : The Length of the 'txt' String is : 26
        
        // Find a Character in a String
        String locateText = "Please locate where 'locate' occurs";
        System.out.println(locateText.indexOf("locate"));  // Outputs : 7
        
        // String Concatenation
        String firstName = "Sanjeev";
        String middleName = "Stephan ";
        String lastName = "Murmu";
        System.out.println(firstName + " " + lastName);
        
        // String concat() Method
        String fullName = firstName.concat( middleName.concat(lastName) );
        System.out.println(fullName);
    }
}
