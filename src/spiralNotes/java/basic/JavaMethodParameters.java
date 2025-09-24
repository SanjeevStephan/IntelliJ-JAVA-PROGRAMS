package spiralNotes.java.basic;

public class JavaMethodParameters {
    static void myMethod(String fname) {
        System.out.println("Hello ! " + fname);
    }

    public static void main(String[] args) {
        myMethod("Sanjeev");
        myMethod("Stephan");
    }
}
