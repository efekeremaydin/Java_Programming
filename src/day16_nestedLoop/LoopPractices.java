package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {


        for (int i = 1; i < 6; i++){ // i is local var. cannot be used outside of the loop

            System.out.println("Hello " + i);

        }
        // System.out.println(i); do not exist
        System.out.println("-----");

        for (int i = 0; i < 5; i++) { // you can still use this i here.
            System.out.println("Hello " +i);
        }

        System.out.println("---");

        int j = 0; // you can't use this j again in the next while loop as it will reassign it. this is one of the disadv of while loop compared to for loop
        while (j<5){ // this while loop is like for loop if you use it like this
            System.out.println("Hello " + j);
            j++;
        }

        System.out.println("0---");

        int k = 0;
        do {
            System.out.println("Hello " + k);
            k++;
        }while (k<5);

        System.out.println("---");

        Scanner input = new Scanner(System.in);
        System.out.println("enter your score");

        int score = input.nextInt();

        // while (score >100 || score<0) another way
        while (! (score>=0 && score <=100) ){ // while score is invalid
            // you can use this if you want to inf. provide user option to enter something if they don't enter it right
            System.err.println("invalid, please re-enter");
            score = input.nextInt();
        }
        if (score >= 60){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }








    }
}
