package day31_inheritance.shape_methodOverriding;

public abstract class Shape {

    private String name;

    public Shape() {
        setName(getClass().getSimpleName()); // this will get the class name as the name of the shape
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*public double area(){
        return 0; // every area formula is diff so we can set to 0 here, as it will be overridden
    }*/

    public abstract double area();


    /*public double perimeter(){
        return 0;
    }*/
    public abstract double perimeter();


    /*public void draw(){
        System.out.println("Drawing a " + getClass().getSimpleName() + ": ");
    }*/
    public abstract void draw();

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
