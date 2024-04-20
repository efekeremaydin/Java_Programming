package day06_ifStatements;

public class IfAndElseStatementIntro {

    public static void main(String[] args) {


        int age = 20;

        if (age >=21){
            System.out.println("eligible");
        }
        if (age<21){
            System.out.println("not eligible");
        }

        System.out.println("[[--------");

        if (age >= 21){
            System.out.println("eligible");
        }else{ // otherwise. if above cond is not true, below will be checked
            System.out.println("not eligible");
        }







    }
}
