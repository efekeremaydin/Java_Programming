package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Tester extends Employee{
    private String testingTool;

    public Tester(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary, String testingTool) {
        super(name, gender, dateOfBirth, jobTitle, salary);
        setTestingTool(testingTool);
    }

    public String getTestingTool() {
        return testingTool;
    }

    public void setTestingTool(String testingTool) {
        this.testingTool = testingTool;
    }

    public void testing(){
        System.out.println(getJobTitle() + " is testing with " + testingTool);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", testingTool='" + testingTool + '\'' +
                '}';
    }
}
