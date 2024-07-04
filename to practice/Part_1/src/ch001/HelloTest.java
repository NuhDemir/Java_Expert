package ch001;

public class HelloTest {

    public static void main(String[] args) {

        Hello article = new Hello();

        String question = article.sayHi("Ethan");
        System.out.println(question);

        question = article.sayHi("Bear");
        System.out.println(question);

        System.out.println("World: " +article.sayHi("Moliere"));
    }
}
