package spiralNotes.codes;

// Defining the Car class
class Motorcycle {
    // Attributes (fields)
    String brand;
    String model;
//    String color;
//    boolean isRunning; // Tracks whether the Car is running

    // Constructor to initialize object attributes
//    Motorcycle(String brand, String model) {
//        this.brand = brand;
//        this.model = model;
//        this.isRunning = false; // Initially, the Car is off
//    }
//
//    // Method to start the Car
//    void start() {
//        if (!isRunning) {
//            isRunning = true;
//            System.out.println(model + " is starting...");
//        } else {
//            System.out.println(model + " is already running.");
//        }
//    }
//
//    // Method to accelerate
//    void accelerate() {
//        if (isRunning) {
//            System.out.println(model + " is accelerating!");
//        } else {
//            System.out.println("Start the " + model + " before accelerating.");
//        }
//    }
//
//    // Method to stop the Car
//    void stop() {
//        if (isRunning) {
//            isRunning = false;
//            System.out.println(model + " has stopped.");
//        } else {
//            System.out.println(model + " is already off.");
//        }
//    }

    // Method to display Car details
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("----------------------");
    }
}

// Main class to create and use objects
public class MotorcycleInJava {
    public static void main(String[] args) {
        // Creating objects with brand, model, and color
//        MotorCycle bike1 = new MotorCycle("Royal Enfield", "Continental GT 650");
//        MotorCycle bike2 = new MotorCycle("Ducati", "Panigale V4S" );
//        MotorCycle bike3 = new MotorCycle("Royal Enfield", "Hunter 350");

        Motorcycle bike1 = new Motorcycle();
        bike1.brand = "Royal Enfield";
        bike1.model = "Continental GT 650";

        Motorcycle bike2 = new Motorcycle();
        bike2.brand = "Ducati";
        bike2.model = "Panigale V4S";

        Motorcycle bike3 = new Motorcycle();
        bike3.brand = "Royal Enfield";
        bike3.model = "Hunter 350";


        // Displaying object details
        bike1.displayInfo();
        bike2.displayInfo();
        bike3.displayInfo();

        // Testing the behaviors
//        bike1.start();
//        bike2.accelerate();
//        bike3.stop();
    }
}
