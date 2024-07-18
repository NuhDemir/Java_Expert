package clock;

import java.io.FileReader;
import java.io.FileWriter;
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

    // Başlangıç ve bitiş zamanlarını dosyadan okuyup array'lere atayan metot
    private static void readTimesFromFile(String inputFilePath, int[] start, int[] finish) throws IOException {
        Scanner scanner = new Scanner(new FileReader(inputFilePath));
        int line = 0;

        System.out.println("Dosyadan okunan veriler:");

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
            System.out.println(parts[0] + ":" + parts[1] + ":" + parts[2]);
        }
        scanner.close();
    }

    // Rakam sayım sonuçlarını belirtilen dosyaya yazdıran metot
    private static void writeResultsToFile(String outputFilePath) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(outputFilePath));

        for (char i = '0'; i <= '9'; i++) {
            if (result.containsKey(i)) {
                out.println(i + ": " + result.get(i));
            } else {
                out.println(i + ": 0");
            }
        }
        out.close();
    }

    public static void main(String[] args) {
        // Başlangıç ve bitiş zamanlarını tutacak array'ler
        int[] start = new int[3];
        int[] finish = new int[3];

        // Dosya yolları
        String inputFilePath = "src/clock/input.txt";
        String outputFilePath = "src/clock/output.txt";

        try {
            // Zaman bilgilerini dosyadan okuma
            readTimesFromFile(inputFilePath, start, finish);

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

            // Sonuçları dosyaya yazma
            writeResultsToFile(outputFilePath);

            System.out.println("Rakam sayım sonuçları " + outputFilePath + " dosyasına yazıldı.");

        } catch (IOException e) {
            System.err.println("Dosya işlemlerinde bir hata oluştu: " + e.getMessage());
        }
    }
}
