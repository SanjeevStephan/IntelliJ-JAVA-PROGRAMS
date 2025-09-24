package spiralNotes.java.basic;

class Student {
    String name;
    int rollno;

    Student(String studName)
    {
        name = studName;
        System.out.println("Added new STS.sir.stephan.Student : " + name);
    }

}

public class JavaConstructor {

    public static void main(String[] args) {

        // creating instance object of the class "STS.sir.stephan.Student"
        Student stud1 = new Student("Sanjeev");  // passing the value directly inside a method
        Student stud2 = new Student("Stephan");

        stud1.rollno = 12;
        stud2.rollno = 15;

        System.out.println(stud1.name + " is assigned rollno " + stud1.rollno);
        System.out.println(stud2.name + " is assigned rollno " + stud2.rollno);


    }

}
