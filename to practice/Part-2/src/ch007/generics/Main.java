package ch007.generics;

public class Main {

    public static void main(String[] args) {
        MyList<String> country = new MyList<>();
        country.add("Los Angeles");
        country.add("Texas");
        country.remove("Los Angeles");

    }
}
