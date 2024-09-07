package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Employee extends Person { // this also should not be final as it may need to be inherited

    private String jobTitle;
    private float salary;

    public Employee(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setJobTitle(jobTitle);
        setSalary((float) salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void work(){ // this should not be final as we may need to override
        System.out.println(getName() + " is working.");
    }

    /*public void breathe(){ // can't be overridden as it's final in the parent method

    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }









}
