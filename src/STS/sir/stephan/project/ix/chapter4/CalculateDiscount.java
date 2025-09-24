/**                              DisplayGST.java
    Program No : 05
    Date :
    Program Title : CalculateDiscount
    Program Description : A Program to Calculate Discounts
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package STS.sir.stephan.project.ix.chapter4;

public class CalculateDiscount {
    public static void calculateDiscount() {
        int cost_price = 7200;
        double discount1, discount2, totalDiscount, amount;
        discount1 = cost_price * 20.0 / 100.0;
        discount2 = (cost_price - discount1) * 10.0 / 100.0;
        totalDiscount = discount1 + discount2;
        amount = cost_price - totalDiscount;
        System.out.println("Total Discount =" + totalDiscount);
        System.out.println("Amount to Pay =" + amount);
    }
}
