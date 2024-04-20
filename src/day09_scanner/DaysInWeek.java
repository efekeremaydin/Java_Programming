package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in); // since you use one time, there is no need for var.
        System.out.println("Please enter the number of the day:");
        int num = new Scanner(System.in).nextInt();// this will be collected by garbage collector after the first usage. you dont need to close.
        String day = "";

//
//        switch (num){
//            case 1:
//                day = "M";
//                break;
//            case 2:
//                day = "T";
//                break;
//            case 3:
//                day = "M";
//                break;
//            case 4:
//                day = "M";
//                break;
//            case 5:
//                day = "M";
//                break;
//            case 6:
//                day = "M";
//                break;
//            case 7:
//                day = "M";
//                break;
//            default:
//                day = "no such num";
//
//        }

//        System.out.println("The day is: " + day);
        day = "Invalid";

        if (num >= 1 && num <= 7){

            day = (num ==1)? "M" :(num ==2)? "T" :(num ==3)? "W" :(num ==4)? "T" :(num ==5)? "F" :(num ==6)? "Sa" : "Su";

        } else {
            day = "No such day";
        }

        System.out.println("The day is: " + day);


    }

}
