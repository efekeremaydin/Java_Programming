package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person("Efe", 33, 'M', LocalDate.of(1988, 10, 18));

        System.out.println(p1);
    }
}
