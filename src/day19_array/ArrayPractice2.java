package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {
        
        int[] arr1 = new int[100];
        System.out.println("arr1 = " + Arrays.toString(arr1));

        for (int i = 0, j =1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));

        for (int i = 0, j =10; i < arr1.length; i++, j+=10) {
            arr1[i] = j;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println("---");
        System.out.println("arr1 = " + Arrays.toString(arr1));

        int[] arr2 = new int[100]; // index: 0 ~ 99

        System.out.println("arr2 = " + Arrays.toString(arr2));
        int a = arr2.length;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = a;
            a-=1;
        }
        System.out.println();

        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println("---");

        for (int i = 0, j=100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println("---");

        for (int i = 100; i < arr2.length; i++) {
            arr2[i] = 100-i;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2));

    }
}
