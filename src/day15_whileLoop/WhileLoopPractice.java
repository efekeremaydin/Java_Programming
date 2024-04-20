package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your age");

        int age = input.nextInt();


//         while ( !(age>=1 && age <= 150) ) // another way
        while (age<=1 || age >= 150){ // exact iter is unknown. this means: while the age is invalid
            System.err.println("invalid age, please re-enter your age");
            age = input.nextInt(); // ask this over and over again until user enters a valid age
        }
        if (age >= 21){
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

        input.close();







    }
}
