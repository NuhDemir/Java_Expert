package ch007.files;

import java.io.*;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {
        getFileInfo();
        writeFile();
        readFile();
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
            System.out.println("Dosya adı: " + file.getName() + " " + file.canWrite() + " " + file.canRead());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\EvAn\\Desktop\\Github\\4-Java\\Java_Expert\\to practice\\Part-2\\src\\ch007\\files\\student.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new File("C:\\Users\\EvAn\\Desktop\\Github\\4-Java\\Java_Expert\\to practice\\Part-2\\src\\ch007\\files\\student.txt"));
writer.write("Ahmet");
System.out.println("Dosyayı okuma: ");
writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
