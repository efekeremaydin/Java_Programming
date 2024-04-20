package day26_statics.studentTask;

public class Student {

    public String name, id;
    public int age;
    public char gender;

    public Student(String name, String id, int age, char gender) { // this makes the use of these vars mandatory when creating objs
        this.name = name; // if you don't use this keyword compiler will only use local var, not the instance var
        this.id = id;
        this.age = age;
        this.gender = gender;
    } // only time const gets exec is when you create the obj
    // if you define the const yourself compiler won't create any
    // every class must have at least one const.

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()
 */