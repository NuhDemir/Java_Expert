package ch005.polymorphism.music;

public class Music {

    public static void tune(Instrument instrument) {
        instrument.play(Note.A_FLAT);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);//upcasting
    }
}
