package day20_forEach;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};

        for (int i = 0, j = arr.length; i < arr.length; i++, j--) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }
}
