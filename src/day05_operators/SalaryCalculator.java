package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50,
                weeklyHours = 45,
                stateTaxRate =6,
                federalTaxRate =26,
                salaryBeforeTax = hourlyRate*weeklyHours*52,
                stateTax = salaryBeforeTax *stateTaxRate/100,
                federalTax = salaryBeforeTax*federalTaxRate/100,
                totalTax = stateTax + federalTax,
                netIncome = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + Math.round(salaryBeforeTax));
        System.out.println("Federal tax is: $" + Math.round(federalTax));
        System.out.println("State tax is: $" + Math.round(stateTax));
        System.out.println("Total tax is: $" + Math.round(totalTax));
        System.out.println("Net income is: $" + Math.round(netIncome));

        System.out.println("---------");

        System.out.println("Gross pay is: $" + Math.round(salaryBeforeTax) +
                "\nFederal tax is: $" + Math.round(federalTax) +
                "\nState tax is: $" + Math.round(stateTax) +
                "\nTotal tax is: $" + Math.round(totalTax) +
                "\nNet income is: $" + Math.round(netIncome));






    }
}


/*
1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in the above variables to calculate the following:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use the print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as a percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as a percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
 */