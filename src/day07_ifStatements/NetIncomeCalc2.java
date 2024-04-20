package day07_ifStatements;

public class NetIncomeCalc2 {

    public static void main(String[] args) {

        int salary = 100000;
        double taxRate = 0;
        boolean isMarried = true;


        if (salary >= 130000){ // if the salary is 130k or more the tax rate is 35%
            taxRate = 0.35;
        }

        if (salary >= 100000 && salary <= 129999){ // if the salary is between 100k and 130k then the tax rate is 30%
            taxRate = 0.30;
        }

        if (salary >= 80000 && salary <= 99999){ // if the salary between 80k and 100k the tax rate is 25%
            taxRate = 0.25;
        }

        if (salary < 80000){ // if the salary below 80k the tax rate is 20%
            taxRate = 0.20;
        }

        if (isMarried){ // if married then 5% less tax
            // taxRate = taxRate -= 0.05;
            taxRate -= 0.05;
        }
//
//        double netIncome =  salary * (1-taxRate);
//        System.out.println(netIncome);
        double totalTax = salary *taxRate;
        double netIncome = salary - totalTax;
        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

//        System.out.println("taxRate = " + taxRate);
//        double salaryAfterTax = salary - salary*taxRate;
//        System.out.println("salaryAfterTax = " + salaryAfterTax);


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
