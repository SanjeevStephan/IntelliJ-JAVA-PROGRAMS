/**                              CalculateGST.java
    Program No : 04
    Program Title : CalculateGST
    Program Description : A Program to Calculate Goods and Services Tax (GST)
    Note : below method is executed from public static void main(String[] args){..} method only
    ---------------------------
    The Basic formula for GST calculation is :
    GST Amount = (Original Price x GST Rate) / 100
    Final Price = Original Price + GST Amount
 */
package Student.stephan.project.ix.chapter4;

public class CalculateGST {
    public static void calculateGST( int originalPrice) {
        double gstRate = 10.0 , gstAmount, finalAmount;
        gstAmount = originalPrice * gstRate / 100.0;
        finalAmount = originalPrice + gstAmount;
        System.out.println("GST = " + gstAmount);
        String txt = "Amount to Pay (including GST) =" ;
        System.out.println(txt + finalAmount);
    }
    public static void displayGST() {
        calculateGST(10000);
    }
}
