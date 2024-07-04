package ch001;

public class Hello {

    String world = "people";

    public String sayHi(String whoIs) {
        String word;
        if (whoIs != "")
            word = "Hello " + whoIs + " :)";
        else
            word = "Hello " + world + " :)";
        return word;
    }
}
