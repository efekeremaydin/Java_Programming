package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Efe", "Java Developer", 33, 'M', new SalaryCalculator(100, 0.2,0.3), LocalDate.of(2024, 8,1)); // first part is class name and second part is the const.

        /*Employee employee2 = new Employee("Mohammed", "Project Manager", 31, 'M', 120000, LocalDate.of(2021, 1, 1)); // each obj has diff mem*/

        System.out.println(employee1);
        //System.out.println(employee2);


    }
}
