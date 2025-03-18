package class_ix.chapter_7;

import stephanware.Bookmark;

import java.util.Scanner;

public class Display_Pass_or_Fail {

    String program_title = "A Program to input the marks obtained by a student and print 'Pass' or 'Fail'.";

    public Display_Pass_or_Fail()
    {
        Chapter_Seven_ProgramMenu chapter_seven = new Chapter_Seven_ProgramMenu();

        //Bookmarking Program Details
        Bookmark bookmark = new Bookmark(chapter_seven.chapter_no,2,128,chapter_seven.chapter_title,program_title);
        bookmark.ShowProgramDetails();
        bookmark.StartBanner();
        // The Actual Program Code
        Scanner scanner = new Scanner(System.in);
        int marks, pass_marks = 35;
        System.out.print("\nEnter Your Marks : ");
        marks = scanner.nextInt();

        if(marks > pass_marks) {
          System.out.println("You have Passed.Congratulation");
        }
        else {
            System.out.println("You have Failed.Sorry Try Again! Next Time");
        }

        scanner.close();

        bookmark.EndBanner();

    }

}
