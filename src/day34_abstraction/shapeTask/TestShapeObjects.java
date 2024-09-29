package day34_abstraction.shapeTask;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);
        Circle circle = new Circle(5);
        Cube cube = new Cube(5);
        Cylinder cylinder = new Cylinder(5, 5);

        System.out.println(square);
        System.out.println(circle);
        System.out.println(cube);
        System.out.println(cylinder);
    }
}
