package day31_inheritance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);
        square.draw();

        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.draw();

        System.out.println("----");





    }
}
