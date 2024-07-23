package ch001.testRange;
import java.util.Arrays;

import static ch001.Range.*;
public class TestRange {
    private static void show(int[] range){
        System.out.println(Arrays.toString(range));
    }

    public static void main(String[] args) {
        show(range(10,20,3));
        show(range(40,50,4));
        show(range(1,5,5));
    }

}
