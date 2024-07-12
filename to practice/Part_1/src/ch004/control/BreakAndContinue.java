package ch004.control;

import static ch004.Range.range;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int  i = 0; i <100; i++)
        {
            if (i==58) break;//out of loop
            if (i%7!=0) continue; //Next iteration
            System.out.println(i +" ");
        }
        System.out.println("=======");
        for(int i : range(100)) {             // [2]
            if(i == 74) break; // Out of for loop
            if(i % 9 != 0) continue; // Next iteration
            System.out.print(i + " ");
        }

        System.out.println("=======");
        int i  = 0;
        while(true)
        {
            i++;
            int j = i*10;
            if (j==1200) break;//out of loop
            if (i %10 ==0) continue; //Top of loop
        System.out.println(i +" ");

        }
    }
}
