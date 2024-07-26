package ch004.the_final.blank_final;

public class BlankFinalExample {
    // Blank final değişkenler
    private final int blankFinalVar;
    private final StringBuilder blankFinalStringBuilder;

    // Yapıcı metod
    public BlankFinalExample(int initialValue, StringBuilder sb) {
        // Blank final değişkenler burada başlatılır
        this.blankFinalVar = initialValue;
        this.blankFinalStringBuilder = sb;
    }

    // Metodlar
    public void displayValues() {
        System.out.println("Blank Final Variable: " + blankFinalVar);

        // Blank final StringBuilder'ın içeriğini yazdır
        System.out.println("Blank Final StringBuilder: " + blankFinalStringBuilder.toString());
    }

    public void updateValues(String additionalText) {
        // Blank final StringBuilder üzerinde değişiklik yapılabilir
        blankFinalStringBuilder.append(additionalText);
    }

    public static void main(String[] args) {
        // StringBuilder nesnesi oluşturuluyor
        StringBuilder sb = new StringBuilder("Initial Text");

        // BlankFinalExample sınıfından bir nesne oluşturuluyor
        BlankFinalExample example = new BlankFinalExample(42, sb);

        // Metodların çağrılması
        example.displayValues();

        // StringBuilder'ın güncellenmesi
        example.updateValues(" - Updated Text");

        // Güncellenmiş içeriğin yazdırılması
        example.displayValues();

        // Aşağıdaki satır hata verecektir çünkü blankFinalVar final olarak tanımlanmıştır ve değeri değiştirilemez
        // example.blankFinalVar = 100; // Bu satır derleme hatasına neden olur
    }
}

