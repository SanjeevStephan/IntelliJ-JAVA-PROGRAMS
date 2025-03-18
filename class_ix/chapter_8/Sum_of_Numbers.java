package class_ix.chapter_8;

public class Sum_of_Numbers {

    public Sum_of_Numbers()
    {
        int num = 1;
        int sum = 0;
        int max = 10;
        while(num <= max)
        {
            sum = sum + num;
            num++;
        }
        System.out.println(" SUM of Numbers ( 1 - " + max + " ) = " + sum);
    }
}
