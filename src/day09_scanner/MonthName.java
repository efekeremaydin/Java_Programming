package day09_scanner;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        System.out.println("Please enter a number:");

        int num = new Scanner(System.in).nextInt();

        switch (num){
            case 1:
                System.out.println("J");
                break;
            case 2:
                System.out.println("F");
                break;
            case 3:
                System.out.println("M");
                break;
            case 4:
                System.out.println("A");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Au");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("No");
                break;
            case 12:
                System.out.println("Dec");
                break;
        }
    }
}
