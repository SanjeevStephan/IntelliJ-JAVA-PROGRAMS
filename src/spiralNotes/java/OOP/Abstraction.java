package spiralNotes.java.OOP;


/**
 * Write a description of class Abstraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barking...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}

