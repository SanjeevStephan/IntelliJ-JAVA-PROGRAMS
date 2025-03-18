package class_ix.chapter_5;

import java.util.Scanner;

public class Find_Area_and_Perimeter_of_Rectangle {

    public Find_Area_and_Perimeter_of_Rectangle()
    {
        Scanner scanner = new Scanner(System.in);
        int length, breadth, area, perimeter;
        System.out.println("Enter the Length : " );
        length = scanner.nextInt();
        System.out.println("Enter the Breadth : ");
        breadth = scanner.nextInt();
        area = length * breadth;
        System.out.println("Area of The Rectangle : " + area);
        perimeter = 2*(length + breadth);  // 2 x (length + breadth)
        System.out.println("Perimeter of the Rectangle : " + perimeter);
    }
}
