package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // we have loops so we dont have to repeat

        int max = -2147483648; // 10, 20
        // any int number user enters will ALWAYS be greater than -2147483648
        //int num = 0;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i <5 ; i++) {  // i: 0, 1, 2, 3, 4
            // if you know the iter. for loops is best. if cond is never false then the loop will be infinite
            System.out.println("enter a number");
            int num = input.nextInt(); // 10, 5, 3, 20, 15
            if (num > max){ // true, false, false, true, false
                // if the user enters a number greater than the current max number we have
                max = num; // max: 10, 10, 10, 20, 20
                // then that number should be the max number
            }
        }
        System.out.println("max = " + max);



    }


}

/*
Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */
