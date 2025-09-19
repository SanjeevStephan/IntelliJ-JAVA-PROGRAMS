package spiralNotes.java.keyword;

public class JavaThisKeyword {
    int num;
    //int numWithoutThis;

    // Constructor with a parameter
    public JavaThisKeyword(int num, int numWithoutThis) {
        this.num = num;
      //  numWithoutThis = numWithoutThis;
    }

    // Call the constructor.
    public static void main(String[] args) {
        JavaThisKeyword myObj = new JavaThisKeyword(12, 18);
        System.out.println("Value of num = " + myObj.num);
        //System.out.println("Value of a Variable (without using this keyword) = " + myObj.numWithoutThis);

    }
}
