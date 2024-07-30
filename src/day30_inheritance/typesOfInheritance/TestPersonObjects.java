package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {
        Student student = new Student("M", 'M',LocalDate.of(2023, 1,3),'A', "A123");

        President president = new President("K", 'M', LocalDate.of(1988, 10,18), LocalDate.of(2023, 3,3));

        Teacher teacher = new Teacher("C", 'F', LocalDate.of(1987, 9,5), "A123", "Teacher", 123123123);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        // if you want the unique values to be printed then you need to override the toString method that is from Person class

        student.eat("Baklava");
        teacher.eat("Lahmacun");
        president.eat("Kebab");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("coffee");













    }

}
