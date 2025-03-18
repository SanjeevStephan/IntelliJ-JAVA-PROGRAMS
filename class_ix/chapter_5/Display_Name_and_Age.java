package class_ix.chapter_5;

import java.util.Scanner;

public class Display_Name_and_Age {

    public Display_Name_and_Age()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter The Name of Student : ");
        String name = scanner.nextLine(); // Use nextline() for sentences and next() for word only
        System.out.print("\nEnter The Age of Student : ");
        int age = scanner.nextInt();
        String message_to_print = "My Name is " + name + " \nI am " + age + " year old";
        System.out.println(message_to_print);
//        System.out.println("Name : " + name + " | Age : " + age);

        scanner.close();
    }

    public static void main(String[] args)
    {
        Display_Name_and_Age displayNameAndAge = new Display_Name_and_Age();
    }

}
