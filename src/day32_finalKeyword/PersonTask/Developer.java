package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary, String programmingLanguage) {
        super(name, gender, dateOfBirth, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void coding(){
        System.out.println(getJobTitle()+ " is coding " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
