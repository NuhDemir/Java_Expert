package ch004.control;

import java.util.Random;

public class ForInFloat {
    public static void main(String[] args) {
        Random rand = new Random(33);
        float[] f = new float[10];
        for (int i = 0; i< 10; i++)
            f[i] = rand.nextFloat();
        for (float x: f)
System.out.println(x);
    }
}

/*
Output:
* 0.72801155
0.7095041
0.8355015
0.042466402
0.4572323
0.30614942
0.36567825
0.9984074
0.8144958
0.44529957*/
