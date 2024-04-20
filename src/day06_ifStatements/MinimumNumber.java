package day06_ifStatements;

public class MinimumNumber {

    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 20;

        String result = "";

        if (num1 > num2){
            result = num2 + " is the min number";
        }
        if (num1 < num2){
            result = num1 + " is the min number";
        }
        if (num1 == num2){
            result = "equal";
        }

        System.out.println(result);



    }
}
/*
1. Create a class named MinimumNumber.java
2. Declare the following variables: 1. num1
2. num2
3. Write a program that can print the minimum number between the two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
10 is the minimum number
 */