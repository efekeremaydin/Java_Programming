package day30_inheritance.typesOfInheritance;

import java.time.LocalDateTime;

public class Teacher extends Employee {

    // it's better to inherit from Employee as it has relevant fields such as salary, employeeID

    // if it's not a default const you need to create in the child class as well

    // person is the parent of employee and employee is the parent of teacher

    public Teacher(String name, char gender, LocalDateTime DOB, String employeeID, String jobTitle, double salary) {
        super(name, gender, DOB, employeeID, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }
























}
