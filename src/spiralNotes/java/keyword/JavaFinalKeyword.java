package spiralNotes.java.keyword;

public class JavaFinalKeyword {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args)
    {
        JavaFinalKeyword myObj = new JavaFinalKeyword();
//        myObj.x = 50 ;  // will generate an error : cannot assign a value to a final variable
//        myObj.PI = 4.1; // will generate an error : cannot assign a value to a final variable
        System.out.println("The Value of x : " + myObj.PI);
        System.out.println("The Value of PI : " + myObj.PI);
    }
}
