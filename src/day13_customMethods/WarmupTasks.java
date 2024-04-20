package day13_customMethods;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class WarmupTasks {

    public static void main(String[] args) { // returnType and methodName is MUST
        // method cannot be created inside a method
        // it has to be inside the class outside the method

        // calculate(1, 2, '^');

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("enter your two numbers and a math operator");
        double n1 = input.nextDouble(),
                n2 = input.nextDouble();
        char operator = input.next().charAt(0);
        input.close();



        calculate(n1, n2, operator);

         */

        ageGroup(0);

        eligibleToVote(21, true);

    }

    public static void calculate(double num1, double num2, char mathOperator) { // if data is needed we need to pass this via param

        /*
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

         */

        /*
        if (mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/' || mathOperator == '%') {
            if (mathOperator == '+') {
                System.out.println(num1 + " + " + num2 + " = " + addition);
            } else if (mathOperator == '-') {
                System.out.println(num1 - num2);
            } else if (mathOperator == '*') {
                System.out.println(num1 * num2);
            } else if (mathOperator == '/') {
                System.out.println(num1 / num2);
            } else if (mathOperator == '%') {
                System.out.println(num1 % num2);
            } else {
                System.err.println("invalid operator");
            }
        }

         */

        switch (mathOperator) { // use the minimise button to see if curly braces are there. once completed also minimise the method's body to have it readable
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + Math.round(num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.err.println("invalid operator");
        }


    }

    public static void ageGroup(int age) {
/*
        if (age >= 0 && age < 150) {

            if (age < 21) {
                System.out.println("Teenager");
            } else if (age < 55) {
                System.out.println("Adult");
            } else if (age >= 55) {
                System.out.println("Senior");
            }

        } else {
            System.err.println("invalid");
        }

 */

        if (age >= 0 && age < 150) {
            System.out.println((age < 21) ? "Teeneager" : (age < 55) ? "Adult" : "Senior");
        } else {
            System.out.println("invalid");
        }
    }

    public static void eligibleToVote(int age, boolean isAmerican) {

        if (age >= 18 && isAmerican) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }
}


/*
Warmup task:
	1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote
 */