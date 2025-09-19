package spiralNotes.java.OOP;


/**
 * Write a description of class ClassAndObject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassAndObject
{
 
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 120;
        myCar.display();
        
    }
   
}

class Car {
    String color;
    int speed;
    public Car()    { System.out.println(" Constructor of the Car Class has been called & New Object has been created!" ); } 
    void display() { System.out.println("Color : " + color + ", Speed : " + speed); } 
}
