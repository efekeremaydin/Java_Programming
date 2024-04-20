package day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    // instance var
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth; // we only need 3 info. once we now the date of birth we can subtract the birth year from current year

    public void setInfo(String name, char gender, LocalDate dateOfBirth) { // transform this const into setInfo method.
        // less parameter is better (so we don't pass the age, we calculate ourselves)
        this.name = name; // this keyword is used cuz in the parameters we have the same names as the instance var names
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear()-dateOfBirth.getYear(); // we don't need this keyword here as age is not within the parameters of this constructor. when we call age it will call the instance var cuz in this method we don't have the local age var.
    }

    public String toString() { // in order to print the objs we need to have this method
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
