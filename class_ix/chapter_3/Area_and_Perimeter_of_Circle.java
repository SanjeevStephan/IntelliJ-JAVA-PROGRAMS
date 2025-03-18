package class_ix.chapter_3;

public class Area_and_Perimeter_of_Circle
{
    public void Circle()
    {
        final double pi_value = 3.14; // Constant Value
        double radius = 3.5;
        double area, perimeter;
        area = pi_value * radius * radius;
        perimeter = 2 * pi_value * radius;

        System.out.println("Radius :" + radius);
        System.out.println("Area   : " + area);
        System.out.println("Perimeter : " + perimeter);

    }

    public static void main(String[] args)
    {
        Area_and_Perimeter_of_Circle areaAndPerimeterOfCircle = new Area_and_Perimeter_of_Circle();
        areaAndPerimeterOfCircle.Circle();
    }
}
