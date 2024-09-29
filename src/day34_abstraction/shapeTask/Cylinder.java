package day34_abstraction.shapeTask;

import static day34_abstraction.shapeTask.Circle.PI;

public class Cylinder extends Shape implements Volume{

    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return 2*PI*radius*radius*height + 2*PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 4*radius+2*height;
    }

    @Override
    public double volume() {
        return PI*radius*radius*height;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "height=" + height +
                ", radius=" + radius +
                ", area=" +area() +
                ", perimeter=" + perimeter() +
                ", volume=" +volume() +
                '}';
    }
}
