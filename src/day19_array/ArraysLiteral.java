package day19_array;

import java.util.Arrays;

public class ArraysLiteral {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {1, 2, 3, 4, 5}; // Array Literal., you can use this if you know the elements
        // above are two different obj in heap mem

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("----");

        // given the number print the day of the week

        // element         1      2      3      4      5      6      7
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        // index           0      1      2      3      4      5      6

        int n = 1;
        System.out.println(days[n - 1]);


        System.out.println("----");

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        /*below is what happens in the background
        month = new String[12];
        month[0] = "Jan;
         */

        System.out.println("months = " + Arrays.toString(months));

        System.out.println("---");

        // it's not wise to print all numbers between 1-100 by Array Literal
        //int[] numbers1 = {1,2,3,4 ...}
        int[] numbers2 = new int[100];

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }





    }
}
