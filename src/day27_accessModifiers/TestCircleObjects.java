package day27_accessModifiers;

public class TestCircleObjects {

    public static void main(String[] args) {

        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(7);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3); // pi is static so its value is same all the time
/*
        System.out.println(c1.pi); // static can be called via obj as well
        System.out.println(c2.pi);
        System.out.println(c3.pi);*/

        // obj shares all the class members as they come from the class
        // but this doesn't mean that you should call them via obj, they should be called via class

        System.out.println(Circle.pi);
       // System.out.println(Circle.radius); // this isn't possible as class can't access to obj instance var
        // inst can't be called via class name
        // radius belong inst
        // class can't access to obj members


        // inst multiple copies. call by obj.
        // static only one copy shared by all obj. call by class or obj name.





    }
}
