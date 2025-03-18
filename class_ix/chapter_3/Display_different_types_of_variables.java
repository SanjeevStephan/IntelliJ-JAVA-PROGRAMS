package class_ix.chapter_3;

public class Display_different_types_of_variables {


    public void Display_Details_of_Employee()
    {
        int emp_id = 101 ; // Integer Variable
        String name = "Sanjeev Stephan Murmu";
        String department = "Computer Science";  // String Variable
        char gender = 'M'; // Character Variable
        float salary = 15000 ; // Float Variable

        System.out.println("ID : " + emp_id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
    }


    public static void main(String[] args)
    {
        Display_different_types_of_variables display_employee_details = new Display_different_types_of_variables();
        display_employee_details.Display_Details_of_Employee();
    }

}
