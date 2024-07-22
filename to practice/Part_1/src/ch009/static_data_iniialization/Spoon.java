package ch009.static_data_iniialization;

public class Spoon {
    static int i;

    //işlemi bir blok içerisinde yazabilirsiniz.
    //biraz methodlara benzese de sadece static anahtar sözcüğü ve ardından gelen bir kod bloğundan ibaret.

    //bu kod diğer staric başlatmalar gibi bir kez çalıştırılır.

    static {
        i=43;
    }
}
