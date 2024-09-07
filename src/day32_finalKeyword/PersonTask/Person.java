package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class Person { // this should not be a final class as it will be a parent

    private String name; // no comp err as it has def val
    private final char gender; // compiler err as it needs to be init. cuz they don't have def value -> it will be with the const.
    private final int age;
    private final LocalDate dateOfBirth;



    public static final int numberOfHead;

    static{
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {
        setName(name);
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid Gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
       /* if (age<=0){
            System.err.println("Invalid Age: " + age);
            System.exit(1);
        }*/
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public void setGender(char gender) { // as the gender is final you can't generate setter for it. Also, since const init them before this method this m can't change the init. final var.
        this.gender = gender;
    }*/

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public final void breathe(){
        System.out.println(name+" is breathing");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

/*
var:
    name, gender, age, dateOfBirth
    numberOfHead


Met:
    eat(), drink(), sleep()
    breath()
 */
















