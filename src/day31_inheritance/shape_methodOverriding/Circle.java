package day31_inheritance.shape_methodOverriding;

public final class Circle extends Shape{


    public Circle(double radius) {
        setRadius(radius);
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public void draw() {
        super.draw();

        // code fragments that can draw the circle

        System.out.println("    *  ");
        System.out.println(" *     *");
        System.out.println("*       *");
        System.out.println(" *     *");
        System.out.println("    * ");
    }

   /* @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "radius=" + radius +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

