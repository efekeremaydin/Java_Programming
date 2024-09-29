package day34_abstraction.shapeTask;

public class Circle extends Shape {

    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return radius * 2 * PI;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
