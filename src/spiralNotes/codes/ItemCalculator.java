package spiralNotes.codes;


/**
 * Write a description of class ItemCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemCalculator
{
    public static void main(String[] args)
    {
        // Create variable of different data-types
        int items = 50;
        double costPerItem = 9.99;
        double totalCost = items * costPerItem ;
        char currency = '$';
        
        // Print Variables
        System.out.println("Number of items : "  + items );
        System.out.println("Cost per Item : " + costPerItem);
        System.out.println("Total cost = " + totalCost + currency );
        
    }
}
