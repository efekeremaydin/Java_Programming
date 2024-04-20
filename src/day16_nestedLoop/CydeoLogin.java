package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username");
        String u = input.nextLine();

        System.out.println("Please enter your password");
        String p = input.nextLine();


        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
            return;
        }


        for (int i = 0; i < 3; i++) { // 2 is cuz we already asked the 1st one above
            if (!(u.equals("Cydeo") || p.equals("WoodenSpoon"))) {
                System.err.println("Invalid username or password, please re-enter your username and password:");
                System.out.println("Please enter your username");
                u = input.nextLine();
                System.out.println("Please enter your password");
                p = input.nextLine();
            }
            System.err.println("you've reached the invalid entry limit so your account is locked ");
            System.exit(1);
        }



        input.close();


    }
}

/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */
