package spiralNotes.java.basic;

public class JavaMethodReturn {
    static String hello(String name) {
        // this method returns the String
        String msg = "Hello! " + name;
        return msg;
    }
    static String numberPassed(int num){
        return "You have passed an Integer : " + num;
    }
    static int addTheseNumbers(int x, int y) {
        // this method returns the sum of two numbers
        int sum = x + y;
        return sum;
    }
    static int multiplyTheseNumbers(int x, int y) {
        return x * y;
    }
    public static void main(String[] args)
    {
             //case : 1 - You can also directly call the method() inside another method()
        System.out.println(hello("Stephan"));
        System.out.println(numberPassed(126));
        //Case : 2 - You can store the result in a variable and then print it
        int result = addTheseNumbers(5, 3);
        System.out.println("The Result is " + result);
        //Case : 3 - You can concat the string with the method()
        System.out.println("The Multiplication Result is : " + multiplyTheseNumbers(7, 8));

    }
}
