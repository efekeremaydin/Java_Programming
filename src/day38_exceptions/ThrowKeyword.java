package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
         /*   System.err.println("Invalid age");
            System.exit(1);*/
            if (age < 0){
                throw new InputMismatchException("Age of the person can't be negative: " + age); // there's a constructor with String arg in the parent class (RuntimeException) that would allow this c to have String arg
            }else {
                throw new InputMismatchException("Age of the person can't be more than 150: " + age);
            }

        }

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }


        System.out.println("---");

        //throw new RuntimeException("new runtime exception");
        //System.out.println("hello world"); // unreachable


        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
