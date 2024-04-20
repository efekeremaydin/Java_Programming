package day18_garbageCollection;

public class TestPizzaObjects2 {

    public static void main(String[] args) {

         // new Pizza(); // const is same name as class name. const are methods. in order to use it we need to store in var

        Pizza2 pizza1 = new Pizza2(); // datatype decides what can be stored in this var

        //object is stored in pizza1

//        pizza1.size = 'L';
//        pizza1.numberOfCheeseTopping = 2;

        pizza1.setInfo('L', 2, 3);

        Pizza2 pizza2 = new Pizza2();
        // pizza2.size = 'M';

        pizza2.setInfo('S', 1, 2);


        System.out.println(pizza1.toString()); // you dont need to call toString method as it's called implicitly
        System.out.println(pizza2);


        System.out.println("--------");


        double total = 0;

        for (int i = 0; i < 20; i++) {
//            Pizza pizzaI = new Pizza();
//            pizzaI.setInfo('M', 2, 2);
//            System.out.println(pizzaI);

            Pizza2 small = new Pizza2();
            small.setInfo('S', 2, 2);
            total += small.calcCost();

            Pizza2 medium = new Pizza2();
            medium.setInfo('M', 3, 4);
            total += medium.calcCost();
            Pizza2 large = new Pizza2();
            large.setInfo('L', 4, 5);
            total += large.calcCost();
        }

        System.out.println("Total Cost = " + total);






















    }
}
