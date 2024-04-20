package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for (Integer element : list) {

            int frequency = 0;
            for (Integer each : list) {
                if (each == element){
                    frequency++;
                }
            } // he creates the inner loop and adds another outer loop, that i need
            if (frequency ==1){
                System.out.println(element);
                break; // after printing the first unique element, exit the loop
            }
        }

        //int element = 1;
       // int frequency = 0;

      /*  for (Integer each : list) {
            if (each == element){
                frequency++;
            }
        } // he creates the inner loop and adds another outer loop, that i need to learn!
*/














    }
}
