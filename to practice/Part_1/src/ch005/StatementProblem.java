package ch005;

public class StatementProblem {

    private int i = 1;

    public static void main(String[] args) {
        // Değişken tanımlama ve atama problemi
        int i = 33;
        if (i < 34) {
            // Bu satırda bir değişken tanımlaması yapılamaz, çünkü if bloğu bir satırda bitirilmemiş
            // int ii = 3;

            if (i < 3)
                if (i > 0)
                    if (i < 3)
                        i = i++ - 5;
        }

        // Bu satırda da bir değişken tanımlaması yapılamaz
        // if(i<3)
        // int k;

        // Bu for döngüsü doğru çalışacaktır ve 0'dan 9'a kadar olan sayıları yazdıracaktır
        for (int j = 0; j < 10; j++)
            System.out.println(j);

        // Bu satırlar hepsi derleme hatası verecektir, çünkü kontrol yapılarında blok olmadan değişken tanımlaması yapılamaz
//		for (int j = 0; j < 10; j++)
//			int k = j;
//
//		if (true)
//			int u = 7;
//
//		for (int j = 0; j < 10; j++)
//			int k = j;
//
//		if (true)
//			int z = 7;
//
//		do
//			int r = 7;
//		while (true);
    }

    // Bu metot da derleme hatası verecektir, çünkü if bloğunda değişken tanımlaması yapılamaz
//	public static void f(int i) {
//	 if(i == 5)
//		 int k = 8;
//	 }
}
