package ch004;

public class StringConcat {

    // Sabit String değişkenler
    private static String world = "people";
    private static String smiley = ":)";
    private static String hi = "hi!";

    public static void main(String[] args) {
        // String birleştirme (concatenation) işlemi
        String hello = "Hello" + world + smiley;
        System.out.println("Hello: " + hello);

        // String ve sayılarla birleştirme örnekleri
        System.out.println("Java" + 1 + 2); // Java12
        System.out.println("Java " + (1 + 2)); // Java3
        System.out.println(1 + 2 + "Java"); // 3Java
    }
}
