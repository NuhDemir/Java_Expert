package ch009.static_data_iniialization;

class Bottle {
    static Bottle bottle1;
    static Bottle bottle2;

    static {
        bottle1 = new Bottle();
        bottle2 = new Bottle();

    }

    Bottle() {
        System.out.println("No Argument Constructor");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main method(): ");
        Bottle.bottle1.equals(args[1]);
    }
}
