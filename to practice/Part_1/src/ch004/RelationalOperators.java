package ch004;

import java.util.Random;

public class RelationalOperators {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;
        prt("i: " + i);
        prt("j: " + j);
        prt("i > j is " + (i > j));
        prt("i >= j is " + (i >= j));
        prt("i < j is " + (i < j));
        prt("i <= j is " + (i <= j));
        prt("i == j is " + (i == j));
        prt("i != j is " + (i != j));

        System.out.println("----------");
        char c1 = 'a';
        char c2 = 'x';
        prt("a > x is " + (c1 > c2));
        prt("a < x is " + (c1 < c2));

        c1 = 's';
        c2 = 'q';
        prt("s > q is " + (c1 > c2));


        c1 = 'ü';//0x00FC
        c2 = 'ı';//0x0131
        prt("ü < ı is " + (c1 < c2));

        System.out.println("--------------");

        boolean b1 = true;
        boolean b2 = false;
        if (b1 ==b2)
            prt("Equal");
        else
            prt("Not equal");
if (b1)
    prt("true!");

System.out.println("-----------");

String s1 = new String("String");
String s2 = new String("String");

//s1 = s2;

        if (s1 == s2)
            prt("The same");
        else
            prt("Different");
        


    }

    static void prt(String s) {
        System.out.println(s);
    }
}
