package day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {


        int age = 18;

        boolean isEligible = age >= 21 && age < 100;

        if (isEligible){
            System.out.println("You are eligible");
        }

        if (!isEligible){
            System.out.println("You are not eligible");
        }

        System.out.println("--------");

        if (age >= 21 && age < 100){
            System.out.println("You are eligible");
        }

        if (age < 21 || age >100){
            System.out.println("You are not eligible");
        }



    }
}
