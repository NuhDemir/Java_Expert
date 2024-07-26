class MutfakMasasi {
    // Bu method final olarak işaretlenmiştir, bu yüzden alt sınıflar tarafından geçersiz kılınamaz.
    public final void masaYap() {
        System.out.println("Mutfak masası yapılıyor...");
    }

    // Bu method final değil, alt sınıflar tarafından geçersiz kılınabilir.
    public void malzemeKullan() {
        System.out.println("Ahşap kullanılıyor...");
    }
}

class ModernMutfakMasasi extends MutfakMasasi {
    // Bu methodu geçersiz kılmak mümkündür.
    @Override
    public void malzemeKullan() {
        System.out.println("Cam kullanılıyor...");
    }

    // Bu methodu geçersiz kılamayız, çünkü üst sınıfta final olarak işaretlenmiş.
    // @Override
    // public void masaYap() {
    //     System.out.println("Modern mutfak masası yapılıyor...");
    // }
}

public class Table {
    public static void main(String[] args) {
        MutfakMasasi mutfakMasasi = new MutfakMasasi();
        ModernMutfakMasasi modernMutfakMasasi = new ModernMutfakMasasi();

        // MutfakMasasi nesnesi üzerinden method çağrısı
        mutfakMasasi.masaYap(); // Mutfak masası yapılıyor...
        mutfakMasasi.malzemeKullan(); // Ahşap kullanılıyor...

        // ModernMutfakMasasi nesnesi üzerinden method çağrısı
        modernMutfakMasasi.masaYap(); // Mutfak masası yapılıyor... (Alt sınıfta geçersiz kılınamaz)
        modernMutfakMasasi.malzemeKullan(); // Cam kullanılıyor... (Alt sınıfta geçersiz kılınabilir)
    }
}
