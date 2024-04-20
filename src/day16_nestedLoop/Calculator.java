package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) { // nested loop

        Scanner input = new Scanner(System.in);

        while (true) { // creating while loop with true condition so it will loop until false
            System.out.println("enter first number");
            double num1 = input.nextDouble();

            System.out.println("enter operator");
            char operator = input.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) { // if operator is not one of these
                System.err.println("invalid operator, please enter a valid operator");
                operator = input.next().charAt(0); // then enter a valid operator
            }

            System.out.println("enter second number");
            double num2 = input.nextDouble();

            if (operator == '+') { // calc steps
                System.out.println(num1 + num2);
            } else if (operator == '-') {
                System.out.println(num1 - num2);
            } else if (operator == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }

            System.out.println("Would you like to continue? yes/no"); // continue step
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) { // invalid entry for yes no step. if the entry is invalid loop will continue until user enters yes or no
                System.err.println("invalid entry, please re-enter yes/no");
                answer = input.next().toLowerCase(); // if it's yes the while loop will start over
            }

            if (answer.equals("no")) { // if no
                break; // break
            }
        }


    }


}
/*
	1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, reapet the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)

 */
