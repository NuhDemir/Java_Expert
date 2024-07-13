package ch004.control;

import static ch004.Range.range;

public class ForInInt {
    public static void main(String[] args) {
        System.out.println("range: 0->10");
        for (int i : range(10))//0..9
System.out.print(i + " - ");
        System.out.println();
        System.out.println("====================================");

        System.out.println("range: 5->10");
        for (int i: range(5,10))

       System.out.print(i +" - ");
        System.out.println();
        System.out.println("====================================");

        System.out.println("range: 5->20 step 3");
        for (int i: range(5,20,3))

            System.out.print(i +" - ");
        System.out.println();
        System.out.println("====================================");

        System.out.println("range: 20->5 step-3");
        for (int i: range(5,10))

            System.out.print(i +" - ");
        System.out.println();
        System.out.println("====================================");



    }
}
