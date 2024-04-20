package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // Remove duplicates from an ArrayList

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); // 2
        names.add("Sumeye"); // 3
        names.add("Ali"); // 4
        names.add("Sumeye"); // 5

        System.out.println(names);
        ArrayList<String> nonDuplicates = new ArrayList<>();

//        boolean r1 = names.contains("Ali");
//        System.out.println(r1);

/*        for (String each : names) {
            if (!names.contains(each)){
                nonDuplicates.add(each);
            }
        }*/




        for (String each : names) {
            if (nonDuplicates.contains(each)){
                continue;
            }
            nonDuplicates.add(each);
        }
        names = nonDuplicates;
        System.out.println(names); // GC collected names var
        System.out.println(nonDuplicates);

      /*  for (String each : names) {
            if (names.contains(each)){
                names.remove(each);
            }
        }
        System.out.println(names);*/



    }
}
