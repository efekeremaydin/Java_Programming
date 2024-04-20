package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your username");
        String u = input.next();

        System.out.println("enter your password");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if cred are valid
            System.out.println("logged in");
        } else { // otherwise
            for (int i = 0; i < 3; i++) {
              //  System.err.println("Invalid username or password, please re-enter your username and password:");

               /* if (i == 2){
                    System.err.println("this is your last attempt");
                }*/
                if (i!=2){
                    System.err.println("Incorrect username or password please re-enter");
                } else {
                    System.err.println("Please note that this is your last chance, please re-enter your username and password");
                }


                System.out.println("Please enter your username again"); // in the second this printed earlier than the first statement, why?
                u = input.next();

                System.out.println("Please enter your password again");
                p = input.next();

                cydeoLogin("Cydeo", "WoodenSpoon"); // another way
                break;
                /*if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if the user enters valid credentials
                    System.out.println(" You're now logged in");
                    break; // exit the loop
                }*/
            }
            /*System.err.println("you've reached the invalid entry limit so your account is locked ");
            input.close();
            System.exit(1);*/

            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){ // not sure why do we need this? as if it's already faield 3 times we can just use the below print statement?
                // after all 3 attempts if username and p still incorrect,
                System.err.println("your account is locked please contact the support the team");
            }
            input.close();
        }










    }

    public static void cydeoLogin (String username, String password){
        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("logged in");
        } else {
            System.out.println("invalid credentials");
        }
    }
}









