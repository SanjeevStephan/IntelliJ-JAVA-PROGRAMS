package myPrograms.file;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class ReadFileUsingFileReader here.
 * 
 * FileReader reads the contents of a file as a stream of characters. It is suitable for reading text files.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFileUsingFileReader
{
 
    /**
     * Constructor for objects of class ReadFileUsingFileReader
     */
    public ReadFileUsingFileReader(String filename) throws IOException
    {
       //myVariables myvar = new myVariables();
       //String file_location = myvar.getFileLocation();
       //myvar.getFilewithLocation()    
       try(FileReader reader = new FileReader(filename)) 
       {
           int data;
           while(( data = reader.read()) != -1 )
           {
               System.out.print((char) data);
           }
       }
    }


}
