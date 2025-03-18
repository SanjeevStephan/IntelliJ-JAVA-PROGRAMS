import class_ix.chapter_7.Chapter_Seven_ProgramMenu;
import class_ix.chapter_7.Display_Pass_or_Fail;
import class_ix.chapter_7.Larger_of_the_two;
import class_ix.chapter_8.Chapter_Eight_ProgramMenu;

import java.util.Scanner;

public class MainMenu {

    int program_num ;

    public void DisplayChapters(String[] chapters_list,boolean[] available_status_list) {
        for(int i = 0; i < chapters_list.length; i++) {
            System.out.println("[" + (i+1) + "] " + chapters_list[i] + " => " + IsAvailable(available_status_list[i]));
        }
    }

    public String IsAvailable(boolean status_code)
    {
        if(status_code) { return "[AVAILABLE]"; }
        else { return "[NOT-AVAILABLE]"; }
    }

    public void ChapterMenu() {

        MainMenu menu = new MainMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease Enter Chapter Number : ");
        int choice = scanner.nextInt();

        switch(choice)
        {
            case 7 :
                Chapter_Seven_ProgramMenu chapter_seven = new Chapter_Seven_ProgramMenu();
                menu.DisplayMenu(7,chapter_seven.GetChapter_Seven_ProgramMenu(), chapter_seven.available_status);
//                menu.DidProgramRanSuccessfully(chapter_seven.Execute_SevenProgram());
                break;
            case 8 :
                Chapter_Eight_ProgramMenu chapter_eight = new Chapter_Eight_ProgramMenu();
                menu.DisplayMenu(8,chapter_eight.GetChapter_Eight_ProgramMenu(), chapter_eight.available_status);
//                menu.DidProgramRanSuccessfully(chapter_eight.Execute_EightProgram());
                break;
            default : System.out.println("No Such Option! Found");
        }

    }

    public void DisplayMenu(int chapter_no,String[] list, boolean[] available_status)
    {
//        int initial_value = chapter_no ;
//        int initial_num = Integer.parseInt(initial_value);

        int total_length = list.length;
//        System.out.println("==========================================")
        for (int i = 0;i < total_length ; i++) {
            System.out.println(" -> "+ chapter_no + "-" +(i+1) + ". " + list[i] + " => " + IsAvailable(available_status[i]));
        }
//        System.out.println("==========================================");

    }

    public void DidProgramRanSuccessfully(boolean check_program) {
        if (check_program) {
            System.out.print("[SUCCESS] Program Ran Successfully");
        } else {
            System.out.println("[FAILED] Program Failed to Run! Check Program Logs");
        }
    }

}
