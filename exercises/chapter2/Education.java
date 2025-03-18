package exercises.chapter2;

public class Education {
    public void teach1()
    {
        String school = "St.Thomas School";
        String address = "Agaimore";
        String board  = "ICSE";
        System.out.println("School Name : " + school);
        System.out.println("Address : " + address);
        System.out.println("Board : " + board);
    }
    public void teach2 ()
    {
        System.out.println("Number of Students : " + 550);
        System.out.println("Number of Teachers : " + 20);
    }
    public static void main(String[] args)
    {
        Education edu = new Education();
        edu.teach1();
        edu.teach2();
    }

}
