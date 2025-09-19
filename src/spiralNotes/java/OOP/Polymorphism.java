package spiralNotes.java.OOP;


/**
 * Write a description of class Polymorphism here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Polymorphism
{
    class Shape { void area() { System.out.println("Calculating Area..."); }  }
    
    class Circle extends Shape { 
        @Override
        void area() { System.out.println("Circle Area");
        }
    }
    
    class Rectangle extends Shape {
        @Override
        void area() { System.out.println("Rectangle Area");
        }
    
    }
    
    
    /**
     * Constructor for objects of class Polymorphism
     */
    public Polymorphism()
    {
         Shape circle = new Circle();
         Shape rectangle = new Rectangle();
         circle.area();
         rectangle.area();
    }
}
