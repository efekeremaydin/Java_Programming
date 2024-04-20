package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -200;

        boolean positiveNumber = number > 0; // if the number is greater than zero, then it's a positive number
        boolean negativeNumber = number < 0; // if the number is less than zero, then it's a negative number
        // boolean isZero = number == 0; // if the number is zero, then it's zero

        boolean isZero = !positiveNumber && !negativeNumber; // if the number is not positive and negative then it's zero

        System.out.println(number + " is a positive number: " + positiveNumber);
        System.out.println(number + " is a negative number: " + negativeNumber);
        System.out.println(number + " is zero: " + isZero);






    }
}

/*
	2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */