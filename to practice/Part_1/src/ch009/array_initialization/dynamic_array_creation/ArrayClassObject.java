package ch009.array_initialization.dynamic_array_creation;

import java.util.*;

public class ArrayClassObject {
    public static void main(String[] args) {
        Random random = new Random(50);
        Integer[] a = new Integer[random.nextInt(10)];
        System.out.println("length of a: " + +a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = random.nextInt(200);
        System.out.println(Arrays.toString(a));

    }
}
