package glutton;

import java.io.PrintWriter;
import java.util.Scanner;

public class Glutton {
    public static void main(String[] args) {
        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner in = new Scanner(System.in);

        // Çıktıları ekrana yazdırmak için PrintWriter nesnesi oluşturuluyor
        PrintWriter out = new PrintWriter(System.out);

        // Kullanıcıdan 5 adet tam sayı girişi alınıyor

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        // a değeri 1 ise "Ali" yazdırılıyor
        if (a == 1) {
            out.println("Ali");
            // b değeri 1 ise "Yılmaz" yazdırılıyor
        } else if (b == 1) {
            out.println("Yılmaz");
            // c değeri 1 ise "Salih" yazdırılıyor
        } else if (c == 1) {
            out.println("Salih");
            // d değeri 1 ise "Mali" yazdırılıyor
        } else if (d == 1) {
            out.println("Mali");
            // e değeri 1 ise "Elen" yazdırılıyor
        } else if (e == 1) {
            out.println("Elen");
            // Hiçbir değer 1 değilse "Adnan" yazdırılıyor
        } else {
            out.println("Adnan");
        }

        // PrintWriter nesnesini temizleyerek çıktıları yazdırıyor
        out.flush();
    }
}
