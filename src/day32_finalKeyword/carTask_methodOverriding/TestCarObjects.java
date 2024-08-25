package day32_finalKeyword.carTask_methodOverriding;

public class TestCarObjects {

    public static void main(String[] args) {

        Audi car1 = new Audi("123", "W", 2004, 123);

        System.out.println(car1);
        car1.start();

        BMW car2 = new BMW("123", "W", 2004, 123);
        car2.start();
        System.out.println(car2);

        Toyota car3 = new Toyota("123", "W", 2004, 123);
        car3.start();
        System.out.println(car3);

        Honda car4 = new Honda("123", "W", 2004, 123);
        car4.start();
        System.out.println(car4);

        Tesla car5 = new Tesla("Model S", "White", 2010, 112323);
        car5.start();
        System.out.println(car5);


    }
}
