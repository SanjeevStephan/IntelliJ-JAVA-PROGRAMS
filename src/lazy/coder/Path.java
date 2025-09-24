package lazy.coder;

import static lazy.coder.Data.root;

public class Path {

    public static String getTypography(int index)
    {
        String[] path =
                {
                        "typography",
                        "pyscripts"
                };
        return root + path[index];
    }

    public static void main(String[] args) {
        System.out.println(getTypography(Data.TYPOGRAPHY));
    }
}
