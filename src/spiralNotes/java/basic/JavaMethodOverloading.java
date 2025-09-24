package spiralNotes.java.basic;

public class JavaMethodOverloading {
    static int plusMethod(int x, int y)
    {
        return x + y;
    }
    static double plusMethod(double x, double y)
    {
        return x + y;
    }
    static String plusMethod(String a, String b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        int myNum1 = plusMethod(4, 8);
        double myNum2 = plusMethod(12.6, 18.5);
        String myNum3 = plusMethod("9", "8");

        System.out.println("int : " + myNum1);
        System.out.println("double : " + myNum2);
        System.out.println("String : " + myNum3);
    }
}
