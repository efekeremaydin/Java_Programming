package day36_polymorphism;

public class Circle {

    private double radius;

    public final static double PI = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return PI * radius * radius;
    }

    public double perimeter(){
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


    // == compares objects
    // equals() compares value of the objects


    @Override
    public boolean equals(Object obj) { // this obj can ref to any obj as ref type is Object =>pm

        if (!(obj instanceof Circle)) { // if the specified obj is not circle, then we should not compare them
            System.err.println("Invalid Object");
            System.exit(1);
        }

        if (this.radius == ( (Circle)obj ).radius) { // downcasting. if the current circle radius is equal to the given circle's radius, then two circles are equal. using "this" is not a must here as there's only one radius var.
            return true;
        }
        return false;
        //return super.equals(obj);
    }










}

