package ch002;

public class Piano implements Instrument ,KeyboardIntstrument{
    @Override
    public void Play() {
        System.out.println("Playing the piano");
    }

    @Override
    public void press() {
        System.out.println("The key has beed pressed.");
    }
}
