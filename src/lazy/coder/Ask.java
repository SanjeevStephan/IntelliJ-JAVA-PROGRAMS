package lazy.coder;

import java.util.Scanner;
public class Ask {

    public static int[] ForInput(int no_of_times_to_ask,String questionToAsk)
    {
        Scanner input = new Scanner(System.in);

        int numbers[] = new int[no_of_times_to_ask];
        for(int i = 0 ; i < no_of_times_to_ask ; i++)
        {
            System.out.print("[" + i + " ] " + questionToAsk + " : ");
            numbers[i] = input.nextInt();
        }

        return numbers;
    }
}
