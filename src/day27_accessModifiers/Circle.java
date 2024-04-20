package day27_accessModifiers;

import java.util.Random;

public class Circle {

    public double radius;

    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius) { // to set inst var we need const
        this.radius = radius; // to set the radius of the circle. we need this keyword as local and inst var are same name.
        //this.diameter = radius*2; we dont need this keyword here
        diameter = radius * 2;
    }

    /*public static double calcArea(double radius){ // if you use inst var then you need to use inst met
    // static only accepts statics - it can share whatever class has cuz static meth belongs to class
    // class cannot share whatever the obj has
        double area = radius*radius*pi;
        return area;
    }*/

    // accessing static is a lot easier as it can be just accessed via class (and no mem allocated) but not everything can be stat
    // to access instance var you need to create obj

    public double calcArea(){ // if you use inst var then you need to use inst met
        // area for each circle obj should be different
        // inst meth can access any inst/stat var cuz inst belong to the obj whereas static belongs to the class
        // obj members can share class members cuz all the obj come from the class, so they share all the obj
        // if you use any inst var then the var can't be static
        //double area = radius*radius*pi;
        return radius * radius * pi;
    }

    public double calcPerimeter(){ // since we only use inst var m should be inst
        //double perimeter = diameter*pi;
        return diameter*pi;
    }

    public static void printPiValue(){ // we dont need any inst so this m needs to be static
        // it's better to use this one as you can just call by class name
        // static accepts static
        // if you make this method instance then everytime you want to print this you need to create an obj, it will also waste the memory
        // every circle has the same pi value
        // so making this as a class member it will be shared by all the objs
        System.out.println("Pi value is: " + pi);
    }

    public String toString() { // this also needs to be an instance method as it has instance var
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi + // inst m can still access to static var
                ", area=" + calcArea() + // can directly pass the m as it's a return m
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */
