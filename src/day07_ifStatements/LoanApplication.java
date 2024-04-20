package day07_ifStatements;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 55000,
                creditScore = 680;

        String result = "";


        if (salary >=45000 && creditScore >=700){
            result = "Eligible";
        }else{
            result = "not eligible";
        }

        System.out.println(result);


    }


}

/*

    1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note: In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */