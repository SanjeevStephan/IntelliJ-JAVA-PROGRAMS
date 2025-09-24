package myPrograms.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a description of class ReadFileUsingScanner here.
 *
 * 'Scanner' is useful for reading files and parsing different types of data.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFileUsingScanner
{
  public ReadFileUsingScanner(String filename)
  {
      //myVariables myvar = new myVariables();
      //String file_location = myvar.getFileLocation() + filename;
      
      try(Scanner scanner = new Scanner(new File(filename))) {
          while(scanner.hasNextLine()) {
              System.out.println(scanner.nextLine());
          }
      } catch(FileNotFoundException e) {
          System.out.println("File Not Found");
      }
  }
  
  
  
}

