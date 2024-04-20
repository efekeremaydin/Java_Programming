package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your age:");
        int age = input.nextInt(); // valid age 1-120

        while( !(age >=1 && age <=120) ){ // inside the paranthesis provide the valid cond.
            // while the age is not valid. valid data will make the while loop false so it won't be executed.
            System.err.println("invalid age, please re-enter your age:");
            age = input.nextInt();
            // if you want to limit the number of times loop gets executed then you should use for loop
        }

        System.out.println("are you a US citizen? Yes/No");
        String citizen = input.next().toLowerCase();

        while (!(citizen.equals("yes") || citizen.equals("no") )){ // while the answer is neither yes or no
            System.err.println("invalid entry, please enter yes or no without any spaces");
            citizen = input.next().toLowerCase();
        }

        if (age >=21 && citizen.equals("yes")){
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
        input.close();















    }
}
