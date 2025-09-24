package spiralNotes.java.basic;



public class JavaTypeCasting {

    void ImplicitCasting() {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("=====[ Implicit Casting ]========");
        System.out.println("myInt : " + myInt);
        System.out.println("myDouble : " + myDouble);
    }
    void ExplicitCasting() {
        double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println("=========[ Explicit Casting ]=========");
        System.out.println("myDouble : " + myDouble);
        System.out.println("myInt : " + myInt);
    }
    public static void main(String[] args) {
        JavaTypeCasting typeCasting = new JavaTypeCasting();
        typeCasting.ImplicitCasting();
        typeCasting.ExplicitCasting();
    }
}
