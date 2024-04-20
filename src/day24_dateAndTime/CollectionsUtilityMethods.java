package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

/*        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")){
                names.set(i, "Python");
            };
        }
        System.out.println(names);*/

        Collections.replaceAll(names, "Java", "Python");
        System.out.println(names);

        System.out.println("---");

        // frequency()

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,30,40,40, 50, 50, 50,50,50, 60, 60, 50,50,50));

        int count = Collections.frequency(list, 50); // compares the element and increases the freq by 1
        System.out.println(count);

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println("---");
        int countJava = Collections.frequency(words,"Java");

        System.out.println(countJava);

        System.out.println("---");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,40,40, 50, 50, 50,50,50, 60, 60, 50,50,50));

        for (Integer each : numbers) {
            if (Collections.frequency(numbers, each) == 1){
                System.out.println(each + " is unique");
            }
        }




    }
}
