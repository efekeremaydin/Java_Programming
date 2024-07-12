package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDateTime DOB;

//    private double salary; should not be added
//    private String schoolName;


    public Person(String name, char gender, LocalDateTime DOB) {
        setName(name);
        setGender(gender);
        setDOB(DOB);
        setAge(LocalDate.now().getYear()-DOB.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<= 0){
            System.err.println("Age cannot be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDateTime getDOB() {
        return DOB;
    }

    public void setDOB(LocalDateTime DOB) {
        this.DOB = DOB;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink );
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }



}
