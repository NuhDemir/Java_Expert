package ch008.university;

// Ana sınıf UniversityTest
public class UniversityTest {
    public static void main(String[] args) {
        // Yeni bir Department (Bölüm) nesnesi oluştur
        Department department1 = new Department();
        department1.name = "Software Engineering"; // Bölüm adını "Yazılım Mühendisliği" olarak ata

        // Yeni bir Professor (Profesör) nesnesi oluştur
        Professor professor1 = new Professor();
        professor1.name = "Ali Safa"; // Profesör adını "Ali Safa" olarak ata

        // Yeni bir Course (Ders) nesnesi oluştur
        Course course1 = new Course();
        course1.name = "Internet Programming"; // Ders adını "İnternet Programlama" olarak ata

        // Yeni bir Student (Öğrenci) nesnesi oluştur
        Student student1 = new Student();
        student1.name = "Nuh Demir"; // Öğrenci adını "Nuh Demir" olarak ata

        // Yazılım Mühendisliği bölüm başkanı Ali Safa'dır ve bu nedenle Ali Safa'nın bölümü Yazılım Mühendisliği'dir
        department1.head = professor1; // Bölüm başkanını ata
        professor1.department = department1; // Profesörün bölümünü ata

        // İnternet Programlama dersinin bölümü Yazılım Mühendisliği'dir ve bu nedenle İnternet Programlama dersi Yazılım Mühendisliği bölümüne aittir
        course1.department = department1; // Dersin bölümünü ata
        department1.courses = new Course[100]; // Bölümün derslerini depolamak için bir dizi oluştur
        department1.courses[0] = course1; // Dersin ilk elemanını ata

        // İnternet Programlama dersinin öğretmeni Ali Safa'dır
        course1.teacher = professor1; // Dersin öğretmenini ata
        professor1.courseGiven = new Course[5]; // Profesörün verdiği dersleri depolamak için bir dizi oluştur
        professor1.courseGiven[0] = course1; // İlk dersi ata

        // Ali Safa'nın danışmanı olduğu öğrenciler dizisi
        professor1.advisee = new Student[10]; // Profesörün danışman olduğu öğrencileri depolamak için bir dizi oluştur
        professor1.advisee[0] = student1; // İlk öğrenciyi ata
        student1.advisor = professor1; // Öğrencinin danışmanını ata

        // Nuh Demir'in aldığı dersler dizisi
        student1.courseTaken = new Course[9]; // Öğrencinin aldığı dersleri depolamak için bir dizi oluştur
        student1.courseTaken[0] = course1; // İlk dersi ata

        // İnternet Programlama dersinin öğrencileri dizisi
        course1.students = new Student[100]; // Dersin öğrencilerini depolamak için bir dizi oluştur
        course1.students[0] = student1; // İlk öğrenciyi ata

        // Bilgileri ekrana yazdır
        System.out.println("Öğrenci student1'in ilk dersinin adı: " + student1.courseTaken[0].name);
        System.out.println("Öğrenci student1'in ilk dersinin profesörünün adı: " + student1.courseTaken[0].teacher.name);
        System.out.println("Öğrenci student1'in ilk dersinin profesörünün bölümünün adı: " + student1.courseTaken[0].teacher.department.name);
    }
}