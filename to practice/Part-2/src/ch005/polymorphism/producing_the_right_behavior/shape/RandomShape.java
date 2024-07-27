package ch005.polymorphism.producing_the_right_behavior.shape;

import org.w3c.dom.UserDataHandler;

import java.util.Random;

public class RandomShape {

    private Random random = new Random();

    // Rasgele bir Shape nesnesi döndüren yöntem
    public Shape get() {
        switch (random.nextInt(9)) {  // 0 ile 8 arasında rasgele bir sayı üretir.
            default:
            case 0:
                return new Circle();
            case 1:
                return new Ellipse();
            case 2:
                return new Hexagon();
            case 3:
                return new Pentagon();
            case 4:
                return new Polygon();
            case 5:
                return new Rectangle();
            case 6:
                return new Rhombus();
            case 7:
                return new Square();
            case 8:
                return new Triangle();
        }
    }

    // Rasgele Shape nesneleri içeren bir dizi döndüren yöntem
    public Shape[] array(int size) {
        Shape[] shapes = new Shape[size];  // Dizi boyutunu belirtirken hata düzeltilir.
        for (int i = 0; i < size; i++) {  // Dizi boyutuna kadar döngü oluşturulur.
            shapes[i] = get();  // Rasgele Shape nesneleri dizinin elemanlarına atanır.
        }
        return shapes;  // Diziyi döndür.
    }

    public static void main(String[] args) {
        RandomShape randomShape = new RandomShape();
        Shape[] shapesArray = randomShape.array(10);  // 10 elemanlı bir Shape dizisi oluşturulur.

        for (Shape shape : shapesArray) {
            shape.draw();  // Her bir Shape nesnesinin draw() yöntemi çağrılır.
        }
    }
}