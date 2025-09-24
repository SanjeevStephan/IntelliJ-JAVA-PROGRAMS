package STS.sir.stephan.labwork.forexplanation;

public class Staircase {


    static void CleanAndDrySteps()
    {
        System.out.println("----[ Clean & Dry Staircase ]----------");
        System.out.println("----[ Going up Staircase ]----------");

        for(int step=1; step <=5; step++)
        {
            System.out.println("Stepping on Step : " + step);
        }
        System.out.println("Safely Reached the Top");
    }

    static void WetAndSlipperySteps()
    {
        System.out.println("----[ Wet & Slippery Staircase ]----------");
        System.out.println("----[ Going Down Staircase ]----------");

        for(int step=5; step >=1; step--)
        {
            if (step == 3)
            {
                System.out.println("[SKIPPED] Step " + step + " is Wet! Skipping");
                continue; // skip this step
            }
            System.out.println("Stepping on Step : " + step);
        }
        System.out.println("Safely Reached the Down");
    }

    public static void main(String[] args)
    {
//        System.out.println("Step 1 ");
//        System.out.println("Step 2 ");
//        System.out.println("Step 3 ");
//        System.out.println("Step 4 ");
//        System.out.println("Step 5 ");
//        System.out.println("Step 6 ");

        CleanAndDrySteps();
//        WetAndSlipperySteps();




    }
}
