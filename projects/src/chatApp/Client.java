package chatApp;
import java.net.Socket;
import java.net.*;
import java.io.*;

// Client sınıfı, sunucu ile bağlantı kuran ve veri alışverişi yapan bir sohbet istemcisi oluşturur.
public class Client {

    // Socket, sunucu ile istemci arasında veri alışverişi sağlayan bir ağ yapısıdır.
    Socket socket;

    // BufferedReader, sunucudan gelen verileri okumak için kullanılır.
    BufferedReader bufferedReader;

    // PrintWriter, sunucuya veri göndermek için kullanılır.
    PrintWriter out;

    // Client sınıfının kurucu metodu. Sunucuya bağlanmaya çalışır ve bağlantı sağlandığında
    // mesaj gönderme ve alma işlemleri başlatılır.
    public Client(){

        try{
            // Sunucuya bağlantı isteği gönderiliyor.
            System.out.println("Sunucuya istek gönderiliyor...");
            // 127.0.0.1 localhost'u temsil eder ve 7777 portu üzerinden bağlanılır.
            socket = new Socket("127.0.0.1",7777);
            System.out.println("Bağlantı başarılı!");

            // Sunucudan gelen mesajları okumak için BufferedReader oluşturulur.
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Sunucuya mesaj göndermek için PrintWriter oluşturulur.
            out = new PrintWriter(socket.getOutputStream());

            // Mesaj okuma ve yazma işlemleri başlatılıyor.
            startReading();
            startWriting();
        }
        catch (Exception e){
            // Bir hata oluştuğunda yakalanır (örneğin sunucu kapalı olabilir).
        }
    }

    // Sunucudan gelen mesajları okuyan bir metot.
    public void startReading(){
        // Bu işlem farklı bir thread'de (paralel işlem) çalışacak.
        Runnable r1 = () -> {
            System.out.println("Okuma işlemi başlatıldı...");

            try {
                // Sonsuz döngüyle sürekli mesajları dinler.
                while (true){
                    String message = bufferedReader.readLine(); // Sunucudan gelen mesajı okur.
                    // Eğer mesaj "EXIT" ise bağlantıyı sonlandırır.
                    if (message.equals("EXIT")) {
                        socket.close(); // Soket bağlantısını kapatır.
                        break;
                    }

                    // Sunucudan gelen mesaj ekrana yazdırılır.
                    System.out.println("Sunucu: " + message);
                }

            } catch (Exception e){
                // Bağlantı kapandığında burada yakalanır.
                System.out.println("Bağlantı kapatıldı!!!");
            }

        };
        // Yeni bir thread oluşturulur ve çalıştırılır.
        new Thread(r1).start();
    }

    // İstemci tarafından sunucuya mesaj gönderme işlemini yöneten metot.
    public void startWriting(){
        // Bu işlem de farklı bir thread'de çalışacak.
        Runnable r2 = () -> {
            System.out.println("Yazma işlemi başlatıldı...");

            try {
                // Soket kapatılmadığı sürece sürekli mesaj göndermeye hazır olacak.
                while (!socket.isClosed()){
                    // Konsoldan girilen mesajı okumak için BufferedReader kullanılır.
                    BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));

                    String content = bufferedReader1.readLine(); // Kullanıcının girdiği mesaj.
                    out.println(content); // Mesajı sunucuya gönderir.
                    out.flush(); // Mesajın tam olarak gönderildiğinden emin olur.

                    // Eğer mesaj "EXIT" ise bağlantıyı kapatır.
                    if (content.equals("EXIT")){
                        socket.close(); // Soket kapatılır.
                        break;
                    }

                    // Bağlantı kapandığında mesaj yazdırılır.
                    System.out.println("Bağlantı kapatıldı!!!");
                }
            } catch (Exception e){
                // Hata yakalanır ama burada herhangi bir işlem yapılmıyor.
            }

        };
        // Yeni bir thread oluşturulur ve çalıştırılır.
        new Thread(r2).start();
    }

    // Programın giriş noktası, ana metodudur.
    public static void main(String[] args) {
        System.out.println("Bu bir istemci uygulamasıdır...");
        // Yeni bir istemci nesnesi oluşturulur ve sunucuya bağlanılır.
        new Client();
    }

}
