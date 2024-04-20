package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers);
        System.out.println(list1);

        list1.addAll(1, numbers);
        System.out.println(list1);

        System.out.println("---");

        ArrayList<Integer> scores = new ArrayList<>();

        //scores.addAll(57, 45, 34 ); not possible

        // asList(): allows to pass multiple elements and return you a List that contains the specified elements

        scores.addAll(Arrays.asList(75, 85,95, 80, 100));

        System.out.println(scores);

        System.out.println("---");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Qadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));

        System.out.println(students);

        System.out.println("---");

        Integer [] nums = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> l1 =  new ArrayList<>(Arrays.asList(nums)); // this is an overloaded constructor. This can take collection. when it creates the object, you will get all the elements of the above array. This constructor implicitly uses below addAll method

        // l1.addAll(Arrays.asList(nums)); // you can convert array to array list if it's non-prim

        System.out.println(l1);

        System.out.println("---");

        // contains - one element
        // containsAll - all elements

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena);
        
        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);

        boolean hasMuhtarAliKuzzat = employeesList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);


        System.out.println("---");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50,60, 70, 10,10,10,10, 20,20,20));
        // remove all 10 and 20

        list.removeAll(Arrays.asList(10,20));

        System.out.println("list = " + list);


        System.out.println("----");

        // removeAll: removes all elements mentioned
        // retainAll: opposite of removeALl. decrease the size. retain the elements that are matching.


        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena"));

        developers.retainAll(Arrays.asList("Alena", "Khashayar", "Muhtar"));

        System.out.println("developers = " + developers);

        System.out.println("---");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels"));

       // groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));
        System.out.println("groceriesList = " + groceriesList);

        groceriesList.removeAll(Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels"));
        System.out.println("groceriesList = " + groceriesList);





















    }
}
