package day31_inheritance.shape_methodOverriding;

public class Rectangle extends Shape {

    public double width;
    public double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * * * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*                   *");
        }
        System.out.println("\t* * * * * * * * * * *");
    }

    @Override
    public double perimeter() {
        return 2*(width + height);
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name =" + getName() +
                "width=" + width +
                ", height=" + height +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
