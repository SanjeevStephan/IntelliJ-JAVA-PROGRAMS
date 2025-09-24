package myPrograms.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a description of class ReadFromFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFromFile
{

    /**
     * Constructor for objects of class ReadFromFile
     */
    public ReadFromFile(String fileLocation)
    {
     
        myVariables myvar = new myVariables();
        try
        {
//            File file = new File(myvar.getFilewithLocation());
            File file = new File(fileLocation);
            Scanner scanner = new Scanner(file);
            while( scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch(FileNotFoundException e) { System.out.println("File Not Found."); }
    }


}
