package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name, jobTitle; // this should be instance var as we need multiple copies/names
    public int age;
    public char gender;
    //public double salary;
    public SalaryCalculator salary;
    public double hourlyRate;
    public double stateTax;
    public double fedTax;

    public LocalDate hiredDate;

    public Employee(String name, String jobTitle, int age, char gender, SalaryCalculator salary, LocalDate hiredDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        //this.salary = SalaryCalculator(hourlyRate, stateTax, fedTax);
        this.salary = new SalaryCalculator(hourlyRate, stateTax,fedTax);
        this.hiredDate = hiredDate;
    } // allows us to set all the instance vars of each obj as soon as the obj is created


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary+
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    } // allows you to print the obj when it's passed in the print statement
}

/*
name
age
gender
jobTitle
salary
hiredDate
 */