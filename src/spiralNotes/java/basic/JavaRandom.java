package spiralNotes.java.basic;

public class JavaRandom {
    static  void generateRandomNum()
    {
        int randomNum = (int) (Math.random() * 10) + 1;
        System.out.println("Random Number Generated : " + randomNum );
    }

    public static void main(String[] args) {
        generateRandomNum();
        generateRandomNum();
    }
}
