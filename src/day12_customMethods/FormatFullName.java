package day12_customMethods;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Efe's solution
//        System.out.println("enter first name");
//        String firstName = input.next();
//
//        System.out.println("enter second name");
//        String secondName = input.next();
//
//        firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
//        secondName = secondName.toUpperCase().charAt(0) + secondName.substring(1).toLowerCase();
//
//
//        System.out.println(firstName + " " + secondName);

// First solution - Muhtar
        /*
        String first = "cyDEo";
        String second = "SCHOOl";

//         first.charAt(0) ==> this always gives you char data type, so there's no way you can use String methods. you need to have a String to use String methods.

        // we can call toUpperCase here as it's a String. we can also call lowerCase after substring as it's still a string.
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        // getting first char of the first name     + the remaining chars of the first name with lowercase

        System.out.println(first);

         */

// Second solution => Muhtar
        System.out.println("First name");
        String first = input.nextLine().trim().replace(" ", ""); // adding trim just in ase user enters spaces before entering the name. also adding replace to remove all spaces between chars given within the name.

        System.out.println("Last name");
        String last = input.nextLine().trim().replace(" ", "");

        input.close();

//first.charAt(0) ==> this always gives you char data type, so there's no way you can use String methods. you need t®o have a String to use String methods.

        // we can call toUpperCase here as it's a String. we can also call lowerCase after substring as it's still a string.
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        // getting first char of the first name     + the remaining chars of the first name with lowercase

        String full_name = first + " " + last;
        System.out.println(full_name);



    }

}


/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */