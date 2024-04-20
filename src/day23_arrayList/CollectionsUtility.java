package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8));

        int max = Collections.max(list); // unboxing
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // you can find 2nd/3rd by removing the first max number first

        System.out.println("---");

        // sort()

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels"));
        
        Collections.sort(items); // sorts in ascending order
        System.out.println("items = " + items);

        System.out.println("---");

        // reverse()
        
        Collections.reverse(items);

        System.out.println("items = " + items);

        System.out.println("---");

        // swap ()

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Qadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println("students = " + students);
        Collections.swap(students, 0, 1);
        System.out.println("students = " + students);

        // swap first and last
        Collections.swap(students, 0, students.size()-1);
        System.out.println("students = " + students);




        
















    }
}
