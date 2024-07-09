package ch002;

public class Orchestra {

    private Instrument[] instruments = {new Guitar(),new Piano()};

    public void PlayAll()
    {
        for (Instrument instrument: instruments)
        {instrument.Play(); }
    }


}


