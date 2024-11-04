package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObjects {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza('M', 3, 2);
        Pizza pizza2 = new Pizza('L', 3, 2);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza1.equals(pizza2));

        Object pizza3  = (Object)new Pizza('M', 3, 2); // upcasting

        boolean r = pizza3.equals(pizza1); // obj type determines which equals() m will get executed
        System.out.println(r);

        // pizza3.calcCost(); // not possible since Object hasn't got this m so it needs to be downcasted

        double total = ( (Pizza)pizza3 ).calcCost();
        System.out.println(total);

        //double area = ((Circle)pizza3).area(); // this will be ClassCastException as there's no IS-A rel. btw Pizza and Circle so it can't be downcasted

        //System.out.println(area);





    }
}
