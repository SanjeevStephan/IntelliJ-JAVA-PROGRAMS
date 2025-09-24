package myPrograms.file;


/**
 * Write a description of class myVariables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myVariables
{
    // instance variables - replace the example below with your own
    private int x;
    private String file_location;
    private String samplefile;
    /**
     * Constructor for objects of class myVariables
     */
    public myVariables()
    {
        // initialise instance variables
        file_location = "Texts/";
        samplefile = "test.txt";
    }

    public String getFileLocation(){ return file_location; }
    public String getSamplefile()  { return samplefile ; }
    public String getFilewithLocation() { return file_location + samplefile ; }
   
}
