package ch008.passing;

public class PassByValueExample {

    public static void main(String[] args) {
        int number = 13;
        System.out.println("before calling modify value: " +number);
        modifyValue(number);
        System.out.println("after calling modify value: " +number);
    }

    public static void modifyValue(int value)
    {
        value = 20;
        System.out.println("ınside modify value: " +value);
    }
}
