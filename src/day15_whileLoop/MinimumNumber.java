package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647; // 20, -5
        // any int number user enters will ALWAYS be less than 2147483647

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = input.nextInt(); // 20, 30, -5, 100, 200

            if (num < min){ // if the user entered number is less than the current number
                min = num; // then the user entered number is the min number
            }

        }

        System.out.println("min = " + min);

        input.close();;
    }
}
