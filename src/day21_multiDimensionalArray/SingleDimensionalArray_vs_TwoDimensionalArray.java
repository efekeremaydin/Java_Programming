package day21_multiDimensionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {

    public static void main(String[] args) {

        int[] arr1D = new int[10]; // contains 10 elements
        arr1D[0] = 100;
        System.out.println(Arrays.toString(arr1D));

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        int[] arr3 = {9,10};
        int[] arr4 = {11,12,13,14,15};
        int[] arr5 = {16,17,18,19,20,21};

        int[] arr6 = {30,40,50,60,70,80,90};

        int[][] arr2D = new int[5][]; // 5 1D arrays. index: 0~4

        // arr2D[0] = 100; // this will give error as it's 2D array
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;
        // arr2D[5] = arr6; // exception

        System.out.println(Arrays.deepToString(arr2D)); // for obj default value is null





    }
}
