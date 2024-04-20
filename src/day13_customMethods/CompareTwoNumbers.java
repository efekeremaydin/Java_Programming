package day13_customMethods;

public class CompareTwoNumbers {

    public static void main(String[] args) {

        String result = compareNumbers(35, 50);
        System.out.println(result);


    }

    public static String compareNumbers(int number1, int number2) {

        // String result;

        if (number1 > number2) {
            return "number1 is greater";
        } else if (number2 > number1) {
            return "number2 is greater";
        }
        return "equal";
    }
}



/*
Write a Java program to compare two numbers,(Outputs: number1 is greater, number2 is greater, numbers are equal)
 */
