package day07_ifStatements;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if (age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("---------");

        if (age >=21) System.out.println("Eligible"); // without curly brace if block only carries one statement
        else System.out.println("Not eligible");

        System.out.println("---------");

        int itemNum = 1;

        /*
        if (itemNum ==1){
            System.out.println("eggs");
            System.out.println("orange");
        else if(itemNum ==2){
            System.out.println("milk");
            System.out.println("onion");
        else{
            System.out.println("apple");
            System.out.println("cherry");
        }

         */

        int day = 2; // 1~7

        if (day ==1) System.out.println("Monday"); // this is not the best practice. always give the curly braces. this is just good to know.
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thu");
        else if (day == 5) System.out.println("Fri");
        else if (day == 6) System.out.println("Sat");
        else System.out.println("Sun");

        // IF STATEMENT WITHOUT CURLY BRACE IS NOT A GOOD PRACTICE

    }
}
