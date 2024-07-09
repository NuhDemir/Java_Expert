package ch002;

public class Guitar implements Instrument,ElectronicInstrument {

    @Override
    public void Play() {
        System.out.println("Playing the guitar...");
    }

public void setChord()
{
System.out.println("The Guitar has been tuned.");
}

    @Override
    public void tune() {
        System.out.println("Guitar is being tuned.");
    }
}
