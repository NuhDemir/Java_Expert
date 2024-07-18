package ch009.order_of_initialization;

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window window1 = new Window(1);//Before constructor

    House() {
        //show that we're in the constructor:
        System.out.println("House()");
        window3 = new Window(33);//reinitialize window3
    }

    Window window2 = new Window(2);//after constructor

    void f() {
        System.out.println("f()");
    }
Window window3 = new Window(3);//at end

}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
