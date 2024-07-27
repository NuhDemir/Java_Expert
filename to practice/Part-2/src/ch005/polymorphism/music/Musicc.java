package ch005.polymorphism.music;

class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }
}

class Brass extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }
}


public class Musicc {
    public static void tune(Wind wind) {
        wind.play(Note.A_FLAT);
    }

    public static void tune(Stringed stringed) {
        stringed.play(Note.A_FLAT);
    }

    public static void tune(Brass brass) {
        brass.play(Note.C_SHARP);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenhHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenhHorn);
    }

}
