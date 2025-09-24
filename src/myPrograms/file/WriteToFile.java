package myPrograms.file;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Write a description of class WriteToFileUsingFileWriter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteToFile
{

   public static void main(String args[])
{
    String filename = "exampletoday.txt";
    String message;
    Scanner scanner = new Scanner(System.in);
    System.out.println("=> Enter Filename : ");
    filename = scanner.nextLine();
    System.out.println("=> Enter the Message : ");
    message = scanner.nextLine();
    
    try(FileWriter writer = new FileWriter(filename)) {
        String content = "Hello, World";
        writer.write(message);
        writer.close();
        System.out.println("Successfully Wrote to the File : " + filename );
    } catch(IOException e)
    {
        System.out.println("File not found.");
    }
}
    
}
