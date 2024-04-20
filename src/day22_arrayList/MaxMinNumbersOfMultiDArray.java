package day22_arrayList;

import utilities.ArraysUtility;

public class MaxMinNumbersOfMultiDArray {

    public static void main(String[] args) {

       // ind of elements:   0    1   2      0   1    2       0    1   2
        int[][] array =  { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };// ind: 0~2
        // ind of 1d array      0               1               2
        //int[] arr2 = new int[0];

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) { // 2d array you need to use 2 loops to get to the elements
            for (int eachElement : each1D) { // if you're accessing for each loop is the choice
                if (eachElement > max){
                    max = eachElement;
                }
                if (eachElement< min){
                    min = eachElement;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);


//        for (int[] each1D : array) {
//            arr2 = each1D;
//            for (int eachElement : each1D) {
//                ArraysUtility.addElement(int[] arr2, )
//            }
//        }
    }
}

/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000

 */
