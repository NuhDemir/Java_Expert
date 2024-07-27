package ch005.polymorphism.extensibility;

import ch005.polymorphism.music.Note;

class Instrument {
    void play(Note note) {
        System.out.println("Instrument.play()" + note);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("adjusting ınstrument");
    }
}

class Wind extends Instrument{
    @Override
    void play(Note note) {
        System.out.println("Wind.play()");
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

class Percussion extends Instrument{
    @Override
    void play(Note note) {
        System.out.println("");
    }
}



public class Music3 {
}
