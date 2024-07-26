package ch004.the_final.final_data;

/*
 * Bir sabit iki nedenden dolayı kullanışlıdır.
 * 1- Hiç değişmeyecek bir derleme zamanı sabiti olabilir.
 * 2- Çalışma zamanında başlatılan ve değiştirilmesini istemediğiniz bir değer olabilir.
 */

import ch001.Range;
import ch003.reuse.Tub;

import java.util.Random;

class Value {
    int i;//Package access

    Value(int i) {
        this.i = i;
    }
}

public class FinalData {

    private static Random random = new Random(30);
    private String id;

    //Constructor
    public FinalData(String id) {
        this.id = id;
    }

    private final int value1 = 10;
    private static final int valu2 = 20;
    //Typical public constant
    public static final int value3 = 30;

    private final int i4 = random.nextInt(20);
    static final int i5 = random.nextInt(20);

    private Value v1 = new Value(40);
    private final Value v2 = new Value(50);
    private static final Value v3 = new Value(60);

    //Arrays
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "\ni4: " + i4 + "\n i5: " + i5;
    }

    public static void main(String[] args) {
        FinalData finalData = new FinalData("final data");

        finalData.v2.i++;
        finalData.v1 = new Value(9);
        for (int i = 0; i < finalData.a.length; i++)
            finalData.a[i]++;

        System.out.println(finalData);
        System.out.println("Creating new FinalData");
        FinalData finalData1 = new FinalData("finaldata1");
        System.out.println(finalData);
        System.out.println(finalData1);
    }
}


