package spiralNotes.java.basic;

public class JavaScopeInsideBlock {
    public static void main(String[] args)
    {  // This is a block

        // Code here CANNOT use 'x'

        int x = 100;

        // code here can use 'x'
        System.out.println(x);

    } // The Block ends here

    // THe Code here cannot use 'x'
}
