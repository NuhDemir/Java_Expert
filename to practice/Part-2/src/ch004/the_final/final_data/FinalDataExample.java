package ch004.the_final.final_data;

public class FinalDataExample {
    // Sınıf seviyesinde final değişkenler
    private final int instanceFinalVar; // Bu değişken yalnızca yapıcı metod içinde başlatılabilir
    private static final int STATIC_FINAL_VAR = 100; // Bu değişken sınıf yüklenirken başlatılır

    // Final diziler
    private final int[] numbersArray;

    // Sınıf yapıcı metodu
    public FinalDataExample(int initialValue) {
        instanceFinalVar = initialValue; // final değişken başlatılıyor
        numbersArray = new int[]{1, 2, 3, 4, 5}; // final dizi başlatılıyor
    }

    // Final metod
    public final void displayValues() {
        System.out.println("Instance Final Variable: " + instanceFinalVar);
        System.out.println("Static Final Variable: " + STATIC_FINAL_VAR);

        // Final dizinin içeriğini yazdır
        System.out.print("Numbers Array: ");
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // FinalDataExample sınıfından bir nesne oluşturuluyor
        FinalDataExample example = new FinalDataExample(10);

        // displayValues metodu çağrılıyor
        example.displayValues();

        // Dizinin içeriği değiştirilebilir
        example.numbersArray[0] = 10;

        // final dizinin içeriği tekrar yazdırılıyor
        System.out.print("Updated Numbers Array: ");
        for (int number : example.numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Aşağıdaki satırlar hata verecektir
        // instanceFinalVar = 20; // instanceFinalVar final olarak tanımlandığı için değeri değiştirilemez
        // STATIC_FINAL_VAR = 200; // STATIC_FINAL_VAR final olarak tanımlandığı için değeri değiştirilemez
        // numbersArray = new int[]{6, 7, 8}; // numbersArray final olarak tanımlandığı için referansı değiştirilemez
    }
}
