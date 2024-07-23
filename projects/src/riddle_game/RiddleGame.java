package riddle_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Riddle nesnelerini RiddleData sınıfından alın
        Riddle[] riddles = RiddleData.getRiddles();
        int numRiddles = riddles.length;
        List<Integer> askedRiddles = new ArrayList<>();

        while (askedRiddles.size() < numRiddles) {
            int randomIndex = (int) (Math.random() * numRiddles);

            // Daha önce sorulmuş bir bulmaca mı kontrol et
            if (askedRiddles.contains(randomIndex)) {
                continue;
            }

            Riddle selectedRiddle = riddles[randomIndex];
            askedRiddles.add(randomIndex);

            // Kullanıcıya bulmacayı göster
            System.out.println("Bulmaca:\n " + selectedRiddle.getQuestion());

            // Kullanıcının cevabını alın
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(selectedRiddle.getAnswer())) {
                System.out.println("Doğru cevap!");
                score++;
            } else {
                // Eğer cevap yanlışsa, ipucu teklif edin
                System.out.println("Yanlış! İpucu ister misiniz? (evet/hayır)");
                String giveHint = scanner.nextLine().toLowerCase();
                if (giveHint.equals("evet")) {
                    System.out.println("İpucu: " + selectedRiddle.getHint());
                }
            }

            // Kullanıcının devam edip etmeyeceğini sor
            System.out.println("Oyuna devam etmek ister misiniz? (evet/hayır)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("evet")) {
                break;
            }
        }

        // Son puanı göster
        System.out.println("Son puanınız: " + score);
        System.out.println("Oynadığınız için teşekkürler.");
    }
}
