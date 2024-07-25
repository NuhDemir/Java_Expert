package ch004.protected_access;

class Villian {
    private String name;

    protected void set(String name) {
        name = name;
    }

    Villian(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am a Villain and my name is " + name;
    }
}


public class Orc extends Villian {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Psycho", 10);
        System.out.println(orc);
        orc.change("Anchor", 20);
        System.out.println(orc);
    }
}
