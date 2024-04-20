package day25_constructors;

public class Rectangle {

    // length width - instance or not? depending on if you want diff data for each obj
    // if you need diff then you need instance

    public double length, width; // more obj diff length and width

    // const.
    // access modifier: yes
    // no specifier or return type.
    // name should be same with class name
    // also a method. we can use that to set length and width.
    // this method is used for creating objects but at the same time we can use it to set length and width
    // so we need param. how many? 2. length and width. if you pass param that means;
    // if you create the const yourself compiler doesnt create the default const. this means you have to use this c everytime you create the obj.
    // when c exec two arg will be given, once they are given you need to use this keyword with these arguments to set the length and width of each rec object. so you need to assign the args to the instance vars length and width
    // if you notice these are the same code fragments we used in the setInfo method's body
    // when you define c yourself you can also determine how the objects should be created
    // so defined some requirements and conditions for the obj to be created
    // cond here: when you create the obj l and w must be passed.

    // first option is to create const cuz classes are created to creat the objs
    // when we use const to create the obj we can also use it for setting the instances
    // so no need for setinfo
    //
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }



    /*public void setInfo(double length, double width){
        this.length = length; // how to ensure that the param will be assigned to length and width? we use this keyword and assign the arg to it
        this.width = width;
    }*/

    // this solution still works but can it be optimised?
    //

    // actions
    // calcArea

    public double area(){
        return length*width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }

    // everytime when create rec obj you need to sent instances length and width
    // so instead of calling one by one with setInfo













}

