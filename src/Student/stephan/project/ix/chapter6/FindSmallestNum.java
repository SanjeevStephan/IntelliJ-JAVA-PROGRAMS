/*                              DisplayGST.java
    Program No : 07
    Date :
    Program Title : FindSmallestNum
    Program Description : A Program In Java to pass three numbers as parameters inside method and display the smallest number
    Note : below method is executed from public static void main(String[] args){..} method only
 */
package Student.stephan.project.ix.chapter6;

public class FindSmallestNum {
    public static void findSmallestNum(int a, int b, int c)
    {
        // Math.min() method returns the minimum number
        int d = Math.min(a, b);
        int smallestNum = Math.min(c, d);
        String txt = "Smallest Number between (" ;
        String nums = "a=" + a + ", b=" + b + ", c=" + c;
        System.out.println(txt + nums + ") is : " + smallestNum);
    }

}
