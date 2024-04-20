package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100+200);
        System.out.println("100" + 200); // + can be used for addition and concat
        System.out.println(40-10); // - can't be used for concat

        System.out.println(50/6); //int
        System.out.println(50/6.0); // decimal
        System.out.println(50.0/6); // dec
        System.out.println(50d/6); // dec

        System.out.println(2.5/0.5); // dec
        System.out.println((int)(2.5/0.5));// int (casted)

        // System.out.println(9/0); // exception error

        System.out.println(10*2);
        System.out.println(20*12);

        // MODULUS
        // Remainder operator (leftover) = (denominator * integer result)

        /*
        10/3 = 3.3333...
        remainder: 10 - (3*3) = 1

        20/6 = 3.33333...
        20-(6*3) = 2

        15/4 = 3.75
        15 - (4*3) = 3

        10%3=1
        20%6=2
        15%4=3

         */

        System.out.println(100%13);
        System.out.println(45%8);

        char ch = 95;
        System.out.println(ch);

 //       byte number = 10.5;
   //     System.out.println(number);

        int num1 = 50;
        int num2 = 200;
        num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        long a = 3_000L;
        double b = (float)a;
        System.out.println(b);
        int c = (short)b;
        System.out.println(c);

        System.out.println(c%1000);

        long ab = 30L;
        short cb = (short)ab;
        System.out.println(cb);

        System.out.println("5 +2 = " + (3+4));







    }
}
