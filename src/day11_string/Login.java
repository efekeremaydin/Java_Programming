package day11_string;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        System.out.println("enter username");
        String username = input.nextLine();

        System.out.println("enter password");
        String password = input.nextLine();

        input.close();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You're now logged in");
        } else {
            System.out.println("Incorrect username and/or password. Please try again.");
        }


 */


        String correctUsername = "Cydeo", // literal
                correctPassword = "WoodenSpoon"; // literal

        System.out.println("Enter your username");
        String username = input.nextLine(); // new obj

        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("You're now logged in");
        } else {
            System.err.println("Incorrect username and/or password. Please try again.");
        }
/*
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("passed");
        } else if (username.equals(correctUsername) && !password.equals(correctPassword))){
            System.err.println("incorrect password");
        } else if (!username.equals(correctUsername) && password.equals(correctPassword)) {
            System.err.println("incorrect username");
        }

 */
    }

}










/*

	2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */