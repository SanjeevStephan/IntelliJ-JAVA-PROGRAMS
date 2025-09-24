package spiralNotes.java.advanced;


class SportCar {
    String brand = "Audi";
    void start() {
        System.out.println("Car is Starting");
    }
}


public class AccessClassVariablesMethods {
    public static void main(String[] args)
    {
        SportCar car = new SportCar();
        System.out.println(car.brand);
        car.start();
    }
}
