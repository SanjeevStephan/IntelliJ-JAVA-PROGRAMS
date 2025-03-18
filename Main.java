import class_ix.Chapters_of_Class_IX;
import class_ix.ExecutePrograms;
import class_ix.chapter_7.Chapter_Seven_ProgramMenu;
import class_ix.chapter_8.Chapter_Eight_ProgramMenu;
import class_x.Chapters_of_Class_X;
import stephanware.DisplayFiglet;
import java.util.Arrays;
import java.util.stream.Stream;
public class Main {

    public static void main(String[] args) {

        DisplayFiglet figlet = new DisplayFiglet();

        Chapter_Seven_ProgramMenu chapter_seven_programMenu = new Chapter_Seven_ProgramMenu();
        Chapter_Eight_ProgramMenu chapter_eight_programMenu = new Chapter_Eight_ProgramMenu();
        MainMenu menu = new MainMenu();
        figlet.ShowCustomFiglet("java_programs");
        System.out.println("=========================================================================================");
        figlet.ShowCustomFiglet("chapter-7");
        menu.DisplayMenu(7,chapter_seven_programMenu.program_list, chapter_seven_programMenu.available_status);
        figlet.ShowCustomFiglet("chapter-8");
        menu.DisplayMenu(8,chapter_eight_programMenu.program_list, chapter_eight_programMenu.available_status);

        ExecutePrograms executePrograms = new ExecutePrograms();



    }

}
