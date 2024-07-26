package ch004.the_final.final_arguments;

public class FinalArgumentsExample {

    // Bu metod final parametreler kullanır
    public void calculateArea(final int width, final int height) {
        // Parametrelerin değerlerini yazdır
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);

        // Aşağıdaki satırlar hata verecektir çünkü width ve height final olarak tanımlanmıştır
        // width = width + 10; // Bu satır derleme hatasına neden olur
        // height = height + 10; // Bu satır derleme hatasına neden olur

        // Alanı hesapla ve yazdır
        int area = width * height;
        System.out.println("Area: " + area);
    }

    // Final parametre ile başka bir metod
    public void updateValue(final StringBuilder sb) {
        // Final parametre üzerinde değişiklik yapılabilir
        sb.append(" World!"); // StringBuilder kullanılarak değişiklik yapılabilir

        // Aşağıdaki satır hata verecektir çünkü sb final olarak tanımlanmıştır
        // sb = new StringBuilder("New String"); // Bu satır derleme hatasına neden olur
    }

    public static void main(String[] args) {
        FinalArgumentsExample example = new FinalArgumentsExample();

        // calculateArea metodunun çağrılması
        example.calculateArea(10, 20);

        // StringBuilder ile updateValue metodunun çağrılması
        StringBuilder sb = new StringBuilder("Hello");
        example.updateValue(sb);
        System.out.println("Updated StringBuilder: " + sb.toString());
    }
}
