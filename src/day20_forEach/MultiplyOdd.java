package day20_forEach;

import java.util.Arrays;

public class MultiplyOdd {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};

        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 != 0){
                arr[i]= arr[i] *2;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
