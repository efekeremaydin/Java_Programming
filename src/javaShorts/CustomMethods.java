package javaShorts;

public class CustomMethods {
    public static void main(String[] args) {

        displayCube(3);
        int total = sum(1,2);
        System.out.println(total);
        System.out.println(sum(1,2));




    }

    public static void displayCube(int num){

        int cube = num * num * num;
        System.out.println("cube of " + num + " is " + cube);
    }

    // create a function that can return the sum of two integers

    public static int sum (int num1, int num2){

        int sum = num1 + num2;
        return sum; // this is exiting line
//         System.out.println();// unreachable

//        int result;
//        result = num1 + num2;
//        return result;




    }
}