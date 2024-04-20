package day07_ifStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 130000;
        boolean isMarried = true;
        String isMarried1 = "true";

        String result = "";

        if (salary >= 130000 && isMarried1 == "true"){
           result = "Tax is: " +salary*0.30;
        }
        if (salary >= 130000 && isMarried == false){
            result = "Tax is: " +salary*0.35;
        }

        if (salary >= 100000 && salary <= 129999 && isMarried == true){
            result = "Tax is: " +salary*0.25;
        }
        if (salary >= 100000 && salary <= 129999 && isMarried == false){
            result = "Tax is: " +salary*0.30;
        }

        if (salary >= 80000 && salary <= 99999 && isMarried == true){
            result = "Tax is: " +salary*0.20;
        }
        if (salary >= 80000 && salary <= 99999 && isMarried == false){
            result = "Tax is: " +salary*0.25;
        }

        if (salary < 79000 && isMarried == true){
            result = "Tax is: " +salary*0.15;
        }
        if (salary >= 79000 && isMarried == false){
            result = "Tax is: " +salary*0.20;
        }
        System.out.println(result);





    }
}

/*
3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999k
                        25% for salary of 80K to 99,999K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */