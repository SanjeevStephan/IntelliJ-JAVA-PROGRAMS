package class_ix.chapter_5;

import javax.xml.namespace.QName;

public class Pass_Parameter_to_Method {

    public static void Greetings(String name)
    {
        System.out.println("Hi !! " + name);
    }

    public static void main(String[] args)
    {
        Greetings("Albert");
        Greetings("Bruce");
        Greetings("Candace");
        Greetings("David");
        Greetings("Elvin");
    }

}
