package day20_forEach;

import java.util.Arrays; // imported

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score); // returns String

        System.out.println(result);

        System.out.println("----");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1, ch2); // order is not same
        System.out.println(r2);

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1, s2)); // order is not same

        System.out.println("---");

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums)); // before sort
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // after sort

        System.out.println("Min number is: " + nums[0]);

        System.out.println("Max number is: " + nums[nums.length-1]);

        System.out.println("---");

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1, b2)); // before sort this is false, now true

        System.out.println("---");

        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("---");

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        //int[] array2 = array; // not new object, ref to the same array obj

        // int[] array2 =  Arrays.copyOf(array, 4); // only first 4 will be copied
        int[] array2 =  Arrays.copyOf(array, 10); // after 7 elements the other elements will be 0

        System.out.println(Arrays.toString(array2));

        // another way for the merge using copyOf() method
        System.out.println("---");

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10,11,12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        System.out.println(Arrays.toString(n3));

/*        for (int i = 5, j=0; i < n3.length; i++, j++) {
            n3[i] = n2[j];
        }
        System.out.println(Arrays.toString(n3));*/

      /*  for (int i = n1.length, j=0; i < n3.length; i++, j++) {
            n3[i] = n2[j];
        }
        System.out.println(Arrays.toString(n3));*/

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i]; // get the elements of the n2 and assign one by one to the 3rd array
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("---");


        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        // index:     0    1    2    3    4    5    6
        char[] result1 = Arrays.copyOf(ch, 20);

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 5); // excludes ending index

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);
        System.out.println(Arrays.toString(result3));









    }
}
