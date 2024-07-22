package ch009.array_initialization;

import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6,7,8};
        Integer[] b = new Integer[]{1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
