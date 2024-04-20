package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

//        System.out.println("".charAt(0));
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = input.nextLine();
        input.close();

        if ((int)word.charAt(0) >= 48 && (int)word.charAt(0) <= 57){
            System.out.println("first char is digit");
        } else if ((int)word.charAt(0) >= 65 && (int)word.charAt(0) <=90){
            System.out.println("first char is uppercase letter");
        } else if ((int)word.charAt(0) >= 97 && (int)word.charAt(0) <= 122) {
            System.out.println("first char is lowercase letter");
        } else if (((int)word.charAt(0) >= 33 && (int)word.charAt(0)<=46) || ((int)word.charAt(0) >=58 && (int)word.charAt(0) <= 64) || ((int)word.charAt(0) >= 91 && (int)word.charAt(0) <= 96) || ((int)word.charAt(0) >= 123 && (int)word.charAt(0) < 126)){
            System.out.println("first character is special character");
        }

 */

        String str = new Scanner(System.in).nextLine(); // unreferenced. so no need to close.

        if (str.length() >= 1){ // if the string has at least one char
            char f = str.charAt(0); // the first char of string

            if( f >= '0' && f<= '9'){
                System.out.println("digit");
            } else if ( f>= 'A' && f<= 'Z') { // number will be compared
                System.out.println("uppercase");
            } else if ( f>= 'a' && f<= 'z') {
                System.out.println("lowercase");
            }else {
                System.out.println("special");
            }
        } else {
            System.out.println("String is empty");
        }


    }
}

/*]
	3. Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

 */