package ch005.loop;

public class ComplexWhile {
    public static void main(String[] args) {
        System.out.println("First While: ");
        System.out.println("===========");
        int i = (int) (10 * Math.random());
        int j = (int) (10 * Math.random());
        boolean b = i > j;
        while (b = !b)
            System.out.println("i: " + i + " j: " + j);
        System.out.println("===========");
        System.out.println("\nSecond While: ");
        System.out.println("============");

        while (b = i > j ? true : false) {
            System.out.println("i: " + i + " j: " + j);
            i = (int) (10 * Math.random());
            j = (int) (10 * Math.random());
        }
        System.out.println("\nThird While: ");
        System.out.println("============");

        while (b = getBoolean()) {
            System.out.println("i: " + i + " j: " + j);
            i = (int) (10 * Math.random());
            j = (int) (10 * Math.random());
        }
    }

    public static boolean getBoolean() {
        boolean b;
        return b = Math.random() > 0.6 ? true : false;
    }
}
