package spiralNotes.codes;

public class Student {
    String name;
    int rollno;
    char gender ; // use 'm' for male and 'f' female
    double height;// height (in inch)

    Student()
    {
        System.out.println("Class Constructor is called");
    }

    void display()
    {
        System.out.println("Name of STS.sir.stephan.Student : " + name);
        System.out.println("Roll no : " + rollno);
        System.out.println("Gender : " + gender);
        System.out.println("Height : " + height);

    }

    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.name = "Newton";
        stud1.rollno = 1;
        stud1.gender = 'M';
        stud1.height = 5.6;
        stud1.display();

    }

}
