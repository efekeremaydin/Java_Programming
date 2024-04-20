package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        // int total = sum(20, 40); // this sum method is a void method that doesnt return any data

        int total = addition(1, 2); // now you can use this value assigned to a var and is reusable. that's the only difference between void and return method.
        System.out.println(total);

        int result = square(7);
        System.out.println(result);

        System.out.println(cube(3));




    }

    /*
    public static void sum (int n1, int n2){ // if there's any data you want to return then use return type

        int result = n1 + n2;
        // System.out.println(result);
        return;  // you can still use return but it doenst return any value



    }

     */

    public static int addition(int n1, int n2) { // for reusability.

        return n1 + n2; // this is MUST when method is not void. another use case of the return statement is for exiting the function.
    }

    public static int square (int num){ // return type should be same as the parameter return type
        int square = num*num;
        return square;
    }

    public static int cube (int num){
        int cube = square(num)*num;
        return cube;
    }




}
