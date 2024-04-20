package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};
        // if i don't want to change their group:
        // container for arrays: MD A

        System.out.println("---");

        // int[][] arr2D = {10, 20, 30, 40};

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}, {1000, 2000}};
        // 4 1D array here

        System.out.println(arr2D.length); // 4
        System.out.println(Arrays.deepToString(arr2D));

        int[][] arr2D2 = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}, arr4};
        System.out.println(Arrays.deepToString(arr2D2));

        int[][] arr2D3 = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}}; // index: 0 ~ 2
        //                      0                   1              2
        // MultiD array is container for arrays not elements, each array has index
        // Single array is container for elements, each element has index

        System.out.println(Arrays.toString(arr2D3[1]));
        System.out.println(Arrays.toString(arr2D3[0]));
        System.out.println(Arrays.toString(arr2D3[2]));

        System.out.println(arr2D3[2][0]); // 90
        System.out.println(arr2D3[1][2]); // 60



























    }
}
