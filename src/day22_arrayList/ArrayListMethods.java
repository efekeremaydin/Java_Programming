package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // autobox internally happens here, everytime the size increases by 1 // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(10); // duplicates allowed // 3


        // list.add(5.5); // no double as ArrayList is Integer.

        // list is ordered data collection, follow the ind order.

        System.out.println(list);

        list.add(1, 15); // shifts the indexed element to the right

        System.out.println(list);

        list.add(2, 25);
        System.out.println(list);

        System.out.println("---");

        ArrayList<String> studensList = new ArrayList<>();
        studensList.add("Mohammad");
        studensList.add("Abdurasul");
        studensList.add("Abidullah");
        studensList.add("Tatiana");

        System.out.println(studensList.size());
        System.out.println(studensList);

        String firstStudent = studensList.get(0);

        System.out.println(firstStudent);

        String lastStudent = studensList.get(studensList.size()-1);

        System.out.println(lastStudent);

        System.out.println("---");

        for (String each : studensList) {
            System.out.println(each);
        }

        for (int i = 0; i < studensList.size(); i++) {
            System.out.println(studensList.get(i));
        }




    }
}
