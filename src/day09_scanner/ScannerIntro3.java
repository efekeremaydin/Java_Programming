package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0); // 0 is the first char
        System.out.println("you have entered: " + ch);

        System.out.println("would you like to continue?");
        String answer = input.next(); // reads only until a space.
        // String answer = input.nextLine(); // reads the entire line


        System.out.println("you have entered: " + answer);
        input.close();

    }
}
