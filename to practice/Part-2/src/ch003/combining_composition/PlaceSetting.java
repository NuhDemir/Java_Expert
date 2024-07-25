package ch003.combining_composition;

import ch003.reuse.Dama;

class Plate {
    Plate(int i) {
        System.out.println("Plate Constructor.");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate Constructor.");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil Constructor.");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Spoon Constructor.");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork Constructor.");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Knife Constructor.");
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Custom Constructor");
    }
}

public class PlaceSetting extends Custom {
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinerPlate;

    public PlaceSetting(int i) {
        super(i + 1);
        spoon = new Spoon(i + 2);
        fork = new Fork(i + 3);
        knife = new Knife(i + 8);
        dinerPlate = new DinnerPlate(i + 6);
        System.out.println("PlaceSetting Constructor.");
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(6);
    }
}
