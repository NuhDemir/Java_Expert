package ch007.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        getFileInfo();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\EvAn\\Desktop\\Github\\4-Java\\Java_Expert\\to practice\\Part-2\\src\\ch007\\files\\student.txt");
        try {

            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu!");
            } else {
                System.out.println("Dosya zaten mevcut!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void getFileInfo() {
        File file = new File("C:\\Users\\EvAn\\Desktop\\Github\\4-Java\\Java_Expert\\to practice\\Part-2\\src\\ch007\\files\\student.txt");
        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName()+" "+file.canWrite()+" "+file.canRead());
        }
    }
}
