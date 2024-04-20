package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*String answer = "yes";

        while (answer.equals("yes")){

        }*/
        // another way above
        while (true){
            System.out.println("enter a number");
            int number = input.nextInt();

            if (number % 2 ==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }

            System.out.println("enter again? yes/no");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){ // while the user provides invalid answer. we had to add this to fix the bug of entering another answers such as "maybe"
                System.err.println("invalid. enter again? yes/no");
                answer = input.next().toLowerCase();

            }
            if (answer.equals("no")){
                break;
            }


        }

    }




}
