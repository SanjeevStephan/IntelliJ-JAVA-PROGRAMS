package spiralNotes.codes;

public class StaircaseInJava {

    static void CleanAndDrySteps()
    {
        System.out.println("----[ Clean & Dry Staircase ]-----");
        System.out.println("----[ Going Up the Staircase ]-----");
        for( int step = 1; step <= 5; step++) // 5-step staircase
        {
            System.out.println("Stepping on step " + step);  // normal steps
        }
        System.out.println("Safely reached the top!");
    }

    static void WetAndSlipperySteps()
    {
        System.out.println("----[ Wet & Slippery Staircase ]-----");
        System.out.println("----[ Coming down the Staircase ]-----");
        for( int step = 5; step >= 1 ; step--)  // 5-step staircase
        {
            if(step == 4 || step == 2)   // Wet steps to avoid
            {
                System.out.println("Step " + step + " is wet! Skipping");
                continue;  // skip this step
            }
            System.out.println("Stepping on step " + step); // Dry steps
        }
        System.out.println("Safely reached the floor");
    }

    public static void main(String[] args) {
        CleanAndDrySteps();
        WetAndSlipperySteps();
    }
}
