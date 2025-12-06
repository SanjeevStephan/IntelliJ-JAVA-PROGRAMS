package sir.stephan.exam.ques.x.second;

public class quesII {
    static void s(String text) { System.out.println(text); }
    static void s(boolean bool) { System.out.println("Boolean Value is : " + bool);}
    static void s(int num) { System.out.println(num); }

    public static void main(String[] args)
    {

        String msg = "CONCENTRATION DEVOTION DEDICATION AND DETERMINATION=DETERMINATION";
        String w0 = "", w1 = "REQUIRES" ,w2= "hardwork", w3 = "Life", w4 = "CAT";
        int n1 = 2, n2 =9 , n3 = 5, n4 = 27, n5 = 30;

        s(w0 + msg); // i
        s("i. w3.concat(w1).concat(w2) : " + (w3.concat(w1).concat(w2))); // ii
        s("ii. msg.startsWith(w3) : " + msg.startsWith(w3));  // iii
        s("iii. w3.concat(w1).concat(msg) : " + (w3.concat(w1).concat(msg))); // ii
        s(("iV. w3.concat(w1).concat(msg).toUpperCase() : " + w3.concat(w1).concat(msg).toUpperCase()));
        s("v. : " + msg.replace("="," ").replace(" ", ","));
       // s();


       // System.out.println("Math.abs(" + n3 + ") =" + Math.abs(n3) );
        System.out.println("Length Divided by " + n3 + " : " + msg.length() / n3);
        System.out.println("vi. Substring : " + msg.substring(n4,n5));
        s("\t\t\t Letter at :" + n4 + " is " + msg.charAt(n4));
        s("\t\t\t Letter at :" + 28 + " is " + msg.charAt(28));
        s("\t\t\t Letter at :" + 29 + " is " + msg.charAt(29));
        System.out.println("vii. Last Index of 'R' : " + w1.lastIndexOf('R'));
        System.out.println("viii. Length : " + msg.length());
        System.out.println("ix. Equals : " + w3.toLowerCase().equals(w3.toUpperCase()));
        System.out.println("x. msg.charAt((" + msg.length() + "/" + n3 +") + " + n1 +") : " + msg.charAt((msg.length() / n3) + n1) );
        s("\t\t\t Letter at :" + 15 + " is " + msg.charAt(15));

    }
}
