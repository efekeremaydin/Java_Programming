package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter?");
        int number = input.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < 5; i++) {
            System.out.println("enter number");
            int n = input.nextInt();
            arr[i] = n;
        }

        System.out.println(Arrays.toString(arr));


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/number);
    }

}

/*
5. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number

 */