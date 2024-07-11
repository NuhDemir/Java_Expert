package ch003;

// Letter sınıfı bir char türünde değişken içerir
class Letter {
    char c;
}

// PassObject sınıfı, main methodunu ve f methodunu içerir
public class PassObject {

    // f methodu, Letter tipinde bir nesneyi parametre olarak alır ve bu nesnenin c değişkenini 'd' yapar
    static void f(Letter a) {
        a.c = 'd';
    }

    public static void main(String[] args) {
        // Letter sınıfından bir nesne oluşturuyoruz
        Letter letter = new Letter();

        // letter nesnesinin c değişkenine 'a' değerini atıyoruz
        letter.c = 'a';

        // İlk başta letter.c değerini yazdırıyoruz
        System.out.println("1: letter.c: " + letter.c);

        // f methodunu çağırarak letter nesnesini parametre olarak geçiriyoruz
        f(letter);

        // f methodu çağrıldıktan sonra letter.c değerini tekrar yazdırıyoruz
        System.out.println("2: letter.c: " + letter.c);
    }
}
