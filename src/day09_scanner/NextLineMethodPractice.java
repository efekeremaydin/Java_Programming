package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // EnterEnterEnter

        System.out.println("Enter your full name:"); // Aaorin King + Enter (this will be all read)
        String full_name = input.nextLine();

        System.out.println("Enter your school name:"); // Cydeo School + Enter (this will be all read)
        String school_name = input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.next(); // Male + Enter

        System.out.println("Enter your age");
        int age = input.nextInt(); // 26 + Enter

        input.nextLine(); // to cleanup Enter(s). we have to give this if are using nextLine method after other methods of scanner

        System.out.println("Enter street name");
        String street = input.nextLine();


    }
}
