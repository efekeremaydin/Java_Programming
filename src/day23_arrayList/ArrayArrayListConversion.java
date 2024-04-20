package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);

        System.out.println("----");


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));

        String[] languages = list2.toArray(new String[list2.size()]); // number will be min size, best practice is give 0. or give list2.size

        System.out.println(Arrays.toString(languages));

        System.out.println("---");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer[] n = nums.toArray(new Integer[0]);
        //int[] n = nums.toArray(new Integer[0]); // error due to prim
        System.out.println(Arrays.toString(n));

        //EXTRA: Create a ArraysUtility method which will take prim arr and coverts it to Wrapper class and then converts to ArrayList









    }
}
