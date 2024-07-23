package ch001.hiding;

import java.util.ArrayList;
// '*' ifadesini kullanıyor olsaydık tüm java.util kütüphanesini çağırmış olurduk

public class SingleImport {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
    }

    int x;
    int y;

    public SingleImport() {

    }

    public SingleImport(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(int x, int y) {
      int  total = 0;
        total = x + y;
        System.out.println("toplam değeri: " + total);
    }
}
