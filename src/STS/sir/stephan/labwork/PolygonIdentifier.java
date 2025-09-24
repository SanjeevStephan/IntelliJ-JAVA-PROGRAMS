package STS.sir.stephan.labwork;

/*
    Program Title : PolygonI
    Created On : 24th-Sep-2025
    Author : Sanjeev Stephan Murmu
 */

import java.util.Scanner;
import lazy.coder.Header;

public class PolygonIdentifier {


    static void FindPolygon(int sides)
    {
        if (sides < 3)
        {
            System.out.println("Not a Polygon. \nA Polygon must have at least 3 sides");
        }

        String polygonType = switch (sides) {
            case 3 -> "Triangle";
            case 4 -> "Square";
            case 5 -> "Pentagon";
            case 6 -> "Hexagon";
            case 7 -> "Heptagon";
            case 8 -> "Octagon";
            case 9 -> "Nonagon";
            case 10 -> "Decagon";
            default -> "Polygon With " + sides + " sides";
        };

        System.out.println("Polygon Type : " + polygonType);
        System.out.println("Number of Sides : " + sides);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Header.DisplayTopography("find-polygon");

        for(int i = 10; i > 1; i--)
        {
            System.out.print("[" + i + "]Enter the Number of Sides : ");
            int sides = input.nextInt();
            FindPolygon(sides);
        }

    }

}
