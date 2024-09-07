package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public final class Student extends Person { // can't have child classes

    private char grade; // non-final
    private String major;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade, String major) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
        setMajor(major);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }
}
