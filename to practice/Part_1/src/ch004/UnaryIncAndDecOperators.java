package ch004;

import javax.swing.text.Style;

public class UnaryIncAndDecOperators {
    public static void main(String[] args) {

    }

    public static void unaryIncrementAndDecrement1()
    {

    }

    public static void unaryIncrementAndDecrement2()
    {

    }

    public static void weirdBehavior()
    {
int i = 0;
        System.out.println("That's OK");
        i = ++i;
        System.out.println("i: "+ i);
        i = ++i +2;
        System.out.println("i: " +i);

        i = 0;
        System.out.println("Taht's not OK");
        i = i++;

        System.out.println("i: " +i);//Why doesn't i increase

        i = i++ +2; //Why doesn't i++ increase i?
        System.out.println("i: " +i);

        System.out.println("That's OK too.");

        i= 0;

        int j = i++;
        System.out.println("i: " +i);
        System.out.println("j: " +j);

    }

    static void prt(String s)
    {
        System.out.println(s);
    }



}
