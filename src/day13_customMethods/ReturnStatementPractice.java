package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade:");
        char grade = input.next().toLowerCase().charAt(0); // HOW do you close the scanner if above first line is not written

        input.close();

        boolean isValid = grade == 'A' ||  grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';


        if (!isValid){
            System.err.println("invalid");
            return;
        }

//        switch (grade){
//            case 'A':
//                System.out.println("Excellent");
//                break;
//            case 'B':
//                System.out.println("Excellent");
//                break;
//            case 'C':
//                System.out.println("Excellent");
//                break;
//            case 'D':
//                System.out.println("Excellent");
//                break;
//            case 'F':
//                System.out.println("Excellent");
//                break;
//        }

        System.out.println( (grade == 'A')? "Excellent" :(grade == 'B')? "Great" :(grade == 'C')? "Good" :(grade == 'D')? "Passed" : "Failed" );



    }






}


