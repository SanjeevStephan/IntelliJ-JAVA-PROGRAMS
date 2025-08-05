package class_ix.chapter_3;

/*
    Program : To Find the area of perimeter of a circle of radius 3.5
    Page No : 50
 */
public class Area_and_Perimeter_of_Circle
{
    public void Circle()
    {
        final double pi_value = 3.14; // 0Constant Value
        double radius = 3.5;  // double represents a fractional number
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
