package ch004;

public class UnaryOperators {

    public static void main(String[] args) {
    }

    public static void unaryOperators() {
// -21; //Error!
        // +a; //Error!
        //-b; //Error!
        int a = 3;

        int i = +12;
        int j = -i;
        int k = +i;
        int l = +-4;
        prt("i: "+ i + " j: " + j + " k: "+ k + " l: "+ l);

        int m = +-7;
        int n = -+9;
        int o = - -11; // Better to write - (-11)
        int p = -(-13);
        prt("m: " + m + " n: " + n + " o: " + o + " p: " + p);

    }

    public void unariryPromotion() {
        byte b1 = 11;
        short s1 = 44;

//byte b2 = +b1;  //Erroré need a cast
        byte b2 = (byte) -b1;

        //short s2 = -s1; //Erroré Need a cast
        short s2 = (short) -s1;

        int i = 7;
        //byte b3 = -i;//Error need a cast
        byte b3 = (byte) -i;

        prt("b2: " + b2);
        prt("b3: " + b3);
        prt("s2: " + s2);

        byte b4 = ++b1; //OK. No need to implicity cast
        short s4 = --s2; //OK. No need to implicity cast

        long l = 12;
        l = -l;
        System.out.println(l);

        boolean isTrue = true;
        isTrue = !isTrue;
        //!isTrue; //compiler error


    }

    static void prt(String s) {
        System.out.println(s);
    }
}
