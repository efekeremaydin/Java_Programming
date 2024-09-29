package day34_abstraction.shapeTask;

public class Cube extends Shape implements Volume {
    private double side;

    public Cube(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side * 6;
    }

    @Override
    public double perimeter() {
        return side * 12;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +
                "volume=" + volume() +
                '}';
    }
}
