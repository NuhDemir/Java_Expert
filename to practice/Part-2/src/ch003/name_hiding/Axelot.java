package ch003.name_hiding;

public class Axelot extends Homer {

    void doh(MilHouse milHouse) {
        System.out.println("doh(Milhouse)");
    }

    public static void main(String[] args) {
        Axelot a = new Axelot();
        a.doh(1);
        a.doh("sdd");


    }
}
