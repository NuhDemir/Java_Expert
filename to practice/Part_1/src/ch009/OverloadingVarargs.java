package ch009;

import java.util.logging.Logger;

public class OverloadingVarargs {

    static void f(Character... args) {
        System.out.print("first:");
        for (Character c : args) {
            System.out.print(" " + c);
            System.out.println();
        }
    }

    static void f(Integer... args) {
        System.out.println("Second:");
        for (Integer i : args) {
            System.out.print(" " + i);
            System.out.println();
        }
    }

    static void f(Long... args) {
        System.out.println("Third:");
        for (Long l : args) {
            System.out.print(" " + l);
            System.out.println();
        }
    }
//    static  void f(int... args){
//        System.out.print("Four:");
//        for (int a: args){
//            System.out.print(" " +a);
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        f('a');
        f(1);
        f(2, 1);
        f(0);
        f(33L);
    }

}



