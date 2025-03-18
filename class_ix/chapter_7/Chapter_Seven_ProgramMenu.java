package class_ix.chapter_7;

import java.util.Scanner;

public class Chapter_Seven_ProgramMenu {

    int chapter_no = 7;
    String chapter_title = "Conditional Constructs in Java";
    int program_num;
    public String[] program_list = {
            "Program that accepts two numbers and prints the larger of the two.",
            "Input Marks obtained by a student and print either 'Pass' or 'Fail'.",
            "input the cost price and selling price and calculate the profit or loss per cent.",
            "input the marks obtained by a student and print his grade according to the criteria:",
            "input the purchase amount and find the gift that the customer gets accordingly",
            "input month number and print the name of the month accordingly",
            "check the greater number among the three.",
            "input the day number and print the name of the day using switch-case",
            "input the month number and print the number of days in the month.",
            "Input a Letter and check whether it is an uppercase vowel, a lowercase vowel, or not a vowel",
    };
     public  boolean[] available_status = {
            true,  //Program-1
            true,  //Program-2
            true,  //Program-3
            false,  //Program-4
            false,  //Program-5
            false,  //Program-6
            false,   //Program-7
            false,   //Program-8
            false,  //Program-9
            false,  //Program-10

    };
    public String[] GetChapter_Seven_ProgramMenu() {
        System.out.println("======================[ Chapter - " + chapter_no + " | " + chapter_title + " ]=========================");
        return program_list;
    }



}
