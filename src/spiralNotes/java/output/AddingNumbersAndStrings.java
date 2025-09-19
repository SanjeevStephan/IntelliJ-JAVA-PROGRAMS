package spiralNotes.java.output;

public class AddingNumbersAndStrings {

    int AddingTwoNumbers() {
        // I - Adding Two Numbers Together
        int x = 10;
        int y = 20;
        return x + y;
    }
    String AddingTwoStrings() {
        // II - Adding Two Strings Together
        String x = "10";
        String y = "20";
        return x + y;
    }
    String AddingNumberAndString() {
        // III - Adding A Number and a String
        int x = 10;
        String y = "20";
        return x + y;
    }

    public static void main(String[] args) {
        AddingNumbersAndStrings x_plus_y = new AddingNumbersAndStrings();
        System.out.println("Adding Two Numbers : " + x_plus_y.AddingTwoNumbers());
        System.out.println("Adding Two Strings : " + x_plus_y.AddingTwoStrings());
        System.out.println("Adding A Number and a String : " + x_plus_y.AddingNumberAndString());
    }
}
