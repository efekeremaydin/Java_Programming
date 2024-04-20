package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {
        // ind of el:     0   1   2     0    1   2  3   4      0   1
        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}}; // index: 0 ~ 2
        // ind of 1D array     0                 1               2

       /* for (int[] each : arr2D) {
            System.out.println(Arrays.toString(each));
            for (int each2 : each) {
                System.out.println(each2);
            }
        }*/

        for (int i=0; i<arr2D.length; i++){ // i: ind number of 1D arrays in array2D
            int[] each1D = arr2D[i]; // asssign each 1D array to each1D in every loop
            System.out.println(Arrays.toString(each1D)); // print each 1D

            for (int j = 0; j<each1D.length; j++){ // each element of each1D needs to be iterated.
                // j: ind number of elements in each 1D array of arr2D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("---");

        for (int[] each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray));
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

        // for each loop is shorter and readable
        // for loop is more powerful


        System.out.println("---");


        for (int i = 0; i < arr2D.length; i++) {

        }


        // all elements in reversed order
        for (int i = arr2D.length - 1; i >= 0; i--) { // i each 1d array
            for (int j = arr2D[i].length - 1; j >= 0; j--) { // j ind no of each element of the 1d arrays
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("---");
        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }



















    }
}
