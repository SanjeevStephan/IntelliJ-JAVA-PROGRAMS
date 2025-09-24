package spiralNotes.java.basic;

public class JavaMath {

    public static void main(String[] args) {
        double a = 9.5, b = -3.7, c = 2.0;
        int x = 10, y = -5;
        double angle = Math.toRadians(45); // Convert 45 degrees to radians


        // Basic Operations
        System.out.println("Math.abs(" + b + ") = " + Math.abs(b));
        System.out.println("Math.max(" + x + ',' + y + ") = " + Math.max(x, y));
        System.out.println("Math.min(" + x + ',' + y + ") = " + Math.min(x, y));

        // Power and root functions
        System.out.println("Math.pow(" + c + ", 3) = " + Math.pow(c, 3));
        System.out.println("Math.sqrt(" + 25 + ") = " + Math.sqrt(25));
        System.out.println("Math.cbrt(" + 64 + ") = " + Math.cbrt(64));

        // Rounding Methods
        System.out.println("Math.ceil(" + a + ") = " + Math.ceil(a));
        System.out.println("Math.floor(" + a + ") = " + Math.floor(a));
        System.out.println("Math.round(" + a + ") = " + Math.round(a));

        // Trigonometric functions
//        System.out.printf("\n Math.sin(angle) = %.2f", Math.sin(angle));
//        System.out.printf("\n Math.cos(angle) = %.2f", Math.cos(angle));
//        System.out.printf("\n Math.tan(angle) = %.2f", Math.tan(angle));
//
//        // Degree-Radian conversion
//        System.out.println();
//        System.out.println("Math.toDegrees(angle) = " + Math.toDegrees(angle));
//        System.out.println("Math.toRadians(180) = " + Math.toRadians(180));

    }
}
