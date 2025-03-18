import java.util.Scanner;

public class Hello {
    public Hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();
    }
}