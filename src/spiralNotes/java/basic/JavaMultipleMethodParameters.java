package spiralNotes.java.basic;

public class JavaMultipleMethodParameters 
{
    static void myMethod(String fname, int age) 
    {
        System.out.println(fname + " is " + age + " year old");
    }
    
    public static void main(String[] args) {
        myMethod("Adam",20);
        myMethod("Jenny", 18);
    }
}
