package day04_concatenation;

public class SalaryCalculator2 {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        int stateTaxRate = 6;
        int federalTaxRate = 26;


        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        int stateTax = salaryBeforeTax * stateTaxRate / 100;
        int federalTax = salaryBeforeTax * federalTaxRate /100;
        int totalTax = stateTax + federalTax;
        int salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);


    }
}

/*
7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the following:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax


    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
 */
