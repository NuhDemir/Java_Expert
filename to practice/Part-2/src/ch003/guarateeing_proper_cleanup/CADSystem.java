package ch003.guarateeing_proper_cleanup;

class Shape {
    Shape(int i) {
        System.out.println("Shape Constructor.");
    }

    void dispose() {
        System.out.println("Shape dispose.");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle.");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle.");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle.");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + " - " + end);
    }

    @Override
    void dispose() {
        System.out.println("Erasing Line: " + start + " - " + end);
        super.dispose();
    }
}


public class CADSystem extends Shape {
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[5];

    public CADSystem(int i) {
        super(i + 2);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j * j);
        circle = new Circle(1);
        triangle = new Triangle(1);
        System.out.println("Combined Constructor.");
    }

    @Override
    void dispose() {
        System.out.println("CADSystem.dispose()");
        super.dispose();
        triangle.dispose();
        circle.dispose();
        for (int i= lines.length-1;i>=0;i--)
            lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem cadSystem = new CADSystem(22);
        try {

        }finally {
            cadSystem.dispose();
        }
    }
}
