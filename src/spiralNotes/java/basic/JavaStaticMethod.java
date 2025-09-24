package spiralNotes.java.basic;

public class JavaStaticMethod {
    static void myMethod() {
        System.out.println("I just got Executed ");
    }
    void myMethodWithoutStatic() {
        System.out.println("I can only be accessed using the object of the class");
    }

    public static void main(String[] args) {
        myMethod();

        // Creating an object / instance of the class JavaStaticMethod
        JavaStaticMethod staticMethod = new JavaStaticMethod();
        staticMethod.myMethodWithoutStatic();
        // myMethodWithoutStatic();  this method cannot be called without an instance of the class
    }
}
