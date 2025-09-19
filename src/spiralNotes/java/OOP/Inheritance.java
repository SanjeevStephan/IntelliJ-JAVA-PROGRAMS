package spiralNotes.java.OOP;


/**
 * Write a description of class Inheritance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Inheritance
{

    class Animal { 
        void eat() { 
            System.out.println("Eating.. "); 
        } 
    }
    class Dog extends Animal { 
        String name;
        public Dog(String name) { this.name = name; } 
        void bark() { 
            System.out.println(name + " is Barking.. "); 
        }
    }
    
    public static void main(String args[]) {
        Inheritance obj = new Inheritance();
        Dog myDog = obj.new Dog("Secissors");
        myDog.bark();
        myDog.eat();
    }
    
    
 
}
