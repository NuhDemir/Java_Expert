package ch003.primitives.characters;

public class Characters {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("Character: " + ch + " its numeric value (Unicode): " + (int)ch);

        ch = 'A';
        System.out.println("Character: " + ch + " its numeric value (Unicode): " + (int)ch);

        ch = 9; // 9 sayısının karakter karşılığı (Tab karakteri)
        System.out.println("Character: " + ch + " its numeric value (Unicode): " + (int)ch);

        ch = ' '; // Boşluk karakteri
        System.out.println("Character: " + ch + " its numeric value (Unicode): " + (int)ch);

        ch = '$'; // Dolar işareti
        System.out.println("Character: " + ch + " its numeric value (Unicode): " + (int)ch);

        ch = (char)-5; // Negatif bir değer (garip bir durum oluşturur)
        System.out.println("Character: " + ch + " its numeric value (Unicode): " + (int)ch);

        ch = (char) -65535; // Negatif büyük bir değer (garip bir durum oluşturur)
        System.out.println("Character: " + ch + " its numeric value (Unicode): " + (int)ch);
    }
}
