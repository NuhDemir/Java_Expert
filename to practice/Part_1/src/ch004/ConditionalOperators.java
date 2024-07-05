package ch004;

public class ConditionalOperators {
    public static void main(String[] args) {
boolean b1 = true;
boolean b2 = false;
boolean b3 = b1 & b2;
boolean b4 = b1 | b2;
boolean b5 = b1 ^ b2;

System.out.println("b1 & b2: " + b3);
System.out.println("b1 | b2: " + b4);
System.out.println("b1 ^ b2: " + b5);
System.out.println("!b1: " + !b1);

System.out.println("---------------------");

if ((getOne() == 2) & (getTwo() == 2))
        {
            System.out.println("value 1 is 1 AND value 2 is 2");
        } if ((getOne() == 1) | (getTwo() == 2))
        {
            System.out.println("value 1 is 1 OR value 2 is 2");
        }

    }

    public static int getOne()
    {
System.out.println("In getOne()");
return 1;
    }

    public static int getTwo()
    {
        System.out.println("In getTwo()");
        return 2;
    }
}
