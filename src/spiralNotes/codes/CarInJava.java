package spiralNotes.codes;

// Defining the Car class
class Car {
    // Attributes (fields)
    String brand;
    String model;
    String color;
    boolean isRunning; // Tracks whether the Car is running

    // Constructor to initialize object attributes
    Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isRunning = false; // Initially, the Car is off
    }

    // Method to start the Car
    void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(model + " is starting...");
        } else {
            System.out.println(model + " is already running.");
        }
    }

    // Method to accelerate
    void accelerate() {
        if (isRunning) {
            System.out.println(model + " is accelerating!");
        } else {
            System.out.println("Start the " + model + " before accelerating.");
        }
    }

    // Method to stop the Car
    void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(model + " has stopped.");
        } else {
            System.out.println(model + " is already off.");
        }
    }

    // Method to display Car details
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("----------------------");
    }
}






// Main class to create and use objects
public class CarInJava {
    public static void main(String[] args) {
        // Creating objects with brand, model, and color
        Car car1 = new Car("Tesla", "Model 3", "Red");
        Car car2 = new Car("Bugatti", "Veyron", "Blue");
        Car car3 = new Car("Nissan", "GT-R", "Red");

        // Displaying object details
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        // Testing the behaviors
        car1.start();
        car2.accelerate();
        car3.stop();
    }
}
