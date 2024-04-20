package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;
    public static LocalDate todaysDate = LocalDate.now();

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        if (name == null){
            return "unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can't be blank or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0 || age > 120){
            System.err.println("Age can't be less than zero or greater than 120");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Gender can only be M or F");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.compareTo(todaysDate)>0){
            System.err.println("Date can't be after today's date: " + dateOfBirth);
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

/*
Variables:
    name, age, gender, dateOfBirth

        name:
            Write: can not be null/empty/blank
            Read: if name is not, return "Unknown" instead

        age:
            Write: age can not be less than zero or greater than 120

        gender:
            Write: gender can only be 'M' or 'F'

        dateOfBirth:
            Write:  can not be after today's date

    Add a constructor that can set all the fields

    Add toString()
 */










