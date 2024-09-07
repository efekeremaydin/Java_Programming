package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1,25));

        System.out.println(person);
        //person.setGender; can't be set as it's final

        person.breathe(); // this m is final and can't be changed

        System.out.println("---");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 2, 5), "Accountant", 100000);
        System.out.println(employee);
        employee.breathe();

        Student student = new Student("M", 'M', LocalDate.of(2024, 1,1), 'A', "Computer Science");

        System.out.println(student);

        Developer developer = new Developer("E", 'M', LocalDate.of(1988, 10,18), "Senior Software Engineer", 10000000, "Java");
        System.out.println(developer);



    }


















}
