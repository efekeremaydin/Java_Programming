package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        System.out.println(ArraysUtility.contains(arr, 2));

        System.out.println("---");

        char[] arr2 = {'a', 'b', 'c'};
        System.out.println(ArraysUtility.contains(arr2, 'd'));

        System.out.println("---");

        String[] arr3 = {"abc", "def"};

        System.out.println(ArraysUtility.contains(arr3, "abcd"));

        System.out.println("---");
        int[] numbers = {10,20,30,40,50,60,70,90};

        System.out.println(ArraysUtility.contains(numbers, 25));


        System.out.println("---");
        String[] students = {"Sumeye", "Hamza", "Marika"};

        System.out.println( ArraysUtility.contains(students, "Khashayar"));

        System.out.println("---");

        int[] arr1 = {10,20,30,40};

        System.out.println(Arrays.toString(ArraysUtility.remove(arr1, 2)));

        System.out.println("--");

        int[] arr5 = {10,10,20};
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(ArraysUtility.removeDup(arr5)));

        String[] arr6 = {"James", "Kane"};

        System.out.println(Arrays.toString(ArraysUtility.remove(arr6, 1)));

        String[] arr7 = {"James", "James", "kane"};
        System.out.println(Arrays.toString(ArraysUtility.removeDup(arr7)));


    }

}
