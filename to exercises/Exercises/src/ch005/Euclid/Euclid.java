package ch005.Euclid;

public class Euclid {
    public static void main(String[] args) {
        int a = 2000;
        int b = 10;

        if (args.length == 2) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            } catch (NumberFormatException numberFormatException) {
                System.err.println("Arguments were not both numbers. Using defaults.");
            }
        } else {
            System.err.println("Wrong number of arguments(expected 2). Using defaults.");
        }
        System.out.println("The GDC of " + a + " and " + b + " is");
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
