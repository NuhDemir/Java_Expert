package chatApp;
import java.net.*;
import java.io.*;

// Server sınıfı, istemciden gelen bağlantıları kabul eden ve mesaj alışverişi yapan bir sunucu oluşturur.
public class Server {
    // Sunucu, istemci ile bağlantı kurulmasını sağlayan ServerSocket nesnesi.
    ServerSocket server;

    // Socket, istemci ile sunucu arasında veri alışverişini sağlayan ağ yapısıdır.
    Socket socket;

    // BufferedReader, istemciden gelen verileri okumak için kullanılır.
    BufferedReader bufferedReader;

    // PrintWriter, istemciye veri göndermek için kullanılır.
    PrintWriter out;

    // Server sınıfının kurucu metodu. Sunucu, belirlenen port üzerinden istemciyi bekler ve bağlanıldığında
    // veri alışverişi işlemlerini başlatır.
    public Server(){
        try {
            // Sunucu, 7777 portunu dinlemeye başlar.
            server = new ServerSocket(7777);
            System.out.println("Sunucu, bağlantı kabul etmeye hazır.");
            System.out.println("Bağlantı bekleniyor...");

            // İstemciden gelen bağlantı kabul edilir.
            socket = server.accept();

            // İstemciden gelen mesajları okumak için BufferedReader oluşturulur.
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // İstemciye mesaj göndermek için PrintWriter oluşturulur.
            out = new PrintWriter(socket.getOutputStream());

            // Mesaj okuma ve yazma işlemleri başlatılır.
            startReading();
            startWriting();

        } catch (Exception e){
            // Hata oluştuğunda yakalanır (örneğin bağlantı hatası).
        }
    }

    // İstemciden gelen mesajları sürekli olarak okuyan bir metot.
    public void startReading(){
        // Bu işlem farklı bir thread'de çalıştırılacak.
        Runnable r1 = () -> {
            System.out.println("Okuma işlemi başlatıldı...");

            try {
                // Sonsuz döngü ile sürekli olarak mesajları okur.
                while (true) {
                    String message = bufferedReader.readLine(); // İstemciden gelen mesaj okunur.

                    // Eğer istemciden gelen mesaj "EXIT" ise bağlantıyı sonlandırır.
                    if (message.equals("EXIT")) {
                        System.out.println("İstemci bağlantıyı sonlandırdı.");
                        socket.close(); // Soket bağlantısı kapatılır.
                        break;
                    }

                    // İstemciden gelen mesaj sunucu tarafında ekrana yazdırılır.
                    System.out.println("İstemci: " + message);
                }
            } catch (Exception e) {
                // Bağlantı kapandığında hata yakalanır.
                System.out.println("Bağlantı KAPANDI!!!");
            }

        };
        // Yeni bir thread oluşturulur ve çalıştırılır.
        new Thread(r1).start();
    }

    // Sunucu tarafında mesaj yazma işlemini sürekli çalıştıran metot.
    public void startWriting(){
        // Bu işlem de farklı bir thread'de çalışacak.
        Runnable r2 = () -> {
            System.out.println("Yazma işlemi başlatıldı...");

            try {
                // Soket kapatılmadığı sürece sürekli mesaj göndermeye hazır olacak.
                while (!socket.isClosed()) {
                    // Konsoldan girilen mesajı okumak için BufferedReader kullanılır.
                    BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));

                    String content = bufferedReader1.readLine(); // Kullanıcının girdiği mesaj alınır.
                    out.println(content); // Mesaj istemciye gönderilir.
                    out.flush(); // Mesajın tam olarak gönderildiğinden emin olur.

                    // Eğer mesaj "EXIT" ise bağlantı sonlandırılır.
                    if (content.equals("EXIT")) {
                        socket.close(); // Soket bağlantısı kapatılır.
                        break;
                    }
                }
            } catch (Exception e) {
                // Bağlantı kapandığında hata yakalanır.
                System.out.println("Bağlantı KAPANDI!!!");
            }

        };
        // Yeni bir thread oluşturulur ve çalıştırılır.
        new Thread(r2).start();
    }

    // Sunucu tarafındaki bağlantı işlemi başlatılmış durumda, istemciden gelen mesajlar alınıp gönderilir.
}
