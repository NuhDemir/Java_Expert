package ch008;

public class WindowTest {

    public static void main(String[] args) {
        Window window = new Window();
        window.setOpen(true);
        System.out.println("Open? : " +window.isOpen());

        window.close();
        System.out.println("Open? : " +window.isOpen());
    }
}
