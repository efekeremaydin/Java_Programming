package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // Datatype variableName = Data;

        // byte a = "Java; // byte ONLY accepts integer values (-128 ~ 127)
        // byte a = 20.5; // byte cannot take decimal numbers
        // byte a = 2000; // out of byte range (-128 ~ 127)

        byte a = 20;

        // price of the car is $17500

        short p = 17500;
        System.out.println("p");

        System.out.println(p);

        // salary is $95000
        int s = 95000; // preferred data type
        System.out.println(s);

        // int n = 9999999999;
        long n = 9999999999L; // if you don't add L at the end compiler assumes that's int.


        // gpa is 3.5
        double gpa1 = 3.5; // preferred

        float gpa2 = 3.5F; // double is larger than float that's why it gives error. We need to pass F into it to indicate it's float.

    }
}
