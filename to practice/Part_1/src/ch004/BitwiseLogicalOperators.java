package ch004;

public class BitwiseLogicalOperators {
    public static void main(String[] args) {
        int x = 4;
        int y = 11;

        int k = x & y;
        System.out.println(x + " & " + y + " = " + k );
        System.out.println(getBinary(x)+ " & " +getBinary(y) + " = " + getBinary(k));

        System.out.println();

        k = x | y;
        System.out.println(x + " | " + y + " = " + k);
        System.out.println(getBinary(x) + " & " + getBinary(y) + " = " + getBinary(k));

        System.out.println();

        k = x ^ y;
        System.out.println(x + " ^ " + y + " = " + k);
        System.out.println(getBinary(x) + " & " + getBinary(y) + " = " + getBinary(k));

        System.out.println();
    }

    public static String getBinary(int l)
    {
        return Integer.toBinaryString(l);
    }

    public static String getBinary(long l)
    {
        return  Long.toBinaryString(l);
    }
}
