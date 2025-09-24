package spiralNotes.java.advanced;

// Create a Main class
class Main
{
    // Create a fullThrottle() method
    public void fullThrottle()
    {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed)
    {
        System.out.println("Ma speed is : " + maxSpeed);
    }
}

// Access above class from different methods
public class AccessMethodsWithObject {

    // Inside main() method, call the methods on the myCar Object.
    public static void main(String[] args) {
        Main myCar = new Main();     // Create a myCar object from Main class.
        myCar.fullThrottle();       // Call the fullThrottle() method
        myCar.speed(220);  // Call the speed() method
    }

}

/*



 */
