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

        long u = 6; // 0110
        long v = 2; // 0010
//		int w = u & v; // Needs cast!
//		int w = (int) (u & v);
        long w = u & v;
        System.out.println(u + " & " + v + " = " + w);
        System.out.println(getBinary(u) + " & " + getBinary(v) + " = " + getBinary(w));

        System.out.println();

        byte m = 6;
        byte n = 2;
//		byte l = m & n;
        byte l = (byte) (m & n);
        System.out.println(m + " & " + n + " = " + l);
        System.out.println(getBinary(m) + " & " + getBinary(n) + " = " + getBinary(l));

        System.out.println();

        long cL = ~l;
        System.out.println("l  = " + l + ", cL = " + ~l);
        System.out.println("l = " + getBinary(l) + ", ~l = " + getBinary(cL));

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
