package myPrograms.file;
import java.util.Scanner;
//

import java.io.IOException;

/**
 * Write a description of class ReadFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFile
{

    public String[] programs_to_readfile = 
    {
      "ReadFile using 'FileReader'      - for simple character-by-character reading.",
      "ReadFile using 'BufferedReader'  - for efficient line-by-line reading.",
      "ReadFile using 'Scanner'         - for parsing different data types."
    };
    public ReadFile() throws IOException
    {
        
       myVariables myvar = new myVariables();
       String file_location = myvar.getFileLocation();
       String filename = myvar.getFilewithLocation() ;
       
       
//        ProgramMenuList menulist = new ProgramMenuList();
//        menulist.DisplayProgramList("Programs to ReadFile",programs_to_readfile);
        
        Scanner scanner = new Scanner(System.in);
        int choice;
       do 
       {
           
        System.out.println("\n Enter Your Option (1-4) | (0) to Exit : ");
        choice = scanner.nextInt();
        
            switch(choice)
        {
            case 1 : 
                System.out.println("=> ReadFile using FileReader");
                ReadFileUsingFileReader readusingReader = new ReadFileUsingFileReader(filename);
                break;
            case 2 : 
                System.out.println("=> ReadFile using BufferedReader");
                ReadFileUsingBufferedReader readusingBufferedReader = new ReadFileUsingBufferedReader(filename);
                break;
            case 3 : 
                System.out.println("=> ReadFile using Scanner");
                System.out.println("==> Reading File : 'test.txt' ");
                ReadFileUsingScanner readusingScanner = new ReadFileUsingScanner(filename);
                break;
            default:
                System.out.println("\n Wrong Option Entered");
                System.out.println("Exiting Now");
        }
       }
       while(choice != 0);
       
        
        
        
        
    }

}
