package riddle_game;

import java.util.Scanner;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Riddle nesnelerini oluştur
        Riddle[] riddles = {
                new Riddle(
                        "Ağzım olmadan konuşurum ve kulaklarım olmadan duyarım. Vücudum yok ama rüzgarla canlanırım. Ben neyim?",
                        "Yankı",
                        "İpucu: Ses yansıtma yeteneğiyle bilinir."
                ),
                new Riddle(
                        "Ne kadar çok alırsan o kadar çok geride bırakırım. Ben neyim?",
                        "Ayak izleri",
                        "İpucu: Yürüdüğünüzde geride bıraktığınız şey."
                ),
                new Riddle(
                        "Canlı değilim ama büyüyebilirim; ciğerlerim yok ama havaya ihtiyacım var; ağzım yok ama su beni öldürür. Ben neyim?",
                        "Ateş",
                        "İpucu: Isı ve ışık üretir."
                ),
                new Riddle(
                        "Geceleri gökyüzünde parlarım, ama bir yıldız değilim. Ben neyim?",
                        "Ay",
                        "İpucu: Dünya'nın doğal uydusudur."
                ),
                new Riddle(
                        "Bir kapı gibi açılırım, ama bir kapı değilim. Anahtarım yoktur ama açılırım. Ben neyim?",
                        "Kitap",
                        "İpucu: Bilgi içerir ve sayfaları vardır."
                ),
                new Riddle(
                        "Gün içinde uzarım, ama gece kaybolurum. Ben neyim?",
                        "Gölge",
                        "İpucu: Işık varken oluşur."
                )
        };

        int numRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * numRiddles);
            Riddle selectRiddle = riddles[randomIndex];

            //Kullanıcıya bulmacayı göster.
            System.out.println("Bulmaca" + selectRiddle.getQuestion());

            //Kullanıcının cevabını alın.
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(selectRiddle.getAnswer())) {
                System.out.println("Doğru cevap!");
                score++;
            } else {
                //Eğer cevap yanlışsa ,ipucu teklif edin
                System.out.println("Yanlış! İpucu ister misiniz? (evet/hayır)");
                String giveHint = scanner.nextLine().toLowerCase();
                if (giveHint.equals("evet")) {
                    System.out.println("İpucu: " + selectRiddle.getHint());
                }
            }

            //Kullanıcının devam edip etmeyeceğini soralım
            System.out.println("Oyuna devam etmek ister misiniz? (evet/hayır)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("evet")) {
                break;
            }
        }
        //Son puanı göster
        System.out.println("Son puanınız: " + score);
        System.out.println("Oynadığınız için teşekkürler.");
    }
}
