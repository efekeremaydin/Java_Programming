package day13_customMethods;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {


        System.out.println("enter month number");
        int month = new Scanner(System.in).nextInt(); // how do you close this scanner?

        if (month < 1 || month >12){
            System.err.println("invalid");
            return;// terminates the method. implicit condition: the month has valid number: 1-12
        }

        // the more topics the better solutions
        // with data structures -  you dont need this many lines. all possible data you will store in data str and you will call with index number.

        switch (month){ // 1~12
            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");
        }




    }


}
