package day19_array;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50}; // heap // room has 3 doors // door
        int[] arr2 = arr1; // assing first array obj to second array var // door
        int[] arr3 = arr1; // assiging second aray to third array var // door

        // totla we have only one obj ion the heap
        // 3 var ref to the same obj

        arr1[0] = 1000; // this will change this index number for all var
        arr2[2] = 3000;// this is still updating the first array obj

        // ref vars will be in stack, everytime they return you the obj in the heap


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // can multiple objs be ref by one var?

        System.out.println("---");
        String[] a1 = {"Umran", "Mehmet"}; // eligible for GC cuz one ref cannot ref more than one obj at a time. this becomes unreachable after line 31

        a1 = new String[]{"James", "Daniel"};
        System.out.println(Arrays.toString(a1));

    }
}
