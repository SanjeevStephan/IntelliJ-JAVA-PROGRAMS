package class_ix.chapter_5;

import java.util.Scanner;

public class Input_and_Display_Sentence_and_word {

    public Input_and_Display_Sentence_and_word()
    {
        Scanner scanner = new Scanner(System.in);
        String word, sentence ;
        System.out.print("\nEnter a Sentence : ");
        sentence = scanner.nextLine();
        System.out.print("\nEnter a Word : ");
        word = scanner.next();

        System.out.println("Sentence Entered : " + sentence);
        System.out.println("Word Entered : " + word);
    }

}
