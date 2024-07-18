package ch006.HouseKeeping;

class Bird2 {
    Bird2(int i) {

    }
    Bird2(double d){

    }
}

public class NoSynthesis {
    public static void main(String[] args) {
        //Bird2 b = new Bird2(); //no default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.2);
    }
}
