/**                              AreaOfSquare.java
    Program No : 03
    Date :
    Program Title : AreaOfSquare
    Program Description : A Program in Java to find the Area, Perimeter and Diagonal of a Square.
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package STS.sir.stephan.project.ix.chapter4;

public class AreaOfSquare {

    // static method can only be accessed from within the same class
   public static void calculateSquare(int side) {
        // declaring the required variables for the program
        int area, perimeter;
        double diagonal;
        area = side * side;  // calculate area of sq
        perimeter = 4 * side; // calculate perimeter of sq
        diagonal = Math.sqrt(2) * side;

        System.out.println("The Area of Square :" + area);
        System.out.println("The Perimeter of Square : " + perimeter);
        System.out.println("The Diagonal of Square : " + diagonal);
    }
    // public static method() can be accessed from outside the class
   // public static void displaySquareArea(){
   //     calculateSquare(25);
  //  }
}
