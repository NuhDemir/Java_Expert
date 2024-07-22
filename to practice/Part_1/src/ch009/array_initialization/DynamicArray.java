package ch009.array_initialization;

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"a", "b", "c", "d", "e"});
    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.println(s + " ");
    }
}
