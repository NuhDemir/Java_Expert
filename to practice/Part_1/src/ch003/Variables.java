package ch003;

public class Variables {

    public static void main(String[] args) {
        //You can't use a variable if you don't declare it. You must define
        //i = 2;

        //Declaring a variable
        int i;
        boolean b;
        String s1;

        //Do not use a variable before defining it!
        //System.out.println(i + " " + b + " " + s1);
        //int k = i;

        //Inıtıalızıng a variable
        i = 8;
        b= false;
        s1 = new String("new Java!");

        //Only after they are defined can we use them!
        System.out.println("i: " + i + "\t b:" + b + "\t s1: " + s1);

        //Defining a variable
        int j = 18;
        float sin30 = 0.4f;
        String s2 = new String("Java :)");

    }

}
