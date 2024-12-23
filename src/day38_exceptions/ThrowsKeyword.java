package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException { // throws wouldn't handle the exception for unchecked exceptions below (e.g. Arithmetic Exception), it's only for checked exceptions

        // when you declare these exceptions with throws keyword that means within this method these exceptions will be handled
        // throws keyword makes the code more readable as well



/*        System.out.println("Programme1 started");

        try {
            System.out.println(100 / 0); // unchecked exception
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try { // disadv of using try catch here is having too many lines of code for one checked exception. For these kind of scenarios throws is better.
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programme1 ended");

        System.out.println("---");

        System.out.println("Programme2 started");

        try {
            System.out.println(100 / 0); // unchecked exception
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programme2 ended");*/

        System.out.println("Programme1 started"); // throws would handle below exceptions faster and shorter. only used for checked exceptions.Throws keyword covers all checked exceptions within the class

            Thread.sleep(5000);

        System.out.println("Programme1 ended");

        System.out.println("---");

        System.out.println("Programme2 started");

        Thread.sleep(5000);

        System.out.println("Programme2 ended");

        System.out.println("---");

        System.out.println("Programme3 started");

        FileInputStream file = new FileInputStream(""); // this will still give error as file path should be provided anyway

        System.out.println("Programme3 ended");




    }


}
