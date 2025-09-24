package myPrograms.file;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Write a description of class ReadFileUsingBufferedReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFileUsingBufferedReader
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ReadFileUsingBufferedReader
     */
    public ReadFileUsingBufferedReader(String filename) throws IOException
    {
        // initialise instance variables
        //myVariables myvar = new myVariables();
        // myvar.getFilewithLocation()
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while(( line = reader.readLine())  != null )
            {
                System.out.println(line);
            }
        }
    }


}
