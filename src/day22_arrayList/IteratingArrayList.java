package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3, 255);
//        numbers.add(300, 2000); // ind out of bounds, you can't skip the index with this method

        System.out.println(numbers); // {100,200,300,255,400,500}

        for (int i = 0; i < numbers.size(); i++) {
            //System.out.println(numbers.get(i));
            int each = numbers.get(i);
            System.out.println(each);
        }

        System.out.println("---");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---");

        for (Integer each : numbers) { // this can also be int each however it's best to keep as Integer
            System.out.println(each);
        }


    }
}
