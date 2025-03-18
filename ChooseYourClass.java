import class_ix.Chapters_of_Class_IX;
import class_x.Chapters_of_Class_X;
import stephanware.DisplayFiglet;

public class ChooseYourClass {


    public ChooseYourClass()
    {
        DisplayFiglet figlet = new DisplayFiglet();

        Chapters_of_Class_IX chapters_of_class_ix = new Chapters_of_Class_IX();
        Chapters_of_Class_X chapters_of_class_x   = new Chapters_of_Class_X();

        MainMenu menu = new MainMenu();
        figlet.ShowCustomFiglet("class_ix");
        menu.DisplayChapters(chapters_of_class_ix.chapters,chapters_of_class_ix.available_status);
        // menu.ChapterMenu();
        figlet.ShowCustomFiglet("class_x");
        menu.DisplayChapters(chapters_of_class_x.chapters,chapters_of_class_x.available_status);
        menu.ChapterMenu();

    }

}
