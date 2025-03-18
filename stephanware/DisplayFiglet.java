package stephanware;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFiglet {

    String currentPath;
    String figletDirectory;
    public DisplayFiglet()
    {
//        String filename = "chapters";
        currentPath = System.getProperty("user.dir");
        figletDirectory = currentPath + "\\stephanware\\figlets\\" ;
    }
    public void ShowCustomFiglet(String filename)
    {
        File txtfile = new File(figletDirectory + filename);
        String absolutePath = txtfile.getAbsolutePath();
//        System.out.println("Absolute Path : " + absolutePath);

        try(BufferedReader br = new BufferedReader(new FileReader(absolutePath)))
        {
            String line;
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Error Reading File : " + e.getMessage());
        }
    }
}


