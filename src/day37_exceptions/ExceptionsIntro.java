package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        String str = "Java";

        /*char ch = str.charAt(150); // Unchecked exception
        System.out.println(ch);
*/
        System.out.println("Hello World");

        System.out.println("---");

        Pizza pizza = null;

        //pizza.calcCost(); // Ref type decides what's accessible. but obj type decides the impl.
        // unchecked exception

        System.out.println("---");

        //System.out.println(50/0); // unchecked exception

        int score = 100;

        if (score > 59) {
            System.out.println("Your grade is D");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        }

        System.out.println("---");

        //FileInputStream file = new FileInputStream(""); // checked exception
        // this code won't run as compiler detects it automatically







    }

}
