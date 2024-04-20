package day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        System.out.println(isOdd(4));
        System.out.println(isEven(2));
        System.out.println(isMax(1, 2));
        System.out.println(isMin(1, 2));

        //String str = "";
        //str.equals() these return boolean
        //str.isEmpty()

        int num = 200;

        if (isEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }


    }

//    public static boolean isOdd (int num){
//        if (!(num %2 ==0)){
//            return true;
//        }
//        return false;
//    }

    public static boolean isOdd(int num) {
//         return (num % 2 != 0) ? true : false;
        if (num % 2 != 0) {
            return true; // it exists here if it's an odd number
            //} else { // you don't need else as there is return
        }
        return false;

    }

//    public static boolean isEven(int num) {
//        if (num % 2 == 0) {
//            return true;
//        }
//        return false;
//    }

    public static boolean isEven(int num) {
        // !isOdd(); is this possible
        // return !isOdd(num);

        return (num % 2 == 0) ? true : false;
    }

    public static int isMax(int num1, int num2) {
        //return (num1 > num2) ? num1 : num2;

        if (num1 >num2){
            return num1; // if this is true it will exit
        }
        return num2; // otherwise this will be run
    }

    //        if (num1 > num2) {
//            return num1;
//        }
//        return num2;
//    }
    public static int isMin(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        }
        return num1;
    }


}

/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers

 */

