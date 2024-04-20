package day20_forEach;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // this is to iterate the ind number for arr3 for the second loop

        for (int i = 0; i < arr1.length; i++, k++) { // i  : for first array's index numbers
            arr3[k] = arr1[i];
        }

        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's ind numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("----");


        int[] a1 = {10,20,30,40,50,60};
        int[] a2 = {70,80,90};

        // System.out.println(Arrays.toString(ArraysUtility.merge(a1, a2)));

        int[] a3 = ArraysUtility.merge(a1, a2);
        System.out.println(Arrays.toString(a3));


        System.out.println("---");

        double[] b1 = {10.5, 5.5};
        double[] b2 = {20.5, 15.5};

        double[] b3 = ArraysUtility.merge(b1, b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("----");

        char[] ch1 = {'K', 'C'};
        char[] ch2 = {'M'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("---");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};

        String[] c3 = ArraysUtility.merge(c1, c2);
        System.out.println(Arrays.toString(c3));

    }
}

/*
2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */