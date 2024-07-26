package ch004.the_final.initialization_and_inheritance;

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i: " + i + "\n j: " + j);
        j = 33;
    }

    private static int a1 = printInit("static insect.a initialized.");

    static int printInit(String word) {
        System.out.println(word);
        return 46;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized.");

    public Beetle() {
        System.out.println("k: " + k);
        System.out.println("j: " + j);
    }
    private static int a2= printInit("static Beetle.a2 initialized.");

    public static void main(String[] args) {
        System.out.println("Beetle Constructor.");
        Beetle beetle = new Beetle();
    }


}
