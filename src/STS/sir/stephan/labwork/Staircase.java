package STS.sir.stephan.labwork;


/**
 * Write a description of class Staircase here.
 *
 * @author (Sanjeev Stephan Murmu)
 * @version (22-Sep-2025)
 */
public class Staircase
{
    
    static void CleanAndDryStaircase()
    {
                
        System.out.println("------[ Going up the Staircase ]-------");
        
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Stepping in Step :" + i);
        }
        
    }
    
    
    static void WetAndSlipperyStaircase()
    {
          System.out.println("------[ Coming Down the Staircase ]-------");
          
          for(int i = 5; i >= 1; i--)
          {
              System.out.println("Stepping in Step :" + i);
              if(i == 4 || i == 2)
              {
                 System.out.println(" Skipping Step 4 & 2 ");
                 continue;
              }

          }
    }
    
    
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        
        CleanAndDryStaircase();
        WetAndSlipperyStaircase();
        
    }
}
