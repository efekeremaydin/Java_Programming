package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        double num1 = input.nextDouble();

        System.out.println("enter second number");
        double num2 = input.nextDouble();

        System.out.println("enter math operator");
        char operator = input.next().charAt(0);

        //boolean validOperator = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) { // while the operator is invalid
            System.err.println("invalid operator, please enter a valid operator");
            operator = input.next().charAt(0);
        }

        if (operator == '+') { // only time this runs is when operator is valid
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }

        input.close();

    }
}
