package spiralNotes.java.basic;

public class JavaDoWhileLoop {

    static void countUpto20()
    {
        int x = 10;
        do
        {
            System.out.println("The Value of X : " + x);
            x++;
        } while(x < 20);
    }


    public static void main(String[] args) {
        countUpto20();
    }

}
