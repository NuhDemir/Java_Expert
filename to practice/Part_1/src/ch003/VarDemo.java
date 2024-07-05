package ch003;

import java.util.Date;

public class VarDemo {
    //var x = 10; //Error: 'var' is not allowed here
    //private static var b = true;

    public static void main(String[] args) {
        //var i; //Cannot use 'var' on variable without initializer
        var l = 2;
        System.out.println("l: " + l);

        var ll = 1_0f/2_00_0;
        System.out.println("ll: " +ll);

        byte b = 3;
        var lll = b/3.2;
        System.out.println("lll: " + lll);

        //l= true; //var provides type inference, it is not something that enables
        //dynamic typing.

        var d = new Date();
        System.out.println("Date: " + d);

        //		var anArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};  // Problem! Array initializer needs an explicit target-type
//		var anotherArray = {1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L};  // Problem!
//		var aStringArray = {"1", "2", "4"};  // Problem!
        var intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.print("Array: ");
        for (var t : intArray)
            System.out.println(t + " ");
        System.out.println("\n");

    }
}
