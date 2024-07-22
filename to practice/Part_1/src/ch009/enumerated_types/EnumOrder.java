package ch009.enumerated_types;
//Bir enum'u bir veri türü oluşturmanın başka bir yoluymuş gibi kullanılabilir.

public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s: Spiciness.values()){
            System.out.println(s+", ordinal:" +s.ordinal());

        }
    }
}
