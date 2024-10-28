package day36_polymorphism;

import day34_abstraction.carTask.Honda;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // compares location (in the heap mem) of the objects so this will be FALSE

        System.out.println(circle1.equals(circle2)); // this doesnt give ce due to pm obj is Object and implicit upcasting happening with Circle.

        //System.out.println(circle1.hashCode() == circle2.hashCode());

        //System.out.println(circle1.equals("Java"));

        System.out.println(circle1.equals(circle3));

        System.out.println("---");

        IPhone2 phone1 = new IPhone2("IPhone 12", "Pro Max","M", 132, "Black");
        IPhone2 phone2 = new IPhone2("IPhone 12", "Pro Max","M", 123, "Black");

        System.out.println(phone1.equals(phone2));
        //System.out.println(phone1.equals(circle1));

        Honda2 honda1 = new Honda2("123", "grey", 2033, 123123);
        Honda2 honda2 = new Honda2("123", "grey", 2033, 123123);

        System.out.println(honda1.equals(honda2));



    }









}
