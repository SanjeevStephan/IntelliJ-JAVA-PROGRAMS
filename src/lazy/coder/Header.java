package lazy.coder;

import myPrograms.file.ReadFromFile;

public class Header {

   static String path = Path.getTypography(Data.TYPOGRAPHY);
   public static void DisplayTopography(String fileName)
    {
        ReadFromFile rf = new ReadFromFile(path + fileName);
    }

    public static void title(String title)
    {
        System.out.println("          Program Title : " + title);
    }

    public static void sign(String date)
    {
        System.out.println("          Created On    : " + date);
        System.out.println("          Code Author   : " + Data.name);
    }

}
