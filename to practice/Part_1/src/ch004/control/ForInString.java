package ch004.control;

public class ForInString {
    public static void main(String[] args) {
        for (char c: "An african swallow".toCharArray())
            System.out.print(c +" -> ");
    }
}
