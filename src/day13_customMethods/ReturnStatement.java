package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) { // void method should not return any value
        eligible(151);

        int result = multiplication(2, 3);
        System.out.println(result);

        System.out.println("----");
        System.out.println("test started");
        boolean exit = true;
        if (exit) {
            return; // main method gets terminated.
            // System.out.println("no use"); // this is useless, unreachable
        }
        System.out.println("test completed"); // this line won't be executed


    }

    public static void eligible(int age) {

        if (age < 0 || age > 150) { // invalid age, it should exit
            System.err.println("Invalid age: " + age);
            return; // exits the method not for returning a value
            // if the age is invalid then this method gets terminated
        }


        if (age >= 21) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }

    public static int multiplication(int num1, int num2) {

        // return num1 * num2;
        int result = num1 * num2;
        return result; // return is a must here. returns the value when exiting the method
    }


}

