package day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Enter

        System.out.println("Enter your full name"); // Cydeo School + Enter
        String name = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNum = input.next(); // 7925A + Enter (enter will go in the scanner)

        input.nextLine(); // to clear the scanner's mem. nextline method will not ignore the enter key.

        System.out.println("Street name?"); // Jones Branch Dr + Enter
        String street = input.nextLine();

        System.out.println("Enter your city name"); // McLean + Enter
        String city = input.nextLine(); // if prev method is next () then you need to add another blank nextline beforehand

        System.out.println("Enter your state"); // VA
        String state = input.nextLine();

        System.out.println("ZIP code?");
        String zip = input.next();

        input.close();

        System.out.println("Your shipping address is:\n\t" +
                                                    name +
                                        "\n\t" + buildingNum + " " + street +
                                        "\n\t" + city + ", " + state + " " +zip);
    }
}

/*

Warmup tasks:
	1. Create a class named ShippingAddress and ask the user to:
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
 */
