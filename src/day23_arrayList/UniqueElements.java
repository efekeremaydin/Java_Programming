package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        // Print the unique names from this ArrayList

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); // 2
        names.add("Sumeye"); // 3
        names.add("Ali"); // 4
        names.add("Sumeye"); // 5
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");




        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){ // if the first time the element appeared in the array list equals to the last time it appears then it's unique
                System.out.println(each);
                // break; // first unique
            }
        }


        // Unique elements approaches:
        // freq = 1
        // first and last time index equal






    }
}
