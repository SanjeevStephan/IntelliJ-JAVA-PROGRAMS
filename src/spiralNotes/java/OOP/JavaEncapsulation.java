package spiralNotes.java.OOP;


public class JavaEncapsulation {
    public static void main(String[] args)
    {
        Person myObj = new Person();
        // Trying to access the private variable

//         myObj.name = "Stephan";  // error
//         System.out.println(myObj.name);

        // Accessing the private variable using public getter & setter
        myObj.setName("Emily");
        System.out.println("Name : " + myObj.getName());
    }
}
