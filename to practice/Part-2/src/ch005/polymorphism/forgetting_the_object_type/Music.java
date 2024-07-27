package ch005.polymorphism.forgetting_the_object_type;

import ch005.polymorphism.music.Note;

class Instrument {
    void play(Note note) {
        System.out.println("Instrument.play()" + note);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Wind.play()" + note);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Percussion.play()" + note);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}


class Brass extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Brass.play()" + note);
    }

    @Override
    String what() {
        return "Brass";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Stringed extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}

public class Music {

    public static void tune(Instrument instrument) {
        instrument.play(Note.C_SHARP);
    }

    public static void tuneAll(Instrument[] allInstrument) {

        for (Instrument instrument : allInstrument) {
            tune(instrument);

        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }
}