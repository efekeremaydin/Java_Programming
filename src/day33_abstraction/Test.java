package day33_abstraction;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        CydeoDevStudent dev1 = new CydeoDevStudent("E", 'M', LocalDate.of(1987, 1,1), 12, "Zero to Hero", 1);

        System.out.println(dev1);
    }
}
