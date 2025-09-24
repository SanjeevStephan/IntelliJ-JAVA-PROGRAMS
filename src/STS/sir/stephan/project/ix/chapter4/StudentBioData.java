/**                              StudentBioData.java
    Program No : 01
    Program Title : StudentBioData
    Program Description : Program in Java to assign and display Name, Class, Rollno, Subject, School and
    City of a STS.sir.stephan.Student.
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package STS.sir.stephan.project.ix.chapter4;

public class StudentBioData {
    public static void displayStudentBioData(String name) {
        // Assign values to the String Variables
        //String name = "Jimmy Jones";
        String std = "IX-A";
        int rollno = 1;
        String subject = "Computer Applications";
        String school = "St.Thomas School, Agiamore";
        String city = "Godda";
        // Print the STS.sir.stephan.Student Data
        System.out.println("Name : " + name);
        System.out.println("Class : " + std);
        System.out.println("Roll No : " + rollno);
        System.out.println("Subject : " + subject);
        System.out.println("School : " + school);
        System.out.println("City : " + city);
    }
}



