package ch004.upcasting;

import javax.print.DocFlavor;

class Door {

    public boolean open() {

        if (true) {
            System.out.println("Kapı açık");
            return true;
        } else {
            System.out.println("Kapı kapalı");
            return false;
        }

    }

    public void size(int x) {
    }

    static void cost(Door d) {
        d.size(4);
    }
}


public class Home extends Door {

    public static void main(String[] args) {
        Home baraka = new Home();
        Door.cost(baraka);//upcasting
        baraka.open();

    }
}
