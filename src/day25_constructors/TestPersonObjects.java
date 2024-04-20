package day25_constructors;

import java.time.LocalDate;

public class TestPersonObjects {


    public static void main(String[] args) {

        Person person1 = new Person("Efe", 'M', LocalDate.of(1988, 10,18), true, true);

        System.out.println(person1);
        person1.eat("simit");
        person1.drinking("cay");
        person1.sleeping();
    }




}
