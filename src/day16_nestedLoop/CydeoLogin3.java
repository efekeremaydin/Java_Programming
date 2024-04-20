package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your username");
        String u = input.next();

        System.out.println("enter your password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if cred are valid
            System.out.println("logged in");
        } else { // otherwise
            for (int i = 3; i > 0; i--) {
                //  System.err.println("Invalid username or password, please re-enter your username and password:");
                System.err.println(i + " attempts left. Incorrect username or password please re-enter");
                System.err.println("Please enter your username again");
                u = input.next();

                System.err.println("Please enter your password again");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("logged in");
                    break;
                }
            }
            System.err.println("you've reached the invalid entry limit so your account is locked ");
            input.close();
            System.exit(1);
        }









    }
}

