package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int num = 0;
        for (int i = 0; i <10; i++){ // variable by default is i. they always use i for for loop. it could be anything. i stands for init.
            System.out.println("enter a number 10 times");
            int num = input.nextInt();
            //num += input.nextInt();
        }
        // System.out.println(num);

        // iterating backwards - for data structure or String that you need to reverse

        int sum = 0; // declare a var start with 0

        for (int i = 0; i < 5; i++) { // sum of 5 numbers
            System.out.println("enter a number");
            sum += input.nextInt(); // in oder to add input to the var sum we can use += operator.
        }
        System.out.println("sum = " + sum);

        // write a program that can ask user to enter a number 5 times, print the max number


       /* int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            int num5 = input.nextInt();
        }*/
       /* if (num1 > num2){
            if (num1 > num3){
                if (num1 > num4){
                    if (num1 > num5){
                        System.out.println("");*/


        // write a program that can ask user to enter a number 5 times, print the min number







    }
}
