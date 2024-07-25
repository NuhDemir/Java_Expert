package ch003.name_hiding;

import java.math.BigInteger;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'a';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 3.14f;
    }

    int doh(int i) {
        System.out.println("doh(int)");
        return 5;
    }

    String doh(String s) {
        System.out.println("doh(String)");
        return "Home";
    }
}

class MilHouse {
//empty
}

class Bart extends Homer {
String doh(MilHouse milHouse){
    System.out.println("doh(Milhouse)");
    return "String miilhouse";
}
}

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh("ali");
        bart.doh(1.2f);
        bart.doh(new MilHouse());
    }

}
