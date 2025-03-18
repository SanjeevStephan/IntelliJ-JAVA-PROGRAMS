package class_ix.chapter_8;


import java.util.Scanner;

public class Chapter_Eight_ProgramMenu {

    int chapter_no = 7;
    String chapter_title = "Conditional Constructs in Java";
    int program_num;
    public String[] program_list = {
            "Print the natural number from 1 to 10 using for Loop.",
            "Print the even natural numbers from 1 to 10 using loop'.",
            "Print the numbers from 10 to 1 in reverse order using for Loop",
            "Find the sum of numbers from 1 to 10",
            "Display the table of a number entered by the user",
            "Input the positive numbers from the user and find their sum.",
            "check the greater number among the three.",
            "input the day number and print the name of the day using switch-case",
            "input the month number and print the number of days in the month.",
            "Input a Letter and check whether it is an uppercase vowel, a lowercase vowel, or not a vowel",
    };

    public boolean[] available_status = {
            true,  //Program-1
            true,  //Program-2
            true,  //Program-3
            true,  //Program-4
            false,  //Program-5
            false,  //Program-6
            false,   //Program-7
            false,   //Program-8
            false,  //Program-9
            false,  //Program-10

    };

    public String[] GetChapter_Eight_ProgramMenu() {
        return program_list;
    }


}
