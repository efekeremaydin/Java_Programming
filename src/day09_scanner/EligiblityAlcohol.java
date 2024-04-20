package day09_scanner;

import java.util.Scanner;

public class EligiblityAlcohol {

    public static void main(String[] args) {

        System.out.println("Please enter a number:");

        byte age = new Scanner(System.in).nextByte();

        if (age >= 21 ){
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

    }
}
