package day25_constructors;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTax;
    public double federalTax;
    public double salaryAfterTax;
    public double salaryBeforeTax;

    public SalaryCalculator(double hourlyRate, double stateTax, double federalTax) {
        this.hourlyRate = hourlyRate;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
        this.salaryBeforeTax = hourlyRate * 40 * 52; // HOW CAN I USE THIS IN THE EMPLOYEE CLASS?
        this.salaryAfterTax = salaryBeforeTax-(federalTax*salaryBeforeTax) +(stateTax*salaryBeforeTax);
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salaryAfterTax=" + salaryAfterTax +
                ", salaryBeforeTax=" + salaryBeforeTax +
                '}';
    }
}




/*
const to pass
hourly rate
state tax
fed tax

you can then print salary after and before tax




 */
