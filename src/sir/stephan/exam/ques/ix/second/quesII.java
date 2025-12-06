package sir.stephan.exam.ques.ix.second;

public class quesII {

    public static void main(String[] args) {

        int m = 1, n = 5, p = 4;

        if (m==0)
        {
            m = m + 1;
            System.out.println(m);

            if((m==1) && (n!=p))
            {
                System.out.println("m * n : " + m*n);
                System.out.println("n % p : " + n % p);
            }
        }
        else
        {
            if((m!=n) || (n==p))
            {
                System.out.println("m + n : " + (m+n));
                System.out.println("m - n : " + (m-n));
            }
        }

    }

}
