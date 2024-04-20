package day09_scanner;

// import java.util.Scanner;
// import java.util.*; this is also possible. but uses more resources.

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // new keyword used for creating object always. except String. String is only class that you don't need new keyword when creating objects.

//        Scanner input = new Scanner(System.in); // to get input in the console, for reading user inputs

//        input.close(); // when you create scanner. this object still connected to your keyboard. you use this to disconnect.

/*
        System.out.println("Enter a number: ");
        // byte num = input.nextByte(); // returns as byte and stores in the var
        short num = input.nextShort();

        System.out.println("You entered: " + num);

 */

        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte(); // -128 ~ 127

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number: ");

        long num4 = input.nextLong();

        input.close(); // scanner closed. can't be used for inputs again.


//        System.out.println("Enter fifth");
//        int num5 = input.nextInt();
        // scanner is closed at line 43 so you can't input again.

        System.out.println("First number:" + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number:" + num3);
        System.out.println("Fourth number:" + num4);
        // System.out.println("Fifth number: " + num5);





    }


}
