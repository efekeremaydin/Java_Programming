package day11_string;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        System.out.println("Please enter two strings");
        System.out.println("Enter the first one:");
        String firstString = input.nextLine();

        System.out.println("Enter the second one:");
        String secondString = input.nextLine();

        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();

        if (firstStringLength > secondStringLength){
            System.out.println(firstString);
        } else if (secondStringLength > firstStringLength){
            System.out.println(secondString);
        } else {
            System.out.println("Equal");
        }
        input.close();

 */

        System.out.println("Please enter two strings");
        System.out.println("Enter the first one:");
        String first= input.nextLine();

        System.out.println("Enter the second one:");
        String second= input.nextLine();

        input.close();

        if (first.length() > second.length()){
            System.out.println(first);
        } else if (second.length() > first.length()) {
            System.out.println(second);
        } else{
            System.out.println("Equal");
        }




    }
}

/*
	1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"

 */
