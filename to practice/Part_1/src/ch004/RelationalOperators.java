package ch004;

import java.util.Random;

public class RelationalOperators {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt()%100;
        int j = rand.nextInt()%100;
prt("i: " +i);
prt("j: " +j);
prt("i > j is " + (i > j));
prt("i >= j is " + (i >= j));
prt("i < j is " + (i < j));
prt("i <= j is " + (i <= j));
prt("i == j is " + (i == j));
prt("i != j is " + (i != j));

System.out.println("----------");
char c1 = 'a';
char c2 = 'x';




    }

    static void prt(String s)
    {
        System.out.println(s);
    }
}
