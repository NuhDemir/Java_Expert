package ch006.iinterfaces.interfacesdemo;

public class Main {
    public static void main(String[] args) {
        // Worker nesnesini oluştururken, amount (ücret) parametresini geçmelisiniz
        Worker worker1 = new Worker("Ali", "Sales Management");

        System.out.println(worker1.getName().toLowerCase());
        System.out.println(worker1.getPosition());

        // pay metodunu çağırın, ancak System.out.println kullanmadan
        worker1.pay(); // Kullanıcıdan ücret girişi alınıyor ve işlem yapılıyor.
    }
}
