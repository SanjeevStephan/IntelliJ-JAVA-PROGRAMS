package spiralNotes.java.OOP;


/**
 * Write a description of class Encapsulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Employee {
    private String name;
    private int age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30);
        System.out.println("Name: " + emp.getName() + ", Age: " + emp.getAge());
    }
}

