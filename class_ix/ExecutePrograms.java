package class_ix;

import class_ix.chapter_7.Calculate_profit_loss_percent;
import class_ix.chapter_7.Display_Pass_or_Fail;
import class_ix.chapter_7.Larger_of_the_two;
import class_ix.chapter_8.Even_Natural_Numbers;
import class_ix.chapter_8.Natural_Numbers;
import class_ix.chapter_8.Reverse_Natural_Numbers;
import class_ix.chapter_8.Sum_of_Numbers;

import java.util.Scanner;

public class ExecutePrograms {
    String program_num;

    public ExecutePrograms() {
//    int Total_program_length = program_list.length;
        Scanner scanner = new Scanner(System.in);
//    System.out.print("\nPlease! Enter the program number (1 : " + Total_program_length + ") | 0 to Exit : ");
        System.out.print("\nPlease! Enter the program number (i.e 7-1,8-1 & so on.) | 0 to Exit : ");

        while(true) {
            program_num = scanner.next();

                switch (program_num) {

                    case "8-1" : Natural_Numbers program_8_1 = new Natural_Numbers(); break;
                    case "8-2" : Even_Natural_Numbers program_8_2 = new Even_Natural_Numbers(); break;
                    case "8-3" : Reverse_Natural_Numbers program_8_3 = new Reverse_Natural_Numbers(); break;
                    case "8-4" : Sum_of_Numbers program_8_4 = new Sum_of_Numbers(); break;
                    case "7-1" : Larger_of_the_two program_7_1 = new Larger_of_the_two(); break;
                    case "7-2" : Display_Pass_or_Fail program_2 = new Display_Pass_or_Fail(); break;
                    case "7-3" : Calculate_profit_loss_percent program_7_3 = new Calculate_profit_loss_percent(); break;

                    default : {
                        System.out.println("[INVALID] No Such Program Number Found ! Try Again ");
                        System.exit(0);
                        break;
//                        return false;
                    }

                }

        }

    }

}