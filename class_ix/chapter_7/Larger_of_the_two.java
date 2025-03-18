package class_ix.chapter_7;

import stephanware.Bookmark;

import java.util.Scanner;
import java.lang.System;

public class Larger_of_the_two {

    String program_title = "A Program that accepts two numbers and prints the larger of the two";

    public Larger_of_the_two() 
    {
        Chapter_Seven_ProgramMenu chapter_seven = new Chapter_Seven_ProgramMenu();

        // Bookmarking the Computer Program Detail
        Bookmark bookmark = new Bookmark(chapter_seven.chapter_no,1,127, chapter_seven.chapter_title, program_title);
        bookmark.ShowProgramDetails();

        bookmark.StartBanner();
        // The Actual Program Code
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("\nEnter First Number : ");
        a = scanner.nextInt();
        System.out.print("\nEnter Second Number : ");
        b = scanner.nextInt();

        if (a > b ) {
            System.out.println("Larger Number is : " + a );
        }
        else {
            System.out.println("Larger Number is : " + b);
        }

        scanner.close();

        bookmark.EndBanner();


    }



    
}