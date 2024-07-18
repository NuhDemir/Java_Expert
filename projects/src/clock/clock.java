package clock;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class clock {
    // Saat, dakika ve saniye rakamlarının sayısını tutmak için TreeMap kullanılıyor
    private static Map<Character, Integer> result = new TreeMap<>();

    // Belirtilen numaraları sayan metot
    private static void countNumbers(String number) {
        // Eğer numara tek haneli ise başına '0' ekleniyor
        if (number.length() < 2) {
            addChar('0');
        }
        char[] ch = number.toCharArray();
        // Her karakterin sayısını artıran döngü
        for (char temp : ch) {
            addChar(temp);
        }
    }

    // Her bir karakteri sayan metot
    private static void addChar(char number) {
        int count = 1;
        if (result.containsKey(number)) {
            count = result.get(number) + count;
        }
        result.put(number, count);
    }

    public static void main(String[] args) throws IOException {
        // input.txt dosyasını okumak için Scanner oluşturuluyor
        Scanner scanner = new Scanner(new FileReader("src/clock/input.txt"));
        int[] start = new int[3];
        int[] finish = new int[3];
        int line = 0;

        // Dosyadaki satırları okuyup başlangıç ve bitiş zamanlarını ayırıyor
        while (scanner.hasNextLine()) {
            String[] parts = scanner.nextLine().split(":");
            for (int i = 0; i < parts.length; i++) {
                if (line == 0) {
                    start[i] = Integer.parseInt(parts[i]);
                } else {
                    finish[i] = Integer.parseInt(parts[i]);
                }
            }
            line++;
        }

        int hours = start[0];
        int minutes = start[1];
        int seconds = start[2];

        // Başlangıç zamanından bitiş zamanına kadar her saniyeyi sayıyor
        while ((hours < finish[0]) || (hours <= finish[0] && minutes < finish[1]) || (hours <= finish[0] && minutes <= finish[1] && seconds < finish[2])) {
            countNumbers(String.valueOf(hours));
            countNumbers(String.valueOf(minutes));
            countNumbers(String.valueOf(seconds));

            seconds++;
            if (seconds >= 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes >= 60) {
                minutes = 0;
                hours++;
            }
        }
        countNumbers(String.valueOf(hours));
        countNumbers(String.valueOf(minutes));
        countNumbers(String.valueOf(seconds));

        // Sonuçları ekrana yazdırmak için PrintWriter kullanılıyor
        PrintWriter out = new PrintWriter(System.out);

        for (char i = '0'; i <= '9'; i++) {
            if (result.containsKey(i)) {
                out.println(result.get(i));
            } else {
                out.println('0');
            }
        }
        out.flush();
    }
}
