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

        Rectangle rectangle = new Rectangle(5,5);

        System.out.println(rectangle);
        rectangle.draw();

        System.out.println("---");

        Triangle triangle = new Triangle(5,2,3, 3);
        System.out.println(triangle);

        triangle.draw();




    }
}
