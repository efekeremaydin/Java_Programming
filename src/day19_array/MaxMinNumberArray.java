package day19_array;

import java.util.Arrays;

public class MaxMinNumberArray {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber){
                maxNumber = i;
            }
        }

        System.out.println(maxNumber);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber){
                minNumber = i;
            }
        }
        System.out.println(minNumber);

    }


}

/*
	1. Write a program that can find the maximum number from an array

	2. Write a program that can find the minimum number from an array
 */