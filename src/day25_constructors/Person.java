package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void sleeping(){
        System.out.println(name + " is sleeping");
    }

    public void drinking(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y"))+
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
}

/*
name
age
gender
dateOfBirth
isMarried
isEmployed

ensure all instances are set when obj is created

add a const that can set all the fields once an obj is created

create method toString() and format the date of birth MM/dd/y

eat(String food), sleeping(), drink(String drink)

create 5 person object and test











 */
