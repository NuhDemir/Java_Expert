package ch008.passing;

// Ana sınıf ObjectPassing
public class ObjectPassing {
    public static void main(String[] args) {
        // ObjectPassing sınıfından bir nesne oluşturuluyor
        ObjectPassing o = new ObjectPassing();

        // W sınıfından bir nesne oluşturuluyor
        W w = new W();
        w.i = 22; // w nesnesinin 'i' değişkenine 22 değeri atanıyor
        w.b = false; // w nesnesinin 'b' değişkenine false değeri atanıyor

        // 'o' nesnesinin 'f' metodu çağrılıyor ve 'w' nesnesi argüman olarak geçiliyor
        o.f(w);

        // 'w' nesnesinin 'i' ve 'b' değişkenlerinin değerleri ekrana yazdırılıyor
        System.out.println("w'nin i değeri: " + w.i + " ve w'nin b değeri: " + w.b);
    }

    // W sınıfından bir nesne alan 'f' metodu
    public void f(W objectW) {
        // 'objectW' referansının işaret ettiği nesnenin 'i' ve 'b' değişkenleri değiştiriliyor
        objectW.i = 5;
        objectW.b = true;

        // Yeni bir W nesnesi oluşturuluyor
        W ww = new W();
        ww.i = 8; // 'ww' nesnesinin 'i' değişkenine 8 değeri atanıyor
        ww.b = false; // 'ww' nesnesinin 'b' değişkenine false değeri atanıyor

        // 'objectW' referansı 'ww' nesnesine yönlendiriliyor
        objectW = ww;

        // 'objectW' referansının işaret ettiği nesnenin (yani 'ww' nesnesinin) 'i' ve 'b' değişkenleri değiştiriliyor
        objectW.i = 12;
        objectW.b = false;

        // 'objectW' referansının işaret ettiği nesnenin 'i' ve 'b' değişkenlerinin değerleri ekrana yazdırılıyor
        System.out.println("objectW'nin i değeri: " + objectW.i + " ve objectW'nin b değeri: " + objectW.b);
    }
}

// W sınıfı
class W {
    int i; // Tamsayı değişkeni
    boolean b; // Boolean değişkeni
}
