package Student.stephan.labwork;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Student
{
    // Class Data-Members 
    String name;
    String classname;
    int rollno;
        
    void displayInfo()
    {
        String msg = name + " is Studying in class " + classname + " and has a rollno " + rollno;
        System.out.println(msg);
        
      // Display Information
       System.out.println("Student Name : " + name);
       System.out.println("Student Class : " + classname);
       System.out.println("Student Rollno : " + rollno);
    }
    void reading()
    {
        System.out.println(name  + " is reading now ");
    }
    void writing()
    {
        System.out.println(name + " is writing now");
    }
    void sleeping()
    {
        System.out.println(name + " is Sleeping now");
    }

    public static void main(String[] args)
    {
        
        // Student Data 1
        Student stud1 = new Student();
        stud1.name = "Adam";
        stud1.classname = "IX";
        stud1.rollno = 1;
        stud1.displayInfo();
        stud1.reading();


        // Student Data 2
        Student stud2 = new Student();
        stud2.name = "Anderson";
        stud2.classname = "IX";
        stud2.rollno = 2;
        stud2.displayInfo();
        stud2.writing();
        
        // Student Data 3
        Student stud3 = new Student();
        stud3.name = "Smith";
        stud3.classname = "IX";
        stud3.rollno = 3;
        stud3.displayInfo();
        stud3.sleeping();
      
        
    }
}
